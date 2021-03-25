import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.interactions.Actions as Actions
import org.openqa.selenium.interactions.Keyboard as Keyboard
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.sun.jna.platform.KeyboardUtils as KeyboardUtils
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

//WebDriver driver;
//driver = new ChromeDriver();
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://demoqa.com/automation-practice-form')

WebUI.sendKeys(findTestObject('Student form/Txt_Firstname'), findTestData('StudentForm').getValue(1, 1))

WebUI.sendKeys(findTestObject('Student form/Txt_Lastname'), findTestData('StudentForm').getValue(2, 1))

WebUI.sendKeys(findTestObject('Student form/Txt_email'), findTestData('StudentForm').getValue(3, 1))

WebUI.click(findTestObject('Student form/RadioBtn_Male'))

WebUI.sendKeys(findTestObject('Student form/Txt_Mobilenumber'), findTestData('StudentForm').getValue(4, 1))

WebUI.click(findTestObject('Student form/Click_Datepicker'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Student form/Click_Yeardropdown'))

WebUI.click(findTestObject('Student form/Select_Year97'))

WebUI.click(findTestObject('Student form/Click_Month'))

WebUI.click(findTestObject('Student form/Select_Month10'))

WebUI.click(findTestObject('Student form/Select_Date27'))

WebUI.setText(findTestObject('Student form/Subject'), findTestData('StudentForm').getValue(5, 1))

WebUI.sendKeys(findTestObject('Student form/Subject'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Student form/Btn_hobbySports'))

WebUI.click(findTestObject('Student form/Btn_hobbyReading'))

WebUI.click(findTestObject('Student form/Btn_hobbyMusic'))

WebUI.sendKeys(findTestObject('Student form/Click_Uploadpicture'), findTestData('StudentForm').getValue(9, 1))

WebUI.scrollToPosition(0, 1000)

WebUI.sendKeys(findTestObject('Student form/Txt_CurrentAddress'), findTestData('StudentForm').getValue(6, 1))

WebUI.sendKeys(findTestObject('Student form/Click_SelectState'), findTestData('StudentForm').getValue(7, 1))

WebUI.sendKeys(findTestObject('Student form/Click_SelectState'), Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('Student form/Click_SelectCity'), findTestData('StudentForm').getValue(8, 1))

WebUI.sendKeys(findTestObject('Student form/Click_SelectCity'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Student form/Click_Submit'))

String Fullname_aftr = WebUI.getText(findTestObject('Student form/After Submit/Full_name'))
System.out.println('Student name : ' + Fullname_aftr)

String Email_aftr = WebUI.getText(findTestObject('Student form/After Submit/Email'))
System.out.println('Email : ' + Email_aftr)

String Gender_aftr = WebUI.getText(findTestObject('Student form/After Submit/Gender'))
System.out.println('Gender : ' + Gender_aftr)

String Mobile_aftr = WebUI.getText(findTestObject('Student form/After Submit/Mobile'))
System.out.println('Mobile : ' + Mobile_aftr)

String DOB_aftr = WebUI.getText(findTestObject('Student form/After Submit/Date_Of_Birth'))
System.out.println('Date of Birth : ' + DOB_aftr)

String Subject_aftr = WebUI.getText(findTestObject('Student form/After Submit/Subject_Aftrsubmit'))
System.out.println('Subject : ' + Subject_aftr)

String Hobbies_aftr = WebUI.getText(findTestObject('Student form/After Submit/Hobbies'))
System.out.println('Hobbies : ' + Hobbies_aftr)

String Picture_aftr = WebUI.getText(findTestObject('Student form/After Submit/Picture'))
System.out.println('Picture : ' + Picture_aftr)

String Address_aftr = WebUI.getText(findTestObject('Student form/After Submit/Address'))
System.out.println('Address : ' + Address_aftr)

String StateAndCity_aftr = WebUI.getText(findTestObject('Student form/After Submit/State and City'))
System.out.println('State and City : ' + StateAndCity_aftr)

String fullname = findTestData('StudentForm').getValue(1, 1) + " " + findTestData('StudentForm').getValue(2, 1)
//System.out.println('Full name from excel sheet = ' + fullname )
String email  = findTestData('StudentForm').getValue(3, 1)

String mobile = findTestData('StudentForm').getValue(4, 1)

String subjects = findTestData('StudentForm').getValue(5, 1)

String address = findTestData('StudentForm').getValue(6, 1)

String stateandcity = findTestData('StudentForm').getValue(7, 1) + " " + findTestData('StudentForm').getValue(8, 1)

if((fullname).equals(Fullname_aftr) && (email).equals(Email_aftr) && (mobile).equals(Mobile_aftr) &&
(subjects).equals(Subject_aftr) && (address).equals(Address_aftr) && (stateandcity).equals(StateAndCity_aftr) ){
	
	System.out.println("Verification is done successfully ")
}
else{
	System.out.println("Verification is failed ")
}


WebUI.closeBrowser()