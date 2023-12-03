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



class Edit_Product {

	@And("User click on DAFTAR JUAL SAYA")
	public void User_click_on_DAFTAR_JUAL_SAYA() {
		Mobile.tap(findTestObject('Page_Akun/button_DaftarJualSaya'), 2)
	}

	@And("User click product card that want to edit")
	public void user_click_product_card_that_want_to_edit() {
		Mobile.verifyElementVisible(findTestObject('Page_Akun/Page_DaftarJualSaya/txt_NamaProduk'), 2)
		Mobile.tap(findTestObject('Page_Akun/Page_DaftarJualSaya/txt_NamaProduk'), 0)
	}

	@And("User fill text field {string} at NAMA PRODUK")
	public void user_fill_text_field_at_NAMA_PRODUK(String NamaProduk) {
		Mobile.setText(findTestObject('Page_Akun/Page_DaftarJualSaya/Page_EditProduct/inputfield_NamaProduk'), NamaProduk, 2)
	}

	@And("User fill text field {string} at HARGA PRODUK")
	public void user_fill_text_field_at_HARGA_PRODUK(String Harga) {
		Mobile.setText(findTestObject('Page_Akun/Page_DaftarJualSaya/Page_EditProduct/inputfield_Harga'), Harga, 2)
	}

	@And("User fill text field {string} at LOKASI PRODUK")
	public void user_fill_text_field_at_LOKASI_PRODUK(String Lokasi) {
		Mobile.setText(findTestObject('Page_Akun/Page_DaftarJualSaya/Page_EditProduct/inputfield_Lokasi'), Lokasi, 2)
	}

	@Then("User fill text field {string} at DESKRIPSI")
	public void user_fill_text_field_at_DESKRIPSI(String Deskripsi) {
		Mobile.setText(findTestObject('Page_Akun/Page_DaftarJualSaya/Page_EditProduct/inputfield_NamaProduk'), Deskripsi, 2)
	}

	@Then("User select category {string}")
	public void user_select_category(String EditKategori) {
		Mobile.tap(findTestObject('Page_Akun/Page_DaftarJualSaya/Page_EditProduct/dropdown_EditKategori'), 0)
		Mobile.sendKeys(findTestObject('Page_SellProduct/dropdown_Kategori'), EditKategori)
		Mobile.tap(findTestObject('Page_SellProduct/link_PilihKategoriPertama'), 0)
	}


	@Then("upload photos at FOTO PRODUK")
	public void upload_photos_at_FOTO_PRODUK() {
		Mobile.tap(findTestObject('Page_Akun/Page_DaftarJualSaya/Page_EditProduct/inputfield_FotoProduk'), 0)
		Mobile.verifyElementVisible(findTestObject('Page_Akun/Page_DaftarJualSaya/Page_EditProduct/Popup_UbahGambar/txt_PilihGambar'), 2)
		Mobile.tap(findTestObject('Page_Akun/Page_DaftarJualSaya/Page_EditProduct/Popup_UbahGambar/button_Galeri'), 0)
		Mobile.delay(4)
		Mobile.tap(findTestObject('Page_Akun/Page_DaftarJualSaya/Page_EditProduct/Popup_UbahGambar/img_FotoEdit'), 0)
	}

	@Then("User click PERBARUI PRODUK button")
	public void user_click_PERBARUI_PRODUK_button() {
	}

	@Then("User successfully edit product detail")
	public void user_successfully_edit_product_detail() {
	}
}