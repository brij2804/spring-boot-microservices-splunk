# Springboot Microservices Splunk repo
All Springboot Microservices Splunk projects

## Tech Stack - SpringbootMicroservices Part1
  - java17, 
  - springboot-starter 3.1.0-M2,
  - Splunk 9.0,
  - micrometer-tracing-bridge-brave
  - log4j2

## Modules
- inventory-service
- payment-service
- order-server

## Splunk Index
- order-service
   - Source name = order-service-http-event-logs
   - Name = order-service-logs
   - Index = order_service_idx
- payment-service
    - Source name = payment-service-http-event-logs
    - Name = payment-service-logs
    - Index = payment_service_idx
- inventory-service
    - Source name = inventory-service-http-event-logs
    - Name = inventory-service-logs
    - Index = inventory_service_idx