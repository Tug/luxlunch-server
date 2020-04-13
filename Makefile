current_dir = $(shell pwd)

start-all-dev:
	mvn clean install -Dmaven.test.skip=true
	cd docker && ./build.sh
	cd docker && ./run.sh
	docker-compose -f docker-compose-dev.yml up

rebuild-all-dev:
	docker-compose -f docker-compose-dev.yml build

old-old-server-dev:
	cd luxlunch-account-microservice && mvn vertx:run -Dvertx.config=src/config/local.json &
	cd luxlunch-api-gateway && mvn vertx:run -Dvertx.config=src/config/local.json &
	cd luxlunch-monitor-dashboard && mvn vertx:run -Dvertx.config=src/config/local.json &
	cd luxlunch-frontend && npm start

old-server-dev:
	mvn compile vertx:run -pl :luxlunch-launcher-dev &
	docker-compose -f docker/docker-compose-dev-partial.yml up

dev:
	docker-compose -f docker/docker -compose-dev.yml up

