package com.ncepu.yun.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

@Component
public class TestRequestFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        System.out.println("request filter doFilter");

        if (request instanceof HttpServletRequest) {
            HttpServletRequest httpServletRequest = (HttpServletRequest) request;
            Object test = httpServletRequest.getSession().getAttribute("test");
            if (test == null) {
                httpServletRequest.getSession().setAttribute("test", "test-value");
            }
        } else {
            System.out.println("servlet request is not httpServletRequest");
        }

        chain.doFilter(request, response);
    }



}
