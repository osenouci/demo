docker rmi $(docker images -q) --force
mvn clean && mvn package && docker build --tag registry.in.luxair.lu/osenouci/tavel-ibe-api .