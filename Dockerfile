FROM openjdk:11
ADD target/calculatorss-0.0.1-SNAPSHOT.jar calculatorss-0.0.1-SNAPSHOT.jar
EXPOSE 8085
CMD ["java", "-jar", "calculatorss-0.0.1-SNAPSHOT.jar"]

#FROM node:alpine
#WORKDIR /src/main/frontend/calculator
#COPY /src/main/frontend/calculator/package*.json ./
#RUN npm install
#COPY /src/main/frontend/calculator .
#EXPOSE 3000
##ENTRYPOINT npm start
#CMD npm start