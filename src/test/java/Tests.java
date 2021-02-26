import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Tests {
    private static final WebDriver driver = new ChromeDriver();

    private static void NavigateToSecondPage() {
        driver.get(Utils.BASE_URL);
        LoginAndSearchPage webForm = new LoginAndSearchPage(driver);
        webForm.SearchSearchField();
        webForm.PopulateSearchField1();
        webForm.SearchSearchButton();
    }
    private static void NavigateToThirdPage(){
        SelectProduct webSelectProduct = new SelectProduct(driver);
        Utils.WaitForElement(3);
        webSelectProduct.SelectProduct();
        Utils.WaitForElement(2);
        webSelectProduct.SearchPopUp();
        Utils.WaitForElement(3);
        webSelectProduct.SearchShopButton();
        Utils.WaitForElement(3);
// .Products--grid > li:first-of-type > div >div:nth-child(2) > div > h2 > a
    }
    public static void NavigateToFourthPage() {
        ShopProduct webShopProduct = new ShopProduct(driver);
        Utils.WaitForElement(3);
        webShopProduct.SelectMobileProtectButton();
        Utils.WaitForElement(10);
        webShopProduct.SearchFinalButton();

    }


    @BeforeSuite
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);}

    @Test (testName = "LoginPage")
      public static void LoginPage () {
        driver.get(Utils.BASE_URL);
        LoginAndSearchPage webForm = new LoginAndSearchPage(driver);
        webForm.searchLoginButton();
        webForm.populateSearchEmail();
        webForm.populateSearchPassword();
        webForm.searchAuthenticationButton();
    }

    @Test (testName = "Support")
    public static void Support () {
        driver.get(Utils.BASE_URL);
       Support webSupport = new Support(driver);
       Utils.WaitForElement(4);
      webSupport.SearchSupportButton();
      Utils.WaitForElement(4);
      webSupport.SearchFieldSupport();
      webSupport.PolulateFieldSupport();
      webSupport.SearchSendButton();
    }
    @Test (testName = "SearchProduct")
     public static void SearchProduct() {
        driver.get(Utils.BASE_URL);
        LoginAndSearchPage webForm = new LoginAndSearchPage(driver);
        webForm.SearchSearchField();
        webForm.PopulateSearchField1();
        webForm.SearchSearchButton();
    }

    @Test (testName = "BrandButton")
    public static void BradButton() {
        driver.get(Utils.BASE_URL);
        BrandButton webBrand = new BrandButton(driver);
        webBrand.SearchBrandButton();
        Utils.WaitForElement(2);
        webBrand.SearchSpecificBrand();
        Utils.WaitForElement(2);
        webBrand.SearchSpecificProduct();
        Assert.assertEquals(webBrand.SearchTopHeader(),"Branduri disponibile pe Altex");
    }
    @Test (testName = "PromotionsButton")
    public static void PromotionButton() {
        driver.get(Utils.BASE_URL);
        Promotions webPromotions = new Promotions(driver);
        webPromotions.SearchPromotionsButton();
        Utils.WaitForElement(2);
        webPromotions.SearchTvButton();
        Utils.WaitForElement(2);
        webPromotions.SearchTV2Button();
    }
    @Test (testName = "ShopButton")
    public static void ShopButton() {
        driver.get(Utils.BASE_URL);
        Utils.WaitForElement(3);
        Shops webShops = new Shops(driver);
        webShops.SearchShopButton();
        Utils.WaitForElement(2);
        webShops.SearchRegionButton();
        Utils.WaitForElement(5);
        webShops.SearchSpecificShop();
    }

    @Test (testName = "CriteriaSpecific")
    public static void CriteriaSpecific () {
        NavigateToSecondPage();
        CriteriaProduct webSecondPage = new CriteriaProduct(driver);
        Utils.WaitForElement(3);
        webSecondPage.SearchCriteriaButton();
        Utils.WaitForElement(3);
        webSecondPage.SearchStockButton();
        Utils.WaitForElement(3);
        webSecondPage.SearchUnderPrice();
        Utils.WaitForElement(3);
        webSecondPage.SelectProduct();
        Assert.assertEquals(webSecondPage.GetProductHeader(), "Rezultate cautare : iphone11");
    }
    @Test (testName = "ShopList")
    public static void SelectProduct () {
         NavigateToSecondPage();
        SelectProduct webSelectProduct = new SelectProduct(driver);
        Utils.WaitForElement(3);
        webSelectProduct.SelectProduct();
        Utils.WaitForElement(3);
        webSelectProduct.SearchWarrantyButton();
        Utils.WaitForElement(5);
        webSelectProduct.SearchPopUp();
        Utils.WaitForElement(5);
        webSelectProduct.SearchShopButton();

    }
    @Test (testName = "ShopProduct")
    public static void ShopProduct () {
        NavigateToSecondPage();
        NavigateToThirdPage();
        ShopProduct webShopProduct = new ShopProduct(driver);
        Utils.WaitForElement( 3);
        webShopProduct.SelectMobileProtectButton();
        Utils.WaitForElement(10);
        webShopProduct.SearchFinalButton();


    }
    @Test (testName = "HomeButton")
    public static void HomeButton () {
        NavigateToSecondPage();
        NavigateToThirdPage();
        NavigateToFourthPage();
        Utils.WaitForElement(10);
        HomeButton webHome = new HomeButton(driver);
        webHome.SearchAmountButton();
        Utils.WaitForElement(10);
        webHome.SearchUltimateButton();
        Utils.WaitForElement(10);
        webHome.SearchHomeButton();


    }
    @AfterSuite
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}