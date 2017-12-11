#!/bin/bash

echo "------------- DOCKER -------------"
mvn clean package -U -f ./docker/

echo "------------- IMAGE PUSH -------------"
docker login -u="$DOCKER_USERNAME" -p="$DOCKER_PASSWORD"

docker build -t "$DOCKER_IMAGE_MS_DOCKER" ./docker/
docker push "$DOCKER_IMAGE_MS_DOCKER"
# - LATEST -
docker build -t "$DOCKER_IMAGE_MS_DOCKER_LATEST" ./docker/
docker push "$DOCKER_IMAGE_MS_DOCKER_LATEST"
