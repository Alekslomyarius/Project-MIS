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

'Переходим на страницу Расписание'
WebUI.click(findTestObject('Object Repository/Запись на прием с созданием пациента (Test case)/timetable'))

'Нажать на фильтр специалист'
WebUI.click(findTestObject('Object Repository/Запись на прием с созданием пациента (Test case)/filter_specialist'))

'Ввод специалиста'
WebUI.setText(findTestObject('Object Repository/Запись на прием с созданием пациента (Test case)/input_filter_specialist'), 
    GlobalVariable.Test_vrach_familia)

'Подтверждение выбора специалиста\r\n'
WebUI.sendKeys(findTestObject('Object Repository/Запись на прием с созданием пациента (Test case)/input_filter_specialist'), 
    Keys.chord(Keys.ENTER))

'Нажать на ячейку в расписании'
WebUI.click(findTestObject('Object Repository/Запись на прием с созданием пациента (Test case)/free_time_in_timetable'))

'Ввод Фамилии'
WebUI.setText(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/input__FIO'), GlobalVariable.Test_patient2_familia)

'Выбор добавления пациента'
WebUI.click(findTestObject('Object Repository/Запись на прием с созданием пациента (Test case)/add_patient_information_card'))

a = WebUI.getAttribute(findTestObject('Запись на прием с созданием пациента (Test case)/verif_familia_'), 
    'value')

WebUI.verifyEqual(a, GlobalVariable.Test_patient2_familia)

'Назначает прием'
WebUI.click(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/tab_naznachit'))

