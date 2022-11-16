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

'Проверяем заголовок'
WebUI.verifyElementText(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/h_timetable'), 
    'Расписание')

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

'Нажимаем на фильтр специальность'
not_run: WebUI.click(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/filter_speciality'), 
    FailureHandling.STOP_ON_FAILURE)

'Ввод специальности'
not_run: WebUI.setText(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/input__specialist_timetable'), 
    'Врач общей практики')

'Подтверждение выбора специалиста'
not_run: WebUI.sendKeys(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/input__specialist_timetable'), 
    Keys.chord(Keys.ENTER))

'Проверка, что вывелась та специальность'
not_run: WebUI.verifyElementText(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/h_verif_specialnost_vrach_obshei_praktiki'), 
    'Врач общей практики')

'Кнопка очистка\r\n'
not_run: WebUI.click(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/button_clear_timetable'))

'Нажать на фильтр специалист'
WebUI.click(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/filter_specialist'))

'Ввод специалиста'
WebUI.setText(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/input_filter_specialist'), 
    GlobalVariable.Test_vrach_familia)

'Подтверждение выбора специалиста\r\n'
WebUI.sendKeys(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/input_filter_specialist'), 
    Keys.chord(Keys.ENTER))

'Проверка, что вывелся тот специалист'
WebUI.verifyElementText(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/h_specialist_name'), 
    GlobalVariable.Test_vrach_abbreviaturoi)

'Нажать на ячейку в расписании'
WebUI.scrollToElement(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/cell_in_timetable'), 
    0)

'Нажать на ячейку в расписании'
WebUI.click(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/cell_in_timetable'))

'Проверка, что открылась форма записи на прием'
WebUI.verifyElementText(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/h_zapic_na_priem'), 
    'Запись на прием')

'Нажать на поиск пациентов'
WebUI.click(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/button_search_patient_zapis'))

'Ввод Фамилии'
WebUI.setText(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/input__FIO'), GlobalVariable.Test_patient_familia)

'Выбор пациента'
WebUI.click(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/Patient_Avtotest QA Regressovich'))

'Переход в профиль пациента'
WebUI.click(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/tab_pereiti_v_profile_in_zapis_na_priem'))

'Таб Назад'
WebUI.click(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/button_back'))

'Получает атрибуты инпута фамилии'
WebUI.verifyElementText(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/div_Avtotest'), 
    GlobalVariable.Test_patient_familia)

'Сравнивает глобальную переменную и входящую'
not_run: WebUI.verifyEqual(a, GlobalVariable.Test_patient_familia)

'Проверка врача'
WebUI.verifyElementText(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/imput_vrach_verif'), 
    GlobalVariable.Test_vrach_full)

'Установка окончания приема'
not_run: WebUI.setText(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/input__okonchanie_priema'), 
    '08:10')

'Указание цели визита'
WebUI.setText(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/input_cel_vizita'), 'Автотест. Цель визита')

'Открыть мультиселект услуг'
WebUI.click(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/tab_add_ysluga'))

'Берет название услуги, чтобы далее сравнить'
Ysluga1 = WebUI.getText(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/add_ysluga_first'))

'Выбрать 1 услугу'
WebUI.click(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/add_ysluga_first'))

WebUI.scrollToElement(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/tab_add_ysluga'), 
    0)

'Сравнивает добавленную услугу с той которую выбирал\r\n'
WebUI.verifyElementText(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/dobavlennay_ysluga'), 
    Ysluga1)

'Открыть мультиселект услуг'
WebUI.click(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/tab_add_ysluga'))

'Выбрать 2 услугу'
WebUI.click(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/add_ysluga_two'))

'Проверка что у услуги есть цена'
WebUI.verifyElementVisible(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/price_ysluga'))

'Таб удалить услугу'
WebUI.verifyElementClickable(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/tab_delete_ysluga'))

'Проверка суммы услуг'
WebUI.verifyElementText(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/all_cost_yslugi'), 
    '3 100 ₽')

'Проверка то что длительность услуги видна'
WebUI.verifyElementText(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/verif_time_on_ysluga'), 
    '20 мин.')

'Проверка общая длительность услуг'
WebUI.verifyElementText(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/summ_time_yslug'), 
    '70 мин.')

'Открывает статусы'
WebUI.click(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/status_ne_podtvershden'))

'Выбирает стутус подтвержден'
WebUI.click(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/status_podtvershden'))

'Проверка что статус верный'
WebUI.verifyElementText(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/verif_status_add'), 
    'Подтвержден')

'Назначает прием'
WebUI.click(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/tab_naznachit'))

WebUI.verifyElementText(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/alert_success'), 
    'Успешно')

WebUI.closeBrowser()

