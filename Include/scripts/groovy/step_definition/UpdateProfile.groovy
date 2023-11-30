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



class UpdateProfile {
	
	@And("User click on Edit button")
	public void User_click_on_Edit_button() {
		Mobile.tap(findTestObject('Page_Akun/button_EditProfile'), 2)
	}
	
	@And("User click on Image field")
	public void User_click_on_Image_field() {
		Mobile.tap(findTestObject('Page_UpdateProfile/link_Foto'), 2)
	}
	
	@And("User click on Galeri button")
	public void User_click_on_Galeri_button() {
		Mobile.tap(findTestObject('Page_UpdateProfile/button_Galeri'), 2)
	}
	
	@And("User input profile picture file")
	public void User_input_profile_picture_file() {
		Mobile.tap(findTestObject('Page_UpdateProfile/image_PictureFromGallery'), 2)
		Mobile.delay(1)
	}
	
	@Then("User verify profile updated")
	def user_verify_profile_updated() {
		Mobile.verifyElementVisible(findTestObject('Page_UpdateProfile/text_ProfilBerhasilDiperbarui'), 3)
	}
}