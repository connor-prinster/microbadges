# Demonstrate PaaS Proficiency

## Tasks

* Explain what "A-B Deploy" and "In-Place Update" mean.  What are some of the differences between the two?
    * A-B Deploy: While version *A* is still running, a subset of users see version *B* under certain conditions.
    * In-Place Update: updating certain number of instances at a time. 
    * differences: it's harder to do A-B if you don't have excess instances you can spin up.
* Create a simple application using the PaaS Platform blueprint in the Dev-FH5 VPC.
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