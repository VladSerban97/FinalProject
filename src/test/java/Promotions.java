import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Promotions extends PageObject{



    @FindBy(xpath = "/html/body/div/div[2]/div[2]/div[2]/ul/li[2]/a")
    private WebElement PromotionsButton;

    @FindBy(xpath = "/html/body/div/div/div/div/div[1]/div/div/div/ul/li[2]/div[1]/a")
    private WebElement TvButton;

    @FindBy(xpath = "/html/body/div/div/div/div/div[1]/div/div/div/ul/li[2]/div[2]/div/ul/li[1]/div[1]/a")
    private WebElement TV2Button;

    public Promotions(WebDriver driver) { super(driver);}

    public void SearchPromotionsButton(){ this.PromotionsButton.click();}
    public void SearchTvButton() { this.TvButton.click();}
    public void SearchTV2Button() { this.TV2Button.click();}


}