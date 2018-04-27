[![Build Status](https://travis-ci.org/netshoes/sample-sleuth-notification.svg?branch=master)](https://travis-ci.org/netshoes/sample-sleuth-notification)

# Sample for Spring Cloud Sleuth - Notification Microservice
Simple project to show how spring-cloud-sleuth works.

# Running
## Zipkin
```
docker pull openzipkin/zipkin:2.7.3
docker run -d --name openzipkin-2.7.3 -p 9411:9411 openzipkin/zipkin:2.7.3
```

## Application
### From source code
```mvn spring-boot:run```

### From Docker
``` 
docker pull netshoes/sample-sleuth-notification
docker run -d --name sample-sleuth-notification -p 8081:8081 netshoes/sample-sleuth-notification
```

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