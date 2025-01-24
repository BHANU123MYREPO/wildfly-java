FROM jboss/wildfly:latest

# Set working directory
WORKDIR /opt/jboss/wildfly

# Copy the war file (generated during Maven build) to the WildFly deployment folder
COPY target/backend.war /opt/jboss/wildfly/standalone/deployments/

# Expose port
EXPOSE 8081
