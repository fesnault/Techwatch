package org.phoenix.openid.openidwebapp.request;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class OpenIdCleanedRequest extends HttpServletRequestWrapper {
	private Map cleanedParameterMap;
	
	public OpenIdCleanedRequest(HttpServletRequest request) {
		super(request);
	}
	
	@Override
	public Map getParameterMap() {
		if (cleanedParameterMap != null) {
			return cleanedParameterMap;
		}
		Map original = super.getParameterMap();
		cleanedParameterMap = new HashMap();
		Iterator iterator = original.keySet().iterator();
		while (iterator.hasNext()) {
			String key = (String)iterator.next();
			Object value = original.get(key);
			if (value instanceof String) {
				value = clean((String)value);
			} else if (value instanceof String[]) {
				String[] vals = new String[((String[]) value).length];
				for (int i=0; i<vals.length; i++) {
					String originalValue = ((String[])value)[i];
					vals[i] = clean(originalValue);
				}
				value = vals;
			}
			cleanedParameterMap.put(key,value);
		}
		return cleanedParameterMap;
	}

	private String clean(String value) {
		String cleanedValue = value;
		if (cleanedValue.indexOf("\r") != -1) {
			cleanedValue = cleanedValue.replaceAll("\r", "");
		}
		if (cleanedValue.indexOf("\n") != -1) {
			cleanedValue = cleanedValue.replaceAll("\n", "");
		}
		return cleanedValue;
	}
}
