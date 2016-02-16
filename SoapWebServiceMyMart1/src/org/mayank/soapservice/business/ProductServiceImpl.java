package org.mayank.soapservice.business;

import java.util.ArrayList;
import java.util.List;

import org.mayank.soapservice.model.Products;

public class ProductServiceImpl {

	List<String> books = new ArrayList<>();
	List<String> music = new ArrayList<>();
	List<String> cosmetics = new ArrayList<>();

	public ProductServiceImpl(){
		books.add("The Life of Pie");
		books.add("The Game of Thrones");
		books.add("The Legend of Zoro");

		music.add("Beethovan");
		music.add("AR Rehmaaan");
		music.add("Pritam");

		cosmetics.add("Garnier");
		cosmetics.add("Lakme");
		cosmetics.add("Vasline");
	}

	public List<String> getProductCategories(){
		List<String> categories = new ArrayList<>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Cosmetics");
		return categories;
	}

	public List<String> getProducts(String category){
		switch (category.toLowerCase()) {
		case "books":
			return books;

		case "music":
			return music;

		case "cosmetics":
			return cosmetics;
		}
		return null;
	}

	public boolean addItem(String category, String item){

		switch (category.toLowerCase()) {
		case "books":
			books.add(item);
			break;
		case "music":
			music.add(item);
			break;
		case "cosmetics":
			cosmetics.add(item);
			break;
		default:
			return false;
		}
		return true;

	}

	public List<Products> getProductsV2(String category) {
		List<Products> productList = new ArrayList<>();
		if(category.equalsIgnoreCase("books")){
			productList.add(new Products("C++", "656", 99.98));
			productList.add(new Products("Java", "456", 199.98));
			productList.add(new Products("Python", "856", 1999.98));
			return productList;
		}

		else if(category.equalsIgnoreCase("music")){
			productList.add(new Products("Tylor Swift", "156", 99.98));
			productList.add(new Products("Bruno Mars", "356", 199.98));
			productList.add(new Products("Katy Perry", "756", 1999.98));
			return productList;
		}

		else if(category.equalsIgnoreCase("cosmetics")){
			productList.add(new Products("Loreal", "426", 99.98));
			productList.add(new Products("Lakme", "486", 199.98));
			productList.add(new Products("Garnier", "816", 1999.98));
			return productList;
		}
		else
			return null;

	}

}
