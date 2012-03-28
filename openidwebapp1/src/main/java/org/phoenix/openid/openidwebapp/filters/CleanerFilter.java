package org.phoenix.openid.openidwebapp.filters;

import org.phoenix.openid.openidwebapp.request.OpenIdCleanedRequest;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class CleanerFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
		OpenIdCleanedRequest cleanedRequest = new OpenIdCleanedRequest((HttpServletRequest)request);
		filterChain.doFilter(cleanedRequest, response);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}

}
