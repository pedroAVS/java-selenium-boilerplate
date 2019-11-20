package io.mb.oneweb.java.selenium.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    private By pageTitle = By.xpath("//*[contains(@test-id, 'headline') and (@xpath, '1')]");
    //top menu
    private By AllModels = By.xpath("//*[@Test-id=\"enterstringhere\"]");
    private By MercedesAMG = By.xpath("//*[@Test-id=\"enterstringhere\"]");
    private By AlternativeModels = By.xpath("//*[@Test-id=\"enterstringhere\"]");
    private By MercedesMaybach = By.xpath("//*[@Test-id=\"enterstringhere\"");

    //side menu
    private By SubGroupKombis = By.xpath("//*[@Test-id=\"enterstringhere\"");
    private By SubGroupSUVs = By.xpath("//*[@Test-id=\"enterstringhere\"");
    private By SubGroupKompaktwagen = By.xpath("//*[@Test-id=\"enterstringhere\"");
    private By SubGroupCoupes = By.xpath("//*[@Test-id=\"enterstringhere\"");
    private By SubGroupPickup = By.xpath("//*[@Test-id=\"enterstringhere\"");
    private By SubGroupLimousinen = By.xpath("//*[@Test-id=\"enterstringhere\"");
    private By SubGroupVans = By.xpath("//*[@Test-id=\"enterstringhere\"");
    private By SubGroupRoadster = By.xpath("//*[@Test-id=\"enterstringhere\"");
    private By SubGroupDisplayAll = By.xpath("//*[@Test-id=\"enterstringhere\"");

    //section name
    private By HeaderKombis = By.xpath("//*[@Test-id=\"enterstringhere\"");
    private By HeaderSUVs = By.xpath("//*[@Test-id=\"enterstringhere\"");
    private By HeaderKompaktwagen = By.xpath("//*[@Test-id=\"enterstringhere\"");
    private By HeaderCoupes = By.xpath("//*[@Test-id=\"enterstringhere\"");
    private By HeaderPickup = By.xpath("//*[@Test-id=\"enterstringhere\"");
    private By HeaderLimousinen = By.xpath("//*[@Test-id=\"enterstringhere\"");
    private By HeaderVans = By.xpath("//*[@Test-id=\"enterstringhere\"");
    private By HeaderRoadster = By.xpath("//*[@Test-id=\"enterstringhere\"");

    //section body
    private By InnerKombis = By.xpath("//*[@Test-id=\"enterstringhere\"");
    private By InnerSUVs = By.xpath("//*[@Test-id=\"enterstringhere\"");
    private By InnerKompaktwagen = By.xpath("//*[@Test-id=\"enterstringhere\"");
    private By InnerCoupes = By.xpath("//*[@Test-id=\"enterstringhere\"");
    private By InnerPickup = By.xpath("//*[@Test-id=\"enterstringhere\"");
    private By InnerLimousinen = By.xpath("//*[@Test-id=\"enterstringhere\"");
    private By InnerVans = By.xpath("//*[@Test-id=\"enterstringhere\"");
    private By InnerRoadster = By.xpath("//*[@Test-id=\"enterstringhere\"");


    public HomePage(WebDriver driver) {super(driver);}


    public WebElement getPageTitle() { return driver.findElement(pageTitle); }
    //top menu
    public WebElement getAllModels() { return driver.findElement(AllModels);}
    public WebElement getMercedesAMG() { return driver.findElement(MercedesAMG);}
    public WebElement getAlternativeModels() { return driver.findElement(AlternativeModels);}
    public WebElement getMercedesMaybach() { return driver.findElement(MercedesMaybach);}

    //side menu
    public WebElement getSubGroupKombis() { return driver.findElement(SubGroupKombis);}
    public WebElement getSubGroupSUVs() { return driver.findElement(SubGroupSUVs);}
    public WebElement getSubGroupKompaktwagen() { return driver.findElement(SubGroupKompaktwagen);}
    public WebElement getSubGroupPickup() { return driver.findElement(SubGroupPickup);}
    public WebElement getSubGroupCoupes() { return driver.findElement(SubGroupCoupes);}
    public WebElement getSubGroupLimousinen() { return driver.findElement(SubGroupLimousinen);}
    public WebElement getSubGroupVans() { return driver.findElement(SubGroupVans);}
    public WebElement getSubGroupRoadster() { return driver.findElement(SubGroupRoadster);}
    public WebElement getSubGroupDisplayAll() { return driver.findElement(SubGroupDisplayAll);}

    //section name
    public WebElement getHeaderKombis() { return driver.findElement(HeaderKombis);}
    public WebElement getHeaderSUVs() { return driver.findElement(HeaderSUVs);}
    public WebElement getHeaderKompaktwagen() { return driver.findElement(HeaderKompaktwagen);}
    public WebElement getHeaderCoupes() { return driver.findElement(HeaderCoupes);}
    public WebElement getHeaderPickup() { return driver.findElement(HeaderPickup);}
    public WebElement getHeaderLimousinen() { return driver.findElement(HeaderLimousinen);}
    public WebElement getHeaderVans() { return driver.findElement(HeaderVans);}
    public WebElement getHeaderRoadster() { return driver.findElement(HeaderRoadster);}

    //section body
    public WebElement getInnerKombis() { return driver.findElement(InnerKombis);}
    public WebElement getInnerSUVs() { return driver.findElement(InnerSUVs);}
    public WebElement getInnerKompaktwagen() { return driver.findElement(InnerKompaktwagen);}
    public WebElement getInnerCoupes() { return driver.findElement(InnerCoupes);}
    public WebElement getInnerPickup() { return driver.findElement(InnerPickup);}
    public WebElement getInnerLimousinen() { return driver.findElement(InnerLimousinen);}
    public WebElement getInnerVans() { return driver.findElement(InnerVans);}
    public WebElement getInnerRoadster() { return driver.findElement(InnerRoadster);}
}
