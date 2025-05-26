# [1.2.0](https://github.com/PAYONE-GmbH/PCP-ServerSDK-java/compare/v1.0.0...v1.2.0) (2025-05-26)

### Bug Fixes

* fix: change JsonInclude strategy for transactionId to always include as its a required property ([9ba6fff98b9d7cb3aab7345ae311fd7244564da3](https://github.com/PAYONE-GmbH/PCP-ServerSDK-java/commit/9ba6fff98b9d7cb3aab7345ae311fd7244564da3))

### Documentation

* docs: add changelog ([02364d5b907f712c0d9714286168bfcba723f76f](https://github.com/PAYONE-GmbH/PCP-ServerSDK-java/commit/02364d5b907f712c0d9714286168bfcba723f76f))
* docs: add maven link to readme ([0cc0e443c9670dab7abb30f538c77f77f91758a6](https://github.com/PAYONE-GmbH/PCP-ServerSDK-java/commit/0cc0e443c9670dab7abb30f538c77f77f91758a6))
* docs: improve Javadoc for taxAmountPerUnit field in OrderLineDetailsInput ([74252775d5790fa459e2453301c904046a356bb5](https://github.com/PAYONE-GmbH/PCP-ServerSDK-java/commit/74252775d5790fa459e2453301c904046a356bb5))
* docs: update error category documentation to clarify possible values and their meanings ([6d8dda707d9a3999bf6868936c00c4a65fe9ece6](https://github.com/PAYONE-GmbH/PCP-ServerSDK-java/commit/6d8dda707d9a3999bf6868936c00c4a65fe9ece6))
* docs: update readme ([42826dac963443597d14b1c4aa5fc21d28e66439](https://github.com/PAYONE-GmbH/PCP-ServerSDK-java/commit/42826dac963443597d14b1c4aa5fc21d28e66439))

### Features

* feat: add BusinessRelation enum and update Customer model to use it ([69e1777510ff6936692c28ddc823d2c01ec15bf0](https://github.com/PAYONE-GmbH/PCP-ServerSDK-java/commit/69e1777510ff6936692c28ddc823d2c01ec15bf0))
* feat: add CustomerAccount model and integrate it into Customer class ([09db51a9a970f337ab0e813190cd3c01eb85f7d5](https://github.com/PAYONE-GmbH/PCP-ServerSDK-java/commit/09db51a9a970f337ab0e813190cd3c01eb85f7d5))
* feat: add fraudNetId field to RedirectPaymentProduct840SpecificInput model ([9d54df263be99280c89ce5f840b8d00e3ae0ceaf](https://github.com/PAYONE-GmbH/PCP-ServerSDK-java/commit/9d54df263be99280c89ce5f840b8d00e3ae0ceaf))
* feat: add RecurringPaymentSequenceIndicator enum ([06d9074b719e129b94d06263d8a8c41a71795fa7](https://github.com/PAYONE-GmbH/PCP-ServerSDK-java/commit/06d9074b719e129b94d06263d8a8c41a71795fa7))
* feat: implement AvsResult enum and update CardFraudResults to use it for AVS result handling ([9a38daadee205b63f1c5e78e36f4450eb1080b94](https://github.com/PAYONE-GmbH/PCP-ServerSDK-java/commit/9a38daadee205b63f1c5e78e36f4450eb1080b94))
* feat: integrate BusinessRelation model for customer billing and commerce case creation ([4644a1d7c2d4a548acc525944082214b519bd4cc](https://github.com/PAYONE-GmbH/PCP-ServerSDK-java/commit/4644a1d7c2d4a548acc525944082214b519bd4cc))
* feat: introduce ActionType enum and update MerchantAction to use it ([d1adbddaeabc06010e3ec75b961e08450a1c6946](https://github.com/PAYONE-GmbH/PCP-ServerSDK-java/commit/d1adbddaeabc06010e3ec75b961e08450a1c6946))
* feat: update api-definition file with new version 1.35.0 changes ([63f7e2d8ae591c18ee8b3feca2781a6e2654b442](https://github.com/PAYONE-GmbH/PCP-ServerSDK-java/commit/63f7e2d8ae591c18ee8b3feca2781a6e2654b442))
* feat: update Gradle version to 8.14.1 in workflows and wrapper properties to support Java 24 ([500c21522f308ff345fac4b882962cb622ccb67e](https://github.com/PAYONE-GmbH/PCP-ServerSDK-java/commit/500c21522f308ff345fac4b882962cb622ccb67e))
* feat: update SDK to API 1.28.0 ([518a177487dc26139313eb385af6029b1f034275](https://github.com/PAYONE-GmbH/PCP-ServerSDK-java/commit/518a177487dc26139313eb385af6029b1f034275))

# [1.1.0](https://github.com/PAYONE-GmbH/PCP-ServerSDK-java/compare/v1.0.0...v1.1.0) (2025-03-11)

### Documentation

* docs: add changelog ([02364d5b907f712c0d9714286168bfcba723f76f](https://github.com/PAYONE-GmbH/PCP-ServerSDK-java/commit/02364d5b907f712c0d9714286168bfcba723f76f))
* docs: add maven link to readme ([0cc0e443c9670dab7abb30f538c77f77f91758a6](https://github.com/PAYONE-GmbH/PCP-ServerSDK-java/commit/0cc0e443c9670dab7abb30f538c77f77f91758a6))

### Features

* feat: update SDK to API 1.28.0 ([518a177487dc26139313eb385af6029b1f034275](https://github.com/PAYONE-GmbH/PCP-ServerSDK-java/commit/518a177487dc26139313eb385af6029b1f034275))

# [1.0.0](https://github.com/PAYONE-GmbH/PCP-ServerSDK-java/compare/v0.0.3...v1.0.0) (2024-08-22)

### Documentation

* docs: add contributing guidelines and update readme ([c9c7210c6b7655761851ff5564c09ad10c6a0b4a](https://github.com/PAYONE-GmbH/PCP-ServerSDK-java/commit/c9c7210c6b7655761851ff5564c09ad10c6a0b4a))

## [0.0.3](https://github.com/PAYONE-GmbH/PCP-ServerSDK-java/compare/v0.0.2...v0.0.3) (2024-08-21)

### Bug Fixes

* fix(signature-generation): use empty content type for GET & DELETE ([f438dcb11640ff2f2a6eb42d5f930a31a21aaee5](https://github.com/PAYONE-GmbH/PCP-ServerSDK-java/commit/f438dcb11640ff2f2a6eb42d5f930a31a21aaee5))

### Documentation

* docs: add documentation on how to generate the changelog ([6a58c9544f11d01028b5fd637aed171211e878cb](https://github.com/PAYONE-GmbH/PCP-ServerSDK-java/commit/6a58c9544f11d01028b5fd637aed171211e878cb))
* docs: add installation ([e24166aa9b46250efe86cf3866dc18867d348c93](https://github.com/PAYONE-GmbH/PCP-ServerSDK-java/commit/e24166aa9b46250efe86cf3866dc18867d348c93))
* docs: add status badges ([ad01ef75ed6358b8325a010c8f96d9412ce4b27c](https://github.com/PAYONE-GmbH/PCP-ServerSDK-java/commit/ad01ef75ed6358b8325a010c8f96d9412ce4b27c))
* docs: adjust naming ([4a658161c3dfd5a9615c6b6d779c44442ba6b48b](https://github.com/PAYONE-GmbH/PCP-ServerSDK-java/commit/4a658161c3dfd5a9615c6b6d779c44442ba6b48b))
* docs: init readme skeleton ([7af41adabab6c55c064e159bd6a900b498df0885](https://github.com/PAYONE-GmbH/PCP-ServerSDK-java/commit/7af41adabab6c55c064e159bd6a900b498df0885))
* docs: update readme ([06d9063f1ccbdffb8fa8050ae6eb22a4f0d93455](https://github.com/PAYONE-GmbH/PCP-ServerSDK-java/commit/06d9063f1ccbdffb8fa8050ae6eb22a4f0d93455))
* docs: update readme ([6414a0731c34898c28e7e9be1e18fbbc90837ef2](https://github.com/PAYONE-GmbH/PCP-ServerSDK-java/commit/6414a0731c34898c28e7e9be1e18fbbc90837ef2))

### Features

* feat: add example app files ([c1bba5522869fe7b51a7cac38efd18a218467faa](https://github.com/PAYONE-GmbH/PCP-ServerSDK-java/commit/c1bba5522869fe7b51a7cac38efd18a218467faa))
* feat: add get single commerce case ([82ad19b39c70ccc97eeed47725eac61153828366](https://github.com/PAYONE-GmbH/PCP-ServerSDK-java/commit/82ad19b39c70ccc97eeed47725eac61153828366))
* feat: add ordermanagement and payment endpoints ([e9a695a49eda7fadaed53de1bd8cbacefc450cc7](https://github.com/PAYONE-GmbH/PCP-ServerSDK-java/commit/e9a695a49eda7fadaed53de1bd8cbacefc450cc7))
* feat: add payment information endpoint ([e305d32d5b41ba05bd525384bc6f1dfe679b0162](https://github.com/PAYONE-GmbH/PCP-ServerSDK-java/commit/e305d32d5b41ba05bd525384bc6f1dfe679b0162))
* feat: add querybuilder for commerce-cases ([9d205ecbb5fdcb6a11a5f8769ec15f78772c1f2f](https://github.com/PAYONE-GmbH/PCP-ServerSDK-java/commit/9d205ecbb5fdcb6a11a5f8769ec15f78772c1f2f))
* feat(api): implement first api call ([cd215670c67137f41a3f44ca324d64819c8fd9fe](https://github.com/PAYONE-GmbH/PCP-ServerSDK-java/commit/cd215670c67137f41a3f44ca324d64819c8fd9fe))
* feature(apple-pay): add builder style methods ([903bbb765a2de6c16f441d5bcdd5924699db2653](https://github.com/PAYONE-GmbH/PCP-ServerSDK-java/commit/903bbb765a2de6c16f441d5bcdd5924699db2653))
* feat(checkout-client): add basic class for crud operations on checkouts ([4a5794b775f472f32d9192782320169e4bd742ef](https://github.com/PAYONE-GmbH/PCP-ServerSDK-java/commit/4a5794b775f472f32d9192782320169e4bd742ef))
* feature(checkouts-query): add getter and setter methods and implement interface ([47fde343f8fc75dd8927f7f2d63acbac71b0c209](https://github.com/PAYONE-GmbH/PCP-ServerSDK-java/commit/47fde343f8fc75dd8927f7f2d63acbac71b0c209))
* feature: helper method to convert ApplePayPayment response into PCP model for mobile payments ([909d0221cd2a66bd4aa627acbd9398ed3fd186e1](https://github.com/PAYONE-GmbH/PCP-ServerSDK-java/commit/909d0221cd2a66bd4aa627acbd9398ed3fd186e1))
* feat: implement get all checkouts ([21271121ba64da50f324d2a40df820133cb9e88f](https://github.com/PAYONE-GmbH/PCP-ServerSDK-java/commit/21271121ba64da50f324d2a40df820133cb9e88f))
* feature: implement hmac signature generation ([8f5c2dc6c4c11817b70cbc326a0c48cb2a02aca1](https://github.com/PAYONE-GmbH/PCP-ServerSDK-java/commit/8f5c2dc6c4c11817b70cbc326a0c48cb2a02aca1))
* feature: make integrator field in ServerMetaInfo configurable ([4fc9ffd6289cc3ac810d4cf29382f6c25670b6d1](https://github.com/PAYONE-GmbH/PCP-ServerSDK-java/commit/4fc9ffd6289cc3ac810d4cf29382f6c25670b6d1))
* feat(meta-info-header): add meta info header ([887de1c2f03cb7fdbed06017fbe3839b1505fd30](https://github.com/PAYONE-GmbH/PCP-ServerSDK-java/commit/887de1c2f03cb7fdbed06017fbe3839b1505fd30))
* feature(models): add models for responses from applepay ([61003928f2b13294b713ba7b64eb443deca43b07](https://github.com/PAYONE-GmbH/PCP-ServerSDK-java/commit/61003928f2b13294b713ba7b64eb443deca43b07))
* feat(request-header-generator): include meta headers, and sign them correctly ([c85471e456567dfac9fd45caf9f7dbf0c674575c](https://github.com/PAYONE-GmbH/PCP-ServerSDK-java/commit/c85471e456567dfac9fd45caf9f7dbf0c674575c))
* feature: use a global serializer class, and expose it to the user ([ae945241f0125a21f02db192d62f1eb7c20b6784](https://github.com/PAYONE-GmbH/PCP-ServerSDK-java/commit/ae945241f0125a21f02db192d62f1eb7c20b6784))

