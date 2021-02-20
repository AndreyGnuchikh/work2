package OFD.stand;

import OFD.methods.*;
import OFD.SettingsOFD.Drivers;
import OFD.SettingsOFD.OfdStand;
import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.WebDriver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Testing2 extends OfdStand {
    public WebDriver driver;

    @BeforeEach
    public void setUP() {
        try {
            driver = Drivers.ff();
            Login login = new Login(url,log1,pass1);
            login.start(driver);
        } catch (Throwable e) {
            Catch.catching(driver, e);
        }
    }
    // Проблема в том, что junit у нас направлена просто а Rule и BeforeEach  в библиотеке import org.junit.jupiter.api.BeforeEach; в апи
    @Ignore
    //@RetryingTest(NUM_FAIL)
    public void Test1_EnterCabinet(){
        try {

                Check.checkExit(Element.getNameElement("Вы",driver),"Выхд",driver);
                System.out.println("Test FAIL");


        } catch (Throwable e) {
            Catch.catching(driver,e);
        }
    }
    @Ignore
    //@RetryingTest(NUM_FAIL)
    public void TestPrivateOffice2(){
        try {
            System.out.println("ddfdsfdf");
            System.out.println("Test GOOD");
        } catch (Throwable e) {
            Catch.catching(driver,e);
        }
    }
}