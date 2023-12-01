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



class Notification {
	
	@And("User click NOTIFICATION icon")
	def user_click_notification_icon() {
		Mobile.tap(findTestObject('Page_Home/button_Notifikasi'), 3)
	}
	
	@And("User refresh the page")
	def user_refresh_the_page() {
		def device_Height = Mobile.getDeviceHeight()
		int startY = device_Height * 0.30
		int endY = device_Height * 0.70
		Mobile.swipe(0, startY, 0, endY)
	}
	
	@And("User click the first notification")
	def user_click_the_first_notification() {
		Mobile.tap(findTestObject('Page_Notification/card_Notifikasi01'), 3)
		Mobile.delay(3)
	}
	
	@And("User click BERANDA icon")
	def user_click_beranda_icon() {
		Mobile.tap(findTestObject('Page_Home/button_Beranda'), 3)
	}
	
	@And("User click BACK button in product detail")
	def user_click_back_button_in_product_detail() {
		Mobile.tap(findTestObject('Page_DetailProduct/button_back'), 3)
	}
	
	@And("User click BACK button in DAFTAR JUAL SAYA")
	def user_click_back_button_in_datar_jual_saya() {
		Mobile.tap(findTestObject('Page_Akun/Page_DaftarJualSaya/button_Back'), 3)
	}
}