package Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplewindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
       Set<String> windows =driver.getWindowHandles();
       List<String> Ids= new ArrayList<String>(windows);
       String windowone = Ids.get(0);
       String windowtwo =Ids.get(1);
       System.out.println("The 1st Window ID is:"+windowone);
       System.out.println("the 2nd Window ID is: "+ windowtwo);
       driver.switchTo().window(windowtwo);
       System.out.println("The 2nd window title is "+driver.getTitle());
       
       driver.switchTo().window(windowone);
       System.out.println("The 1st window title is "+driver.getTitle());

       
        
	}

}
