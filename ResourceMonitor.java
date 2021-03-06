// camel-k: language=java

import org.apache.camel.builder.RouteBuilder;

public class ResourceMonitor extends RouteBuilder {
  @Override
  public void configure() throws Exception {

      // Write your routes here, for example:
      from("timer:java?period=1000000")
        .routeId("java")
        .setBody()
          .simple("Hello Camel K from ${routeId}")
        .to("log:info");

  }
}
