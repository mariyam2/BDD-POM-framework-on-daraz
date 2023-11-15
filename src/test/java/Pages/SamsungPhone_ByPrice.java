package Pages;
import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.browsersetUp;



public class SamsungPhone_ByPrice extends browsersetUp{
	
	  
	 public static String search_fieldtextbox= "//input[@id='q']";
	 public static String search_button= "search-box__button--1oH7";
	
	 
	 public static String min_filter="//input[@placeholder='Min']";
	 public static String max_filter= "//input[@placeholder='Max']";
	 public static String apply_filter= "//button[@type='button']";
	 public static String product_elements= "gridItem--Yd0sa";
	 public static String Add_toCartBtn= "//span[contains(text(),'Add to Cart')]";
	 public static String cross_button= "//i[@class='next-icon next-icon-close next-icon-small']";
	 public static String navigating_cart="//span[@class='cart-icon']//*[name()='svg']";
	 //public static String update_Phonequantity= "//div[@id='item_i237b8150']//i[@class='next-icon next-icon-add next-icon-medium']";
	 public static String cart_Cell_Links= "//div[@class='content']/a[@class='automation-link-from-title-to-prod title']";
	 //"cart-item-left";//"checkout-shop-children";// "automation-link-from-title-to-prod title";
	 public static String markcheckbox= "//label[contains(@class, 'next-checkbox') and contains(@class, 'cart-item-checkbox')]";
	 public static String del_option= "//span[@class='list-header-operation-text']";
	 public static String del_confirm= "//button[@class='ok']";
	 public static String title_element= "pdp-mod-product-badge-title";
	 public static String product_descp= "pdp-product-detail";
	 public static String Select_all_cartProDel= "//*[@id=\"listHeader_H\"]/div/div/div[1]/label/input";
	 //public static String Select_all_cart_disabled_prodel= "//*[@id=\"listHeader_H\"]/div/div/div[1]/label/input";
	 public static String unavailable_productsDEL= "//span[@class='btn-text' and text()='DELETE ALL']";
	 public static String freeDC="//div[text()='Free Delivery']";
	 public static String proceed_COut= "//button[contains(text(), 'PROCEED TO CHECKOUT')]";
	 public static String sleect_all= "//label[contains(@class, 'next-checkbox') and contains(@class, 'list-header-checkbox')]";
	 
	 
	 public static void moveTo_checkout() throws InterruptedException{
		 WebElement elementlist=  driver.findElement(By.xpath(Select_all_cartProDel));
		 elementlist.click();
		 Thread.sleep(1000);
		 WebElement Checkout= driver.findElement(By.xpath(proceed_COut));
		 Thread.sleep(2000);
		 Checkout.click();
		 Thread.sleep(6000);
		 
	 }
	 
	 public static void Delete_Pro_inCart() throws InterruptedException{
		 
		WebElement elementlist=  driver.findElement(By.xpath(Select_all_cartProDel));
		
		if(elementlist.isEnabled()) {
			
			elementlist.click();
			driver.findElement(By.xpath(del_option)).click();
			Thread.sleep(1000);;
			driver.findElement(By.xpath(del_confirm)).click();
			Thread.sleep(1000);}
			
		if(!elementlist.isEnabled()){
				try {
					
					WebElement unav_del=  driver.findElement(By.xpath(unavailable_productsDEL));
					Thread.sleep(2000);
					unav_del.click();
					
					Thread.sleep(3000);
					driver.findElement(By.xpath(del_confirm)).click();
					Thread.sleep(3000);
				}
				catch(NoSuchElementException e) {
					
					System.out.println("Cart is already Empty");
				}
				
				catch (ElementNotInteractableException e) {
					
					Thread.sleep(3000);
					
				}
			}
			
		
		
		 
	 }
	 
	 public static void navigating_searchbox(String name) throws InterruptedException{
		 
		 driver.findElement(By.xpath(search_fieldtextbox)).sendKeys(name);
		 Thread.sleep(5000);
		 
	 }
	 
public static void extra_cart() throws InterruptedException{
		 
		 driver.findElement(By.xpath(navigating_cart)).click();
		 Thread.sleep(5000);
		 
	 }
	
	 public static void searchboxclick() throws InterruptedException{

		 driver.findElement(By.className(search_button)).click();
//		 driver.findElement(By.xpath()).click();
		 Thread.sleep(2000); }
	
     public static void price_filter(String minprice,String  maxprice) throws InterruptedException{
    	 driver.findElement(By.xpath(min_filter)).sendKeys(minprice);
    	 Thread.sleep(5000);
    	 driver.findElement(By.xpath(max_filter)).sendKeys(maxprice);
    	 driver.findElement(By.xpath(apply_filter)).click();
    	 
    	 
     }

