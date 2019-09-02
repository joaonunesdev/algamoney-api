package com.algaworks.algamoney.api.cors;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class CorsFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        // TODO Configurar para diferentes ambientes
        String allowedOrigin = "http://localhost:8000";
        String allowedMethods = "POST, GET, DELETE, PUT, OPTIONS";
        String allowedHeaders = "Authorization, Content-Type, Accept";

        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        if ("OPTIONS".equals(httpRequest.getMethod())) {
            httpResponse.setHeader("Access-Control-Allow-Origin", allowedOrigin);
            httpResponse.setHeader("Access-Control-Allow-Methods", allowedMethods);
            httpResponse.setHeader("Access-Control-Allow-Headers", allowedHeaders);

            httpResponse.setStatus(HttpServletResponse.SC_OK);
        } else {
            chain.doFilter(request, response);
        }

    }

    @Override
    public void destroy() {

    }
}
