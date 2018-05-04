#!/usr/bin/env bash

export ZIPKIN_ADDRESS=$1 # Address of Zipkin. e.g. http://localhost:9411

exec $(type -p java) \
  -jar /opt/sample-sleuth-notification.jar \
  --spring.zipkin.baseUrl=${ZIPKIN_ADDRESS}