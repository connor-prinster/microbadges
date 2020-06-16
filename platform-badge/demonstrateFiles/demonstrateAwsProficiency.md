# Demonstrate AWS Proficiency

## Tasks

* What is Amazon Web Services?
* Describe what the acronyms SaaS-IaaS-PaaS mean.
* Demonstrate logging into the playground-fh2 AWS account with the SuperAdmin role via the [FamilySearch AWS Portal](https://fhconfluence.churchofjesuschrist.org/display/DPT/Engineering+Tools+Portal+-+AWS+Access).
* Demonstrate basic knowledge of AWS's pricing and how to find information on it
    * Describe when you would want to use each of the three EC2 instance classes. (General purpose, compute-optimized, and memory-optimized)
    * How much does it cost to run a c4.xlarge instance for 1 year?
    * How does AWS charge ElasticBeanstalk usage?
* Explain what reserved instances are and how they reduce AWS expenses.

* Demonstrate AWS Cloudwatch monitoring and create an alarm for one of the machines in the playground-fh2 VPC.  (ex: high CPU usage, high disk-space usage, etc)

## What is Amazon Web Services
A cloud computing platform. Basically, it holds and runs the data so you don't have to deal with it yourself.

## Describe what the acronyms SaaS-IaaS-PaaS mean.
(some of the below is from [here](https://www.bmc.com/blogs/saas-vs-paas-vs-iaas-whats-the-difference-and-how-to-choose/))
* SaaS: (package) software as a service.
    * uses the internet to deliver applications. This is managed by another, third-party service like AWS or Microsoft. It runs on the third-party's backend and is served over the internet
* IaaS: infrastructure as a service
    * "gives servers, network, os, and storage through virtualization technology." Basically, it frees up the businesses from having to deal with their own data centers. Hardware can be aquired only when needed, shich saves costs.
* PaaS: platform as a service
    * hardware and applicication software is provided by another party. A developer can run and manage their apps without having to build and maintain it themselves.
    * for FamilySearch: AppDynamics, Splunk logging, blueprint deploys, and nexus management

## Demonstrate logging into the playground-fh2 AWS account with the SuperAdmin role via the [FamilySearch AWS Portal](https://fhconfluence.churchofjesuschrist.org/display/DPT/Engineering+Tools+Portal+-+AWS+Access).
### Steps
* sign into the VPN
* make sure you have the correct permissions
* go [here](http://portal.fsdpt.net/engtools/portal/app/mod)
* click on **AWS Access**
* select if what account and what group you want and press **Generate AWS Credentials**
* on the popup modal, select **Go to Console**
* On the console page, put the username copied from the modal and then the password from the modal

Demonstrate basic knowledge of AWS's pricing and how to find information on it

## Demonstrate basic knowledge of AWS's pricing and how to find information on it
* Describe when you would want to use each of the three EC2 instance classes. (General purpose, compute-optimized, and memory-optimized) [links from here](https://aws.amazon.com/ec2/instance-types/)
    * general purpose:
        * a general purpose instance. It's balanced and good for web servers and code repositories
    * compute-optimized:
        * best for batch-processing workloads, media transcoding, high performance web servers, scientific modeling, gaming servers, and machine learning
    * memory-optimized: 
        * designed to deliver fast performance for workloads that process large data sets in memory 
        * good for high-performance MySQL and NoSQL databases
        * real time processing
* How much does it cost to run a c4.xlarge instance for 1 year?
    * $0.199 per hour
    * $17.43.24 per year
* How does AWS charge ElasticBeanstalk usage?
    * [for S3](https://aws.amazon.com/s3/pricing/): between $0.021 and $0.023 for general use


## Explain what reserved instances are and how they reduce AWS expenses.
* you can purchace a reservation where you pay for every hour of the term you've bought it for (1-3 years), partial upfont, or no upfront and more like a membership. The hourly rate is lowered significantly for all three, but with diminishing discounting. ([link](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-reserved-instances.html))

## Demonstrate AWS Cloudwatch monitoring and create an alarm for one of the machines in the playground-fh2 VPC. (ex: high CPU usage, high disk-space usage, etc)
### TODO