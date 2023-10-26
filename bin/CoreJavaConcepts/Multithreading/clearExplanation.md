we'll start the section on java concurrency by defining a few key terms as they relate to Java. A process is a unit of execution that has its own memory space. Each instance of a Java virtual Machine (JVM). runs as a process (this isn't true for all JVM implementation, but for most of them). **When we run a java console application**, we're kicking off a process. When we run a javaFx application, we're kicking off a process.

Many people will use the term process and application interchangeably, and we will, too. if one java application is running and we run another one, each application has its own memory space of **heap**.
The first jave application can't access the heap that belongs to the second java application. The heap isn't
shared between them. They each have their own.
