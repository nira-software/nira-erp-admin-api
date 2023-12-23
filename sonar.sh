#!/bin/sh
docker run --rm -e SONAR_HOST_URL="https://sonarqube.victorcornejo.com" -e SONAR_TOKEN="$TOKEN_SONAR_REX" -v "$(pwd):/usr/src" sonarsource/sonar-scanner-cli