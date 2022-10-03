package com.cydeo.streotype_annotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "com.cydeo.streotype_annotation") //we added @Component in the classes so we do not need method method in config. we use this annotation for this.
//"com.cydeo.streotype_annotation" we need to define because it will scan for @Component under this package otherwise it will only look for config package which does not have the classes (Dell etc. )
public class PcConfig {

}
