#!/bin/bash

ROOT=$(cd `dirname $0`; pwd)
cd $ROOT

SRCS=`find . -name "*.java" -type f`

for src in $SRCS
do
	echo "Compile" $src ...
	javac $src
	if [ 0 -ne $? ]; then
		exit -1
	fi
done

exit 0

