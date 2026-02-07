# MyPlaywright_framework

Welcome to the **MyPlaywright_framework** repository! This project serves as a comprehensive automation testing suite, showcasing implementations of industry-standard testing frameworks.

Currently, the repository features a robust **Selenium with Java** automation framework designed for enterprise-level testing, specifically targeting Salesforce login functionality.

## 📂 Project Structure

The project is organized as follows:

- **`promots_RicePot/`**: Contains the core automation resources.
  - **`SeleniumFramework/`**: The main Maven project containing the source code and tests.
  - **`RicePot.md`**: Specifications and prompt details for the Selenium framework implementation.

## 🔄 Automation Flow Diagram

The following diagram illustrates the execution flow of the automation suite, from test initialization to result verification.

```mermaid
graph TD
    A["Start Test Execution (Maven/TestNG)"] --> B{"Test Suite Setup"}
    B -- "@BeforeTest" --> C["Initialize WebDriver"]
    C --> D["Navigate to Salesforce Login"]
    D --> E["Execute Test Case (@Test)"]
    
    subgraph "Page Object Model"
        E --> F["LoginPage Object"]
        F -- "Enter Credentials" --> G["Identify Elements (XPath)"]
        G -- "Perform Actions (SendKeys, Click)" --> H["Selenium Actions"]
    end
    
    H --> I{"Verify Login"}
    I -- "Success" --> J["Assert Dashboard Presence"]
    I -- "Failure" --> K["Assert Error Message"]
    
    J --> L["Teardown (@AfterTest)"]
    K --> L
    L --> M["Close Browser"]
    M --> N["Generate Test Report"]
```

## 🚀 Features

- **Enterprise-Grade Architecture**: Built using the Page Object Model (POM) design pattern with PageFactory for maintainability and scalability.
- **Robust Error Handling**: Implements structured try-catch blocks and explicit exception handling.
- **Test Management**: Utilizes **TestNG** for test execution, annotations (`@Test`, `@BeforeTest`), and assertions.
- **Locator Strategy**: Exclusively uses **XPath** locators for precise element identification.
- **Build Automation**: Managed with **Maven** for dependency management and build lifecycle.

## 🛠️ Tech Stack

The framework is built using a modern and robust stack of technologies ensuring reliability, scalability, and ease of maintenance.

| Component | Technology | Description |
| :--- | :--- | :--- |
| **Language** | ![Java](https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=java&logoColor=white) | Core programming language for script development. |
| **Automation Core** | ![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=flat-square&logo=selenium&logoColor=white) | WebDriver for browser interaction and automation. |
| **Test Runner** | ![TestNG](https://img.shields.io/badge/TestNG-FF7F00?style=flat-square&logo=testng&logoColor=white) | Framework for test management, assertions, and reporting. |
| **Design Pattern** | **Page Object Model (POM)** | Design pattern for creating an object repository for web UI elements. |
| **Build Tool** | ![Maven](https://img.shields.io/badge/Maven-C71A36?style=flat-square&logo=apachemaven&logoColor=white) | Dependency management and build lifecycle automation. |
| **Version Control** | ![Git](https://img.shields.io/badge/Git-F05032?style=flat-square&logo=git&logoColor=white) | Distributed version control system. |

## 🏁 Getting Started

### Prerequisites

Ensure you have the following installed on your system:
- **Java JDK** (version 8 or higher)
- **Maven**
- **Git**

### Installation

1.  **Clone the repository**:
    ```bash
    git clone https://github.com/aaabhishekgole/MyPlaywright_framework.git
    ```

2.  **Navigate to the framework directory**:
    ```bash
    cd MyPlaywright_framework/promots_RicePot/SeleniumFramework
    ```

3.  **Install dependencies**:
    ```bash
    mvn clean install
    ```

### Running Tests

To execute the test suite, run the following command from the `SeleniumFramework` directory:

```bash
mvn test
```

## 🔮 Future Roadmap

- **Playwright Integration**: Incorporate Playwright for modern, fast, and reliable end-to-end testing (aligning with the repository name).
- **Expanded Test Coverage**: Add more complex test scenarios beyond authentication.
- **CI/CD Integration**: Set up automated pipelines for continuous testing.

---
*Created by [Abhishek Gole](https://github.com/aaabhishekgole)*
