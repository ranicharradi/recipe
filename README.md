# SOAP Web Service 

### Server Must Be Running
Before testing, ensure the SOAP server is started:
```
URL: http://localhost:8080/ws/recipes
WSDL: http://localhost:8080/ws/recipes?wsdl
```

## Starting the Server

1. Open the project in IntelliJ
2. Run the **ServerPublisher** configuration
3. Wait for console message: `Server started at: http://localhost:8080/ws/recipes`


### Verify Server is Running
Open browser and navigate to:
```
http://localhost:8080/ws/recipes?wsdl
```
You should see the WSDL XML document.






