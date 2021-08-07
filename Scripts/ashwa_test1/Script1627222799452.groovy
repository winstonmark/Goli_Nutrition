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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

for (int i = 0; i < 6; i++) {
	WebUI.openBrowser('')
	
	WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)
	
	WebUI.navigateToUrl(GlobalVariable.url_ashwa)
	
	WebUI.click(findTestObject('Object Repository/ashwa_test1/Page_Goli Ashwagandha/a_Shop Now'))
	
	switch (i) {
		case 0:
			WebUI.click(findTestObject('ashwa_test1/Page_OrderBtns/button_ORDER NOW'))
	
			break
		case 1:
			WebUI.click(findTestObject('ashwa_test1/Page_OrderBtns/button_PACKAGE6'))
	
			break
		case 2:
			WebUI.click(findTestObject('ashwa_test1/Page_OrderBtns/button_PACKAGE5,1'))
	
			break
		case 3:
			WebUI.click(findTestObject('ashwa_test1/Page_OrderBtns/button_PACKAGE4'))
	
			break
		case 4:
			WebUI.click(findTestObject('ashwa_test1/Page_OrderBtns/button_PACKAGE3,1'))
	
			break
		case 5:
			WebUI.click(findTestObject('ashwa_test1/Page_OrderBtns/button_PACKAGE1'))
	
			break
		default:
			WebUI.closeBrowser()
	
			break
	}
	
	WebUI.click(findTestObject('Object Repository/ashwa_test1/Page_Order - Ashwagandha  Goli/button_ORDER NOW'))
	
	WebUI.setText(findTestObject('Object Repository/ashwa_test1/Page_goli.com - Secure Checkout/input_Contact Information_email'),
		GlobalVariable.myTestEmail)
	
	WebUI.setText(findTestObject('Object Repository/ashwa_test1/Page_goli.com - Secure Checkout/input_Shipping Address_first_name'),
		'test')
	
	WebUI.setText(findTestObject('Object Repository/ashwa_test1/Page_goli.com - Secure Checkout/input_First name_last_name'),
		'test')
	
	WebUI.setText(findTestObject('Object Repository/ashwa_test1/Page_goli.com - Secure Checkout/input_Last name_address1'),
		'test')
	
	WebUI.setText(findTestObject('Object Repository/ashwa_test1/Page_goli.com - Secure Checkout/input_Apt, suite, etc. (optional)_city'),
		'test')
	
	WebUI.selectOptionByValue(findTestObject('ashwa_test1/Page_goli.com - Secure Checkout/select_State'),
		'Bukidnon', true)
	
	WebUI.setText(findTestObject('Object Repository/ashwa_test1/Page_goli.com - Secure Checkout/input_State_zip'), '1234')
	
	WebUI.setText(findTestObject('Object Repository/ashwa_test1/Page_goli.com - Secure Checkout/input_Change_phone'), '123123123123')
	
	CustomKeywords.'com.golinutrition.CommonUtils.inputCardDetailsOfTon'(GlobalVariable.myGoliCcNo, GlobalVariable.myGoliCcExp,
		GlobalVariable.myGoliCcName, GlobalVariable.myGoliCcSc)
	
	WebUI.click(findTestObject('Object Repository/ashwa_test1/Page_goli.com - Secure Checkout/button_Complete Order'))
}

