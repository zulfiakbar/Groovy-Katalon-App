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



class Login {
	
	@Then("User click Masuk Akun Button")
	def UserclickMasukAkunButton() {
		Mobile.tap(findTestObject('Object Repository/Page_Home/button_akun'), 2)
		
	}
	@And("User input {string} into Email field")
	def UserinputEmailintoEmailfield(String email) {
		Mobile.verifyElementVisible(findTestObject('Object Repository/Page_Login/inputfield_email'),email, 2)
		
	}
	@And("User input {string} into Password field")
	def UserinputPasswordintoPasswordfield(String Password) {
		Mobile.verifyElementVisible(findTestObject('Object Repository/Page_Login/inputfield_password'),Password, 2)
		
	}
	@And("User click on Masuk button")
	def  UserclickonMasukbutton() {
		Mobile.verifyElementVisible(findTestObject('Object Repository/Page_Login/button_Login'), 2)
		
		
//	}
//	
//		//Fill the Email and Password fields in the Login form with the defined conditions
//		@When("user input (.*) in Login page")
//		public void user_input_in_login_page(String condition) {
//			if(condition=="valid credentials") {
//				Mobile.setText(findTestObject('Object Repository/Login/input-email'), 'dwnina@gmail.com' , 0)
//				Mobile.setText(findTestObject('Object Repository/Login/input-password'), 'BinarAcademy' , 0)
//			}else if(condition=="empty email") {
//				Mobile.setText(findTestObject('Object Repository/Login/input-email'), '', 0)
//				Mobile.setText(findTestObject('Object Repository/Login/input-password'), 'BinarAcademy', 0)
//			}else if(condition=="incorrect email format") {
//				Mobile.setText(findTestObject('Object Repository/Login/input-email'), 'dwnina', 0)
//				Mobile.setText(findTestObject('Object Repository/Login/input-password'), 'BinarAcademy', 0)
//			}else if(condition=="empty password") {
//				Mobile.setText(findTestObject('Object Repository/Login/input-email'), 'dwnina@gmail.com', 0)
//				Mobile.setText(findTestObject('Object Repository/Login/input-password'), '', 0)
//			}else if(condition=="invalid pasword max char") {
//				Mobile.setText(findTestObject('Object Repository/Login/input-email'), 'dwnina@gmail.com', 0)
//				Mobile.setText(findTestObject('Object Repository/Login/input-password'), '123', 0)
//			}else if(condition=="valid email and invalid password") {
//				Mobile.setText(findTestObject('Object Repository/Login/input-email'), 'dwnina@gmail.com', 0)
//				Mobile.setText(findTestObject('Object Repository/Login/input-password'), '123456', 0)
//			}else if(condition=="invalid email and valid password") {
//				Mobile.setText(findTestObject('Object Repository/Login/input-email'), 'blabla@gmail.com', 0)
//				Mobile.setText(findTestObject('Object Repository/Login/input-password'), 'BinarAcademy', 0)
//			}else if(condition=="invalid email and invalid password") {
//				Mobile.setText(findTestObject('Object Repository/Login/input-email'), 'blabla@gmail.com', 0)
//				Mobile.setText(findTestObject('Object Repository/Login/input-password'), '123456', 0)
//			}
//		}
//	
//		//Click the "Masuk" button after filling the Email and Password fields
//		@When("user click Login button")
//		public void user_click_login_button() {
//			Mobile.tap(findTestObject('Object Repository/Login/btn-masuk-login'), 0)
//		}
//	
//		//Verify the result of each test cases conditions
//		@Then("user (.*) login")
//		public void user_login(String result) {
//			if(result=="successfully") {
//				Mobile.verifyElementVisible(findTestObject('Object Repository/Akun_Saya/title-page-akun-saya'), 0)
//			}else if(result=="see email warning and failed") {
//				Mobile.getAttribute(findTestObject('Object Repository/Login/empty-email-mesg'), 'text', 0)
//			}else if(result=="see email format warning and failed") {
//				Mobile.getAttribute(findTestObject('Object Repository/Login/invalid-email-mesg'), 'text', 0)
//			}else if(result=="see password warning and failed ") {
//				Mobile.getAttribute(findTestObject('Object Repository/Login/empty-password-mesg'), 'text', 0)
//			}else if(result=="see password char warning and failed") {
//				Mobile.getAttribute(findTestObject('Object Repository/Login/char-password-mesg'), 'text', 0)
//			}else if(result=="see toast message and failed") {
//			//	AppiumDriver<?> driver = MobileDriverFactory.getDriver()
//				driver.findElementByXPath("//android.widget.Toast[@text='Email atau kata sandi salah']")
//			
		
//	}
		
	}
}