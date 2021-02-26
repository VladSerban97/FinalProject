import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class BrandButton extends PageObject{


    @FindBy(xpath = "/html/body/div/div[2]/div[2]/div[2]/ul/li[3]/a")
    private WebElement BrandButton;

    @FindBy(xpath = "/html/body/div/div[3]/main/div[3]/div[1]/button[4]/span[1]")
    private WebElement SpecificBrandButton;

    @FindBy(xpath = "/html/body/div/div[3]/main/div[4]/div/div[2]/div/a/span[1]")
    private WebElement SpecificProductBrandButton;
    @FindBy(xpath = "//*[@id=\"__next\"]/div[3]/main/div[2]/h1")
    private WebElement Topheader;

    public BrandButton (WebDriver driver) { super(driver);}

    public void SearchBrandButton(){ this.BrandButton.click();}
    public void SearchSpecificBrand() { this.SpecificBrandButton.click();}
    public void SearchSpecificProduct() { this.SpecificProductBrandButton.click();}
    public String SearchTopHeader(){return this.Topheader.getText();}

}
