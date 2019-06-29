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
	
		