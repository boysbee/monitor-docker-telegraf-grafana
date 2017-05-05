#!/bin/sh

docker run --rm telegraf -sample-config > telegraf.conf
