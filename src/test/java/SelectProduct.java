import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SelectProduct extends PageObject{

    @FindBy(css = ".Products li:nth-child(1) .Product-photoWrapper a")
    private WebElement SelectProduct;

    @FindBy(xpath = "/html/body/div/div[3]/main/div/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/div/div/div[1]/div/ul/li[1]/label/span")
    private WebElement WarrantyButton;

    @FindBy(xpath = "/html/body/div/div[3]/main/div/div[2]/div[1]/div[2]/div[2]/div/div/div[4]/div/div[1]/div[1]/div/div/button/div/div[2]/div")
    private WebElement ShopButton;

    @FindBy(xpath = "/html/body/div[1]/div[5]/div/div[2]/button")
    private WebElement PopUpButton;



    public SelectProduct (WebDriver driver) { super(driver);}

    public void SelectProduct() { this.SelectProduct.click();}

    public void SearchWarrantyButton() { this.WarrantyButton.click();}

    public void SearchShopButton() { this.ShopButton.click();}
    public void SearchPopUp() { this.PopUpButton.click();}


}
