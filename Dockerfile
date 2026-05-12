# Use Tomcat with Java 21 as the base
FROM tomcat:10-jdk21-openjdk

# Remove default Tomcat apps
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy your WAR file from Eclipse's target folder
# Note: Ensure you have run 'mvn install' first to generate this file!
COPY target/*.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080
CMD ["catalina.sh", "run"]