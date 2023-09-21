FROM openjdk:11.0.6-jre-slim

# downgrade TLS for SQL Server 2008 to connect (pre SP3)
RUN sed -i 's/MinProtocol = TLSv1.2/MinProtocol = TLSv1/' /etc/ssl/openssl.cnf \
&& sed -i 's/CipherString = DEFAULT@SECLEVEL=2/CipherString = DEFAULT@SECLEVEL=1/' /etc/ssl/openssl.cnf

#COPY path-to-your-application-jar path-to-webapps-in-docker-jar
COPY ./target/sqlserver.provider-0.0.1-SNAPSHOT.jar /app/sql-server-provider.jar

CMD ["java","-Djava.security.egd=file:/dev/./urandom","-cp","/lib/*:/app/sql-server-provider.jar","org.springframework.boot.loader.JarLauncher"]
