import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomeButton extends PageObject{


    @FindBy(xpath = "/html/body/div/div[2]/main/div[3]/div/section/div/div[1]/ul/li/div/div/div[2]/div/button[2]")
    private WebElement AmountButton;
    @FindBy(xpath = "/html/body/div/div[2]/main/div[3]/div/div[3]/a/div/div/div")
    private WebElement UltimateButton;

    @FindBy(xpath = "/html/body/div/div[2]/main/div[1]/ol/li[1]/a")
    private WebElement Homebutton;


    public HomeButton(WebDriver driver) { super(driver);}

    public void SearchAmountButton() {this.AmountButton.click();}
    public void SearchUltimateButton() {this.UltimateButton.click();}
    public void SearchHomeButton() { this.Homebutton.click();}




}
