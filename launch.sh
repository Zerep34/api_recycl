#! /bin/bash

sudo rm -rf sql

sudo mvn clean

sudo mvn install -DskipTests

sudo docker-compose up --build -d