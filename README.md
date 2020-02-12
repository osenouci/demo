# Travel IBE api spring boot POC

This project demonstrates how the bewotec APIs can be called using spring boot.

In order to run the project, please make sure that your system is running java 8 and maven 3.2+.

Please refer to the [official sprint boot documentation](https://duckduckgo.com) if you don't have java and maven installed on your system.

## The aim of this document is to explain how to
1. Clone the project
2. Install the editor `Spring Tools 4`
3. Configure the editor to run the project
4. Generate bewotec stubs from wsdl files
5. Compile the project from the command line
6. Package the project as an image and push it to the Luxair registry
7. Deploy the project to minikube

### Clone the project
1. Navigate to the directory where you want to clone the project.
2. Clone the project using git

    `git clone git@gitlab.luxair.lu:osenouci/travel-ibe-api.git`
3. Navigate to the directory

    `cd travel-ibe-api`

### Install the editor
Visit [https://spring.io/tools](https://spring.io/tools) and down the file corresponding to your operating system. 

Follow the installation steps. If you have alreay installed Java and maven then the editor should work out of the box without any problems.

### Configure the IDE to run the project


We need to install `Project Lombok` in order for the IDE to work properly.
If you are unfamiliar with the `Project Lombok` then they best describe themselfs as:
> Project Lombok is a java library that automatically plugs into your editor and build tools, spicing up your java.
Never write another getter or equals method again, with one annotation your class has a fully featured builder, Automate your logging variables, and much more.

#### Installation

1. In order to configure Spring boot IDE to use Lombok then navigate to [their download page](https://projectlombok.org/download) and download the latest jar file
2. Double-click lombok.jar, this starts the eclipse installer which will find eclipse and its spring boot variation. If it does not then you can manually locate spring boot using the `Specify location...` button
3. Once the IDE has been located and its checkbox checked then click on `Install/Update` button
4. If the IDE is open then restart it
5. Import the project into the IDE
6. Run it as a spring boot application once maven finished building it
7. Once the application is up and running then open a browser and test that the hotel list endpoint is up and running
   
   > http://localhost:8088/hotels


###  Generate bewotec stubs from wsdl files
Bewotec provides 3 soap services that this project consumes. The services are the following
1. Service hub `http://lux.hub.bewotec.de:6158/Bewo.Hub.Service/BewotecHubService.wsdl`
2. Insurances service `http://192.150.150.228:8073/InsurancesService/InsurancesService.svc?wsdl`
3. Content service `http://192.150.150.228:8098/ContentService/ContentService.svc?wsdl`

We are using AXIS2 Web Services library to generate the subs from the wsdl files. This is done by configuring the Axis2 plugin as follows in the project's pom.xml file:

    <plugin>
        <groupId>org.apache.axis2</groupId>
        <artifactId>axis2-wsdl2code-maven-plugin</artifactId>
        <version>${axis2.version}</version>
        <configuration>
            <skip>true</skip>
        </configuration>
        <executions>
            <execution>
                <id>wsdl-serviceHub</id>
                <goals>
                    <goal>wsdl2code</goal>
                </goals>
                <phase>none</phase>
                <configuration>
                    <packageName>de.bewotec.service</packageName>
                    <wsdlFile>http://lux.hub.bewotec.de:6158/Bewo.Hub.Service/BewotecHubService.wsdl
                    </wsdlFile>
                    <databindingName>jaxbri</databindingName>
                    <outputDirectory>src/main/java</outputDirectory>
                    <flattenFiles>true</flattenFiles>
                    <overWrite>true</overWrite>
                    <suppressPrefixes>true</suppressPrefixes>
                    <!-- -->
                    <namespaceToPackages>http://www.bewotec.de/bewotecws/Schema=de.bewotec.bewotecws.schema</namespaceToPackages>
                    <namespaceURIs>
                        <namespaceURI>
                            <uri>http://www.bewotec.de/bewotecws/Schema</uri>
                            <packageName>de.bewotec.bewotecws.schema</packageName>
                        </namespaceURI>
                    </namespaceURIs>

                </configuration>
            </execution>
            <execution>
                <id>wsdl-InsurancesService</id>
                <goals>
                    <goal>wsdl2code</goal>
                </goals>
                <phase>none</phase>
                <configuration>
                    <packageName>de.bewotec.insurance</packageName>
                    <wsdlFile>http://192.150.150.228:8073/InsurancesService/InsurancesService.svc?wsdl
                    </wsdlFile>
                    <databindingName>adb</databindingName>
                    <flattenFiles>true</flattenFiles>
                    <outputDirectory>src/main/java</outputDirectory>
                    <overWrite>true</overWrite>
                </configuration>
            </execution>
            <execution>
                <id>wsdl-ContentService</id>
                <goals>
                    <goal>wsdl2code</goal>
                </goals>
                <phase>none</phase>
                <configuration>
                    <packageName>de.bewotec.content</packageName>
                    <wsdlFile>http://192.150.150.228:8098/ContentService/ContentService.svc?wsdl
                    </wsdlFile>
                    <databindingName>adb</databindingName>
                    <flattenFiles>true</flattenFiles>
                    <outputDirectory>src/main/java</outputDirectory>
                    <overWrite>true</overWrite>
                </configuration>
            </execution>
        </executions>
    </plugin>

To re-generate the stubs run the command
`./mvnw compile`

> **Please note that one of the services is placed in the wrong directory and that has been corrected manually for the time being.**
> 
> **An additional src directory is being added to the project. This can be corrected in the future by adding an extra plugin that corrects the directory structure**
> 
> **To save time this step has not been done yet.**

The sub regeneration has been disabled for the time being as they don't need to be regnerate with every build. This has been done by adding the following xml tag to the pom file's execusion tags:

    <phase>none</phase>

## Compile the project from the command line
To clean up the project run 

    ./mvnw clean

To compile the project run 

    ./mvnw compile

To package the application 

    ./mvnw package 
Once the application has been package then we can run it from the command line using the following command

    java -jar target\gs-spring-boot-docker-0.1.0.jar

## Package the project as an image and push it to the Luxair registry
Luxair uses Portus as a registry for private images that we don't want to expose to the public. The portal can be accessed using the url [https://registry.in.luxair.lu](https://registry.in.luxair.lu/).

In order to package our application as a docker image the following steps are to be followed
1. Add the luxair registry to your docker registry list which is done by issuing the command here below. You will be asked to authenticate using your Luxair credentials.

        docker login registry.in.luxair.lu

2. Package the project and an image out of it
    
        mvn clean && mvn package && docker build --tag registry.in.luxair.lu/osenouci/tavel-ibe-api:latest .

The following DockerFile has been added to the project to make this possible

    FROM openjdk:8-jdk-alpine
    RUN addgroup -S spring && adduser -S spring -G spring
    USER spring:spring
    ARG JAR_FILE=target/*.jar
    COPY ${JAR_FILE} app.jar
    ENTRYPOINT ["java","-jar","/app.jar"]

3. If the image has not been tagged correcty because of a typo then the image can be tagged again using the command
   
       Docker tag IMAGE_ID registry.in.luxair.lu/osenouci/tavel-ibe-api:latest

4. Push the image to luxair regify 
   
       Docker push registry.in.luxair.lu/osenouci/tavel-ibe-api:latest