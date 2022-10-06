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
WebUI.click(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/timetable'))

'Открывает филиалы'
WebUI.click(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/tab_Filial_in_timetable'))

'Вводит текст в филиалы'
WebUI.setText(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/input__filial_for_avtotest'), 
    'Автотест')

'Подтверждение выбора филиала'
WebUI.sendKeys(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/input__filial_for_avtotest'), 
    Keys.chord(Keys.ENTER))

'Проверка, что выбрался тот филиал'
WebUI.verifyElementText(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/Verif_filial_avtotest_tab'), 
    'Автотест')

'Нажать на фильтр специалист'
WebUI.click(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/filter_specialist'))

'Ввод специалиста'
WebUI.setText(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/input_filter_specialist'), 
    GlobalVariable.Test_vrach_familia)

'Подтверждение выбора специалиста\r\n'
WebUI.sendKeys(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/input_filter_specialist'), 
    Keys.chord(Keys.ENTER))

'Открывает карточку записи на прием'
WebUI.click(findTestObject('Запись на прием с созданием пациента (Test case)/patient_card_Create P'))

'Сверяется заголовок приема'
WebUI.verifyElementText(findTestObject('Object Repository/Просмотр информации о приеме (Test case)/h_info_priema'), 'Информация о приеме')

'Проверка врача'
WebUI.verifyElementText(findTestObject('Object Repository/Просмотр информации о приеме (Test case)/verif_vrach'), GlobalVariable.Test_vrach_full)

'Проверка пациента'
WebUI.verifyElementText(findTestObject('Object Repository/Просмотр информации о приеме (Test case)/verif_Patient Create  In card'), 
    GlobalVariable.Test_patient2_FIO_full)

'Проверка телефона'
WebUI.verifyElementText(findTestObject('Object Repository/Просмотр информации о приеме (Test case)/verif_namber'), GlobalVariable.Test_2_phone)

'Проверка цели визита'
WebUI.verifyElementText(findTestObject('Object Repository/Просмотр информации о приеме (Test case)/verif_TARGET_v2'), 'Автотест. Цель визита. Создание пациента в приеме')

'Закрыть просмотр'
WebUI.click(findTestObject('Просмотр информации о приеме (Test case)/svg__X_piktogramma_close'))

WebUI.closeBrowser()

