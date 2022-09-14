package assessment;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class QaAssessment {

	public static String url;
	//Step1
	 public static String urlName(String url){
		 //Change your url here
			url = "https://en.wikipedia.org/wiki/Test_automation";
			return url;
		}
	 public static boolean isURL(String url) {
   	  try {
   	     (new java.net.URL(url)).openStream().close();
   	     return true;
   	  } catch (Exception ex) { }
   	  return false;
   	}
	 //Step 2
	 public static int setNumber(int newanumber) {
	        int n;
		        if (newanumber >= 1 && newanumber <= 20) {
		            n = newanumber;
		        } else {
		            throw new IllegalArgumentException("anumber out of range");
		        }
		        return n;
	 }
	// Step 3
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String url1=urlName(url);
		driver.get(url1);
		driver.manage().window().maximize();
		//Step 4
		List<WebElement> listofLinks=driver.findElements(By.tagName("a"));
		int count=listofLinks.size();
		System.out.println(count);
		//Change your Number here
		int n= setNumber(8);
		ArrayList<Object> newList = new ArrayList<Object>(listofLinks);
		//step 5
		for (int i=0; i<newList.size(); i++) {
			  Object mylist = newList.get(i);
			  if (i==n) {				
				  break;
			  
			}
			  System.out.println(mylist);		
		       
		}
		    
		} 
}
	


	

