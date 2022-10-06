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
WebUI.click(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/cell_in_timetable'))

'Переход на вкладку Услуги'
WebUI.click(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/yslugi_button'))

'Проверка первой услуги'
WebUI.verifyElementText(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/verif_uslug_1i_vkladka'), 
    'Тестовая услуга два')

'Проверка цены услуги'
WebUI.verifyElementText(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/verif_cost_vkladka_usluga'), 
    '1 600 ₽')

'Проверка второй услуги'
WebUI.verifyElementText(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/verif_ysluga_2_vkladka'), 
    'Тестовая услуга QA')

'Проверка итоговой суммы'
WebUI.verifyElementText(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/verif_1200_cost_usluga_vkladka'), 
    '1 500 ₽')

'Нажать на таб редактировать'
WebUI.click(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/tab_redactor_vkladka_usluga'))

'Удаление услуги Тестовая услуга'
WebUI.click(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/delete_1_usluga_vkladka'))

'Нажать отмена'
WebUI.click(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/tab_otmena_uslugi_vkladka'))

'Проверка что открылось модальное окно'
WebUI.verifyElementText(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/verif_modal_uslugi_vkladka'), 
    'Уверены, что хотите закрыть окно?')

'Таб Да в модальном окне'
WebUI.click(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/tav yes_yslugi_vkladka'))

'Нажать на таб редактировать'
WebUI.click(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/tab_redactor_vkladka_usluga'))

'Проверка заголовка редактирования услуги'
WebUI.verifyElementText(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/verif_h_redactor_vkladka_uslugi'), 
    'Редактировать услуги')

'Удаление услуги Тестовая услуга QA'
WebUI.click(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/delete_1_usluga_vkladka'))

'Проверка что услуга удалилась'
not_run: WebUI.verifyElementNotPresent(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/verif_delete_uslugi_vkladka_'), 
    0)

'Проверка что сумма изменилась'
WebUI.verifyElementText(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/Verif_200_cost_usluga_vkladka_200'), 
    '1 600 ₽')

'Открытие мультиселекта'
WebUI.click(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/open_multiselect_usluga_vkladka'))

'Проверка что в мультиселекте есть цена'
WebUI.verifyElementText(findTestObject('Object Repository/Добавление услуги на вкладке Услуги филиалов на странице Услуги (Test case)/cena_in_multiselect_yslugi'), 
    '1 500 ₽')

'Проверка что в мультиселекте есть длительность услуги'
WebUI.verifyElementText(findTestObject('Object Repository/Добавление услуги на вкладке Услуги филиалов на странице Услуги (Test case)/dlitelnost_in_multiselect_yslugi'), 
    '50 мин.\'')

'Выбор той же самой услуги которая уже добавлена'
WebUI.click(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/2_usluga_vkladka_v2'))

'Проверка алерта, что такая услуга уже была добавлена'
WebUI.verifyElementText(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/verif_usluga_yzhe_add_vkladka'), 
    'Данная услуга уже добавлена')

'Открытие мультиселекта услуг'
WebUI.click(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/open_multiselect_usluga_vkladka'))

'Получение текста'
ysluga = WebUI.getText(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/3_usluga_vkladka'))

'Нажать на 2 услугу'
WebUI.click(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/3_usluga_vkladka'))

'Проверка что именно 3 услуга добавилась'
WebUI.verifyElementText(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/verif_3_usluga_vkladka'), 
    ysluga)

'Проверка длительности всех услуг'
WebUI.verifyElementText(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/verif_all_summ_time_uslug_vkladka'), 
    '70 мин.')

'Таб сохранить'
WebUI.click(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/tab_save_uslugi_vkladka'))

'Проверка алерта'
WebUI.verifyElementText(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/Verif_alert_succsess_vkladka_uslugi'), 
    'Успешно')

'Проверка, что сумма верная'
WebUI.verifyElementText(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/Verif_all_summ_600'), 
    '3 100 ₽')

WebUI.closeBrowser()

WebUI.click(findTestObject('Object Repository/Добавление услуги на вкладке Услуги филиалов на странице Услуги (Test case)/cena_in_multiselect_yslugi'))

WebUI.click(findTestObject('Object Repository/Добавление услуги на вкладке Услуги филиалов на странице Услуги (Test case)/dlitelnost_in_multiselect_yslugi'))

