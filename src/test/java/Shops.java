import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Shops extends PageObject{


    @FindBy(xpath = "/html/body/div/div[2]/div[2]/div[2]/ul/li[6]/a")
    private WebElement ShopsButton;

    @FindBy(xpath = "/html/body/div/div[3]/main/div[2]/div/div[1]/article/div[1]/div[2]/div/div/div/div/div[1]")
    private WebElement RegionButton;

    @FindBy(xpath = "/html/body/div/div[3]/main/div[2]/div/div[1]/article/div[1]/div[3]/ul/li[1]/article/div[2]/div/a/div/div/div")
    private WebElement SpecificShop;

    public Shops (WebDriver driver) { super(driver);}

    public void SearchShopButton(){ this.ShopsButton.click();}

    public void SearchRegionButton()  { this.RegionButton.click();}
    public void SearchSpecificShop() { this.SpecificShop.click();}


}



