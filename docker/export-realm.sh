#!/usr/bin/env bash

set -e

mkdir -p ./export

name=keycloak_export
realm=luxlunch

docker run --rm --name "$name" --net docker_stack -v $(pwd)/export:/tmp/keycloak-export \
  -e KEYCLOAK_USER=admin -e KEYCLOAK_PASSWORD=admin \
  -e DB_VENDOR=POSTGRES -e DB_ADDR=postgres -e DB_DATABASE=keycloak \
  -e DB_SCHEMA=public -e DB_USER=postgres -e DB_PASSWORD=password \
  jboss/keycloak:9.0.2 \
  -Dkeycloak.migration.action=export \
  -Dkeycloak.migration.provider=singleFile \
  -Dkeycloak.migration.file=/tmp/keycloak-export/realm-export.json \
  -Dkeycloak.migration.usersExportStrategy=REALM_FILE \
  -Dkeycloak.migration.realmName=$realm

#mv ./export/realm-export.json ./keycloak-server/

