Spock / Geb functional testing base project
===========================================

A base gradle build to run selenium functional tests using the Groovy
Geb and Spock frameworks.

The tests are currently only setup to use the firefox driver. To run the
tests:

```bash
./gradlew --info firefoxTest
```

--info above is optional, this prints detailed test results to the
 console. The tests also generate a HTML report with the location
outputted once the tests have finnished.
