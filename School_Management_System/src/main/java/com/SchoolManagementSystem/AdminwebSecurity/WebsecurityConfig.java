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
<<<<<<< HEAD
=======
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
>>>>>>> e3f1abb797095a70843f8fb2e65b9cc28b5b88fb

@Configuration
@EnableWebSecurity
public class WebsecurityConfig extends WebSecurityConfigurerAdapter {

<<<<<<< HEAD
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
=======
	@Autowired
	private DataSource dataSource;

	@Bean
	
	public UserDetailsService userDetailsService() {
		return new CustomAdminDetailsService();
	}
>>>>>>> e3f1abb797095a70843f8fb2e65b9cc28b5b88fb

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();

	}
<<<<<<< HEAD
	/***
	 * 
	 * @return authenticationProvider 
	 */
=======
>>>>>>> e3f1abb797095a70843f8fb2e65b9cc28b5b88fb
	public DaoAuthenticationProvider authenticationProvider()
	{
		DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
		authenticationProvider.setUserDetailsService(userDetailsService());
		authenticationProvider.setPasswordEncoder(passwordEncoder());
		return authenticationProvider;
		
	}
<<<<<<< HEAD
	
	/***
	 * 	 configures authentication provider
	 * 
	 * 
	 */
=======

>>>>>>> e3f1abb797095a70843f8fb2e65b9cc28b5b88fb
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(authenticationProvider());
		
	}
<<<<<<< HEAD
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
=======

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		 http
		 
		 .authorizeRequests()
		 
>>>>>>> e3f1abb797095a70843f8fb2e65b9cc28b5b88fb
		.antMatchers("/adminProfile/**/**").authenticated()
		.anyRequest().permitAll()
		.and()
		.formLogin().loginPage("/adminLogin")
				.usernameParameter("email").defaultSuccessUrl("/adminProfile")
				.permitAll()
			 .and()
<<<<<<< HEAD
			.logout().logoutUrl("/logout").permitAll()
=======
			.logout().logoutSuccessUrl("/afterLogout").permitAll()
>>>>>>> e3f1abb797095a70843f8fb2e65b9cc28b5b88fb
			;
		
	        
	}
	
}
