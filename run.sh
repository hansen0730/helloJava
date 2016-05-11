#!/bin/bash

ROOT=$(cd `dirname $0`; pwd)

export CLASSPATH=$CLASSPATH:$ROOT

java com.hansen.Launcher

exit 0

