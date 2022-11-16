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
WebUI.click(findTestObject('Просмотр информации о приеме (Test case)/open_card_Avtotest Q. R'))

'Проверка что номер телефона отображается'
WebUI.verifyElementText(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/Verif_number_in_prosmotr'), 
    GlobalVariable.Test_phone)

'Таб редактировать'
WebUI.click(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/tab_redactor_obshee'))

WebUI.delay(5)

'Проверка, что открыто то окно'
WebUI.verifyElementText(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/verif_h_redactor'), 
    'Редактировать прием')

'Получает атрибуты инпута фамилии'
a = WebUI.getAttribute(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/verif_familia_redactor_obshee'), 
    'value')

'Сравнивает глобальную переменную и входящую'
WebUI.verifyEqual(a, GlobalVariable.Test_patient_familia)

'Изменяем цель визита'
WebUI.setText(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/cel_vizita_redactor'), 
    ' редактирование')

'Кнопка отмена'
WebUI.click(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/exit_button'))

'Проверка модального окна'
WebUI.verifyElementText(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/verif_alert_exit'), 
    'Уверены, что хотите закрыть окно?')

'Подтверждение отмены'
WebUI.click(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/tab_yes_radactor'))

'Проверка что цель визита не изменилась'
WebUI.verifyElementText(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/verif_vizit_redactor'), 
    'Автотест. Цель визита')

'Таб редактировать'
WebUI.click(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/tab_redactor_obshee'))

'Изменяем цель визита'
WebUI.setText(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/cel_vizita_redactor'), 
    ' редактирование')

'Кнопка сохранить'
WebUI.click(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/save_button'))

'Проверка алерта'
WebUI.verifyElementText(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/alert_succsess_redactor'), 
    'Успешно')

'Проверка что изменения прошли успешно'
WebUI.verifyElementText(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/cel_vizita_redactor2'), 
    'Автотест. Цель визита редактирование')

'Таб редактировать'
WebUI.click(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/tab_redactor_obshee'))

WebUI.delay(5)

'Открываем мультиселект врачей\r\n'
WebUI.click(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/open_multiselect_vrachei_in_priem'))

'Вводим фамилию врача'
WebUI.setText(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/multiselect_vrachei_in_priem'), 
    'Измайлов')

'Вводим фамилию врача'
WebUI.click(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/vibor_vracha'), FailureHandling.STOP_ON_FAILURE)

'Подтверждаем выбор'
not_run: WebUI.sendKeys(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/multiselect_vrachei_in_priem'), 
    Keys.chord(Keys.ENTER))

'Проверяет что выбрался тот врач'
WebUI.verifyElementText(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/FIO_vracha_in_multiselect_in_priem'), 
    'Измайлов Дмитрий Петрович')

'Проверка специальности'
WebUI.verifyElementText(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/specialnost_in_priem'), 
    'Акушер-гинеколог')

WebUI.delay(5)

'Повторно нажимает на день в календаре (пока не починят баг)'
WebUI.click(findTestObject('Редактирование вкладки Общее и Услуги (Test case)/button_data_current'))

'Увеличивает прием на 5 минут'
WebUI.click(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/button_plus_minute'))

'Выделяет таб со свободные временем'
WebUI.scrollToElement(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/button_first_time_in_kalendar'), 
    0)

'Выделяет таб со свободные временем'
WebUI.click(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/button_first_time_in_kalendar'))

'Кнопка сохранить'
WebUI.click(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/save_button'))

'Проверка алерта'
WebUI.verifyElementText(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/alert_succsess_redactor'), 
    'Успешно')

'Нажать на фильтр специалист'
not_run: WebUI.click(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/filter_specialist'))

'Ввод специалиста'
not_run: WebUI.setText(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/input_filter_specialist'), 
    'Измайлов')

'Подтверждение выбора специалиста\r\n'
not_run: WebUI.sendKeys(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/input_filter_specialist'), 
    Keys.chord(Keys.ENTER))

'Проверка, что вывелся тот специалист'
not_run: WebUI.verifyElementText(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/h_specialist_name_2_vrach'), 
    'Измайлов Д. П.')

'Нажать на ячейку в расписании'
not_run: WebUI.click(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/cell_in_timetable_find_po_family_patienta'))

'Таб редактировать'
not_run: WebUI.click(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/tab_redactor_obshee'))

'Проверка что сохраненный врач отображается на вкладке общее\r\n'
WebUI.verifyElementText(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/Vrach_in_priem'), 
    'Измайлов Дмитрий Петрович')

'Таб редактировать'
WebUI.click(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/tab_redactor_obshee'))

'Открываем мультиселект врачей\r\n'
WebUI.click(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/open_multiselect_vrachei_in_priem'))

'Вводим врача Машину'
WebUI.setText(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/input__in_multiselect_in_priem'), 
    GlobalVariable.Test_vrach_familia)

'Подтверждает выбор врача Машину'
WebUI.click(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/vibor_vracha_2'), FailureHandling.STOP_ON_FAILURE)

'Подтверждаем'
not_run: WebUI.sendKeys(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/input__in_multiselect_in_priem'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.click(findTestObject('Редактирование вкладки Общее и Услуги (Test case)/button_data_current'))

'Уменьшаем время консультации на 5 мин'
WebUI.click(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/button_minus_minut'))

'Выбираем первый свободный слот времени'
WebUI.click(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/button_first_time_in_kalendar'))

'Кнопка сохранить'
WebUI.click(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/save_button'))

'Проверка алерта'
WebUI.verifyElementText(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/alert_succsess_redactor'), 
    'Успешно')

'Проверка врача'
WebUI.verifyElementText(findTestObject('Object Repository/Просмотр информации о приеме (Test case)/verif_vrach'), GlobalVariable.Test_vrach_full)

WebUI.closeBrowser()

