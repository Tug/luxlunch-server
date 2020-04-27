FROM jboss/keycloak:9.0.2

ENV KEYCLOAK_USER=admin
ENV KEYCLOAK_PASSWORD=admin
ENV PROXY_ADDRESS_FORWARDING=false
ENV KEYCLOAK_IMPORT=/tmp/realm-export.json

COPY --chown=1000 ./realm-export.json /tmp/realm-export.json
COPY --chown=1000 ./keycloak-add-user.json /opt/jboss/keycloak/standalone/configuration/keycloak-add-user.json
