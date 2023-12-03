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
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

class ProductList {

	@When("User verify semua on telusuri kategori")
	def Userverifysemuaontelusurikategori() {
		Mobile.tap(findTestObject('Page_Home/category_semua'), 3)
	}
	@Then("User can see all product")
	def Usercanseeallproduct() {
		int startX = 1000
		int startY = 1000
		int endX = 1000
		int endY = 1000
		Mobile.swipe(startX, startY, endX, endY)
	}
	@When("User click one of category button on Telusuri Kategori section")
	def UserclickoneofcategorybuttononTelusuriKategorisection() {
		Mobile.tap(findTestObject('Page_Home/category_Elektronik'), 3)
	}
	@Then("User can see product list based on category filter")
	def Usercanseeproductlistbasedoncategoryfilter() {
			int startX = 1000
			int startY = 1000
			int endX = 1000
			int endY = 1000
			Mobile.swipe(startX, startY, endX, endY)
	}
	@Then("User can see product list based on search")
	def Usercanseeproductlistbasedonsearch() {
			int startX = 1000
			int startY = 1000
			int endX = 1000
			int endY = 1000
			Mobile.swipe(startX, startY, endX, endY)
	}
}
	
