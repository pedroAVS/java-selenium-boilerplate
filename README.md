# MB.io Java Selenium Framework
More details on [QA java-selenium-framework confluence page](https://confluence.mercedes-benz.io/display/CI/Java+selenium+webdriver)


## Test types
### UI
We are using [Selenium](https://www.seleniumhq.org) webdriver.
You can create a page or component (what fit to your test case), and interact with webElements.

### API
Here we are using [RestAssured](http://rest-assured.io). 
You can create simple test (under testapi folder) to validate a REST api or if needed you can mix in the same e2e the UI and API testing.

### Layout
Here we are using [Galen](http://galenframework.com/).
You can create your specs (under resources/layoutSpecs folder) and assert per page/component.
The report can be founded under target/report.html

### Cucumber
Here we are using [Galen](https://cucumber.io)
You can create your feature files (under resources/cucumberFeatures folder) and create your test scenarios per page/component.

## How to execute
You have 3 options to execute the test (locally, MBio infrastructure or with Jenkins).

##### 1) Locally
Execute docker compose
```
docker-compose up -d
```

Expected output
```
Creating java-selenium-framework_elgalu_1 ... done
Creating java-selenium-framework_zalenium_1 ... done
Creating java-selenium-framework_firefox_1  ... done
Creating java-selenium-framework_chrome_1   ... done
```

ZaleniumGrid should be available with 2 nodes: 
```
http://localhost:4444/grid/console
```
Zalenium dashboard:
```
http://localhost:4444/dashboard/#
```

Execute tests with default profile
```
mvn -Dgrid.browser=${targetBrowser} -Dgrid.viewport=${targetViewport} -Dtest.folder=${targetFolder} test

Example: 
mvn -Dgrid.browser=chrome -Dgrid.viewport=desktop -Dtest.folder=flows test
```

##### 2) MBio infrastructure
Execute tests with test/int profile (you need to be on MB.io network)

ZaleniumGrid should be available with multiple nodes: 
```
https://zalenium.cicd.intra.oneweb.mercedes-benz.io/grid/console
```
Zalenium dashboard:
```
https://zalenium.cicd.intra.oneweb.mercedes-benz.io/dashboard/#
```

```
mvn -Dgrid.browser=${targetBrowser} -Dgrid.viewport=${targetViewport} -Dtest.folder=${targetFolder} -Dspring.profiles.active=${targetProfile} test

Example: 
mvn -Dgrid.browser=chrome -Dgrid.viewport=desktop -Dtest.folder=flows -Dspring.profiles.active=int test
```

##### 3) Jenkins pipeline
Execute tests via jenkins pipeline (you need to be on MB.io network)

ZaleniumGrid should be available with multiple nodes: 
```
https://zalenium.cicd.intra.oneweb.mercedes-benz.io/grid/console
```
Zalenium dashboard:
```
https://zalenium.cicd.intra.oneweb.mercedes-benz.io/dashboard/#
```
Layout report:
```
https://jenkins.cicd.test.intra.oneweb.mercedes-benz.io/job/testautomation-java-selenium-framewoek/job/testautomation-java-selenium-framwork/Galen_20layout_20testing_20Report/
```

Open [Jenkins Mb.io](https://jenkins.cicd.test.intra.oneweb.mercedes-benz.io/job/testautomation-QA-java-selenium-framework/)
```
Build with Parameters
> Select the branch
> Select the target browser
> Select the target viewPort
> Select the target folder
```

## Built With
* [Selenium](https://www.seleniumhq.org)
* [Zalenium](https://opensource.zalando.com/zalenium/)
* [Maven](https://maven.apache.org/)
* [Docker](https://www.docker.com/docker-community)
* [RestAssured](http://rest-assured.io)
* [Galen](http://galenframework.com/)
* [Assertj](https://assertj.github.io/doc/)
* [Maven-Surefire](https://maven.apache.org/surefire/maven-surefire-plugin/)
* [Cucumber](https://cucumber.io)