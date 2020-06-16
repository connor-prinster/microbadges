# Demonstrate Continuous Delivery Proficiency

## Tasks

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

### What is Continuous Delivery?
It is the idea that we continually add new code, configuration, and the like which then is pushed out to production as soon as possible.

The purposes are this:
* there are low risk releases. Single function changes will have less of an effect than if you had a huge release later on
* you can push out faster so a phased software delivery doesn't take up unnecessary time
* lower costs because it takes less of fixed costs shown with release processes

I referenced [this](https://continuousdelivery.com/) to answer some of the reasonings for CI/CD

### Review [this confluence page](https://fhconfluence.churchofjesuschrist.org/display/EPT/Continuous+Delivery) that describes continuous delivery and answer each of the following:
* What is Electric Flow?
* In the continuous delivery pipeline what is the purpose of a commit?
    * the purpose is to have a version change set in the version control system. A commit starts the rest of the pipeline going (commmit -> component pipeline -> integration pipeline -> deploy pipeline)
* Where is a release candidate created?
    * a release candidate is created in the *component pipeline* section
* What thing does integration testing in a production-like environment?
    * the *integration pipeline* runs the end-to-end tests in a production-like environment. Integration pipelines are run in parallel if there are changes to multiple components

### Demonstrate how you would find the status of a build.
Go [here](https://build.fsglobal.net/commander/pages/EC-Homepage/homepage?firstPage=1&s=Home) -> jobs -> `keyword` + `*` + `build` -> look at status

### Demonstrate how you would find the status of a deployment.

Go [here](https://build.fsglobal.net/commander/pages/EC-Homepage/homepage?firstPage=1&s=Home) -> jobs -> `keyword` + `*` + `validate` -> look at status

### What is the difference between release and deployment?
When you **deploy** the update, it puts it on the cloud. **Release** means that it goes to the public

### What is the difference between push button deployment and automatic deployment?  When would you use each?
* push button: push button requires a user to actually manually deploy the change. A good reason is to make sure that a risky release (e.g. a database update) is not done on a Friday at 4pm or the like
* automatic deployment: as soon as it's ready, electricflow deploys and releases to the public. This is better if it's not really a risk to anyone.

### Where are previous versions of one of your team's products or services stored

All the previous versions are stored in/on Github. You can essentially revert a successful branch to master.