package com.silence

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.{EnableAutoConfiguration, SpringBootApplication}
import org.springframework.context.annotation.{ComponentScan, Configuration}
import springfox.documentation.swagger2.annotations.EnableSwagger2

@Configuration
@EnableSwagger2
@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
class Config


object SpringBootScalaApplication extends App {

    SpringApplication.run(classOf[Config])
  
}
