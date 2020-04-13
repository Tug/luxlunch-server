
## realm-export.json

Export of clients and realm config from Keycloak web admin,
secrets such as client secrets and smtp password (api key) added back manually

## keycloak-add-user.json

Generated with:
- `docker exec -it docker_keycloak-server_1 bash`
- `$JBOSS_HOME/bin/add-user-keycloak.sh -r luxlunch --user tug@luxlunch.lu --password password`

