current_dir = $(shell pwd)

start-all-dev:
    mvn clean install -Dmaven.test.skip=true
    cd docker && ./build.sh
    cd docker && ./run.sh
    docker-compose -f docker-compose-dev.yml up

rebuild-all-dev:
    docker-compose -f docker-compose-dev.yml build
