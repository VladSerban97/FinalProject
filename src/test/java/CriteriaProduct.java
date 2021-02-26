import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CriteriaProduct extends PageObject{

    @FindBy(xpath = "/html/body/div/div[3]/main/div[2]/div[1]/div[2]/div[1]/div/div/div/div[1]/div[1]/div/select")
    private WebElement SearchCriteriaButton;

    @FindBy(xpath = "/html/body/div/div[3]/main/div[2]/div[2]/ul/div/li[1]/ul/li[3]/a")
    private WebElement SearchStockButton;

    @FindBy(xpath = "/html/body/div/div[3]/main/div[2]/div[2]/ul/div/li[2]/ul/li[1]/a")
    private WebElement SearchUnderPrice;

    @FindBy(css = ".Products li:nth-child(1) .Product-photoWrapper a")
    private WebElement SelectProduct;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[3]/main/div[2]/div[1]/div[1]/h1")
    private WebElement ProductHeader;

    public CriteriaProduct (WebDriver driver) { super(driver);}

    public void SearchCriteriaButton() { this.SearchCriteriaButton.click();}

    public void SearchStockButton() { this.SearchStockButton.click();}

    public void SearchUnderPrice() { this.SearchUnderPrice.click();}

    public void SelectProduct() { this.SelectProduct.click();}

    public String GetProductHeader() { return this.ProductHeader.getText(); }
}
