#!/usr/bin/env bash

set -e

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

docker build -t "luxlunch-server/luxlunch-api-gateway" $DIR/../luxlunch-api-gateway
docker build -t "luxlunch-server/luxlunch-monitor-dashboard" $DIR/../luxlunch-monitor-dashboard
docker build -t "luxlunch-server/luxlunch-account-microservice" $DIR/../luxlunch-account-microservice
