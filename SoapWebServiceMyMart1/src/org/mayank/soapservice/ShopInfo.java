package org.mayank.soapservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC)
public class ShopInfo {
	
	@WebMethod
	@WebResult(partName="lookupOotput")
	public String getShopInfo(@WebParam(partName="lookupInput")String property){
		
		if("shopname".equalsIgnoreCase(property)){
			return "MyMart";
		}
		else if("since".equalsIgnoreCase(property)){
			return "Since 1956";
		}
		return "Invalid Property";
	}

}
