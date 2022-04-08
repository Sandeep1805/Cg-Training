package Assignment9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages ="Assignment9")
@EnableAutoConfiguration
@SpringBootApplication

public class BootWebApplication{
	
	
	public static void main(String[] args) {
		SpringApplication.run(BootWebApplication.class,args);
	}

}