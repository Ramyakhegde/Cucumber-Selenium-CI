Cucumber-Selenium CI Pipeline
Overview

This project demonstrates a Continuous Integration (CI) pipeline using Selenium WebDriver, Cucumber (BDD), and Jenkins.
The purpose of this setup is to automate browser-based functional testing and ensure tests run automatically whenever code changes are committed or a Jenkins build is triggered.

Tech Stack

Java (JDK 17)

Selenium WebDriver

Cucumber (BDD Framework)

JUnit

Maven (Build Tool)

Jenkins (CI Server)

CI Pipeline Workflow

Developer commits code to the GitHub repository.

Jenkins automatically pulls the latest code from the repository.

Maven builds the project and runs the automated tests (mvn clean test).

Cucumber executes test scenarios written in Gherkin syntax.

Test results and reports are generated automatically inside the target folder.

Example Feature File

Feature: DuckDuckGo Search Functionality

Scenario: Verify DuckDuckGo search works
  Given I open the browser
  When I navigate to "https://duckduckgo.com"
  And I search for "Selenium WebDriver"
  Then the page title should contain "Selenium WebDriver"

Jenkins Setup

Open Jenkins and create a new Freestyle Project.

Under Source Code Management, select Git and provide your repository URL.

Under the Build section, add the following command:

mvn clean test


Save the configuration.

Click Build Now to trigger the pipeline. Jenkins will pull the latest code, run Maven tests, and display results in the console output.

Folder Structure
cucumber_selenium/
├── pom.xml
├── src/
│   ├── main/
│   │   └── java/
│   └── test/
│       ├── java/
│       │   ├── runners/
│       │   └── stepDefinitions/
│       └── resources/
│           └── features/
│               └── DuckDuckGoSearch.feature
└── target/

Future Scope

Integrate detailed HTML reports using Allure or Extent Reports.

Extend the project to include Continuous Deployment (CD) to automate post-test deployments.

Configure parameterized Jenkins builds for flexible test execution.

Enable parallel test execution to reduce build time.

---

## 🏁 How to Run Tests
### From Terminal
```bash
mvn clean test
