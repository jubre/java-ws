package ch01.ts;

import java.util.Date;

import javax.jws.WebService;

/**
 * Service Implementation Bean for the TimeServer
 * 
 * The @WebService property endpointInterface links the SIB (this class) to the
 * SEI (ch01.ts.TimeServer). Note that the method implementations are not
 * annotated as @WebMethods.
 */
@WebService(endpointInterface = "ch01.ts.TimeServer")
public class TimeServerImpl implements TimeServer {

	@Override
	public String getTimeAsString() {
		return new Date().toString();
	}

	@Override
	public long getTimeAsElapsed() {
		return new Date().getTime();
	}

}
