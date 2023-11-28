package step_definition
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys as Keys
import internal.GlobalVariable
import io.appium.java_client.android.nativekey.AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class DetailProduct {
	@Given("User is on SecondHand App")
	public void user_is_on_SecondHand_App() {
		Mobile.startApplication('Apk/secondhand-24082023.apk', true)
	}

	@When("User click one of product card")
	public void user_click_one_of_product_card() {

		Mobile.tap(findTestObject('Page_Home/div_Product1'), 3)
	}

	@Then("User can see product detail")
	public void user_can_see_product_detail() {
		Mobile.verifyElementVisible(findTestObject('Page_DetailProduct/txt_NamaProduk'), 2)
	}

	@When("User click one of product item from {string} result list")
	public void user_click_one_of_product_item_from_result_list(String string) {
		Mobile.tap(findTestObject('Page_Home/inputfield_search'), 2)
		Mobile.setText(findTestObject('Page_Home/inputfield_search'), 'kucing', 1)
		Mobile.sendKeys(findTestObject('Page_Home/inputfield_search'), Keys.chord(Keys.RETURN))
	}

	@Then("User can see product detail from product list that appeared on search result")
	public void user_can_see_product_detail_from_product_list_that_appeared_on_search_result() {
		Mobile.verifyElementVisible(findTestObject('Page_DetailProduct/img_kucing'), 2)
	}
}