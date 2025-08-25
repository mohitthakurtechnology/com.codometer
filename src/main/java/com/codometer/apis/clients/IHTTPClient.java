package com.codometer.apis.clients;

import java.util.HashMap;

public interface IHTTPClient<ANY> {
		 
	String executeGET(HashMap<ANY,ANY> config);
//	String executePUT(HashMap<ANY,ANY> config);
	String executePOST(HashMap<ANY,ANY> config);
//	String executeDELETE(HashMap<ANY,ANY> config);
	
	
}
