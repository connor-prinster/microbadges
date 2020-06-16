# Tasks
* Thoroughly review [Maven Installation Instructions](https://fhconfluence.churchofjesuschrist.org/display/DPT/Maven+Installation+Instructions) for installing and configuring Maven at FamilySearch.
* Install and configure Maven on your local machine.

    * [Configure Maven](https://fhconfluence.churchofjesuschrist.org/pages/viewpage.action?pageId=13011447) to point to our internal Nexus server instead of Maven Central.
    * Install the FamilySearch certificate in Java on your development machine.
* Create a Maven Project for a WAR file

* Add a compile-scoped dependency and use it in your project

    * An easy dependency to use is the logging framework log4j. See [this article](https://howtodoinjava.com/log4j/how-to-configure-log4j-using-maven/) for a tutorial on using it in Maven (only pay attention to steps 3 and 4, and ignore the "mvn eclipse" commands.
* Add a test-scoped dependency

* Build the project with Maven

* Configure a plugin for your project
* Add a profile to your project that changes the behavior of your build in some way when it's enabled.
* Talk about how profiles should be used, and how they can be misused.

# Steps to Complete
* maven is downloaded with `mvn --version` returning **Apache Maven 3.6.3**
* maven is configured
* created a maven project
* added a compile-scoped dependency (log4j)
* added a test-scoped dependency (junit)
* build the project
* configure a plugin
## TODO NEED A PROFILE
