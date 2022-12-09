import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page {

    public Page() {  PageFactory.initElements(Driver.get(),this); }

    @FindBy(xpath = "//*[@id='button1']")
    public WebElement newWindowButton;

    @FindBy(xpath = "//button[.='New Message Window']")
    public WebElement newMessageWindowButton;

    @FindBy(xpath = "//*[.='New Browser Tab']")
    public WebElement newBrowsertabButton;

    @FindBy(xpath = "//*[.='Find me I have nothing in me!!']")
    public WebElement nothingInMe;

    @FindBy(xpath = "//a[@class='sample1']/../a[2]")
    public WebElement alertBox;

    @FindBy(xpath = "//button[.='Timing Alert']")
    public WebElement timingAlert;

    @FindBy(id = "colorVar")
    public WebElement changeColorBttn;






}
