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

import internal.GlobalVariable

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



class BuyProduct {
	@Then("user click home page")
	public void user_click_home_page() {
		Mobile.tap(findTestObject('Page_Home/button_Beranda'), 3)
	}

	@Then("User click SAYA TERTARIK DAN INGIN NEGO button")
	public void user_click_SAYA_TERTARIK_DAN_INGIN_NEGO_button() {
		Mobile.verifyElementVisible(findTestObject('Page_DetailProduct/txt_NamaProduk'), 2)
		Mobile.tap(findTestObject('Page_DetailProduct/button_TertarikdanNego'), 2)
	}

	@And("User fill {string} price field")
	public void user_fill_field(String harga) {
		Mobile.verifyElementVisible(findTestObject('Page_DetailProduct/Popup_Tawar/txt_MasukkanHargaTawarmu'), 2)
		Mobile.setText(findTestObject('Page_DetailProduct/Popup_Tawar/inputfield_HargaTawar'), harga, 3)
	}

	@Then("User click KIRIM button")
	public void user_click_KIRIM_button() {
		Mobile.tap(findTestObject('Page_DetailProduct/Popup_Tawar/button_Kirim'), 2)
	}
		
	@Then("Message Harga tawarmu berhasil dikirim ke penjual will be shown")
	public void message_Harga_tawarmu_berhasil_dikirim_ke_penjual_will_be_shown() {
		Mobile.verifyElementVisible(findTestObject('Page_DetailProduct/button_TertarikdanNego'), 2)
	}
	
	@And("Message Silahkan login terlebih dahulu will be shown")
	public void Message_Silahkan_login_terlebih_dahulu_will_be_shown() {
		Mobile.verifyElementVisible(findTestObject('Page_Login/button_Login'), 2)
	}

}