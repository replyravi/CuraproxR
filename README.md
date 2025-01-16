# CuraproxR

This repository hosts a robust mobile automation framework tailored for testing mobile applications. The framework employs Cucumber for Behavior-Driven Development (BDD), Java as the core programming language, and Jenkins for Continuous Integration/Continuous Deployment (CI/CD).

## Features

- **BDD with Cucumber:** Write test scenarios in Gherkin syntax, making them readable and user-friendly.
- **Java-Based Automation:** Use Java to define step definitions and business logic for tests.
- **CI/CD Ready:** Fully integrated with Jenkins for automated builds, testing, and deployment.
- **Cross-Platform Testing:** Capable of testing applications across multiple mobile platforms.

## Prerequisites

Ensure the following tools and dependencies are installed on your system:

- **Java Development Kit (JDK):** Version 8 or higher.
- **Apache Maven:** For dependency management and project builds.
- **Cucumber:** To enable BDD-style testing.
- **Jenkins:** To configure CI/CD pipelines.

## Installation

1. **Clone the Repository:**

   ```bash
   git clone https://github.com/replyravi/CuraproxConsumerR.git
   ```

2. **Navigate to the Project Directory:**

   ```bash
   cd CuraproxConsumerR
   ```

3. **Install Dependencies:**

   Use Maven to install the required dependencies:

   ```bash
   mvn clean install
   ```

## Running Tests

Execute the tests locally using the following Maven command:

```bash
mvn test
```

This will run all test scenarios defined in the `src/test` directory.

## Continuous Integration

The project includes a Jenkins pipeline configuration for CI/CD:

1. **Set up Jenkins Job:**
   - Create a new Jenkins job and configure the Git repository.
   - Set up Maven build steps for test execution.

2. **Trigger Pipeline:**
   - Automatically trigger test execution on code changes or scheduled intervals.

## Folder Structure

- **src/test:** Contains feature files, step definitions, and test resources.
- **src/main:** Holds utility classes and reusable components.

## Contributing

Contributions are welcome! Follow these steps to contribute:

1. Fork the repository.
2. Create a new branch for your feature or fix.
3. Commit your changes with descriptive messages.
4. Open a pull request for review.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.

## Contact

For any questions or support, please open an issue in this repository or contact the maintainer directly.

---

Happy Testing! 🚀
