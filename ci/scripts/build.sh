#!/bin/sh
set -e

ln -s "$PWD/maven" "$HOME/.m2"

cd git-repo
	./mvnw clean package
cd ..
cp git-repo/target/consumer-0.1.0-SNAPSHOT.jar build-output/consumer.jar
