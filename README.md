# Overview

This repo contains an example Gradle project. 
The project uses Cucumber JVM and uses the Axion release plugin for versioning.
 
## Gradle

The Gradle Wrapper binary is included in the repository, meaning that it should be portable and nothing additional to a JVM is required to run any of the tasks.

### Tasks

To see which tasks are available to run:

    ./gradlew tasks
 
### Current Version?

Axion uses git tags to track the current version. At any time, you can run the following to see the current version:

    ./gradlew currentVersion
    
Or, for simplicity with gradle tasks you can "pattern match":
    
    ./gradlew cV

### Cucumber JVM

To run the Cucumber JVM suite, run the following:

    ./gradlew cucumber
    

The suite is triggered by a gradle task, which invokes a JVM with the cucumber provided main.
Arguments can be configured in this task to dictate tags to run (or exclude), and where to find feature files and step definitions (glue).