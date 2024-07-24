# PayOne Java SDK

Welcome to the Java SDK for the PayOne PCP platform! This repository contains a powerful, easy-to-use software development kit (SDK) designed to simplify the integration of online payment processing into your applications.



### TODOS
- [ ] Setup changelog
- [ ] Setup sonarcloud

## Table of Contents

- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
    - [Configuration](#configuration)
- [Contributing](#contributing)
- [License](#license)

## Features

- **Easy Integration**: Seamlessly integrate online payment processing into your application.
- **Secure Transactions**: Built with security best practices to ensure safe transactions.
- **Extensive Documentation**: Detailed documentation to help you get started quickly.
- **Open Source**: Fully open source and community-driven.

## Installation

```groovy
dependencies {
    implementation group: 'io.github.payone-gmbh', name: 'pcp-serversdk-java', version: '0.0.1'
}
```

## Usage

You can find examples and detailed usage in the [examples](./app/src/main/java/com/payone/commerce/platform/app/examples/) directory.

### Configuration

You need to configure the SDK with your API key and secret key. You can obtain these from your payment gateway provider.

```java
import com.payone.commerce.platform.lib.CommunicatorConfiguration;

CommunicatorConfiguration config = new CommunicatorConfiguration(API_KEY, API_SECRET, "preprod.commerce-api.payone.com");
```




### Run the example app

```sh
API_KEY=api_key API_SECRET=api_secret MERCHANT_ID=123 COMMERCE_CASE_ID=234 CHECKOUT_ID=345 ./gradlew :app:run
```


## Contributing

We welcome contributions from the community. If you want to contribute, please follow these steps:

Fork the repository.
Create a new branch (`git checkout -b feature-branch`).
Make your changes.
Commit your changes (`git commit -am 'Add new feature'`).
Push to the branch (`git push origin feature-branch`).
Create a new Pull Request.
Please make sure to follow the coding standards and write appropriate tests for your changes.


### Build the library

```sh
./gradlew :lib:build
```

### Run tests

```sh
./gradlew :lib:test
# or for coverage
./gradlew :lib:jacocoTestReport
```

### Releasing the library

- Checkout develop branch
- Create release branch (release/0.1.0)
```sh
git checkout -b release/0.1.0
```
- Run prepare-release.sh script to set correct version
```sh
./prepare-release.sh
```
- Create PR on develop branch
- Merge develop in main branch


## License

This project is licensed under the MIT License - see the [LICENSE](./LICENSE) file for details.

---

Thank you for using our SDK for Online Payments! If you have any questions or need further assistance, feel free to open an issue or contact us.