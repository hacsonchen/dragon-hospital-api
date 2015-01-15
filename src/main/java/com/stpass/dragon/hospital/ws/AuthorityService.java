package com.stpass.dragon.hospital.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.stpass.dragon.hospital.domain.OperatorBean;

/**
 * Interface of AuthorityService
 * @author chenqs@stpass.com
 * @version v0.1 2015/01/12
 */
@WebService
public interface AuthorityService {
	
	@WebMethod
	public String thirdAuth();
	
	@WebMethod
	public OperatorBean userSignIn(@WebParam(name="username")String username,@WebParam(name="password")String password);

}
