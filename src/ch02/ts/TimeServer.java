package ch02.ts;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Service Endpoint Interface for the TimeServer.
 * 
 * The annotation @WebService signals that this is the SEI (Service Endpoint
 * Interface). @WebMethod signals that each method is a service operation.
 * 
 * The @SOAPBinding annotation impacts the under-the-hood construction of the
 * service contract, the WSDL (Web Services Definition Language) document.
 * Style.RPC simplifies the contract and makes deployment easier.
 */
@WebService
@SOAPBinding
public interface TimeServer {
	@WebMethod
	String getTimeAsString();

	@WebMethod
	long getTimeAsElapsed();
}
