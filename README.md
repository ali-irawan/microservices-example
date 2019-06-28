# microservices-example
Microservices-example based on OSGi bundle

Run Karaf in Docker

	docker build -t karaf-api .
	docker run -d --name karaf -p 1099:1099 -p 8101:8101 -p 8181:8181 -p 44444:44444 karaf-api