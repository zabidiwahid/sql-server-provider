### This is a simple Spring Boot Application on using Microsoft Sql Server 2008 as Datasource

There are a little modification to the Docker Base Image since the Sql Server that was running not support the latest TLS version.

Steps to run:

1. docker build -t sql-server-provider
2. docker run -d -p 8080:8080 sql-server-provider


