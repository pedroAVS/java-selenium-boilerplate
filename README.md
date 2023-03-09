# Java Selenium Framework
### Currently this framework is outdated and need maintenance. 

#### The tests are not running but the idea here is just to give an idea on how to run tests using Java with Selenium, on a springboot framework and using BDD methodology. The tests are meant to run on a Zalenium Grid to avoid having to manage webdriver files on the repository

## Test types
### UI
We are using [Selenium](https://www.seleniumhq.org) webdriver.
You can create a page or component (what fit to your test case), and interact with webElements.

### API
WIP 

### Layout
WIP

### Cucumber
Here we are using [Cucumber](https://cucumber.io)
You can create your feature files (under resources/cucumberFeatures folder) and create your test scenarios per page/component.

## How to execute
You have 3 options to execute the test (locally or with Github actions).

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

##### 2) GitHub Actions
WIP


## Built With
* [Selenium](https://www.seleniumhq.org)
* [Zalenium](https://opensource.zalando.com/zalenium/)
* [Maven](https://maven.apache.org/)
* [Docker](https://www.docker.com/docker-community)
* [Assertj](https://assertj.github.io/doc/)
* [Maven-Surefire](https://maven.apache.org/surefire/maven-surefire-plugin/)
* [Cucumber](https://cucumber.io)