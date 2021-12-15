package locators;

import org.openqa.selenium.By;

public class Loc {
	
	public static String url= "https://www.amazon.in";
	public static By Sign_in= By.id("nav-link-accountList");//nav-link-accountList
	public static By sign_in_btn= By.className("nav-action-inner");
	public static By email=By.name("email");
	public static By continue_btn=By.className("a-button-input");
	public static By password=By.name("password");
	public static By sign_in_submit_btn=By.id("signInSubmit");
	public static By All_btn=By.xpath("//*[contains(@class,'hm-icon nav-sprite')]");
	public static By Hello_message=By.xpath("(//div[contains(@id,'hmenu-customer-profile')])[3]/div/b");
	public static By cross=By.className("nav-sprite hmenu-close-icon");
	public static By search_box=By.id("twotabsearchtextbox");
	public static By search_btn=By.id("nav-search-submit-button");
	public static By product_names=By.xpath("//*[contains(@class,'a-size-medium a-color-base a-text-normal')]");
	public static By next_btn=By.partialLinkText("/s?k=iphone+12&page");
	public static By product_prices=By.xpath("a-price-whole");
	
	

}
