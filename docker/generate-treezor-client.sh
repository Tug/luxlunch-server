#!/usr/bin/env bash

set -e

docker run --rm -v ${PWD}/export:/local swaggerapi/swagger-codegen-cli generate \
    --input-spec https://www.treezor.com/api-documentation/rest.yaml \
    --lang java \
    --library vertx \
    --model-name-prefix Treezor \
    --group-id "lu.luxlunch" \
    --artifact-id treezor-api-client-vertx \
    --artifact-version 1.0.0 \
    --output /local/treezor-api-client-vertx \
    -DhideGenerationTimestamp=true
