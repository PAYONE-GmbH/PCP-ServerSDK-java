#!/bin/bash

VERSION=$1

# Check if an argument is provided
if [ -z "$VERSION" ]; then
    echo "Error: No version number provided."
    echo "Usage: ./prepare-release.sh <version>"
    exit 1
fi

# Check if the argument matches the format int.int.int
if [[ "$VERSION" =~ ^[0-9]+\.[0-9]+\.[0-9]+$ ]]; then
    echo "Valid version number: $VERSION"
else
    echo "Error: Invalid version number format."
    echo "Usage: ./prepare-release.sh <version>"
    exit 1
fi

# Assign the provided version to a variable
TAG=v$VERSION

BUILD_GRADLE_PATH="./lib/build.gradle"
SERVER_META_INFO_PATH="./lib/src/main/java/com/payone/commerce/platform/lib/utils/ServerMetaInfo.java"
README_PATH="./README.md"
PACKAGE_JSON_PATH="./package.json"
PACKAGE_LOCK_JSON_PATH="./package-lock.json"

# Update the version in the build.gradle file
sed -i '' "s/version = '[0-9]*\.[0-9]*\.[0-9]*'/version = '$VERSION'/" $BUILD_GRADLE_PATH
# Update the version in the ServerMetaInfo.java file
sed -i '' "s/JavaServerSDK\/v[0-9]*\.[0-9]*\.[0-9]*/JavaServerSDK\/$TAG/" $SERVER_META_INFO_PATH
# update the version in the readme file
sed -i '' "s/version: '[0-9]*\.[0-9]*\.[0-9]*'/version: '$VERSION'/g" $README_PATH

# Update the version number in the package.json file for changelog generation
sed -i '' -e "s/\"version\": \".*\"/\"version\": \"$VERSION\"/" package.json

# Update the version number in the package-lock.json file for changelog generation
jq --arg version "$VERSION" '
  .version = $version |
  .packages[""].version = $version
' package-lock.json >tmp.json && mv tmp.json package-lock.json
rm -f tmp.json

git add $BUILD_GRADLE_PATH
git add $SERVER_META_INFO_PATH
git add $README_PATH
git add $PACKAGE_JSON_PATH
git add $PACKAGE_LOCK_JSON_PATH
git tag -a $TAG -m "Release version $VERSION"
npm install
npm run changelog
git add CHANGELOG.md
git commit -m "Update version to $VERSION"
git push --tags
git push origin HEAD

echo "Version updated to $VERSION and tagged in Git."
