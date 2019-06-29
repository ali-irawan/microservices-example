# microservices-example
Microservices-example based on OSGi bundle

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
	
Make sure the docker container is running

	docker ps
	
Login to docker container

	docker exec -i -t karaf /bin/bash
	cd /opt/karaf/bin

Run the **client**	
	
	./client
	
Install features required

If you are using **Apache Karaf 4.2.6**, please use **cxf 3.3.2**
You may need to use correct version that supported by Karaf Runtime

	feature:repo-add cxf 3.3.2
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

		