# Cucumber Selenium CI/CD Automation Project

This project demonstrates a complete **end-to-end automation testing framework** built with **Selenium WebDriver**, **Cucumber (BDD)**, and **Maven**, integrated into a **Jenkins CI/CD pipeline**.  
It focuses on building reliable, maintainable, and scalable test automation that can be easily triggered via Jenkins jobs or GitHub commits.

---

##  Current Features
-  Automated web testing using **Selenium WebDriver**
-  BDD test scenarios written in **Cucumber (Gherkin)**
-  Maven for build management and dependencies
-  Jenkins integration for **Continuous Integration (CI)**
-  Example test: Validating DuckDuckGo search functionality

---

##  Tech Stack
| Tool | Purpose |
|------|----------|
| **Java** | Programming language |
| **Selenium WebDriver** | Browser automation |
| **Cucumber** | Behavior Driven Development (BDD) |
| **Maven** | Build and dependency management |
| **JUnit** | Test execution |
| **Jenkins** | Continuous Integration / Continuous Deployment |

---

##  CI/CD Workflow
1. Developer pushes code to GitHub   
2. Jenkins automatically triggers build  
3. Maven runs all Cucumber tests  
4. Test results (pass/fail) appear in Jenkins reports   

---

##  Future Enhancements
-  Integrate **API testing** using RestAssured  
-  Add **Cucumber HTML and JSON reporting** in Jenkins  
-  Connect with **Docker** to run tests in containers  
-  Implement **parallel test execution** for faster runs  
-  Integrate **Slack or Email notifications** for test results  
-  Add **cross-browser testing** support using Selenium Grid  

---

## 🏁 How to Run Tests
### From Terminal
```bash
mvn clean test
