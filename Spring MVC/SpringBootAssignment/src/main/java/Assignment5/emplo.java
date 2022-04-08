package Assignment5;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages ="Assignment5")
@EnableAutoConfiguration
@SpringBootApplication

public class emplo {
	
	
	public static void main(String[] args) {
		SpringApplication.run(emplo.class,args);
	}

}