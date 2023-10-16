#!/bin/bash

if [ ! -f "openapi-generator-cli-7.0.1.jar" ]; then
  printf "openapi generate cli missing\n"
  exit 1
fi

if [ ! -f "api-docs.json" ]; then
  printf "SimSage api-docs.json missing from instance\n"
  exit 1
fi

rm -rf lib-simsage/php
mkdir -p lib-simsage/php
cd lib-simsage/php
cp ../../openapi-generator-cli-7.0.1.jar .
cp ../../api-docs.json .

java -jar openapi-generator-cli-7.0.1.jar generate -i api-docs.json --skip-validate-spec -g php

rm -f api-docs.json
rm -f openapi-generator-cli-7.0.1.jar
