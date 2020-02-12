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
1. Naviagte to the directory where you want to clone the project.
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
3. Once the IDE has been located and its checkbox checked then click on Install/Update
4. If the IDE is open then restart it
5. Import the project into the IDE
6. Run it as a spring boot application once maven finished building it
7. Once the application is up and running then open a browser and test that the hotel list endpoint is up and running
   
   > http://localhost:8088/hotels

