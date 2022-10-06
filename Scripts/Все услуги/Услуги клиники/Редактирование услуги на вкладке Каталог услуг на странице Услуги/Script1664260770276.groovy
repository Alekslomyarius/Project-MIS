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

'Ввод названия услуги в фильтр поиск'
WebUI.setText(findTestObject('Добавление услуги на вкладке Каталог услуг на странице Услуги (Test case)/input_search_in_page_yslugi'), 
    'Тестовая услуга QA два')

'Кнопка редактирования услуги'
WebUI.click(findTestObject('Object Repository/Редактирование услуги на вкладке Каталог услуг на странице Услуги (Test case)/button__editing_on_page_yslugi'))

'Проверка заголовка модального окна'
WebUI.verifyElementText(findTestObject('Редактирование услуги на вкладке Каталог услуг на странице Услуги (Test case)/h_modal_edit_ysluga'), 
    'Редактировать услугу')

'Изменение названия услуги'
WebUI.sendKeys(findTestObject('Object Repository/Редактирование услуги на вкладке Каталог услуг на странице Услуги (Test case)/input__name_edit_ysluga'), 
    Keys.chord(Keys.CONTROL, 'A', Keys.BACK_SPACE))

'Изменение названия услуги'
WebUI.setText(findTestObject('Object Repository/Редактирование услуги на вкладке Каталог услуг на странице Услуги (Test case)/input__name_edit_ysluga'), 
    'Тестовая услуга два')

'Ввод кода услуги'
WebUI.setText(findTestObject('Object Repository/Редактирование услуги на вкладке Каталог услуг на странице Услуги (Test case)/input__kog_edit_sluga'), 
    '577')

'Таб отмена'
WebUI.click(findTestObject('Object Repository/Редактирование услуги на вкладке Каталог услуг на странице Услуги (Test case)/tab_otmena_on_modal_edit'))

'Таб нет на модальном окне'
WebUI.click(findTestObject('Object Repository/Редактирование услуги на вкладке Каталог услуг на странице Услуги (Test case)/tab_no_on_modal_edit'))

'Таб сохранить'
WebUI.click(findTestObject('Object Repository/Редактирование услуги на вкладке Каталог услуг на странице Услуги (Test case)/tab_save_on_modal_edit'))

'Алерт успешно'
WebUI.verifyElementText(findTestObject('Object Repository/Редактирование услуги на вкладке Каталог услуг на странице Услуги (Test case)/verif_alert_edit_succsess'), 
    'Успешно')

'Ввод названия услуги в фильтр поиск'
WebUI.sendKeys(findTestObject('Добавление услуги на вкладке Каталог услуг на странице Услуги (Test case)/input_search_in_page_yslugi'), 
    Keys.chord(Keys.CONTROL, 'A', Keys.BACK_SPACE))

'Ввод названия услуги в фильтр поиск'
WebUI.setText(findTestObject('Добавление услуги на вкладке Каталог услуг на странице Услуги (Test case)/input_search_in_page_yslugi'), 
    'Тестовая услуга два')

'Проверка кода'
WebUI.verifyElementText(findTestObject('Редактирование услуги на вкладке Каталог услуг на странице Услуги (Test case)/verif_kod_edit'), 
    '577')

'Проверка измененного названия услуги'
WebUI.verifyElementText(findTestObject('Редактирование услуги на вкладке Каталог услуг на странице Услуги (Test case)/verif_name_edit'), 
    'Тестовая услуга два')

WebUI.closeBrowser()

