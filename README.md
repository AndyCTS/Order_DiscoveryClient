# Overview of the problem which we are trying to solve
The problem which is attempted to solve here is the physical manifestation of a shopping cart as a message queue in RaabitMQ. The holistic architecture of the problem is as mentioned below in the archhitecture diagram.

Since this problem as of now is more on setting the technical infrastructure to help build the application in future - hence there is a very limited applicability of JUnit based test cases. 

This particular service exposes the REST endpoints to have the order-producer tested. It hard codes a particular Order Master POJO and calls the REST API endpoint of the producer - which serializes and writes this POJO to a RabbitMQ in PCF. 


# Salient features developed
1) Service Discovery
2) Solution orchestration using AMQP for data provisioning and consuming.

# Salient features planned and in progress
1) Configuration as a service
2) API Gateway
3) CQRS
4) Solution orchestration using AMQP for event provisioning and consuming.

# Architecture Diagram
![Architecture Overview - Shopping cart application](/images/Shopping-cart-architecture.png?raw=true)



