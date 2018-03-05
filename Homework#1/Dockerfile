FROM ubuntu
MAINTAINER Bartlomiej Stapor

RUN apt-get update
RUN apt-get -y install libpcre3 libssl-dev
RUN apt-get -y install libpcre3-dev
RUN apt-get -y install wget zip gcc
RUN apt-get install -y libgnome2-0

# Define environment variables
ENV SHARE /usr/local/share
ENV SCALA_HOME $SHARE/scala
ENV JAVA_HOME $SHARE/java
ENV PATH=$SCALA_HOME/bin:$JAVA_HOME/bin:$PATH

# Move over JDK and Scala
ADD jdk-8u161-linux-x64.tar.gz /
ADD scala-2.13.0-M3.tgz /

# Get JDK and Scala into place
RUN mv jdk1.8.0_161 $JAVA_HOME
RUN mv scala-2.13.0-M3 $SCALA_HOME

CMD ["/bin/bash"]

RUN cd /opt
ADD typesafe-activator-1.3.12.zip /opt

RUN cd opt && unzip typesafe-activator-1.3.12.zip && mv activator-dist-1.3.12/ activator

EXPOSE 80 8888

RUN cd opt/activator/bin && export PATH=$PATH:/opt/activator/bin && /bin/bash -c "source ~/.bashrc" && chmod a+x activator

RUN mkdir -p /opt/slick
ADD slick-3.2.2.tar.gz opt/slick/
RUN mv /opt/slick/slick-3.2.2 /opt
RUN rmdir /opt/slick
RUN mv /opt/slick-3.2.2 /opt/slick
#RUN unzip slick-3.2.2.tar.gz

ENV PATH opt/activator/bin:$PATH
ENV PATH opt/slick:$PATH






