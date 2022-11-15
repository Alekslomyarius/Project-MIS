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
WebUI.click(findTestObject('Object Repository/Редактирование вкладки Документы (Test case)/timetable'))

'Проверяем заголовок'
WebUI.verifyElementText(findTestObject('Object Repository/Редактирование вкладки Документы (Test case)/h_timetable'), 'Расписание')

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
not_run: WebUI.click(findTestObject('Object Repository/Редактирование вкладки Документы (Test case)/filter_specialist'))

'Ввод специалиста'
not_run: WebUI.setText(findTestObject('Object Repository/Редактирование вкладки Документы (Test case)/input_filter_specialist'), 
    GlobalVariable.Test_vrach_familia)

'Подтверждение выбора специалиста\r\n'
not_run: WebUI.sendKeys(findTestObject('Object Repository/Редактирование вкладки Документы (Test case)/input_filter_specialist'), 
    Keys.chord(Keys.ENTER))

'Проверка, что вывелся тот специалист'
not_run: WebUI.verifyElementText(findTestObject('Object Repository/Редактирование вкладки Документы (Test case)/h_specialist_name'), 
    GlobalVariable.Test_vrach_abbreviaturoi)

'Нажать на ячейку в расписании'
WebUI.click(findTestObject('Просмотр информации о приеме (Test case)/open_card_Avtotest Q. R'))

'Таб документы'
WebUI.click(findTestObject('Object Repository/Редактирование вкладки Документы (Test case)/tab_documents_ib_priem'))

'Проверка заголовка документы приема'
WebUI.verifyElementText(findTestObject('Object Repository/Редактирование вкладки Документы (Test case)/h_documents_priem'), 
    'Документы приема')

'Проверка заголовка документы пациента'
WebUI.verifyElementText(findTestObject('Object Repository/Редактирование вкладки Документы (Test case)/h_documents_patiemt_in_priem'), 
    'Документы пациента')

'Проверка плейсхолдера'
WebUI.verifyElementText(findTestObject('Object Repository/Редактирование вкладки Документы (Test case)/placeholder_docum_net'), 
    'Документов нет')

'Таб Добавить шаблон'
WebUI.click(findTestObject('Object Repository/Редактирование вкладки Документы (Test case)/button_add_shablon'))

'Проверка заголовка\r\n'
WebUI.verifyElementText(findTestObject('Object Repository/Редактирование вкладки Документы (Test case)/H_shablon_documentov_in_priem'), 
    'Шаблон документов')

'Проверка что шаблоны видны'
WebUI.verifyElementVisible(findTestObject('Object Repository/Редактирование вкладки Документы (Test case)/sabloni_verif'))

'Проверка алерта'
WebUI.verifyElementText(findTestObject('Object Repository/Редактирование вкладки Документы (Test case)/alert_not_full_info_patienta'), 
    'Информация о пациенте заполнена не полностью')

'Проверка кликабельности предпросмотра'
WebUI.verifyElementClickable(findTestObject('Object Repository/Редактирование вкладки Документы (Test case)/svg_predprosmotr'))

'Нажать на пиктограмму человечка'
WebUI.click(findTestObject('Object Repository/Редактирование вкладки Документы (Test case)/svg__people_profile_patienta'))

'Ввод адреса в профиле пациента'
WebUI.setText(findTestObject('Object Repository/Редактирование вкладки Документы (Test case)/input__adress_in_redactor_profil_patient'), 
    'Советская д.7, кв. 55')

'Таб сохранить'
WebUI.click(findTestObject('Object Repository/Редактирование вкладки Документы (Test case)/tab_save'))

'Проверка алерта\r\n'
WebUI.verifyElementText(findTestObject('Редактирование вкладки Документы (Test case)/alert_success_redactor_patient'), 'Успешно')

'Нажимаем на добавить шаблон договора пациента'
WebUI.click(findTestObject('Object Repository/Редактирование вкладки Документы (Test case)/tab_add_on_shablon_docs'))

'Проверка что документ добавился'
WebUI.verifyElementText(findTestObject('Object Repository/Редактирование вкладки Документы (Test case)/verif_add_documents_2'), 
    'Договора пациента')

'Таб добавить шаблон'
WebUI.click(findTestObject('Object Repository/Редактирование вкладки Документы (Test case)/button_add_shablon'))

'Выбираем все документы'
WebUI.click(findTestObject('Object Repository/Редактирование вкладки Документы (Test case)/select_all_documents'))

'Таб добавить'
WebUI.click(findTestObject('Object Repository/Редактирование вкладки Документы (Test case)/tab_add'))

'Проверка что добавился шаблон документа'
WebUI.verifyElementText(findTestObject('Object Repository/Редактирование вкладки Документы (Test case)/verif_add_shablon'), 
    'Договор об оказании платных медицинских услуг')

'Кликабельность печати'
WebUI.verifyElementClickable(findTestObject('Object Repository/Редактирование вкладки Документы (Test case)/pechat_docs'))

'Кликабельность скачивания '
WebUI.verifyElementClickable(findTestObject('Object Repository/Редактирование вкладки Документы (Test case)/dowload_docs'))

'Отметить все документы'
WebUI.click(findTestObject('Object Repository/Редактирование вкладки Документы (Test case)/select_all_documents_in_stranica_shablon_doc'))

'Скачать все доки'
WebUI.verifyElementClickable(findTestObject('Object Repository/Редактирование вкладки Документы (Test case)/svg_pechat_all_docs'))

'Склеить все доки для печати'
WebUI.verifyElementClickable(findTestObject('Object Repository/Редактирование вкладки Документы (Test case)/svg__skleika_all_docs_for_pechat'))

WebUI.closeBrowser()

