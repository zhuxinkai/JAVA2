package com.buhuixiu.www.demo.controller;

import com.buhuixiu.www.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

/**
 * <h3>buhuixiu</h3>
 * <p>https</p>
 *
 * @author : zhuxinkai
 * @date : 2019-12-22 20:12
 **/

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true,securedEnabled = true)
public class MultiHttpSecurityConfig{
    @Autowired
    UserService userService;
    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    @Autowired
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        /*
        auth.inMemoryAuthentication()
                .withUser("root")
                .password("$2a$10$RMuFXGQ5AtH4wOvkUqyvuecpqUSeoxZYqilXzbz50dceRsga.WYiq")
                .roles("ADMIN", "DBA")
                .and()
                .withUser("admin")
                .password("$2a$10$RMuFXGQ5AtH4wOvkUqyvuecpqUSeoxZYqilXzbz50dceRsga.WYiq")
                .roles("ADMIN", "USER")
                .and()
                .withUser("sang")
                .password("$2a$10$eUHbAOMq4bpxTvOVz33LIehLe3fu6NwqC9tdOcxJXEhyZ4simqXTC")
                .roles("USER");

         */


        auth.userDetailsService(userService);
    }

    @Configuration

    @Order(1)
    public static class AdminSecurityConfig
            extends WebSecurityConfigurerAdapter {
        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.antMatcher("/admin/**").authorizeRequests()
                    .anyRequest().hasRole("ADMIN");
        }
    }






    @Configuration
    public static class OtherSecurityConfig
            extends WebSecurityConfigurerAdapter{

        @Override
        public void configure(WebSecurity web) throws Exception {
            web.ignoring().antMatchers("/webjars/**/*", "/**/*.css", "/**/*.js","/**/*.svg","/**/*.ttf","/**/*.woff",
                    "/**/*.eot");
        }
        @Autowired
        private AuthenticationFailureHandler myAuthenticationFailHander;
        @Autowired
        private AuthenticationSuccessHandler myAuthenticationSuccessHander;
        @Override
        protected void configure(HttpSecurity http) throws Exception {

            http.authorizeRequests().antMatchers("/login","/VlidUser").permitAll()
                    .antMatchers("/admin/**").hasRole("admin")
                    .antMatchers("/db/**").hasRole("dba")
                    .antMatchers("/user/**").hasRole("user")
                    .anyRequest().authenticated()
                    .and()
                    .formLogin().loginPage("/login")
                    .loginProcessingUrl("/authentication/form").failureHandler(myAuthenticationFailHander).successHandler(myAuthenticationSuccessHander).permitAll()
                    .permitAll()
                    .and()
                    .csrf()
                    .disable();

        }
    }
}
