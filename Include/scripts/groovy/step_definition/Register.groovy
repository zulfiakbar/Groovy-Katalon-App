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



class Register {


	@Given("User is on the SecondHand App")
	def user_is_on_the_secondhand_app() {
		Mobile.verifyElementVisible(findTestObject('Page_Home/button_beranda'), 3, FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click AKUN icon")
	def user_click_akun_icon() {
		Mobile.tap(findTestObject('Page_Home/button_akun'), 3)
	}

	@And("User click MASUK button")
	def user_click_masuk_button() {
		Mobile.tap(findTestObject('Page_Home/button_AkunMasuk'), 2)
	}

	@And("User click DAFTAR link")
	def user_click_daftar_link() {
		Mobile.tap(findTestObject('Page_Login/link_Daftar'), 2)
	}

	@And("User is on register page")
	def user_is_on_register_page() {
		Mobile.verifyElementVisible(findTestObject('Page_Register/header_Daftar'), 3)
	}

	@And("User input {string} into NAMA field")
	def user_input_nama_into_nama_field(String nama) {
		Mobile.setText(findTestObject('Page_Register/inputfield_Nama'), nama, 2)
	}

	@And("User input {string} into EMAIL field")
	def user_input_email_into_email_field(String email) {
		Mobile.setText(findTestObject('Page_Register/inputfield_Email'), email, 2)
	}

	@And("User input {string} into PASSWORD field")
	def user_input_password_into_password_field(String password) {
		Mobile.setText(findTestObject('Page_Register/inputfield_Password'), password, 2)
	}

	@And("User input {string} into NOMOR HP field")
	def user_input_nomorhp_into_nomorhp_field(String nomorhp) {
		Mobile.setText(findTestObject('Page_Register/inputfield_NomorHP'), nomorhp, 2)
	}

	@And("User input {string} into KOTA field")
	def user_input_kota_into_kota_field(String kota) {
		Mobile.setText(findTestObject('Page_Register/inputfield_Kota'), kota, 2)
	}

	@And("User input {string} into ALAMAT field")
	def user_input_alamat_into_alamat_field(String alamat) {
		Mobile.setText(findTestObject('Page_Register/inputfield_Alamat'), alamat, 2)
	}

	@Then ("User click DAFTAR button")
	def user_click_daftar_button() {
		def device_Height = Mobile.getDeviceHeight()
		int startY = device_Height * 0.30
		int endY = device_Height * 0.70
		Mobile.swipe(0, endY, 0, startY)
		Mobile.tap(findTestObject('Page_Register/button_Daftar'), 2)
	}

	@And("User is on profile page")
	def user_is_on_profile_page() {
		Mobile.verifyElementVisible(findTestObject('Page_Home/button_beranda'), 3)
	}
}