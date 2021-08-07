package com.golinutrition

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class CommonUtils {
	@Keyword
	def inputCardDetailsOfTon(String cardNumber, String exp, String nameOnCard, String cvv) {

		WebUI.setText(findTestObject('Object Repository/goli_test1/Page_goli.com - Secure Checkout/input_cardnumber'),
				cardNumber)

		WebUI.setText(findTestObject('Object Repository/goli_test1/Page_goli.com - Secure Checkout/input_Payments with us are safely processed_b9df44'),
				nameOnCard)

		WebUI.setText(findTestObject('Object Repository/goli_test1/Page_goli.com - Secure Checkout/input_exp-date'),
				exp)

		WebUI.setText(findTestObject('Object Repository/goli_test1/Page_goli.com - Secure Checkout/input_cvc'),
				cvv)
	}
}
