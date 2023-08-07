package org.pom;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Ada_pom {
		
		public WebDriver driver;
		@FindBy (id="username")
		private WebElement username;
		

		@FindBy (id="password")
		private WebElement password;
		
		@FindBy (id="login")
		private WebElement login;
		
		public WebDriver getDriver() {
			return driver;
		}
		
		public Ada_pom(WebDriver driver2)
		{
			this.driver=driver2;
		PageFactory.initElements(driver, this);
			
		}

		public WebElement getUsername() {
			return username;
		}

		
		public WebElement getPassword() {
			return password;
		}


		public WebElement getLogin() {
			return login;
		}

		


		
		
		
	}



