#! /usr/bin/env/bash

cd app

docker compose down
docker compose up -d
echo 'Build complete'