Java Spark Bootstrap Project
===
About this project
---

This is a basic web application that implements the "Handshake Bootstrap" spec specified for our 
interviews.  This stack is based off of [Spark Java](http://sparkjava.com/), a very simple microframework 
that allows you to stand up a quick stack using Java.

The database this project uses is a SQLite database.  The database file is located at 
`src/main/resources/handshake-interview.db`.  There exists one table called `alarms` that has two 
records, as described in the "Handshake Bootstrap" spec

Install Maven
---
You will need to install Maven in order to download the dependencies for this project.  Instructions to 
install Maven are [here](https://maven.apache.org/install.html).  If you are on a Mac or Linux, it's 
easiest to just install using Homebrew by running `brew install maven`.

Setting up for Eclipse
---
Eclipse is a commonly used, free Java IDE that you can be downloaded from 
[here](http://www.eclipse.org/downloads/).

Once you have downloaded and installed Maven, clone the repro.  In the root directory of this project, run
`mvn eclipse:eclipse`.  This should generate an Eclipse project file for you to load into Eclipse.  Once you 
open Eclipse, Go to File -> Import -> Existing Maven Projects and choose the root directory of this project 
to import it.

Running the project
---
Once imported into Eclipse, you should be able to just run the project.  Right click on the Application.java file and 
select Run as -> Java Application. The output of running the project should look something like this:
```
85 [Thread-0] INFO org.eclipse.jetty.util.log - Logging initialized @223ms
131 [Thread-0] INFO spark.embeddedserver.jetty.EmbeddedJettyServer - == Spark has ignited ...
131 [Thread-0] INFO spark.embeddedserver.jetty.EmbeddedJettyServer - >> Listening on 0.0.0.0:3001
133 [Thread-0] INFO org.eclipse.jetty.server.Server - jetty-9.3.6.v20151106
195 [Thread-0] INFO org.eclipse.jetty.server.ServerConnector - Started ServerConnector@7457c71d{HTTP/1.1,[http/1.1]}{0.0.0.0:3001}
195 [Thread-0] INFO org.eclipse.jetty.server.Server - Started @336ms
```
Once the server has started, you should be able to go to http://127.0.0.1:3001/index in a browser and you should see the
webpage as described in the "Handshake Bootstrap project" spec.

What to do
====
During the Handshake interview process, we will ask you to modify this project to implement features and build out a fully
functioning web application.  We may also ask you to explain the code that you have written and/or explain how this 
web framework works, so please be sure to study the code in this project.  If you are not completely familiar with the 
Spark Java framework, we recommend you read through the documentation and make sure you understand how to work with it.

You are free to modify this web stack to use any technologies you would like to use.