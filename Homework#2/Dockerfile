FROM debian:stretch-slim
MAINTAINER Bartlomiej Stapor

RUN apt-get update && \
	apt-get upgrade -y && \
	apt-get install -y software-properties-common gnupg2 apt-transport-https apt-utils && \
	apt-get install -y rpm && \
	apt-get install -y yum && \
	apt-get install -y curl && \
	apt-get install -y perl	&& \
	apt-get install -y vim

RUN echo "deb https://dl.bintray.com/sbt/debian /" | tee -a /etc/apt/sources.list.d/sbt.list && \
	apt-key adv --keyserver hkp://keyserver.ubuntu.com:80 --recv 2EE0EA64E40A89B84B2DF73499E82A75642AC823 && \
	echo oracle-java8-installer shared/accepted-oracle-license-v1-1 select true | debconf-set-selections && \
	add-apt-repository -y ppa:webupd8team/java

RUN apt-get update && \
	mkdir -p /usr/share/man/man1 && \
	apt-get install -y --allow-unauthenticated oracle-java8-installer && \
	apt-get install oracle-java8-set-default && \
	apt-get install -y scala sbt
EXPOSE 9000

WORKDIR /home/
RUN git clone https://github.com/playframework/play-scala-slick-example
WORKDIR /home/play-scala-slick-example/
#CMD sbt run


RUN ["/bin/bash", "-c", "debconf-set-selections <<< 'mysql-server mysql-server/root_password password my_password'"]
RUN ["/bin/bash", "-c", "debconf-set-selections <<< 'mysql-server mysql-server/root_password_again password my_password'"]
RUN apt-get -y install mysql-server

RUN apt-get -y install mysql-client
RUN sed -i '/h2database/c\libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.24"' build.sbt
CMD sbt run





