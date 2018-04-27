# Sample for Spring Cloud Sleuth - Notification Microservice
Simple project to show how spring-cloud-sleuth works.

# Running
## Zipkin
```
docker pull openzipkin/zipkin:2.7.3
docker run -d --name openzipkin-2.7.3 -p 9411:9411 openzipkin/zipkin:2.7.3
```

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