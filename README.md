# Debugging with [Run Paper](https://github.com/bluelhf/run-paper-maven-plugin)

This repository hosts an example of how a debugger can be attached to the
Minecraft server created by Run Paper. In addition to the example Run Paper
configuration in [pom.xml](./pom.xml), an IntelliJ IDEA run configuration
is provided in [.run](./.run).

## How do I try it out?

1. If you haven't already, install [IntelliJ IDEA Community Edition](https://www.jetbrains.com/idea/download/#section=linux)
2. Create a new project from Version Control using the `File > New > Project from Version Control`
dialog in IntelliJ IDEA 
    - Make sure to set the URL field to `https://github.com/bluelhf/debugger-demo`.
3. Wait for IDEA to clone the project
4. Select the `Start Server` run configuration
    - Usually, run configurations are listed on the top right
5. Start the server
    - On first launch, the plugin will download the 
      server archive, so you might have to wait awhile.
6. When the server starts, it'll log `Listening for transport dt_socket at address: 6969`.
   IDEA will place an `Attach Debugger` hint next to the line — press it to start the debugger.
7. Change some code (for example the message in [TestExecutor](./src/main/java/blue/lhf/debugger_demo/TestExecutor.java)),
   and reload changed classes with `Run > Debugging Actions > Reload Changed Classes`