import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('D:\\bootcamp\\Challenge Platinum Fix\\secondhand-app\\Apk\\secondhand-24082023.apk', true)

Mobile.tap(findTestObject('Object Repository/coba/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/coba/android.widget.Button - Masuk'), 0)

Mobile.setText(findTestObject('Object Repository/coba/android.widget.EditText - Masukkan email'), 'erlangga421@mailinator.com', 
    0)

Mobile.setText(findTestObject('Object Repository/coba/android.widget.EditText - Masukkan password'), 'Test1234', 0)

Mobile.tap(findTestObject('Object Repository/coba/android.widget.Button - Masuk (1)'), 0)

Mobile.tap(findTestObject('Object Repository/coba/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/coba/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/coba/android.widget.Button - Saya Tertarik dan Ingin Nego'), 0)

Mobile.setText(findTestObject('Object Repository/coba/android.widget.EditText - Rp 0,00'), '27000', 0)

Mobile.tap(findTestObject('Object Repository/coba/android.widget.Button - Kirim'), 0)

Mobile.closeApplication()

