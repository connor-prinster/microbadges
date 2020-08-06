# Splunk Apprentice Badge

## Help
* [Splunk Glossary](https://docs.splunk.com/Splexicon)

## References 
* show where to find our documentation on Splunk
    * **[here](https://docs.splunk.com/Documentation/SplunkCloud/8.0.2006/Search/GetstartedwithSearch?ref=hk)**
    * continue to update documentation
* what types of resources and references are available from Splunk
    * **plenty of docs and a glossary**

## Interface
* Explain what a Splunk Application is, related to the User Interface.  What application(s) does your team use?
    * **Application: an app contains one or more views that contains reports, lookups, scripted inputs, and modular inputs for a specific group. It also allows specific add-ons**
    * **Memories uses FS-Engage**
* Describe the use of the Fields Side Bar.  What search settings affect the detail found in the Side Bar?
    * **the fields side bar shows what the default values Splunk pulls out are as well as the other intersting fields Splunk automatically pulls out**
    * **you can change it with the `fields` command**
* Download the latest Splunk Cheat Sheet and become familiar with it.
    * [here](https://www.splunk.com/pdfs/solution-guides/splunk-quick-reference-guide.pdf) it is!

## Understanding Splunk Events

* What is an Event in Splunk?
    * **a single piece of data in Splunk software**
    * **single line in log**
* What is an index?
    * **the repository for data. When splunk indexes raw data, it transforms data into searchable events**
        * **two types of indicies**
            * **events: default type of index. Can hold any type of data**
            * **Metrics: metrics indexes hold only metric data**
* What fields are included in every Splunk Event?
    * _raw: The event in it's raw form 
    * _time: When was it actually received
    * _indextime: When was it actually indexed (Difference between indextime and time is called the indexing latency)
    * _cd: provides an address for an event within the index. Short number indicates the specific index bucket. The long number is an index bucket offset. Exact location of the event
    * host: contains originating hostname or IP address of the network that generated the event
    * index: name of the index in which a given event is indexed
    * linecount: contains number of lines an event contains. This is the number of lines an event contains before it is indexed
    * punct: punctuation pattern that is extracted from an event. The pattern is unique to types of events. 
    * source: name of the file, stream, or other input from where the event originates. 
    * sourcetype: format of the data input from which the event originates. Such as `sourcetype=access_combined` or `=cisco_syslog`
    * splunk_server: contians the name of the Splunk server containing the event
    * timestamp: an event's timestamp value.
    * date_hour: hour where an event occured 0-23
    * date_mday: value of the day of the month where event occurred 1-31
    * date_minute: minute where event occurred 0-59
    * date_month: month where event occurred 0-11
    * date_second: seconds portion of an event's timestamp 0-59
    * date_wday: day of week (Sunday-Saturday)
    * date_year: year where it occurred
    * date_zone: value of the time for local timezone. 
* Describe a Source Type
    * **Identifies data structure of an event. It determines how Splunk Enterprise formats the data during indexing**
* Where does the Host value come from? Are there any commmon patterns in your team's Host values?
    * **It comes from the device where the event originated.**
    * **Most of my team's values are shortened from things such as `tree portrait service` to `tps*`**
* Review the indexes that are available to you in Splunk. Run this search `| eventcount summarize=false index=* | stats values(index)`
    * **running [the above query](https://familysearch.splunkcloud.com/en-US/app/fs-engage/search?q=%7C%20eventcount%20summarize%3Dfalse%20index%3D*%0A%7C%20stats%20values(index)&sid=1596756099.283224_428001B4-9DC6-4793-A94A-778277DBD164&display.page.search.mode=verbose&dispatch.sample_ratio=1&earliest=-1h%40h&latest=now&display.page.search.tab=statistics&display.general.type=statistics) shows quite a few**

## Searching
* When should you specify an index in your search?
    * **Indexing is a mechanism to speed up the search process by giving numeric addresses to the piece of data being searched [source](https://www.tutorialspoint.com/splunk/splunk_managing_indexes.htm)**
* If you do not specify an index in your search (bad practice) what index(es) are used?
    * **main is used. It's the default index where all processed data is stored**
* What fields should be included in almost every search?
    * **host (where it came from), source (file or directory path), source type (waht kind of data it is based on formatting of data)**
* Which mode should you run in if possible?  When should you use "Verbose" mode?
    * **you should use fast mode which does not return nonessential field or event data**
    * **this discovers all fields possible**
* How do you select your search time-range?
    * **time picker on right of search bar in Search Page**
* How can you filter what fields are returned?
    * **use the `table` command**
    * `* | table <insert desired fields here>`
* Is there a search history specific to your user?
    * **yes**
* How long did the last Search you ran take to execute, and what was the search string?
    * **almost instantaneously**
    * `host=tps-int-* pathUri=*cis* AND pathUri=*v4* httpMethod=GET | table httpStatus httpMethod duration`

## Summary Indexes
* what is a summary index?
    * **stores results of a scheduled report**
    * **run fast searches over large data sets by spreading out the cost of a computationally expensive report over time**
    * **it runs on a recurring basis**
    * **90 days of data w/out summary index** **year otherwise**
* when should you use a summary index
    * **to efficiently search on large volumes of statistical data**
    * **put things you want to summarize**

## Search Commands
* Please explain the benefit of the "fields" command on search performance, and output.
    * **it only returns events that match the field command**
    * **more focused results**
    * **specifying the `fields` command also avoids unnecessary field extraction**

* Give an example of a few command(s) which allow you to see a set of fields in the Statistics tab?
    * **`host=tps-prod-* | stats count(@timestamp) as CallCount avg(duration) as AverageDuration by pathUri | table pathUri CallCount, AverageDuration`**
    * **basically, using anything with the `stats` command will give you something in the StatisticsTab**
* How do you sort a series of events by a numeric value, largest first?
    * **by using the `| sort * desc` command with * being what you want to sort by**
    * **e.g. `host=tps-beta-* httpMethod=GET httpStatus=* | stats count(@timestamp) as CallCount by httpStatus | sort CallCount desc`**
* Many events repeat the same field value, which may not be useful. How could you only see the distinct values for the field?
    * **using the `| * by <field>` command.**
    * **e.g. `host=tps-beta-* httpMethod=GET httpStatus=* | stats count(@timestamp) as CallCount by httpStatus | sort CallCount desc`**
* What commands allow you to see the most-frequent and least-frequent values for a field?
    * **most-frequent: `top`**
        * **e.g. `host=tps-beta-* httpMethod=GET httpStatus=* | top httpStatus`**
    * **least-frequent: `rare`**
        * **e.g. `host=tps-beta-* httpMethod=GET httpStatus=* | rare httpStatus`**
* How can we calculate the average or sum of values for a field?
    * **here's both: `host=tps-beta-* httpMethod=GET httpStatus=* | stats avg(duration) as AverageDuration sum(duration) as TotalTime`**
* What is the difference between the "list" and "values" commands. Describe a use case for each.
    * **list()**
        * **gives values as they appeared in events**
        * **for use when wanting to see values as they happened in real time**
    * **values()**  
        * **gives list of all distinct values of the field. The order is lexicographical. It looks like 10-109, 11-119, 13-139 etc**
        * **used when you want to see values sorted into their respective distinct values**
    * **example: `host=tps-beta-* httpMethod=GET httpStatus=* | stats list(duration) as ListCmd values(duration) as ValuesCmd`**

# <</GOT HERE>>

* How do you count the number of values for one field which are unique?
    * **by using `distinct_count`**
    * **e.g. `host=tps-beta-* httpMethod=GET httpStatus=* | stats distinct_count(httpStatus)`**
* Demonstrate a graph of events over time.  Then show the same results using multiple chart types.
    * **command used `host=tps-prod-* httpMethod httpStatus=* | timechart avg(duration) by httpStatus span=1m`**
* Describe why syntax-highlighting is useful within the search pipeline.
    * **easier to look at and find data you want. No sifting through events for the specific string it supposedly has**
    * **e.g. (when viewing events in the `raw` formatting) `host=tps-int-* httpMethod| highlight 204`**

## Reports
* Demonstrate how to create a report that runs a repeating schedule
    1. **run a query**
    1. **top-right `Save As` button**
    1. **choose report**
    1. **name it**
    1. **click `Additional Settings -> Schedule` on the successful creation popup**
    1. **enable `Schedule Report`**
    1. **save**

## Alerts
* Create an alert for you yourself that will notify you by email when the number of events is greater than a threshold
    * **used `host=*photos-artifact-manager-prod* status=500 source=/var/log/tomcat8/catalina.out | stats count(date_hour) as countFails` as the alert search**
* Describe why you chose: frequency, query time-range, permissions, the search string, and alert action type(s)
    * **for this alert**
        * **frequency: on a Friday, there were 14 failures in an hour, 50 seems excessive**
        * **time-range: Running it every hour makes sure I know within an hour or less if something has broken**
        * **search string: gets searches for a very specific thing, hopefully making the cost of the query small**
        * **alert action: email is appropriate during the workday**

## Dashboards
* Explain the purpose of dashboards
    * **a team set it up specifically so custom queries wouldn't have to be thought of and run. It's a quick glance at your product**
    * **opens conversations about what's a problem**
* what types of projects should have a dashboard
    * **if other teams rely on a project, there should be a dashboard so if something goes wrong, it can be looked at quickly and diagnosed**

## Ownership and Permissions
* Demonstrate how to share an Alert and a Dashboard
    * **edit alert**
    * **edit permissions**
    * **Display For -> App**
    * **select user**
* How would you restrict visibility to an Alert to a specific set of users? When would you do this?
    * **When you set it to `select user`, you can choose a group of people. You just want to make sure not EVERYONE gets a plethora of emails when they shouldn't have to deal with it**

## Your Team Services
* Explain how your teams Services get logging into Splunk
    * **We use slf4j libraries to call this method**
        ```java
        private static final Logger LOGGER = LoggerFactory.getLogger(<whatever_class>.class);
        ```
    * **We then use `LOGGER` to use code like this:**
        ```java
        Log.info(LOGGER, "Search complete.", arguments ->
                        new Object[] {
                                keyValue(RESPONSE, responseBody)
                        });
        ```
    * **running `host=*sqm* "Search complete." | stats count(@timestamp) by message` in Splunk will show you the amount of times that is logged**

* Show an example of querying these results
    * **see above**