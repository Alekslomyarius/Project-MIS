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

'Открывается карточка записи'
WebUI.click(findTestObject('Object Repository/Просмотр информации о приеме (Test case)/open_card_Avtotest Q. R'))

'Сверяется заголовок приема'
WebUI.verifyElementText(findTestObject('Object Repository/Просмотр информации о приеме (Test case)/h_info_priema'), 'Информация о приеме')

'Проверка врача'
WebUI.verifyElementText(findTestObject('Object Repository/Просмотр информации о приеме (Test case)/verif_vrach'), GlobalVariable.Test_vrach_full)

'Проверка пациента'
WebUI.verifyElementText(findTestObject('Object Repository/Просмотр информации о приеме (Test case)/verif_patient_QA'), GlobalVariable.Test_patient_FIO_full)

'Открывает мультиселект по выбору статусов'
WebUI.click(findTestObject('Object Repository/Просмотр информации о приеме (Test case)/tab_status_in_information'))

'Стутус начал визит'
WebUI.click(findTestObject('Object Repository/Просмотр информации о приеме (Test case)/Tab_nachat_vizit'))

'Проверка смены статуса'
WebUI.verifyElementText(findTestObject('Object Repository/Просмотр информации о приеме (Test case)/verif_status_nachat_vizit'), 
    'Начат визит')

'Закрыть просмотр'
WebUI.click(findTestObject('Просмотр информации о приеме (Test case)/svg__X_piktogramma_close'))

'Открывается карточка записи'
WebUI.click(findTestObject('Object Repository/Просмотр информации о приеме (Test case)/open_card_Avtotest Q. R'))

'Проверка смены статуса'
WebUI.verifyElementText(findTestObject('Object Repository/Просмотр информации о приеме (Test case)/verif_status_nachat_vizit'), 
    'Начат визит')

'Нажать на ФИО в карточке'
WebUI.enhancedClick(findTestObject('Object Repository/Просмотр информации о приеме (Test case)/verif_patient_QA'))

'Проверка что открылся профиль того пациента'
not_run: e = WebUI.getAttribute(findTestObject('Object Repository/Просмотр информации о приеме (Test case)/verif_email_in_profile'), 
    'value')

not_run: WebUI.verifyEqual(e, GlobalVariable.Test_email)

'Сверка амбулаторной карты'
WebUI.verifyElementText(findTestObject('Object Repository/Просмотр информации о приеме (Test case)/number_ambulat_card_in_profile'), 
    '8437572726432NK')

'Кнопка назад в профиле пациента'
WebUI.scrollToElement(findTestObject('Object Repository/Просмотр информации о приеме (Test case)/button_back_in_profile_in_profile'), 
    0)

'Кнопка назад в профиле пациента'
WebUI.click(findTestObject('Object Repository/Просмотр информации о приеме (Test case)/button_back_in_profile_in_profile'))

'Сверяется заголовок приема'
WebUI.verifyElementText(findTestObject('Object Repository/Просмотр информации о приеме (Test case)/h_info_priema'), 'Информация о приеме')

'Проверка телефона'
WebUI.verifyElementText(findTestObject('Object Repository/Просмотр информации о приеме (Test case)/verif_namber_zapisi'), 
    GlobalVariable.Test_phone)

'Проверка, что день рождение виден'
WebUI.verifyElementText(findTestObject('Object Repository/Редактирование вкладки Общее и Услуги (Test case)/verif_date_in prosmotr'), 
    '27 лет (11.05.1995)')

'Проверка цели визита'
WebUI.verifyElementText(findTestObject('Object Repository/Просмотр информации о приеме (Test case)/verif_target'), 'Автотест. Цель визита')

WebUI.closeBrowser()

