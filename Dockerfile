FROM maven

ADD . dropwizard-config-test
WORKDIR dropwizard-config-test

RUN mvn clean package

CMD ./run.sh

EXPOSE 8080
