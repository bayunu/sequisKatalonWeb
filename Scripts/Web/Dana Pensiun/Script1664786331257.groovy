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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://sequis.co.id/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Sequis Asuransi Jiwa Asuransi Kesehatan/a_Asuransi Jiwa'))

WebUI.click(findTestObject('Object Repository/Page_Sequis Asuransi Jiwa Asuransi Kesehatan/a_Dana Pensiun'))

WebUI.click(findTestObject('Object Repository/Page_Sequis Asuransi Jiwa Asuransi Kesehatan/button Cookies'))

//Dana Pensiun
WebUI.scrollToElement(findTestObject('Object Repository/Page_Asuransi Jiwa Perencanaan Dana Pensiun/h2_Dana Pensiun to Scroll'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Asuransi Jiwa Perencanaan Dana Pensiun/a_Dana Pensiun'))

WebUI.click(findTestObject('Object Repository/Page_Asuransi Jiwa Perencanaan Dana Pensiun/span_- Silakan pilih di sini -'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Asuransi Jiwa Perencanaan Dana Pensiun/h2_Perhitungkan Scroll to'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Asuransi Jiwa Perencanaan Dana Pensiun/span_Dana pensiun'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Asuransi Jiwa Perencanaan Dana Pensiun/select_- Silakan pilih di sini -           _6a6090'), 
    '34', true)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Asuransi Jiwa Perencanaan Dana Pensiun/button_Selanjutnya'))

// Perhitungan Page 1
WebUI.setText(findTestObject('Object Repository/Page_Kalkulator Keuangan - Sequis - Your Better Tomorrow/input_Rp_calc_type3'), 
    '15,000,000')

WebUI.setText(findTestObject('Object Repository/Page_Kalkulator Keuangan - Sequis - Your Better Tomorrow/input_Tingkat inflasi ()_inflasiInput'), 
    '6')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Kalkulator Keuangan - Sequis - Your Better Tomorrow/button_Selanjutnya'))

// Perhitungan Page 2
WebUI.setText(findTestObject('Object Repository/Page_Kalkulator Keuangan - Sequis - Your Better Tomorrow/input_Usia Anda Saat Ini                   _8130c6'), 
    '25')

WebUI.setText(findTestObject('Object Repository/Page_Kalkulator Keuangan - Sequis - Your Better Tomorrow/input_Usia Pensiun yang Anda Inginkan (Tahu_a5afd5'), 
    '55')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Kalkulator Keuangan - Sequis - Your Better Tomorrow/button_Selanjutnya Page 2'))

// Perhitungan Page 3
WebUI.setText(findTestObject('Object Repository/Page_Kalkulator Keuangan - Sequis - Your Better Tomorrow/input_Rasio Penggantian yang dikehendaki ()_b56598'), 
    '120')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Kalkulator Keuangan - Sequis - Your Better Tomorrow/button_Selanjutnya Page 3'))

// Perhitungan Page 4
WebUI.setText(findTestObject('Object Repository/Page_Kalkulator Keuangan - Sequis - Your Better Tomorrow/input_Lama pensiun yang Anda inginkan (Tahu_dfb7f7'), 
    '20')

WebUI.setText(findTestObject('Object Repository/Page_Kalkulator Keuangan - Sequis - Your Better Tomorrow/input_Suku Bunga Deposito                  _87bd1f'), 
    '6')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Kalkulator Keuangan - Sequis - Your Better Tomorrow/button_Selanjutnya Page 4'))

//
WebUI.click(findTestObject('Object Repository/Page_Sequis Asuransi Jiwa Asuransi Kesehatan/a_Dapatkan Hasil'))

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Sequis Asuransi Jiwa  Asuransi Kesehatan  Investasi di Indonesia - Sequis - Your Better Tomorrow/div_Base Info'), 0, FailureHandling.OPTIONAL)) {
	WebUI.comment('ada')
} else {
	WebUI.comment('ga ada')
}

WebUI.setText(findTestObject('Object Repository/Page_Sequis Asuransi Jiwa  Asuransi Kesehat_97836b/input_Email_email'),
	'bababa@mailinator.com')

WebUI.setText(findTestObject('Object Repository/Page_Sequis Asuransi Jiwa  Asuransi Kesehat_97836b/input_Telepon Genggam_phone'),
	'081234567890')

WebUI.setText(findTestObject('Object Repository/Page_Sequis Asuransi Jiwa  Asuransi Kesehat_97836b/input_Alamat_address'),
	'Sesama')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Sequis Asuransi Jiwa  Asuransi Kesehat_97836b/select_-- Silakan pilih --                 _fe4849'),
	'11', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Sequis Asuransi Jiwa  Asuransi Kesehat_97836b/select_-- Silahkan Pilih --ACEH BARATACEH B_d4ce56'),
	'01', true)

WebUI.click(findTestObject('Object Repository/Page_Sequis Asuransi Jiwa  Asuransi Kesehat_97836b/input_ACEH SELATAN_bersedia'))

WebUI.click(findTestObject('Object Repository/Page_Sequis Asuransi Jiwa  Asuransi Kesehat_97836b/button_DAPATKAN SEKARANG'))

