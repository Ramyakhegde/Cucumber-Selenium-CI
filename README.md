#  Cucumber Selenium CI/CD Automation Project
This project demonstrates a complete end-to-end automation testing framework built with Selenium WebDriver, Cucumber (BDD), and Maven, integrated into a Jenkins CI/CD pipeline.
It focuses on creating a reliable, maintainable, and scalable automation setup with continuous testing triggered through GitHub webhook events.
##  Current Features
-  Automated web testing using **Selenium WebDriver**
-  BDD test scenarios written in **Cucumber (Gherkin)**
-  Maven for build management and dependencies
-  Jenkins integration for **Continuous Integration (CI)**
-  GitHub Webhooks configured using **Ngrok** for auto-triggered test runs
-  Dockerized test execution to ensure consistent environment builds
-  Example test: Validating DuckDuckGo search functionality

---

##  Tech Stack
| Tool                   | Purpose |
|------------------------|----------|
| **Java**               | Programming language |
| **Selenium WebDriver** | Browser automation |
| **Cucumber**           | Behavior Driven Development (BDD) |
| **Maven**              | Build and dependency management |
| **JUnit**              | Test execution |
| **Jenkins**            | Continuous Integration / Continuous Deployment |
| **Docker**             | Containerized test execution|
| **Ngrok**              | Webhook tunneling for GitHub → Jenkins|
---

##  CI/CD Workflow
1. Code pushed to GitHub repository  
2. GitHub Webhook triggers Jenkins through Ngrok  
3. Maven executes all Cucumber tests inside Jenkins
4. Test results (pass/fail) appear in Jenkins reports   
5. (Optional step performed) Tests can run inside a Docker container for stability

---
## Docker Integration (What was done)
- Created a Dockerfile to containerize the automation framework
- Installed Maven and Java inside the container for consistent builds
- Built a Docker image and executed tests inside the container
- Verified environment behavior and debugged tests within Docker shell
- Validated that Jenkins can also execute the automation suite using the Docker image

---
##  Future Enhancements
-  Integrate **API testing** using RestAssured  
-  Add **Cucumber HTML and JSON reporting** in Jenkins  
- Implement Selenium Grid or Dockerized Browser setup  
-  Implement **parallel test execution** for faster runs  
-  Integrate **Slack or Email notifications** for test results  
-  Add **cross-browser testing** support using Selenium Grid  

---

##  How to Run Tests
### From Docker
```bash
docker build -t cucumber-ci .
docker run cucumber-ci
```

### From Terminal
```bash
mvn clean test
```