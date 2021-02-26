import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Support extends PageObject{

     final private String String = " Cata garantie am?";

    @FindBy(xpath = "/html/body/div/div[2]/div[2]/div[2]/ul/li[5]/a")
    private WebElement SupportButton;

    @FindBy(xpath = "/html/body/div/div[3]/main/section[1]/div/form/div[1]/input")
    private WebElement FieldSupport;

    @FindBy(xpath = "/html/body/div/div[3]/main/section[1]/div/form/div[2]/button/div/div/div")
    private WebElement Sendbutton;

    public Support(WebDriver driver) { super(driver);}

    public void SearchSupportButton(){ this.SupportButton.click();}
    public void SearchFieldSupport() { this.FieldSupport.click();}
    public void PolulateFieldSupport() { this.FieldSupport.sendKeys(String);}
    public void SearchSendButton() { this.Sendbutton.click();}


}
