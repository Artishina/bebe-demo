FROM centos

RUN yum install -y java

VOLUME /tmp
ADD /bebe-demo-0.0.3-SNAPSHOT.jar myapp.jar
RUN sh -c 'touch /myapp.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/myapp.jar"]