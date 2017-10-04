#!/usr/bin/env bash

if [ ! -e secondstring-20120620.jar ]; then
  wget https://downloads.sourceforge.net/project/secondstring/secondstring/June-2012/secondstring-20120620.jar
fi

mvn deploy:deploy-file \
  -Durl=scpexe://onawh.im/maven \
  -DrepositoryId=ssh-repository \
  -Dfile=secondstring-20120620.jar \
  -DgroupId=com.github.agreementmaker \
  -DartifactId=secondstring \
  -Dversion=20120620 \
  -Dpackaging=jar \
  -DgeneratePom=true \
  -DgeneratePom.description="A Java toolkit for developing and evaluating approximate string comparison operators - https://sourceforge.net/projects/secondstring"
