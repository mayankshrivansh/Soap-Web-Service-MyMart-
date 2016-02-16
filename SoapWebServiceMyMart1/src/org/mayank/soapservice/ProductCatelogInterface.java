package org.mayank.soapservice;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.mayank.soapservice.model.Products;

@WebService(name="ProductDetails",
            targetNamespace="http://soapservice.mayank.org/")
public interface ProductCatelogInterface {
    
	@WebMethod(action="fetchCategory", operationName="fetchCategories")
	List<String> getProductCategories();

    @WebMethod
    List<String> getProducts(String category);

    @WebMethod
    boolean addItem(String category, String item);

    @WebMethod
    List<Products> getProductsV2(String category);

}