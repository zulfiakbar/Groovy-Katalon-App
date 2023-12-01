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
import io.appium.java_client.TouchAction
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.AndroidElement
import io.appium.java_client.touch.offset.PointOption
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory


class ProductList {
	
	@When("User verify semua on telusuri kategori")
	def Userverifysemuaontelusurikategori() {
		Mobile.tap(findTestObject('Page_Home/category_semua'), 3)
	}

	@Then("User can see all product")
	def Usercanseeallproduct() {
		AndroidDriver<AndroidElement> driver = MobileDriverFactory.getDriver()
		TouchAction touchAction = new TouchAction(driver)
		int startX = driver.manage().window().getSize().width / 2
		int startY = driver.manage().window().getSize().height * 3 / 4
		int endY = driver.manage().window().getSize().height / 4
		touchAction.press(PointOption.point(startX, startY)).moveTo(PointOption.point(startX, endY)).release().perform()
	}
	@When("User click one of category button on Telusuri Kategori section")
	def UserclickoneofcategorybuttononTelusuriKategorisection() {
		Mobile.verifyElementVisible(findTestObject('Page_Home/category_Elektronik'), 3)
		Mobile.verifyElementVisible(findTestObject('Page_Home/category_KomputerdanAksesoris'), 3)
	}
	@Then("User can see product list based on category filter")
	def Usercanseeproductlistbasedoncategoryfilter() {
		AndroidDriver<AndroidElement> driver = MobileDriverFactory.getDriver()
		TouchAction touchAction = new TouchAction(driver)
		int startX = driver.manage().window().getSize().width / 2
		int startY = driver.manage().window().getSize().height * 3 / 4
		int endY = driver.manage().window().getSize().height / 4
		touchAction.press(PointOption.point(startX, startY)).moveTo(PointOption.point(startX, endY)).release().perform()
//	}
//	@When("User input {string} into Search field")
//	def user_input_namaproduk_into_search_field(String namaproduk) {
//			// Menggantikan teks berikut dengan teks yang sesuai dengan elemen pencarian di aplikasi Anda
//			String searchText = "Product Name"
//	
//			// Temukan elemen pencarian dan masukkan teks pencarian
//			Mobile.sendKeys(findTestObject('Page_Home/input_Search'), searchText)
//	
//			// Klik tombol pencarian
//			Mobile.tap(findTestObject('Page_Home/button_Search'), 3)
//	}
//	@Then("User can see product list based on search")
//	def Usercanseeproductlistbasedonsearch() {
//		// Mendapatkan instance driver Android
//		AndroidDriver<AndroidElement> driver = MobileDriverFactory.getDriver()
//
//		// Menginisialisasi objek TouchAction
//		TouchAction touchAction = new TouchAction(driver)
//
//		// Menentukan koordinat awal dan akhir untuk melakukan scroll (sesuaikan dengan kebutuhan)
//		int startX = driver.manage().window().getSize().width / 2
//		int startY = driver.manage().window().getSize().height * 3 / 4
//		int endY = driver.manage().window().getSize().height / 4
//
//		// Melakukan scroll dari titik awal ke titik akhir
//		touchAction.press(PointOption.point(startX, startY)).moveTo(PointOption.point(startX, endY)).release().perform()
//
//		// Verifikasi elemen-elemen produk pada halaman hasil pencarian
//		Mobile.verifyElementVisible(findTestObject('Page_SearchResults/product_Item1'), 3)
//		Mobile.verifyElementVisible(findTestObject('Page_SearchResults/product_Item2'), 3)
//		// Tambahkan verifikasi untuk produk lainnya sesuai kebutuhan
//	
//		
	}
	
}
	