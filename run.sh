#!/bin/bash

DW_OPTIONS=`set | grep ^dw_ | awk -F= '{gsub(/_/,".", $1); print "-D"$1"="$2}' | tr -d "'" |  tr '\n' ' '`

echo "Running Dropwizard Config Test with options ${DW_OPTIONS}"

if [ -n "$DW_OPTIONS" ]; then
    java "$DW_OPTIONS" -jar target/dropwizard-config-test-1.0-SNAPSHOT.jar server config.yml
else
    java -jar target/dropwizard-config-test-1.0-SNAPSHOT.jar server config.yml
fi
