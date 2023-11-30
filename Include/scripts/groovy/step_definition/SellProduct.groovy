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



class SellProduct {
	
	@And("User click on Tambah button")
	public void User_click_on_tambah_button() {
		Mobile.tap(findTestObject('Page_home/button_tambah'), 2)
	}
	
	@And("User input {string} on Nama Produk field")
	def User_input_NamaProduk_on_NamaProduk_field(String NamaProduk) {
		Mobile.setText(findTestObject('Page_SellProduct/inputfield_NamaProduk'), NamaProduk, 2)
	}
	
	@And("User input {string} on Harga Produk field")
	def User_input_HargaProduk_on_HargaProduk_field(String HargaProduk) {
		Mobile.setText(findTestObject('Page_SellProduct/inputfield_HargaProduk'), HargaProduk, 2)
	}
	
	@And("User select {string} on Kategori dropdown field")
	def User_select_Kategori_on_Kategori_dropdown_field(String KategoriProduk) {
		Mobile.tap(findTestObject('Page_SellProduct/dropdown_Kategori'), 0)
		Mobile.sendKeys(findTestObject('Page_SellProduct/dropdown_Kategori'), KategoriProduk)
		Mobile.tap(findTestObject('Page_SellProduct/link_PilihKategoriPertama'), 0)
	}
	
	@And("User input {string} on Lokasi field")
	def User_input_LokasiProduk_on_LokasiProduk_field(String LokasiProduk) {
		Mobile.setText(findTestObject('Page_SellProduct/inputfield_LokasiProduk'), LokasiProduk, 2)
	}
	
	@And("User input {string} on Deskripsi field")
	def User_input_DeskripsiProduk_on_DeskripsiProduk_field(String DeskripsiProduk) {
		def device_Height = Mobile.getDeviceHeight()
		int startY = device_Height * 0.30
		int endY = device_Height * 0.70
		Mobile.swipe(0, endY, 0, startY)
		Mobile.setText(findTestObject('Page_SellProduct/inputfield_DeskripsiProduk'), DeskripsiProduk, 2)
	}
	
	@And("User click on Foto Produk field")
	public void User_click_on_FotoProduk_field() {
		Mobile.tap(findTestObject('Page_SellProduct/inputfield_FotoProduk'), 2)
	}
	
	@And("User input product image file")
	public void User_input_productImage_file() {
		Mobile.tap(findTestObject('Page_SellProduct/image_ProductFromGallery'), 2)
		Mobile.delay(3)
	}
	
	@And("User click on Terbitkan button")
	public void User_click_on_Terbitkan_button() {
		Mobile.tap(findTestObject('Page_SellProduct/button_Terbitkan'), 2)
	}
	
	@Then("User verify product added")
	def user_verify_product_added() {
		Mobile.verifyElementVisible(findTestObject('Page_SellProduct/text_ProdukBerhasilDiterbitkan'), 3)
	}
}