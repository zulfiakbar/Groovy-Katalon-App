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
		Mobile.tap(findTestObject('Page_UpdateProfile/image_ProfilePictureFromGallery'), 2)
		Mobile.delay(1)
	}

	@Then("User verify profile updated")
	public void user_verify_profile_updated() {
		Mobile.verifyElementVisible(findTestObject('Page_UpdateProfile/text_ProfilBerhasilDiperbarui'), 3)
	}

	@And("User input big size image profile picture file")
	public void User_input_big_size_image_picture_picture_file() {
		Mobile.tap(findTestObject('Page_UpdateProfile/image_BigSizeFromGallery'), 2)
		Mobile.delay(1)
	}
<<<<<<< HEAD

	@Then("User verify alert Request Entity Too Large show up")
	public void user_verify_alert_requestEntityTooLarge_showUp() {
=======
	
	@Then("User verify profile alert Request Entity Too Large show up")
	public void user_verify_profile_alert_requestEntityTooLarge_showUp() {
>>>>>>> 20af322907bd12eb056c38cf04318698fbafd7ed
		Mobile.verifyElementVisible(findTestObject('Page_UpdateProfile/text_AlertRequestEntityTooLarge'), 3)
	}

	@And("User click on Camera button")
	public void User_click_on_Camera_button() {
		Mobile.tap(findTestObject('Page_UpdateProfile/button_Kamera'), 2)
		Mobile.delay(1)
	}

	@And("User take a picture from camera window")
	public void User_take_a_picture_from_camera_window() {
		Mobile.delay(3)
		Mobile.tap(findTestObject('Object Repository/Page_UpdateProfile/button_CameraShutters'), 2)
		Mobile.delay(3)
		Mobile.tap(findTestObject('Object Repository/Page_UpdateProfile/button_CameraAccept'), 2)
	}

	@And("User click on Nama field")
	public void User_click_on_nama_field() {
		Mobile.tap(findTestObject('Object Repository/Page_UpdateProfile/link_Nama'), 2)
	}

	@And("User input {string} into Nama field")
	public void User_input_Nama_on_Nama_field(String profileName) {
		Mobile.setText(findTestObject('Object Repository/Page_UpdateProfile/inputfield_Nama'), profileName, 2)
	}

	@And("User click on Nomor HP field")
	public void User_click_on_noHP_field() {
		Mobile.tap(findTestObject('Object Repository/Page_UpdateProfile/link_NomorHP'), 2)
	}

	@And("User input {string} into Nomor HP field")
	public void User_input_noHP_on_noHP_field(String profileNoHP) {
		Mobile.setText(findTestObject('Object Repository/Page_UpdateProfile/inputfield_noHP'), profileNoHP, 2)
	}

	@And("User click on Kota field")
	public void User_click_on_Kota_field() {
		Mobile.tap(findTestObject('Object Repository/Page_UpdateProfile/link_Kota'), 2)
	}

	@And("User input {string} into City field")
	public void User_input_city_on_city_field(String profileCity) {
		Mobile.setText(findTestObject('Object Repository/Page_UpdateProfile/inputfield_Kota'), profileCity, 2)
	}

	@And("User click on Alamat field")
	public void User_click_on_Alamat_field() {
		Mobile.tap(findTestObject('Object Repository/Page_UpdateProfile/link_Alamat'), 2)
	}

	@And("User input {string} into Alamat field")
	public void User_input_alamat_on_alamat_field(String profileAddress) {
		Mobile.setText(findTestObject('Object Repository/Page_UpdateProfile/inputfield_Alamat'), profileAddress, 2)
	}

	@And("User click on Password field")
	public void User_click_on_Password_field() {
		Mobile.tap(findTestObject('Object Repository/Page_UpdateProfile/link_Password'), 2)
	}

	@And("User input {string} into Recent Password field")
	public void User_input_recentPassword_on_recentPassword_field(String recentPassword) {
		Mobile.setText(findTestObject('Object Repository/Page_UpdateProfile/inputfield_KataSandiLama'), recentPassword, 2)
	}

	@And("User input {string} into New Password field")
	public void User_input_newPassword_on_newPassword_field(String newPassword) {
		Mobile.setText(findTestObject('Object Repository/Page_UpdateProfile/inputfield_KataSandiBaru'), newPassword, 2)
	}

	@And("User input {string} into Confirmation Password field")
	public void User_input_confirmationPassword_on_confirmationPassword_field(String confirmationPassword) {
		Mobile.setText(findTestObject('Object Repository/Page_UpdateProfile/inputfield_KonfirmasiKataSandi'), confirmationPassword, 2)
	}

	@And("User click on Simpan button")
	public void User_click_on_simpan_button() {
		Mobile.tap(findTestObject('Page_UpdateProfile/button_Simpan'), 2)
	}
}