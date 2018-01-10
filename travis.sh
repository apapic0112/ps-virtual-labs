#!/bin/bash

echo "------------- DOCKER -------------"
mvn clean package -U -f ./docker/
mvn clean package -U -f ./users/

echo "------------- IMAGE PUSH -------------"
docker login -u="$DOCKER_USERNAME" -p="$DOCKER_PASSWORD"

docker build -t "$DOCKER_IMAGE_MS_DOCKER" ./docker/
docker push "$DOCKER_IMAGE_MS_DOCKER"

docker build -t "$DOCKER_IMAGE_MS_USERS" ./users/
docker push "$DOCKER_IMAGE_MS_USERS"
