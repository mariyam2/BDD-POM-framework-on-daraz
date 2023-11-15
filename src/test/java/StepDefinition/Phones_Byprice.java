package StepDefinition;
import Pages.SamsungPhone_ByPrice;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Phones_Byprice {
	
	
	
	  @Then("^I want to search a phone name \"([^\"]*)\"$")	
	  public void navigateToSearchBar(String name) throws InterruptedException {
		  SamsungPhone_ByPrice.navigating_searchbox(name);
	  }
		  
	    
	
	  private void navigating_searchbox() {
		// TODO Auto-generated method stub
		
	}




	@Then("Click search button")
	  public void searchfield() throws InterruptedException {
		
		  
		SamsungPhone_ByPrice.searchboxclick();
		Thread.sleep(5000);
		  
	  }
	
	@When("I set the price min to {int} and max to {int}")
	
	public void pricee(int minprice, int maxprice) throws InterruptedException {
		SamsungPhone_ByPrice.price_filter(String.valueOf(minprice), String.valueOf(maxprice));
	    Thread.sleep(9000);
		
	}
	
	@When("I add products in cart")
	 public void cart_pro() throws InterruptedException{
		SamsungPhone_ByPrice.cart_products();
		
	}
	
	@Then("Update quantity of any phone upto maximum or allowed quantity")
	public void in_cart() throws InterruptedException{
		SamsungPhone_ByPrice.cart123();
		Thread.sleep(2000);
		
//		SamsungPhone_ByPrice samsungPage = new SamsungPhone_ByPrice();
//
//		samsungPage.cart123();
	}
	@Then("Getting products in cart with only fast charging support")
	public void fetching_cart() throws InterruptedException{
		SamsungPhone_ByPrice.Fetch_links();
		
	}
	@Then("Navigate to cart")
	public void navigate_tocart() throws InterruptedException{
		
		SamsungPhone_ByPrice.extra_cart();
	}
	


	@Then("Remove any product\\(s) if found else ingore")
	public void check_productsIN_cart() throws InterruptedException{
		
		SamsungPhone_ByPrice.Delete_Pro_inCart();
	}

	@Then("I click on free delivery option as a filter")
	public void AddtoCart_FD() throws InterruptedException{
		
		SamsungPhone_ByPrice.FreeDelivery_cart();
	}
	
	@Then("I select all products and navigate to checkout page")
	
		public void moveTo_Chckout() throws InterruptedException{
			
			SamsungPhone_ByPrice.moveTo_checkout();
	}

}
	
	


