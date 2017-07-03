#!/bin/sh

className=BBSAdminBootstrap

pid=`/usr/local/java/bin/jps | grep $className | awk '{print $1}'`


if [ "$pid" != "" ]
then
        kill -9 $pid
        echo "kill pid "$pid
else

        echo "pid: not found"

fi