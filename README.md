# Junit / Maven Template

## Historical Log

1. Installed MVN
2. Ran `mvn archetype:generate "-DgroupId=com.symflower.demo"  "-DartifactId=tdd" "-DarchetypeArtifactId=maven-archetype-quickstart" "-DarchetypeVersion=LATEST" "-DinteractiveMode=false"`

## Architecture

* Tests are stored in `\tdd\src\test\java\com\symflower\`
* For code stored in `\tdd\src\main\java\com\symflower\`

## Usage

To run the entire test suite, use:

`mvn test`

To run tests from a specific test class only, use:

`mvn test -Dtest="TriangleTest"`

To run tests and only print failures and our print statements, use the quiet flag:

`-q` or `--quiet` ie `mvn test -q`
