#!/bin/bash

# wget https://repo1.maven.org/maven2/org/openapitools/openapi-generator-cli/7.0.1/openapi-generator-cli-7.0.1.jar
VERSION=7.11.4

if [ ! -f "openapi-generator-cli-7.0.1.jar" ]; then
  printf "openapi generate cli missing\n"
  exit 1
fi

if [ ! -f "api-docs-$VERSION.json" ]; then
  printf "SimSage api-docs-$VERSION.json missing from instance\n"
  exit 1
fi

rm -rf lib/csharp
mkdir -p lib/csharp
cd lib/csharp
cp ../../openapi-generator-cli-7.0.1.jar .
cp ../../api-docs-$VERSION.json ./api-docs.json

java -jar openapi-generator-cli-7.0.1.jar generate -i api-docs.json --skip-validate-spec -g csharp

rm -f api-docs.json
rm -f openapi-generator-cli-7.0.1.jar
rm -f git_push.sh

