package objectrespository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Base;

public class AccessPage extends Base {
	public AccessPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(tagName = "h3")
	private WebElement lbl_custId;

	public WebElement getLbl_custId() {
		return lbl_custId;
	}
}
