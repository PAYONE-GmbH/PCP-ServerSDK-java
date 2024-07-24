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

# Update the version in the build.gradle file
sed -i '' "s/version = '[0-9]*\.[0-9]*\.[0-9]*'/version = '$VERSION'/" $BUILD_GRADLE_PATH
# Update the version in the ServerMetaInfo.java file
sed -i '' "s/JavaServerSDK\/v[0-9]*\.[0-9]*\.[0-9]*/JavaServerSDK\/$TAG/" $SERVER_META_INFO_PATH

git add $BUILD_GRADLE_PATH
git add $SERVER_META_INFO_PATH
git commit -m "Update version to $VERSION"
git tag -a $TAG -m "Release version $VERSION"
git push origin $TAG

echo "Version updated to $VERSION and tagged in Git."
