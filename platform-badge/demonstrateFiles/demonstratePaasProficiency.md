# Demonstrate PaaS Proficiency

## Tasks

* Create a simple application using the PaaS Platform blueprint in the Dev-FH5 VPC.Explain what "A-B Deploy" and "In-Place Update" mean.  What are some of the differences between the two?
    * [Tutorial - Create a Simple Platform App](https://fhconfluence.churchofjesuschrist.org/display/DPT/Tutorial+-+Create+a+Simple+Platform+App)x
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