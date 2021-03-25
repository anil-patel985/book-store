import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://demoqa.com/login')

WebUI.sendKeys(findTestObject('Login_Scenario1_Assignment1/Txt_Username'), findTestData('Login').getValue(1, 1))

WebUI.sendKeys(findTestObject('Login_Scenario1_Assignment1/Txt_Password'), findTestData('Login').getValue(2, 1))

WebUI.click(findTestObject('Login_Scenario1_Assignment1/Btn_Login'))

WebUI.scrollToElement(findTestObject('Bookstore/Btn_Gotostore'), 0)

WebUI.click(findTestObject('Bookstore/Btn_Gotostore'))

WebUI.sendKeys(findTestObject('Bookstore/Txt_Searchbox'), findTestData('Login').getValue(3, 1))

WebUI.delay(3)

String Author_srch = WebUI.getText(findTestObject('Bookstore/Author_Searched'))

String Publisher_srch = WebUI.getText(findTestObject('Bookstore/Publisher_Searched'))

WebUI.click(findTestObject('Bookstore/link_Speaking_Javascript_book'))

String ISBN = WebUI.getText(findTestObject('Bookstore/Txt_ISBN_bookpage'))

System.out.println('ISBN : ' + ISBN)

String Title = WebUI.getText(findTestObject('Bookstore/Txt_Title_bookpage'))

System.out.println('Title : ' + Title)

String Subtitle = WebUI.getText(findTestObject('Bookstore/Txt_SubTitle_bookpage'))

System.out.println('Subtitle : ' + Subtitle)

String Author = WebUI.getText(findTestObject('Bookstore/Txt_Author_bookpage'))

System.out.println('Author : ' + Author)

String Publisher = WebUI.getText(findTestObject('Bookstore/Txt_Publisher_bookpage'))

System.out.println('Publisher : ' + Publisher)

String Total_Pages = WebUI.getText(findTestObject('Bookstore/Txt_Totalpages_bookpage'))

System.out.println('Total Pages : ' + Total_Pages)

String Description = WebUI.getText(findTestObject('Bookstore/Txt_Description_bookpage'))

System.out.println('Description : ' + Description)

String Website = WebUI.getText(findTestObject('Bookstore/Txt_Websitelink_bookpage'))

System.out.println('Website link : ' + Website)

if (Author_srch.equalsIgnoreCase(Author) && Publisher_srch.equalsIgnoreCase(Publisher)) {
    System.out.println('\nAuthor and Publisher names are same as expected')
} else {
}

WebUI.click(findTestObject('Bookstore/Btn_Logout'))

WebUI.delay(3)

WebUI.closeBrowser()

