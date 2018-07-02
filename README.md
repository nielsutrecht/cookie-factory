Cookie Factory Microservice Architecture Example
================================================

Introduction
------------

This project is used to demonstrate a micro service architecture on Kubernetes. There are 3 micro services working 
together to supply you with cookies!

* Cookie service: the front-facing service where cookies can be ordered.
* Factory service: the 'worker' service where cookies are being fabricated
* Stock service: the service responsible for maintaining an inventory of ingredients
* Gateway service: Spring Cloud Gateway exposing a facade over the services

Build / run
-----------

* Maven: `mvn clean package`
* Docker: 
  * `docker build -t cookiefactory/gatewayservice:1.0 .`
  * `docker run -d -p 8080:8080 --name gatewayservice cookiefactory/gatewayservice:1.0`


