#!/usr/bin/env bash
echo "$DOCKER_PASSWORD" | docker login -u "$DOCKER_USERNAME" --password-stdin
docker push netshoes/sample-sleuth-notification:latest
docker push netshoes/sample-sleuth-notification:1.0-SNAPSHOT