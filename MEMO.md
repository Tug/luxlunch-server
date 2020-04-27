

## Generate swagger client

docker run --rm -v ${PWD}:/local swaggerapi/swagger-codegen-cli generate \
    --input-spec https://www.treezor.com/api-documentation/rest.yaml \
    --auth
    --lang java-vertx-async \
    --output /local/out/java-vertx-async

## curl Keycloak

curl -L -X POST 'http://localhost:8180/auth/realms/luxlunch/protocol/openid-connect/token' \
-H 'Content-Type: application/x-www-form-urlencoded' \
--data-urlencode 'client_id=luxlunch-web-frontend-dev' \
--data-urlencode 'grant_type=password' \
--data-urlencode 'scope=openid' \
--data-urlencode 'username=tug@luxlunch.lu' \
--data-urlencode 'password=password'

curl -L -X POST 'http://localhost:8180/auth/realms/luxlunch/protocol/openid-connect/token' \
-H 'Content-Type: application/x-www-form-urlencoded' \
--data-urlencode 'client_id=luxlunch-server-dev-client' \
--data-urlencode 'grant_type=password' \
--data-urlencode 'client_secret=0797a3fa-e813-4c5a-99ca-c399fd002582' \
--data-urlencode 'scope=openid' \
--data-urlencode 'username=tug@luxlunch.lu' \
--data-urlencode 'password=password'

