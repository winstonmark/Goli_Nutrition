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

for (int i = 0; i < 4; i++) {
    
    WebUI.openBrowser('')

    WebUI.navigateToUrl(GlobalVariable.url_immuneti)

    WebUI.click(findTestObject('Object Repository/immuneti_test1/Page_Advanced Immune Defense by Immuneti Nu_0e1009/div_ORDER NOW'))
	
	switch (i) {
		case 0:
			WebUI.click(findTestObject('immuneti_test1/Page_Order_Btns/button_OrderNow'))
			break
		case 1:
			WebUI.click(findTestObject('immuneti_test1/Page_Order_Btns/button_package5'))
			break
		case 2:
			WebUI.click(findTestObject('immuneti_test1/Page_Order_Btns/button_package3'))
			break
		case 3:
			WebUI.click(findTestObject('immuneti_test1/Page_Order_Btns/button_package1'))
			break
	}
	
    WebUI.setText(findTestObject('Object Repository/immuneti_test1/Page_immuneti.com - Secure Checkout/input_Contact Information_email'), 
        GlobalVariable.myCompanyEmail)

    WebUI.setText(findTestObject('Object Repository/immuneti_test1/Page_immuneti.com - Secure Checkout/input_Shipping Address_first_name'), 
        'Test')

    WebUI.setText(findTestObject('Object Repository/immuneti_test1/Page_immuneti.com - Secure Checkout/input_First name_last_name'), 
        'Test')

    WebUI.setText(findTestObject('Object Repository/immuneti_test1/Page_immuneti.com - Secure Checkout/input_Last name_address1'), 
        'Test')

    WebUI.setText(findTestObject('Object Repository/immuneti_test1/Page_immuneti.com - Secure Checkout/input_Apt, suite, etc. (optional)_city'), 
        'Test')

    WebUI.selectOptionByValue(findTestObject('Object Repository/immuneti_test1/Page_immuneti.com - Secure Checkout/select_Select state                        _2b4447'), 
        'Davao del Sur', true)

    WebUI.setText(findTestObject('Object Repository/immuneti_test1/Page_immuneti.com - Secure Checkout/input_State_zip'), 
        '8000')

    WebUI.setText(findTestObject('Object Repository/immuneti_test1/Page_immuneti.com - Secure Checkout/input_Change_phone'), 
        '09151868344')

    CustomKeywords.'com.golinutrition.CommonUtils.inputCardDetailsOfTon'(GlobalVariable.myGoliCcNo, GlobalVariable.myGoliCcExp, 
        GlobalVariable.myGoliCcName, GlobalVariable.myGoliCcSc)

    WebUI.click(findTestObject('Object Repository/immuneti_test1/Page_immuneti.com - Secure Checkout/button_Complete Order'))
}

