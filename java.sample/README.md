# Introduction

* This sample project is provided for support to make Java development environment before test project.
* This sample project have same structure and maven file (pom.xml) as the test project. 
* You can choose any kinds of Java IDE you prefer (InteliJ, Eclipse, STS, etc.) for this project.


# Step

1. Install Java IDE if you didn't have
2. Open this sample project as a Maven project using JAVA IDE 
3. Run maven build

``` 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.nhnent.service.HelloTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.036 s - in com.nhnent.service.HelloTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] 
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ sample ---
[INFO] Building jar: /Users/peter/Downloads/java.sample/target/sample.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.417 s
[INFO] Finished at: 2022-08-24T09:01:58-07:00
[INFO] ------------------------------------------------------------------------
```

* If you can see the result like the above (BUILD SUCCESS), you are ready to test with test project.