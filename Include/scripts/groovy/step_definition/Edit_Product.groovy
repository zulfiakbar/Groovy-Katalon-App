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
	@Given("User is on SecondHand App")
	public void user_is_on_SecondHand_App() {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("User Click {string} Button")
	public void user_Click_Button(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("User input {string} into {string} field")
	public void user_input_into_field(String string, String string2) {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("User click on {string} button")
	public void user_click_on_button(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("User click on {string} icon")
	public void user_click_on_icon(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("User click on {string}")
	public void user_click_on(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("User click product card that want to edit")
	public void user_click_product_card_that_want_to_edit() {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("User fill text field at {string}")
	public void user_fill_text_field_at(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("User choose category at KATEGORI")
	public void user_choose_category_at_KATEGORI() {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("upload photos at FOTO PRODUK")
	public void upload_photos_at_FOTO_PRODUK() {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("User click PERBARUI PRODUK button")
	public void user_click_PERBARUI_PRODUK_button() {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("User successfully edit product detail")
	public void user_successfully_edit_product_detail() {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}
}