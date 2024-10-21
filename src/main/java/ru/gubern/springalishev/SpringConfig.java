package ru.gubern.springalishev;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:musicPlayer.yaml")
@ComponentScan("ru.gubern.springalishev")
public class SpringConfig {
}
