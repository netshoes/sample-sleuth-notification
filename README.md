# Sample for Spring Cloud Sleuth - Notification Microservice
Simple project to show how spring-cloud-sleuth works with RabbitMQ

# Running
## RabbitMQ
### With Docker
```
docker pull rabbitmq:3.7.4-management
docker run -d --name rabbitmq-3.7.4 -p 5672:5672 -p 15672:15672 rabbitmq:3.7.4-management
```
Management console: http://localhost:15672
Username: guest
Password: guest

## Application
```mvn spring-boot:run```

# Available APIs
## Send notification (Mocked)
``` 
curl -X POST \
  http://localhost:8081/notify \
  -H 'Content-Type: application/json' \
  -d '{
    "to" : "john@test.com",
    "content" : "Some content"
}'
```