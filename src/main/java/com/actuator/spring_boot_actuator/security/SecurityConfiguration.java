package com.actuator.spring_boot_actuator.security;

/*import org.springframework.boot.actuate.autoconfigure.security.servlet.EndpointRequest;
import org.springframework.boot.actuate.health.HealthEndpoint;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;*/


//This is made to set an authorized role to see the Health endpoint details

//@Configuration
public class SecurityConfiguration /* extends WebSecurityConfigurerAdapter */{

   /* @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().requestMatchers(EndpointRequest.to(HealthEndpoint.class))
                .permitAll()
                .requestMatchers(EndpointRequest.toAnyEndpoint()).hasRole("ACTUATOR")
                .and().httpBasic();
    }*/
    
}