   public static void cart_products() throws InterruptedException{
	   
	   
	   List<WebElement> productLinks = driver.findElements(By.className(product_elements));
	   Thread.sleep(1000);
	    int numProducts = productLinks.size();
	    
	    for (int i = 0; i < numProducts; i++) {
	        try {
	            // Re-locate product link in each iteration
	            productLinks = driver.findElements(By.className(product_elements));
	            
	            // Click on the product element to view details
	            productLinks.get(i).click();
	            Thread.sleep(5000);

	            // Perform actions to add the product to the cart (replace with your specific actions)
	            // Example: Locate and click the "Add to Cart" button
	            driver.findElement(By.xpath(Add_toCartBtn)).click();
	            Thread.sleep(3000);
	            driver.findElement(By.xpath(cross_button)).click();
	            Thread.sleep(1000);

	            // Go back to the phone page
	            driver.navigate().back();
	        }
	        catch (org.openqa.selenium.StaleElementReferenceException e) {}
	        catch (org.openqa.selenium.NoSuchElementException e) {}
	        catch (ElementNotInteractableException e) {
	            System.out.println("Element not interactable: " + e.getMessage());
	        }
	    }}
	   
   public static void cart123() throws InterruptedException {
//	    driver.findElement(By.xpath(navigating_cart)).click();
	    int maxQuantity = 3;
	    int desiredQuantity = 5;

	    for (int i = 0; i < desiredQuantity; i++) {
	        try {
	            if (i >= maxQuantity) {
	                throw new CartQuantityLimitExceededException("Quantity limit exceeded. Maximum allowed quantity is " + maxQuantity);
	            }

	            // Perform the action to update the cart quantity
	            driver.findElement(By.xpath("//i[@class='next-icon next-icon-add next-icon-medium'][1]")).click();

	            if (isOutOfStock()) {
	                throw new OutOfStockException("Product is out of stock.");
	            }
	        } catch (CartQuantityLimitExceededException e) {
	            System.out.println(e.getMessage());
	            break;
	        } catch (OutOfStockException e) {
	            System.out.println(e.getMessage());
	            break;
	        } catch (NoSuchElementException e) {
	            System.out.println("Quantity field not found.");
	            break;
	        }
	    }
	}

	public static class CartQuantityLimitExceededException extends Exception {
	    public CartQuantityLimitExceededException(String message) {
	        super(message);
	    }
	}

	public static class OutOfStockException extends Exception {
	    public OutOfStockException(String message) {
	        super(message);
	    }
	}

	public static boolean isOutOfStock() {
	    

	    //WebElement addToCartButton = driver.findElement(By.className("next-number-picker-handler next-number-picker-handler-up next-number-picker-handler-up-disabled"));
	    
	    //if (!addToCartButton.isEnabled()) {
	        System.out.println(" No more stock");
	        //return true;
	    //}
	    
	    return false;
	}
   
	public static void Fetch_links() throws InterruptedException {
	    List<WebElement> productLinks = driver.findElements(By.className(product_elements));
	    int numProducts = productLinks.size();

	    for (int i = 0; i < numProducts; i++) {
	        try {
	        	 if (!productLinks.isEmpty() && i < productLinks.size()) { // Check if the index is within the list size
	                // Re-locate product link in each iteration
	                productLinks = driver.findElements(By.className(product_elements));

	                // Click on the product element to view details
	                productLinks.get(i).click();
	                Thread.sleep(2000);

	                // Get the title of the product
	                WebElement titleElement = driver.findElement(By.className(title_element));
	                String title = titleElement.getText();
	                Thread.sleep(2000);

	                // Check through description also
	                WebElement descriptionElement = driver.findElement(By.className(product_descp));
	                String description = descriptionElement.getText();
	                Thread.sleep(2000);

	                if (title.toLowerCase().contains("fast charging") || description.toLowerCase().contains("fast charging") || title.toLowerCase().contains("fast battery") || description.toLowerCase().contains("fast battery")) {
	                    // Example: Locate and click the "Add to Cart" button
	                    Thread.sleep(2000);
	                    driver.findElement(By.xpath(Add_toCartBtn)).click();
	                    Thread.sleep(3000);
	                    driver.findElement(By.xpath(cross_button)).click();
	                    Thread.sleep(1000);
	                    driver.navigate().back();
	                } else {
	                    // If the title doesn't include "fast charging," navigate back to the page
	                    driver.navigate().back();
	                    Thread.sleep(1000);
	                    driver.navigate().refresh();
	                }
	            }
	        } catch (org.openqa.selenium.StaleElementReferenceException e) {
	            // Handle the stale element exception by continuing with the loop
	        } catch (org.openqa.selenium.NoSuchElementException e) {
	            // Handle "Unable to find add to cart element" error, if it occurs
	            // You can add custom error handling here
	        }
	        catch (ElementNotInteractableException e) {
	            // Handle the exception here, such as scrolling to the element or waiting for it to become interactable.
	            // You can also log the exception message.
	            System.out.println("Element not interactable: " + e.getMessage());
	        }
	    }
	}

	public static void FreeDelivery_cart() throws InterruptedException {
		
		driver.findElement(By.xpath(freeDC)).click();
		Thread.sleep(1000);
		
		
		
	}
	
	
}
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	  
	   
	   
	   
	   
 
	
  
