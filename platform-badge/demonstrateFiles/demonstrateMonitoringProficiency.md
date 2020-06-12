# Demonstrate Splunk Proficiency

## Tasks:
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

## SPLUNK TASKS
### What Is Splunk?
Splunk is a tool that analyzes data for trends or certain parameters we specify. Splunk watches your application and keeps notes of what happened from time *x* to time *y*. You can query Splunk for a certain keyword at a certain time or a certain place and retrieve data satifying those requirements. 

### What is a Source, Source Type, Host, Index?
* source: the file, strea, or other input where an event originates (edited from [this](https://answers.splunk.com/answers/588370/source-vs-sourcetype-whats-the-difference.html)). 
* source type: determines how Splunk software processes the incomin gdata into individual events based on the nature. 
* host: name of the physical device where event originates. Splunk assigns a host to every event it indexes by default. It is typically the hostname, IP address, or domain name of the host where the event originated.
* index: The [*repository for data*](https://docs.splunk.com/Splexicon:Index). It looks like Splunk takes all the data it ingests and creates searchable events for them. These event indexes are stored in a plain text database (flat file)

### Write a Splunk query with two search criteria:
```
host=photos-artifact-manager-beta* status=200 AND method=GET
```

### Write a Splunk query that shows cpu usage, netstat, and disk-space. Can you find this information for your servers?
```
index=os AND host=photos-artifact-manager-* AND (source=vmstat OR source=top OR source=netstat OR source=cpu)
```

### Write a Splunk query that shows the results of a build that was started by you or members of your team.

```
blueprint_name=photos-artifact-manager job_name=photos-artifact-manager-validate*
```

### Display the metrics in a graph/chart
see `../visuals/bar_graph_status.png`

### Write an alert that uses data from Splunk
* Create a Splunk alert that sends email when it is fired and display the alert it generated.
***I can show you this***
* Discuss how to create an alert that will fire when a system experiences abnormal traffic patterns.
    * find the average traffic running  
        * this can include things like how many successes or failures
    * if there is something that is running far and above this average(especially with errors), email whoever

### Explain what AppDynamics is
### Explain Applications and Tiers
### Locate your team's running servers within AppDynamics
### Configure an AppDynamics alert
* Choose useful metrics (stack depth, memory, cpu, etc)
* Set the alert to send an email to your team if the chosen metric crosses a threshold.