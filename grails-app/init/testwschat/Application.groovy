package testwschat

import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration

//import org.springframework.boot.SpringApplication
class Application extends GrailsAutoConfiguration {
    static void main(String[] args) {
     //   import org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext
     //   import org.springframework.boot.context.embedded.EmbeddedWebApplicationContext

//        EmbeddedWebApplicationContext context = new AnnotationConfigEmbeddedWebApplicationContext('wschat.config')
  //       println "Started context on ${new Date(context.startupDate)}"

      // SpringApplication.run(WschatConfig.class, args)
        GrailsApp.run(Application)
    }
}