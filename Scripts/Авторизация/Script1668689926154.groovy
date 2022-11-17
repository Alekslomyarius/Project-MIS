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

WebUI.openBrowser(GlobalVariable.URL)

WebUI.maximizeWindow()

'Кнопка со сменой языков\r\n'
WebUI.scrollToElement(findTestObject('Object Repository/Авторизация (Test case)/button_language_English'), 0)

'Кнопка со сменой языков\r\n'
WebUI.click(findTestObject('Object Repository/Авторизация (Test case)/button_language_English'))

'Выбраем русский'
WebUI.click(findTestObject('Object Repository/Авторизация (Test case)/language_Russian'))

'Проверяем, что язык сменился'
WebUI.verifyElementText(findTestObject('Авторизация (Test case)/language_Russian'), 'Русский')

'Вводим логин'
WebUI.setText(findTestObject('Авторизация (Test case)/input_E-mail'), GlobalVariable.Admin_mail)

'Вводим пароль Prod'
WebUI.setEncryptedText(findTestObject('Авторизация (Test case)/input__password'), GlobalVariable.Admin_password)

'Проверяем, что лого видно'
WebUI.verifyElementVisible(findTestObject('Object Repository/Авторизация (Test case)/img___logo_in'))

'Нажимаем кнопку вход\r\n'
WebUI.click(findTestObject('Object Repository/Авторизация (Test case)/button_enter'))

'Проверяем, что совпадает ФИО'
WebUI.verifyElementText(findTestObject('Object Repository/Авторизация (Test case)/FIO acc'), GlobalVariable.Name_clinic)

