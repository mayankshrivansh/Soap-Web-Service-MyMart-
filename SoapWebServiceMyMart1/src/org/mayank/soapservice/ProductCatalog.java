package org.mayank.soapservice;


import java.util.List;

import javax.jws.WebService;

import org.mayank.soapservice.business.ProductServiceImpl;
import org.mayank.soapservice.model.Products;

@WebService(endpointInterface="org.mayank.soapservice.ProductCatelogInterface", serviceName="ProductDetailsService", portName="ProductDetailsPort")
public class ProductCatalog implements ProductCatelogInterface {
	
	
	ProductServiceImpl call = new ProductServiceImpl();
	
	/* (non-Javadoc)
	 * @see org.mayank.soapservice.ProductCatelogInterface#getProductCategories()
	 */
	@Override
	public List<String> getProductCategories(){
		return call.getProductCategories();
	}
	
	/* (non-Javadoc)
	 * @see org.mayank.soapservice.ProductCatelogInterface#getProducts(java.lang.String)
	 */
	@Override
	public List<String> getProducts(String category){
		return call.getProducts(category);
	}
	
	/* (non-Javadoc)
	 * @see org.mayank.soapservice.ProductCatelogInterface#addItem(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean addItem(String category, String item){
		return call.addItem(category, item);
	}   
	
	/* (non-Javadoc)
	 * @see org.mayank.soapservice.ProductCatelogInterface#getProductsV2(java.lang.String)
	 */
	@Override
	public List<Products> getProductsV2(String category){
		return call.getProductsV2(category);
	}
	

}
