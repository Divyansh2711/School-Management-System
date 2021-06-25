package com.SchoolManagementSystem.AdminwebSecurity;



import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebsecurityConfig extends WebSecurityConfigurerAdapter {

	@SuppressWarnings("unused")
	@Autowired
	private DataSource dataSource;
	/***
	 *  @return object of UserDetailsService
	 */
	@Bean	
	public UserDetailsService userDetailsService() {
		return new CustomAdminDetailsService();
	}
	/***
	 * password encoder method
	 * @return object of BCryptPasswordEncoder
	 */

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();

	}
	/***
	 * 
	 * @return authenticationProvider 
	 */
	public DaoAuthenticationProvider authenticationProvider()
	{
		DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
		authenticationProvider.setUserDetailsService(userDetailsService());
		authenticationProvider.setPasswordEncoder(passwordEncoder());
		return authenticationProvider;
		
	}
	
	/***
	 * 	 configures authentication provider
	 * 
	 * 
	 */
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(authenticationProvider());
		
	}
	/***
	 *   configures login and logout 
	 *   authenticate url using antmatcher 
	 *   redirects to defaultsuccessfull url
	 * 
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		 http.authorizeRequests()		 
		.antMatchers("/adminProfile/**/**").authenticated()
		.anyRequest().permitAll()
		.and()
		.formLogin().loginPage("/adminLogin")
				.usernameParameter("email").defaultSuccessUrl("/adminProfile")
				.permitAll()
			 .and()
			.logout().logoutUrl("/logout").permitAll()
			;
		
	        
	}
	
}
