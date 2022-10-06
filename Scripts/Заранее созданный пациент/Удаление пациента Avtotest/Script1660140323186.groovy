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

WebUI.callTestCase(findTestCase('Авторизация'), [:], FailureHandling.STOP_ON_FAILURE)

'Переходим на страницу Пациенты\r\n'
WebUI.click(findTestObject('Object Repository/Удаление пациента (Test case)/button_patients'))

'Сверяем заголовок на странице пациенты'
WebUI.verifyElementText(findTestObject('Object Repository/Удаление пациента (Test case)/h_patients'), 'Пациенты')

'Ищем пациента'
WebUI.setText(findTestObject('Object Repository/Удаление пациента (Test case)/input_search_patient_Avtotest'), GlobalVariable.Test_patient_familia)

'Проверяем есть ли такой пациент'
WebUI.verifyElementText(findTestObject('Object Repository/Удаление пациента (Test case)/patient_Avtotest QA Regressovich'), 
    GlobalVariable.Test_patient_FIO_full)

'Открываем карточку пациента'
WebUI.click(findTestObject('Object Repository/Удаление пациента (Test case)/patient_Avtotest QA Regressovich'))

'Сверяем тот ли пациент'
WebUI.verifyTextPresent(GlobalVariable.Test_patient_FIO_full, false)

'Удаляем пациента'
WebUI.click(findTestObject('Object Repository/Удаление пациента (Test case)/delete_patient'))

'Подтверждение удаления пациента'
WebUI.click(findTestObject('Object Repository/Удаление пациента (Test case)/delete_yes'))

'Ищем пациента'
WebUI.setText(findTestObject('Удаление пациента (Test case)/input_search_patient_Avtotest'), GlobalVariable.Test_patient_familia)

'Проверка, что точно удалили пациента'
WebUI.verifyElementText(findTestObject('Удаление пациента (Test case)/verif_absolutely_delete_patient'), 'НИЧЕГО НЕ НАЙДЕНО')

WebUI.closeBrowser()

