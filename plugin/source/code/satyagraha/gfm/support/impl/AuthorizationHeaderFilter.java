
package code.satyagraha.gfm.support.impl;

import javax.ws.rs.core.HttpHeaders;

import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.ClientRequest;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.filter.ClientFilter;

/**
 * {@link ClientFilter}: Authorization header
 */
public final class AuthorizationHeaderFilter extends ClientFilter {
	
	/**
	 * Value
	 */
	private final String value;
	
	/**
	 * Constructor
	 * 
	 * @param value {@link #value}
	 */
	public AuthorizationHeaderFilter(String value) {
		
		this.value = value;
	}
	
	@Override
	public ClientResponse handle(ClientRequest request) throws ClientHandlerException {
		
		if (!request.getHeaders().containsKey(HttpHeaders.AUTHORIZATION)) {
			
			request.getHeaders().add(HttpHeaders.AUTHORIZATION, this.value);
		}
		
		return this.getNext().handle(request);
	}
}
