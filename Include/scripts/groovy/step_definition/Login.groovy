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
import io.appium.java_client.AppiumDriver



class Login {

	@Given("User is on SecondHand App")
	def UserisonSecondHandApp () {
		Mobile.startApplication('Apk/secondhand-24082023.apk', true)
		Mobile.verifyElementVisible(findTestObject('Page_Home/button_beranda'), 3, FailureHandling.STOP_ON_FAILURE)
		
	}
	@Then("User click Masuk Akun Button")
	def UserclickMasukAkunButton() {
		Mobile.tap(findTestObject('Page_Home/button_AkunMasuk'), 2)
		
	}
	@Then("User is on Akun saya page")
	def UserisonAkunsayapage() {
		Mobile.verifyElementVisible(findTestObject('Page_Akun/txt_akunsaya'), 5, FailureHandling.STOP_ON_FAILURE)
		
	}
	@And("User input {string} into Email field")
	def UserinputEmailintoEmailfield(String email) {
		Mobile.setText(findTestObject('Page_Login/inputfield_email'), email, 2)
		
	}
	@And("User input {string} into Password field")
	def UserinputPasswordintoPasswordfield(String Password) {
		Mobile.setText(findTestObject('Page_Login/inputfield_password'), Password, 2)
		
	}
	@And("User click on Masuk button")
	def  UserclickonMasukbutton() {
		Mobile.tap(findTestObject('Object Repository/Page_Login/button_Login'), 2)
		
	}
	@Then("User Failed to login using unregistered email")
	def UserFailedtologinusingunregisteredemail () {
		AppiumDriver<?> driver = MobileDriverFactory.getDriver()
		driver.findElementByXPath("//android.widget.Toast[@text='Email atau kata sandi salah']")
		
	}
	@Then("User failed to login without fill Email Field")
	def UserfailedtologinwithoutfillEmailField () {
		Mobile.getAttribute(findTestObject('Object Repository/Page_Login/errMsg_Empty_Email'), 'text', 0)
		
	}
	@Then("User failed to login without fill Password Field")
	def UserfailedtologinwithoutfillPasswordField () {
		Mobile.getAttribute(findTestObject('Object Repository/Page_Login/errMsg_Empty_Password'), 'text', 0)
		
	}
	@Then("User failed to login with invalid password")
	def Userfailedtologinwithinvalidpassword () {
		Mobile.getAttribute(findTestObject('Object Repository/Page_Login/errMsg_Invalid_Password'), 'text', 0)
		
	}
	@Then("User failed to login with invalid email format1")
	def ThenUserfailedtologinwithinvalidemailformat1 () {
		Mobile.getAttribute(findTestObject('Object Repository/Page_Login/errMsg_Invalid_Email'), 'text', 0)
		
	}
	@Then("User failed to login with invalid email format2")
	def Userfailedtologinwithinvalidemailformat2 () {
		Mobile.getAttribute(findTestObject('Object Repository/Page_Login/errMsg_Invalid_Email'), 'text', 0)
		
	}
	@Then("User failed to login with invalid email and invalid password")
	def Userfailedtologinwithinvalidemailandinvalidpassword () {
		AppiumDriver<?> driver = MobileDriverFactory.getDriver()
		driver.findElementByXPath("//android.widget.Toast[@text='Email atau kata sandi salah']")
	}
}