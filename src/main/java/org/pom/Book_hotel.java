package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_hotel {

public WebDriver driver;
	
	@FindBy(id="first_name")
	private WebElement first_name;
	
	@FindBy(id="last_name")
	private WebElement last_name;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement card;
	
	@FindBy(id="cc_type")
	private WebElement cc_type;
	
	@FindBy(id="cc_exp_month")
	private WebElement exp_month;
	
	@FindBy(id="cc_exp_year")
	private WebElement exp_year ;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement book ;
	
	@FindBy(id="cancel")
	private WebElement cancel;
	
	
	
	
	public Book_hotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);



}




	public WebDriver getDriver() {
		return driver;
	}




	public WebElement getFirst_name() {
		return first_name;
	}




	public WebElement getLast_name() {
		return last_name;
	}




	public WebElement getAddress() {
		return address;
	}




	public WebElement getCard() {
		return card;
	}




	public WebElement getCc_type() {
		return cc_type;
	}




	public WebElement getExp_month() {
		return exp_month;
	}




	public WebElement getExp_year() {
		return exp_year;
	}




	public WebElement getCvv() {
		return cvv;
	}




	public WebElement getBook() {
		return book;
	}




	public WebElement getCancel() {
		return cancel;
	}
}    
