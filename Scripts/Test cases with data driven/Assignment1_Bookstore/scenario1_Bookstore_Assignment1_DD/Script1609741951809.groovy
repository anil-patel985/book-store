import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demoqa.com/login')

WebUI.sendKeys(findTestObject('Login_Scenario1_Assignment1/Txt_Username'), findTestData('Login').getValue(1, 1))

WebUI.sendKeys(findTestObject('Login_Scenario1_Assignment1/Txt_Password'), findTestData('Login').getValue(2, 1))

WebUI.click(findTestObject('Login_Scenario1_Assignment1/Btn_Login'))

String Actual_Title = WebUI.getWindowTitle()

String Expected_Title = 'ToolsQA'

System.out.println('Actual title = ' + Actual_Title)

if (Expected_Title.equalsIgnoreCase(Actual_Title)) {
    System.out.println('Title is successfully verified')
} 
else {
	System.out.println('Title is not same as expected')
}

WebUI.delay(5)

WebUI.closeBrowser()

