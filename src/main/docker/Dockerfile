FROM java:8-jdk
MAINTAINER "Ali Irawan" <boylevantz@gmail.comp>
ENV JAVA_HOME /usr/lib/jvm/java-8-openjdk-amd64
ENV KARAF_VERSION=4.1.6

# Version 4.0.8 or 4.1.6 is in archive
# Check here https://karaf.apache.org/download.html

# For active distributions
# ENV KARAF_URL=https://www-us.apache.org

# For archived distributions
ENV KARAF_URL=http://archive.apache.org


RUN wget ${KARAF_URL}/dist/karaf/${KARAF_VERSION}/apache-karaf-${KARAF_VERSION}.tar.gz; \
    mkdir /opt/karaf; \
    tar --strip-components=1 -C /opt/karaf -xzf apache-karaf-${KARAF_VERSION}.tar.gz; \
    rm apache-karaf-${KARAF_VERSION}.tar.gz; \
    mkdir /deploy; \
    sed -i 's/^\(felix\.fileinstall\.dir\s*=\s*\).*$/\1\/deploy/' /opt/karaf/etc/org.apache.felix.fileinstall-deploy.cfg
VOLUME ["/deploy"]
EXPOSE 1099 8101 8181 44444
ENTRYPOINT ["/opt/karaf/bin/karaf"]