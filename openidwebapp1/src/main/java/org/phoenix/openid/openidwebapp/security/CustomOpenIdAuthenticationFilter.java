package org.phoenix.openid.openidwebapp.security;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.security.openid.OpenIDAuthenticationFilter;

public class CustomOpenIdAuthenticationFilter extends OpenIDAuthenticationFilter {
	private static final Logger LOGGER = Logger.getLogger(CustomOpenIdAuthenticationFilter.class);
	private String openIdProviderUrl;

	protected String obtainUsername(HttpServletRequest req) {
		LOGGER.info("Obtaining custom username");
        return openIdProviderUrl+req.getParameter(DEFAULT_CLAIMED_IDENTITY_FIELD);
    }

	public void setOpenIdProviderUrl(String openIdProviderUrl) {
		this.openIdProviderUrl = openIdProviderUrl;
	}
}
