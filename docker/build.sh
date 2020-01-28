#!/usr/bin/env bash

set -e

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

docker build -t "luxlunch-server/luxlunch-api-gateway" $DIR/../luxlunch-api-gateway
docker build -t "luxlunch-server/luxlunch-monitor-dashboard" $DIR/../luxlunch-monitor-dashboard
docker build -t "luxlunch-server/luxlunch-account-microservice" $DIR/../luxlunch-account-microservice

docker build -t "luxlunch-server-dev/luxlunch-api-gateway" --file $DIR/../luxlunch-api-gateway/Dockerfile.dev $DIR/../luxlunch-api-gateway
#docker build -t "luxlunch-server-dev/luxlunch-monitor-dashboard" --file $DIR/../luxlunch-monitor-dashboard/Dockerfile.dev  $DIR/../luxlunch-monitor-dashboard
#docker build -t "luxlunch-server-dev/luxlunch-account-microservice" --file $DIR/../luxlunch-account-microservice/Dockerfile.dev $DIR/../luxlunch-account-microservice

