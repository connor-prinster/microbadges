# Tasks

## Demonstrate Git Proficiency

See ./demonstrateGitProficiency.md

## Demonstrate Github Proficiency

see ./demonstrateGitHubProficiency.md

## Demonstrate Maven proficiency

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

## Demonstrate Monitoring proficiency

* Explain what Splunk is
* Explain what a Source, Source Type, Host, Index are
* Write a Splunk query that uses two search criteria
* Write a Splunk query that shows cpu usage, netstat, and disk-space.  Can you find this information for your servers?
* Write a Splunk query that shows the results of a build that was started by you or members of your team.
* Display the metrics in a graph/chart
* Write an alert that uses data from Splunk
    * Create a Splunk alert that sends email when it is fired and display the alert it generated.
    * Discuss how to create an alert that will fire when a system experiences abnormal traffic patterns.
* Explain what AppDynamics is
* Explain Applications and Tiers
* Locate your team's running servers within AppDynamics
* Configure an AppDynamics alert
    * Choose useful metrics (stack depth, memory, cpu, etc)
    * Set the alert to send an email to your team if the chosen metric crosses a threshold.

## Demonstrate knowledge of Continuous Delivery

* What is continuous delivery?
* Review [this confluence page](https://fhconfluence.churchofjesuschrist.org/display/EPT/Continuous+Delivery) that describes continuous delivery and answer each of the following:
    * What is Electric Flow?
    * In the continuous delivery pipeline what is the purpose of a commit?
    * Where is a release candidate created?
    * What thing does integration testing in a production-like environment?
* Demonstrate how you would find the status of a build.
* Demonstrate how you would find the status of a deployment.
* What is the difference between release and deployment?
* What is the difference between push button deployment and automatic deployment?  When would you use each?
* Where are previous versions of one of your team's products or services stored


## Demonstrate Amazon Web Services proficiency

* What is Amazon Web Services?
* Describe what the acronyms SaaS-IaaS-PaaS mean.
* Demonstrate logging into the playground-fh2 AWS account with the SuperAdmin role via the [FamilySearch AWS Portal](https://fhconfluence.churchofjesuschrist.org/display/DPT/Engineering+Tools+Portal+-+AWS+Access).
* Demonstrate basic knowledge of AWS's pricing and how to find information on it
    * Describe when you would want to use each of the three EC2 instance classes. (General purpose, compute-optimized, and memory-optimized)
    * How much does it cost to run a c4.xlarge instance for 1 year?
    * How does AWS charge ElasticBeanstalk usage?
* Explain what reserved instances are and how they reduce AWS expenses.

* Demonstrate AWS Cloudwatch monitoring and create an alarm for one of the machines in the playground-fh2 VPC.  (ex: high CPU usage, high disk-space usage, etc)


## Demonstrate PaaS proficiency

* Create a simple application using the PaaS Platform blueprint in the Dev-FH5 VPC.Explain what "A-B Deploy" and "In-Place Update" mean.  What are some of the differences between the two?
    * [Tutorial - Create a Simple Platform App](https://fhconfluence.churchofjesuschrist.org/display/DPT/Tutorial+-+Create+a+Simple+Platform+App)
* Using the blueprint created in the previous step, point out the location of:
* Your application's public/private configuration
    * Instance Types you are using
    * Scaling parameters
    * TTL
    * Instance Tagging
* Bad blueprint syntax - how to find the definition and also how to find examples
    * Create a blueprint file and validate using the blueprint checker found here: [Is there a way to check my blueprint prior to committing my code?](https://fhconfluence.churchofjesuschrist.org/questions/65540828/is-there-a-way-to-check-my-blueprint-prior-to-committing-my-code)
    * [Blueprint Schema - Version 1.0](https://fhconfluence.churchofjesuschrist.org/display/DPT/Blueprint+Schema+-+Version+1.0)
* How to diagnose deploy failures in AWS
    * Go to a build failure in EC, you can find a workflow failure id
    * AWS Console - search for workflow with that id has lots of additional details
    * Splunk - search for workflow by that blueprint name (add to splunk section)
    * [Confluence Questions](https://fhconfluence.churchofjesuschrist.org/questions)


## Software Authentication Service

* Discuss with your team what SAS is and how it solves a significant problem in our software architecture.

## Notes

* **Note: You are free to be creative and determine your own way to demonstrate the above tasks. It would be great to talk over your plans with your manager!**