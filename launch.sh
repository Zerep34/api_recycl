#! /bin/bash

sudo docker-compose stop

sudo rm -rf sql

sudo mvn clean

sudo mvn install -DskipTests

sudo docker-compose up --build -d