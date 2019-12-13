# webapptest

# used Technology
    junit for unit testing
    springboot (embeded tomcat)
    eclipse
    Flow

* it only call once the rest service to get the datas, then after it store in the 
  memory and response from the singelton storage 
 
* i tried to mimic in the springboot main class commandlinerunner when the application 
  start to make the request and store it in the memory for simplicity i put all the logic in the controller class.
 
* i didnt follow mvc pattern, briefly organized the json hierarch structure, inside the 
  it.ats.webproject.model package, since the data (atm json found under the specifed Rest api) 
  is not big enough i didnt use those models, i only use Responseentity<String> which provide
  me the free json converting mechanism


# url http://localhost:8081/atms

# compilation:

be inside the home folder of the webproject
you can test it in two way

either using curl

or

by creating jar, and execute the jar(i already created the jar inside target folder)

mvn spring-boot:run :-- for running the application 
mvn package :-- for creating the jar


# for simplicity:
in the main folder i put two bash(windows script)

# runapp:- for runing the application
# testapp:- for executing the test
