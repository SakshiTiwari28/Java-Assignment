package CommonUtilities.CommonFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

//find element
//Whether Element does exist or not
//use 2 funtion in 3 function
public class Action {

	private static final String ActionName = null;
	public static Boolean ElementExists(WebDriver driver,String PropertyType,String Value ) 
	{
		// TODO Auto-generated method stub
		
		if(PropertyType.equalsIgnoreCase("ID"))
			try
		{
			if(driver.findElement(By.id(Value)).isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}

		}catch(Exception e)

	{
			 System.out.println("Exception occurred");
			return false;
	}
 return false;
}
public static Boolean ElementAction(WebDriver driver,String PropertyType,String PropertyName,String Value,String ElementName)
{
	Actions action = new Actions(driver);
	WebElement  element = driver.findElement(By.xpath(PropertyName));
	if(CommonActions.ElementExist(element))
	{
		System.out.println(ElementName+" Exists");
		if((ActionName.equalsIgnoreCase("click"))
				{
			element.click();
				}
		else 
		if(ActionName.equalsIgnoreCase("text"))
	{
			element.sendKeys(Value)
	}
		else if(ActionName.equalsIgnoreCase("MoveToAnElement"))
		
		{	
			
				return true;
	}
	else
		System.out.println(ElementName+" Does not Exists");
				return false;
}
}
}

public static Boolean ElementFinder(WebDriver driver,String PropertyType,String Value)
{
{ WebElement Element=null;
try
{if(PropertyType.equalsIgnoreCase("id"))
		{
			
			Element=driver.findElement(arg0)
		}
}

}