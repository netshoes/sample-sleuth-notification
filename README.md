[![Build Status](https://travis-ci.org/netshoes/sample-sleuth-notification.svg?branch=master)](https://travis-ci.org/netshoes/sample-sleuth-notification)

# Sample for Spring Cloud Sleuth - Notification Microservice
Simple project to show how spring-cloud-sleuth works.

# Running
## Dependencies
First you must install and run the dependencies.

### Zipkin
```
docker pull openzipkin/zipkin:2.7.3
docker run -d -p 9411:9411 --name openzipkin-2.7.3 openzipkin/zipkin:2.7.3
```

## Application
### From source code
```mvn spring-boot:run```

### From Docker
``` 
docker pull netshoes/sample-sleuth-notification
docker run -d  -p 8081:8081 -e ZIPKIN_ADDRESS='http://localhost:9411' --name sample-sleuth-notification netshoes/sample-sleuth-notification
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