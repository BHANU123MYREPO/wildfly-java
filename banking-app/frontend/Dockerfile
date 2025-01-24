# Use the official WildFly image as the base
FROM jboss/wildfly:latest

# Set the working directory in the container
WORKDIR /opt/jboss/wildfly

# Copy the jar file (generated during Maven build) to the WildFly deployment folder
COPY target/frontend-1.0-SNAPSHOT.jar /opt/jboss/wildfly/standalone/deployments/

# Expose port 8080
EXPOSE 8080

