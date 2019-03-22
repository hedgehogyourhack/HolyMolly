package pl.aogiri.eventrio.mobile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

@EnableWebSecurity
@Configuration
public class WebSecurityConfig {
    public static final String ROOT_PASSWORD = "admin";
    public static final String ROOT_LOGIN = "admin";
    public static final String USER_PASSWORD = "user";
    public static final String USER_LOGIN = "password";

    public void authWithHttpServletRequest(HttpServletRequest request, String username, String password) {
        try {
            request.login(username, password);
        } catch (ServletException e) {
            System.out.println("error with login: " + e);
        }
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser(USER_LOGIN).password("{noop}" + USER_PASSWORD).roles("USER")
                .and()
                .withUser(ROOT_LOGIN).password("{noop}" + ROOT_PASSWORD).roles("USER", "ROOT");
    }

    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/webjars/**", "/assets/**").permitAll();
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/", "/home", "/about").permitAll()
                .antMatchers("/admin/**").hasAnyRole("ADMIN")
                .antMatchers("/user/**").hasAnyRole("USER")
					.antMatchers("/api/**").hasAnyRole("USER", "ADMIN")
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
                .logout()
                .permitAll();

          //      .exceptionHandling().accessDeniedHandler(accessDeniedHandler).and().httpBasic();
    }

}
