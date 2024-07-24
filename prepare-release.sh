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

# Update the version in the build.gradle file
sed -i '' "s/version = '[0-9]*\.[0-9]*\.[0-9]*'/version = '$VERSION'/" ./lib/build.gradle
# Update the version in the ServerMetaInfo.java file
sed -i '' "s/JavaServerSDK\/v[0-9]*\.[0-9]*\.[0-9]*/JavaServerSDK\/v$VERSION/" ./lib/src/main/java/com/payone/commerce/platform/lib/utils/ServerMetaInfo.java

# # Tag the current commit with the new version
git tag -a v$VERSION -m "Release version $VERSION"

# # Push the tag to the remote repository
git push origin v$VERSION

echo "Version updated to $VERSION and tagged in Git."
