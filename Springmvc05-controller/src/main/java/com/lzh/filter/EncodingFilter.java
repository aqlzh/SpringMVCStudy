package com.lzh.filter;

import javax.servlet.*;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.util.logging.LogRecord;

public class EncodingFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
          servletRequest.setCharacterEncoding("utf-8");
          servletResponse.setCharacterEncoding("utf-8");

          chain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}


