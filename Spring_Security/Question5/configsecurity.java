package Question5;


import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
@EnableWebSecurity
public class configsecurity extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		.withUser("rama")
	     .password("sita")
	     .roles("admin")
	     .and()
	     .withUser("laxmana")
	     .password("hanuma")
	     .roles("user");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests()
		          .antMatchers("/admin").hasRole("admin")
	               .antMatchers("/user").hasRole("user")
	               .and()
	                 .formLogin()
	                 .and()
	                 .rememberMe();
	}

	@Bean
	public PasswordEncoder pass() {
		return NoOpPasswordEncoder.getInstance();
	}

}
