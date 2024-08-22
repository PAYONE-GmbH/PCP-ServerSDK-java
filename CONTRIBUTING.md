# Contributing to the PAYONE Commerce Platform Java SDK

Thank you for considering contributing to the PAYONE Commerce Platform Java SDK! We appreciate your efforts to help improve this project. Below are guidelines for contributing.

## How to Contribute

### Pull Requests

We welcome pull requests! Please follow these steps to submit one:

1. **Fork** the repository and create your branch from `main`.
2. **Install** any dependencies and ensure the project builds and passes tests.

   ```sh
   ./gradlew :lib:build
   ```

3. **Develop** your changes.
4. **Test** your changes thoroughly.
   ```sh
   ./gradlew :lib:test
   # or for coverage
   ./gradlew :lib:jacocoTestReport
   ```
5. **Write** clear, concise, and self-explanatory commit messages.
6. **Open** a pull request with a clear title and description of what your change does.

### Reporting Bugs

If you encounter any bugs, please report them using one of the following methods:

1. **Issue Tracker**: Submit an issue through our [issues tracker](https://github.com/PAYONE-GmbH/PCP-ServerSDK-java/issues/new).
2. **Security Issues**: For security-related issues, please contact our IT support via email at tech.support@payone.com with a clear subject line indicating that it is a security issue. This ensures that the issue will be visible to and handled by the PAYONE tech support team.
