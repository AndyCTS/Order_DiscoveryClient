# Overview of the problem which we are trying to solve
The problem which is attempted to solve here is a small online shopping cart application where physical manifestation of the cart happens as a message queue in RaabitMQ. The holistic architecture is given below.

Note:
1) The JUnits will be accompanying all the business case scenarios which are getting developed as of now. This will be accompanying the release at a later date. 
2) The current development effort are for all technical / infra use cases where JUnits have not been used.
3) This particular service acts as a client to test the REST endpoint of the order-producer. It hard codes a particular Order - creating a POJO and calls this REST endpoint to serialize and push the POJO to RabbitMQ in PCF. 
4) The RabbitListener service consumes the JSon and de-serializes it back to POJO to save the order onto the shipping database. 

Usage to test the application:
http://service-discoverer.app.dev.digifabricpcf.com/discover/post
[Currently the orders are hardcoded onto the POJO's]

The url posts a JSON to the order-producer service which writes it to the RabbitMQ. 
The order-consumer service picks it up from the RabbitMQ and creates an order in the MySQL database by saving the JSON.


# Salient features developed
1) Service Discovery
2) Solution orchestration using AMQP for data provisioning and consuming.

# Salient features planned and in progress (not in order)
1) Configuration as a service
2) API Gateway
3) CQRS
4) Solution orchestration using AMQP for event provisioning and consuming.
5) A simple UI screen to take care of Order entry and creation.



# Architecture Diagram
![Architecture Overview - Shopping cart application](/images/Shopping-cart-architecture.png?raw=true)



