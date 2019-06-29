# microservices-example

Microservices-example based on OSGi bundle
Deploying to Apache Karaf Runtime

## Getting Started

Build Karaf for Docker

	cd src/main/docker
	docker build -t karaf-api .
	
Run Karaf Docker
	
	docker run -d -t \
	   --name karaf \
	   -p 1099:1099 \ 
	   -p 8101:8101 \
	   -p 8181:8181 \
	   -p 44444:44444 \
	   -v /host/path:/deploy \
	   karaf-api
	
Change /host/path with some path in your local folder	
	
You may also running with scripts

	./build.sh
	./run.sh /Users/aliirawan/Docker/volumes/karaf
			
Make sure the docker container is running

	docker ps
	
Login to docker container

	docker exec -i -t karaf /bin/bash
	cd /opt/karaf/bin

Run the **client**	
	
	./client
	
## Install features required

### Using Apache Karaf 4.0.8
If you are using **Apache Karaf 4.0.8** (Archived), please use **cxf 3.1.10**

 - Install Apache Felix WebConsole
 - Add Repo for CXF
 - Add Repo for Jackson
 - Install features for CXF
 - Install features for Jackson-JAXRS-JSON
 
	feature:install webconsole
	feature:repo-add cxf 3.1.10
	feature:install http cxf-jaxrs cxf
	feature:repo-add mvn:org.code-house.jackson/features/2.7.6/xml/features
	feature:install jackson-jaxrs-json-provider jetty
	
Open the Apache Felix WebConsole from Web Browser

	http://{your local IP}:8181/system/console			
	
For example:

	http://192.168.1.50:8181/system/console			
	
Screenshot of 

![Web Console](https://raw.githubusercontent.com/ali-irawan/microservices-example/master/src/main/resources/webconsole.png  "WebConsole")

Screenshot of Install Bundle

![Install Bundle](https://raw.githubusercontent.com/ali-irawan/microservices-example/master/src/main/resources/install-bundle.png  "Install Bundle")

# Testing the REST

Open in your browser

	http://192.168.1.50:8181/cxf
	http://192.168.1.50:8181/cxf/user
	http://192.168.1.50:8181/cxf/account/user/1
		