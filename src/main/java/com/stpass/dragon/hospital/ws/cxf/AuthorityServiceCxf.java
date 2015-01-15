package com.stpass.dragon.hospital.ws.cxf;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.stpass.dragon.hospital.domain.OperatorBean;
import com.stpass.dragon.hospital.service.OperatorService;
import com.stpass.dragon.hospital.ws.AuthorityService;

/**
 * Implement of AuthorityService
 * @author chenqs@stpass.com
 * @version v0.1 2015/01/12
 */
@WebService(endpointInterface = "com.stpass.dragon.hospital.ws.AuthorityService", serviceName = "authorityService")
public class AuthorityServiceCxf implements AuthorityService {

	private OperatorService operatorService;
	
	public void setOperatorService(OperatorService operatorService) {
		this.operatorService = operatorService;
	}
	
	@WebMethod
	public String thirdAuth() {
		return "HelloWorld2";
	}
	
	@WebMethod
	public OperatorBean userSignIn(String username,String password) {
		return operatorService.signIn(username, password);
	}

}
