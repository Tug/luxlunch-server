FROM openjdk:13

ENV VERTICLE_FILE target/luxlunch-monitor-dashboard-fat.jar

# Set the location of the verticles
ENV VERTICLE_HOME /opt/verticles

EXPOSE 9100

COPY $VERTICLE_FILE $VERTICLE_HOME/
COPY src/config/docker.json $VERTICLE_HOME/

WORKDIR $VERTICLE_HOME
ENTRYPOINT ["sh", "-c"]
CMD ["java -Dvertx.logger-delegate-factory-class-name=io.vertx.core.logging.SLF4JLogDelegateFactory -jar luxlunch-monitor-dashboard-fat.jar -Dvertx.metrics.options.enabled=true -cluster -conf docker.json"]
