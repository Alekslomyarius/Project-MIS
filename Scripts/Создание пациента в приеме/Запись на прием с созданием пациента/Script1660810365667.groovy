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

'Проверяем заголовок'
WebUI.verifyElementText(findTestObject('Object Repository/Запись на прием с созданием пациента (Test case)/h_timetable'), 
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
WebUI.click(findTestObject('Object Repository/Запись на прием с созданием пациента (Test case)/filter_specialist'))

'Ввод специалиста'
WebUI.setText(findTestObject('Object Repository/Запись на прием с созданием пациента (Test case)/input_filter_specialist'), 
    GlobalVariable.Test_vrach_familia)

'Подтверждение выбора специалиста\r\n'
WebUI.sendKeys(findTestObject('Object Repository/Запись на прием с созданием пациента (Test case)/input_filter_specialist'), 
    Keys.chord(Keys.ENTER))

'Проверка, что вывелся тот специалист'
WebUI.verifyElementText(findTestObject('Object Repository/Запись на прием с созданием пациента (Test case)/h_specialist_name'), 
    GlobalVariable.Test_vrach_abbreviaturoi)

'Нажать на ячейку в расписании'
WebUI.click(findTestObject('Object Repository/Запись на прием с созданием пациента (Test case)/free_time_in_timetable'))

'Проверка, что открылась форма записи на прием'
WebUI.verifyElementText(findTestObject('Object Repository/Запись на прием с созданием пациента (Test case)/h_zapic_na_priem'), 
    'Запись на прием')

'Нажать на поиск пациентов'
WebUI.click(findTestObject('Object Repository/Запись на прием с созданием пациента (Test case)/button_search_patient_zapis'))

'Ввод Фамилии'
WebUI.setText(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/input__FIO'), GlobalVariable.Test_patient2_familia)

'Выбор добавления пациента'
WebUI.click(findTestObject('Object Repository/Запись на прием с созданием пациента (Test case)/add_patient_information_card'))

'Получает атрибуты инпута фамилии'
a = WebUI.getAttribute(findTestObject('Запись на прием с созданием пациента (Test case)/verif_familia_'), 'value')

'Сравнивает глобальную переменную и входящую'
WebUI.verifyEqual(a, GlobalVariable.Test_patient2_familia)

'Установка начала консультации'
WebUI.setText(findTestObject('Запись на прием созданного пациента (Test case)/input__nachalo_priema'), '08:11')

'Назначает прием'
WebUI.click(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/tab_naznachit'))

'Проверяет валидацию поля "Имя"'
WebUI.verifyElementText(findTestObject('Object Repository/Запись на прием с созданием пациента (Test case)/verif_alert_name'), 
    'Поле обязательно для заполнения')

'Проверяет валидацию поля "Телефон"'
WebUI.verifyElementText(findTestObject('Object Repository/Запись на прием с созданием пациента (Test case)/verif_alert_phone'), 
    'Поле обязательно для заполнения')

'Проверяет валидацию поля "Услуги"'
WebUI.verifyElementText(findTestObject('Object Repository/Запись на прием с созданием пациента (Test case)/verif_alert_yslugi'), 
    'Это обязательное поле!')

'Установка начала консультации'
WebUI.verifyElementText(findTestObject('Запись на прием с созданием пациента (Test case)/verif_alert_kratnost_consultation'), 
    'Длительность консультации должно быть кратно 5 минутам')

'Нажать на Имя'
WebUI.click(findTestObject('Object Repository/Запись на прием с созданием пациента (Test case)/tab_name_information'))

'Ввод имени'
WebUI.setText(findTestObject('Object Repository/Запись на прием с созданием пациента (Test case)/input__Name_in_information'), 
    GlobalVariable.Test_patient2_Name)

'Нажать на отчество'
WebUI.click(findTestObject('Object Repository/Запись на прием с созданием пациента (Test case)/tab_otchestvo'))

'Ввести отчество'
WebUI.setText(findTestObject('Object Repository/Запись на прием с созданием пациента (Test case)/input_otchestvo_in_infprmation'), 
    GlobalVariable.Test_patient2_otchestvo)

'День рождения'
WebUI.setText(findTestObject('Object Repository/Запись на прием с созданием пациента (Test case)/input__day'), '13')

'Месяц рождения'
WebUI.setText(findTestObject('Object Repository/Запись на прием с созданием пациента (Test case)/input__month'), '10')

'Год рождения'
WebUI.setText(findTestObject('Object Repository/Запись на прием с созданием пациента (Test case)/input__year'), '1996')

'Нажать на пол'
WebUI.click(findTestObject('Object Repository/Запись на прием с созданием пациента (Test case)/tab_pol'))

'Выбор пола Женский'
WebUI.click(findTestObject('Object Repository/Запись на прием с созданием пациента (Test case)/gender_women'))

'Ввод телефона'
WebUI.click(findTestObject('Запись на прием с созданием пациента (Test case)/input_Phone_information'), FailureHandling.STOP_ON_FAILURE)

'Ввод телефона'
WebUI.sendKeys(findTestObject('Запись на прием с созданием пациента (Test case)/input_Phone_information'), Keys.chord(Keys.BACK_SPACE))

'Ввести номер телефона'
WebUI.setText(findTestObject('Object Repository/Запись на прием с созданием пациента (Test case)/input_Phone_information'), 
    GlobalVariable.Test_2_phone)

'Проверка врача'
WebUI.verifyElementText(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/imput_vrach_verif'), 
    GlobalVariable.Test_vrach_full)

'Установка начала консультации'
WebUI.setText(findTestObject('Запись на прием созданного пациента (Test case)/input__nachalo_priema'), '08:10')

'Указание цели визита'
WebUI.setText(findTestObject('Object Repository/Запись на прием с созданием пациента (Test case)/input_cel_vizita'), 'Автотест. Цель визита. Создание пациента в приеме')

'Открыть мультиселект услуг'
WebUI.click(findTestObject('Object Repository/Запись на прием с созданием пациента (Test case)/tab_add_ysluga'))

'Берет название услуги, чтобы далее сравнить'
Ysluga1 = WebUI.getText(findTestObject('Object Repository/Запись на прием с созданием пациента (Test case)/add_ysluga_first'))

'Выбрать 1 услугу'
WebUI.click(findTestObject('Object Repository/Запись на прием с созданием пациента (Test case)/add_ysluga_first'))

'Сравнивает добавленную услугу с той которую выбирал\r\n'
WebUI.verifyElementText(findTestObject('Запись на прием созданного пациента (Test case)/dobavlennay_ysluga_2'), Ysluga1)

'Проверка суммы услуг'
WebUI.verifyElementText(findTestObject('Object Repository/Запись на прием созданного пациента (Test case)/all_cost_yslugi'), 
    '1 600 ₽')

'Назначает прием'
WebUI.click(findTestObject('Object Repository/Запись на прием с созданием пациента (Test case)/tab_naznachit'))

'Проверка алерта'
WebUI.verifyElementText(findTestObject('Object Repository/Запись на прием с созданием пациента (Test case)/alert_success'), 
    'Успешно')

WebUI.closeBrowser()

