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

'Страница Услуги'
WebUI.click(findTestObject('Object Repository/Добавление услуги на вкладке Каталог услуг на странице Услуги (Test case)/tab_menu_yslugi'))

'Проверка заголовка страницы Услуги'
WebUI.verifyElementText(findTestObject('Добавление услуги на вкладке Каталог услуг на странице Услуги (Test case)/h_page_yslugi'), 'Услуги')

'Таб Добавить услугу'
WebUI.click(findTestObject('Object Repository/Добавление услуги на вкладке Каталог услуг на странице Услуги (Test case)/add_ysluga_on_page_ysluga'))

'Проверка заголовка модального окна'
WebUI.click(findTestObject('Object Repository/Добавление услуги на вкладке Каталог услуг на странице Услуги (Test case)/Name_ysluga_modal_add'))

'Ввод названия услуги'
WebUI.setText(findTestObject('Object Repository/Добавление услуги на вкладке Каталог услуг на странице Услуги (Test case)/input__name_ysluga_in_modal_add'), 
    'Тестовая услуга QA')

'Нажать на поле ввода Код'
WebUI.click(findTestObject('Object Repository/Добавление услуги на вкладке Каталог услуг на странице Услуги (Test case)/Kod_ysluga_modal_add'))

'Ввод кода услуги'
WebUI.setText(findTestObject('Object Repository/Добавление услуги на вкладке Каталог услуг на странице Услуги (Test case)/input__kod_ysluga_add_in_ modal'), 
    '43')

'Таб отмена'
WebUI.click(findTestObject('Object Repository/Добавление услуги на вкладке Каталог услуг на странице Услуги (Test case)/tab_otmena_in_modal_add'))

'Таб нет на модальном окне'
WebUI.click(findTestObject('Object Repository/Добавление услуги на вкладке Каталог услуг на странице Услуги (Test case)/tab_no_in_modal_add'))

'Кнопка Сохранить'
WebUI.click(findTestObject('Object Repository/Добавление услуги на вкладке Каталог услуг на странице Услуги (Test case)/tab_save_in_modal_add'))

'Проверка алерта сохранения'
WebUI.verifyElementText(findTestObject('Добавление услуги на вкладке Каталог услуг на странице Услуги (Test case)/verif_succsess_alert_in_modal_add'), 
    'Успешно')

'Ввод названия услуги в фильтр поиск'
WebUI.setText(findTestObject('Добавление услуги на вкладке Каталог услуг на странице Услуги (Test case)/input_search_in_page_yslugi'), 
    'Тестовая услуга QA')

'Проверка названия услуги'
WebUI.verifyElementText(findTestObject('Добавление услуги на вкладке Каталог услуг на странице Услуги (Test case)/verif_add_ysluga_number_1'), 
    'Тестовая услуга QA')

'Проверка кода услуги'
WebUI.verifyElementText(findTestObject('Object Repository/Добавление услуги на вкладке Каталог услуг на странице Услуги (Test case)/verif_kod_on_page_yslugi'), 
    '43')

'Таб Добавить услугу'
WebUI.click(findTestObject('Object Repository/Добавление услуги на вкладке Каталог услуг на странице Услуги (Test case)/add_ysluga_on_page_ysluga'))

'Проверка заголовка модального окна'
WebUI.click(findTestObject('Object Repository/Добавление услуги на вкладке Каталог услуг на странице Услуги (Test case)/Name_ysluga_modal_add'))

'Ввод названия услуги'
WebUI.setText(findTestObject('Object Repository/Добавление услуги на вкладке Каталог услуг на странице Услуги (Test case)/input__name_ysluga_in_modal_add'), 
    'Тестовая услуга QA два')

'Таб отмена'
WebUI.click(findTestObject('Object Repository/Добавление услуги на вкладке Каталог услуг на странице Услуги (Test case)/tab_otmena_in_modal_add'))

'Таб нет на модальном окне'
WebUI.click(findTestObject('Object Repository/Добавление услуги на вкладке Каталог услуг на странице Услуги (Test case)/tab_no_in_modal_add'))

'Кнопка Сохранить'
WebUI.click(findTestObject('Object Repository/Добавление услуги на вкладке Каталог услуг на странице Услуги (Test case)/tab_save_in_modal_add'))

'Проверка алерта сохранения'
WebUI.verifyElementText(findTestObject('Добавление услуги на вкладке Каталог услуг на странице Услуги (Test case)/verif_succsess_alert_in_modal_add'), 
    'Успешно')

'Ввод названия услуги в фильтр поиск'
WebUI.setText(findTestObject('Добавление услуги на вкладке Каталог услуг на странице Услуги (Test case)/input_search_in_page_yslugi'), 
    'Тестовая услуга QA два')

'Проверка названия услуги'
WebUI.verifyElementText(findTestObject('Добавление услуги на вкладке Каталог услуг на странице Услуги (Test case)/verif_add_ysluga_number_2'), 
    'Тестовая услуга QA два')

WebUI.closeBrowser()

