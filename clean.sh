#! bin/sh

cp -rf {WORKSPACE}/mob-demo-service/target/mob-demo-service-1.0.0-SNAPSHOT-package/*  $TMP/
rm -rf {WORKSPACE}/*
mv $TMP/* {WORKSPACE}/