import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ShopProduct extends PageObject{

    @FindBy(xpath= "/html/body/div[2]/div[2]/div[2]/div[1]/ul/li/div/div/div[1]/ul/li/div[2]/div/div/div[2]/div/ul/li[1]/label/span")
    private WebElement MobileProtectButton;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div[3]/a/div/div/div")
    private WebElement Finalbutton;


    public ShopProduct(WebDriver driver) { super(driver);}

    public void SelectMobileProtectButton() { this.MobileProtectButton.click();}

    public void SearchFinalButton() { this.Finalbutton.click();}





}
