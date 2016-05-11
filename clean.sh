#!/bin/bash

ROOT=$(cd `dirname $0`; pwd)
OBJS=`find $ROOT -name "*.class" -type f`

count=0

for obj in $OBJS
do
	echo "Rm" $obj ...
	rm $obj
	if [ 0 = $? ]; then
		count=`expr $count + 1`
	fi
done

echo "All cleaned $count files"

exit 0

