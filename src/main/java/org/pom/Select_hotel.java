package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_hotel {
	public WebDriver driver;
	
	@FindBy(id="radiobutton_0")
	private WebElement radio;
	@FindBy(id="continue")
	private WebElement conti;
	
	@FindBy(id="cancel")
	private WebElement cancel;
	
	public Select_hotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getConti() {
		return conti;
	}

	public WebElement getCancel() {
		return cancel;
	}


}
