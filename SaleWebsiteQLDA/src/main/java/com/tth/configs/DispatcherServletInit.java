/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tth.configs;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 *
 * @author tongh
 */
public class DispatcherServletInit extends AbstractAnnotationConfigDispatcherServletInitializer{

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{
            SpringSecurityConfig.class,
            HibernateConfig.class,
            TilesConfig.class,
            JwtSecurityConfig.class,
            EmailConfig.class
        };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{
            WebAppContextConfig.class
        };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{("/")};

    }
}
