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

for (def index : (0..1)) {
    def Priem = Priem++

    'Выбор ячейки в расписании'
    WebUI.click(findTestObject('Object Repository/Отмена приема (Test case)/tab_priem_in_timtable', [('Priem') : Priem]))

    'Открыть статусы'
    WebUI.click(findTestObject('Object Repository/Отмена приема (Test case)/tab_status_in_in_priem'))

    'Выбор статуса отмена'
    WebUI.click(findTestObject('Object Repository/Отмена приема (Test case)/tab_status_otmena'))

    'Проверка модального окна'
    WebUI.verifyElementText(findTestObject('Отмена приема (Test case)/Alert_otmena_priema'), 'Уверены, что хотите отменить прием?')

    'Текст под заголовком модального окна'
    WebUI.verifyElementText(findTestObject('Отмена приема (Test case)/podalert_otmena_priema'), '(вы сможете записать нового пациента на данное время)')

    'Подтверждение отмены'
    WebUI.click(findTestObject('Object Repository/Отмена приема (Test case)/tab_yes_otmena_priema'))

    'Закрыть модальное окно'
    WebUI.click(findTestObject('Object Repository/Отмена приема (Test case)/svg__X_tab'))

    'Выбор ячейки в расписании'
    WebUI.click(findTestObject('Object Repository/Отмена приема (Test case)/tab_priem_in_timtable', [('Priem') : Priem]))

    'Проверка, что открылась форма записи на прием'
    WebUI.verifyElementText(findTestObject('Object Repository/Запись на прием с созданием пациента (Test case)/h_zapic_na_priem'), 
        'Запись на прием')

    'Закрыть модальное окно'
    WebUI.click(findTestObject('Object Repository/Отмена приема (Test case)/svg__X_tab'))
}

WebUI.closeBrowser()

