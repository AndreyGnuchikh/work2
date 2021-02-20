package OFD.stand;


import OFD.methods.*;
import OFD.SettingsOFD.Drivers;
import OFD.SettingsOFD.OfdStand;
import org.junit.jupiter.api.*;
import org.junitpioneer.jupiter.RetryingTest;
import org.openqa.selenium.WebDriver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Test1_loginAndLogout extends OfdStand {
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

    @RetryingTest(NUM_FAIL)
    @Order(1)
    public void Test1_EnterCabinet(){
        try {
            Check.checkExit(Element.getNameElement("�����",driver),"�����",driver);
        } catch (Throwable e) {
            Catch.catching(driver,e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(2)
    public void Test2_CheckNameFDTab(){
        try {

            Element.clickElementByName("���������� ���������",driver);
            Check.checkExit(Element.getNameElement("�����",driver),"�����",driver);
        } catch (Throwable e) {
            Catch.catching(driver,e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(3)
    public void Test3_CheckNameRequestsTab(){
        try {
            Element.clickElementByName("������",driver);
            Check.checkExit(Element.getNameElement("��� ������",driver),"��� ������",driver);
        } catch (Throwable e) {
            Catch.catching(driver,e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(4)
    public void Test4_CheckNameDocumentsTab(){
        try {
            Element.clickElementByName("���������",driver);
            Thread.sleep(200);
            Check.checkExit(Element.getNameElement("�����",driver),"�����",driver);
        } catch (Throwable e) {
            Catch.catching(driver,e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(5)
    public void Test5_CheckNameAnalyticTab(){
        try {

            Element.clickElementByName("���������",driver);
            Element.GetIdAndIfElementExistClick("v-window-closebox",driver);
            Check.checkExit(Element.getNameElement("�������",driver),"�������",driver);
        } catch (Throwable e) {
            Catch.catching(driver,e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(6)
    public void Test6_CheckNameAnalytic_IncomeTab(){
        try {
            Element.clickElementByName("���������",driver);
            Element.GetIdAndIfElementExistClick("v-window-closebox",driver);
            Check.checkExit(Element.getNameElement("������",driver),"������",driver);
        } catch (Throwable e) {
            Catch.catching(driver,e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(7)
    public void Test7_CheckNameAnalytic_ShiftsTab(){
        try {
            Element.clickElementByName("���������",driver);
            Element.GetIdAndIfElementExistClick("v-window-closebox",driver);
            Element.clickElementByName("�����",driver);
            Check.checkExit(Element.getNameElement("������� ���",driver),"������� ���",driver);
        } catch (Throwable e) {
            Catch.catching(driver,e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(8)
    public void Test8_CheckNameAnalytic_NDSTab(){
        try {
            Element.clickElementByName("���������",driver);
            Element.GetIdAndIfElementExistClick("v-window-closebox",driver);
            Element.clickElementByName("���",driver);
            Check.checkExit(Element.getNameElement("��� ���",driver),"��� ���",driver);
        } catch (Throwable e) {
            Catch.catching(driver,e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(9)
    public void Test9_CheckNameMarking(){
        try {
            Element.clickElementByName("����������",driver);
            Check.checkExit(Element.getNameElement("������",driver),"������",driver);
        } catch (Throwable e) {
            Catch.catching(driver,e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(10)
    public void Test10_CheckNameOrganisation(){
        try {
            Element.clickElementByName("�����������",driver);
            Check.checkExit(Element.getNameElement("�������������",driver),"�������������",driver);
        } catch (Throwable e) {
            Catch.catching(driver,e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(11)
    public void Test11_CheckNameUsers_User(){
        try {
            Element.clickElementByName("������������",driver);
            Check.checkExit(Element.getNameElement("�������� ������������",driver),"�������� ������������",driver);
        } catch (Throwable e) {
            Catch.catching(driver,e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(12)
    public void Test12_CheckName_GroupUsers(){
        try {
            Element.clickElementByName("������������",driver);
            Element.clickElementByName("������ �������������",driver);
            Check.checkExit(Element.getNameElement("������� ������",driver),"������� ������",driver);
        } catch (Throwable e) {
            Catch.catching(driver,e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(13)
    public void Test13_CheckName_OnlineRegisterKKT(){
        try {
            Element.clickElementByName("������ ����������� ���",driver);
            Check.checkExit(Element.getNameElement(urlRegKKTToFNS,driver),urlRegKKTToFNS,driver);
        } catch (Throwable e) {
            Catch.catching(driver,e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(14)
    public void Test14_CheckName_Profile(){
        try {
            Element.clickElementByName("�������",driver);
            Check.checkExit(Element.getNameElement("�������� ����������",driver),"�������� ����������",driver);
        } catch (Throwable e) {
            Catch.catching(driver,e);
        }
    }
    @RetryingTest(NUM_FAIL)
    @Order(15)
    public void Test15_Check_Exit(){
        try {
            Element.clickElementByName("�����",driver);
            Check.checkExit(driver.getCurrentUrl(),url,driver);
        } catch (Throwable e) {
            Catch.catching(driver,e);
        }
    }
}
