# Kafka Monolithic Application

## Overview
This repository contains a Kafka monolithic application that includes configurations for Kafka topics, endpoints, and Spring Kafka setup.

## Kafka Topics
- **Topic Name:** logi
- **Consumer Group ID:** myGroup

## Spring Kafka Configuration
The Spring Kafka configuration is set up for both producers and consumers. Below are the details:

### Consumer Configuration
- **Bootstrap Servers:** localhost:9092
- **Group ID:** myGroup
- **Auto Offset Reset:** earliest
- **Key Deserializer:** org.apache.kafka.common.serialization.StringDeserializer
- **Value Deserializer:** org.springframework.kafka.support.serializer.JsonDeserializer
- **Trusted Packages:** com.example.kafka.payload (Adjust the package name accordingly)

### Producer Configuration
- **Bootstrap Servers:** localhost:9092
- **Key Serializer:** org.apache.kafka.common.serialization.StringSerializer
- **Value Serializer:** org.springframework.kafka.support.serializer.JsonSerializer
- **Trusted Packages:** com.example.kafka.payload (Adjust the package name accordingly)

## Endpoints
The application exposes the following endpoints:

- **String Endpoint:** `localhost:8080/api/v1/messages`
  - This endpoint accepts string messages.

- **JSON Endpoint:** `localhost:8080/api/v1/messages/json`
  - This endpoint accepts JSON messages.

## How to Run
1. Clone the repository.
2. Set up and configure Kafka on your local machine.
3. Configure the Kafka topics as specified in the README.
4. Update the Spring Kafka configuration properties according to your Kafka setup.
5. Run the application.
6. Test the endpoints using a tool like Postman or cURL.
