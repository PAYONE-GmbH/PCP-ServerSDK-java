#!/bin/bash

# Run the lib tests, optionally targeting a specific Java version.
# Usage:
#   ./test.sh            # uses the current JAVA_HOME / default toolchain


./gradlew :lib:test
