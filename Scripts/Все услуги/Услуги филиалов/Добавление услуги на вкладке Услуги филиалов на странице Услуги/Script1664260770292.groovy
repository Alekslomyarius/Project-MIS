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

'Вкладка Услуги филиалов'
WebUI.click(findTestObject('Object Repository/Добавление услуги на вкладке Услуги филиалов на странице Услуги (Test case)/vkladka_yslugi_filialov'))

WebUI.click(findTestObject('Object Repository/Добавление услуги на вкладке Услуги филиалов на странице Услуги (Test case)/filter_filiali'))

'Выбор филиала'
WebUI.setText(findTestObject('Object Repository/Добавление услуги на вкладке Услуги филиалов на странице Услуги (Test case)/input_filial_on_page_yslugi'), 
    'Автотест')

'Подтверждение выбора филиала'
WebUI.sendKeys(findTestObject('Object Repository/Добавление услуги на вкладке Услуги филиалов на странице Услуги (Test case)/input_filial_on_page_yslugi'), 
    Keys.chord(Keys.ENTER))

'Таб Добавить услугу'
WebUI.click(findTestObject('Object Repository/Добавление услуги на вкладке Услуги филиалов на странице Услуги (Test case)/tab_add_ysluga_on_page_yslugi_filialov'))

'Ввод 1 услуги в поиск'
WebUI.setText(findTestObject('Object Repository/Добавление услуги на вкладке Услуги филиалов на странице Услуги (Test case)/input_search_ysluga_on_modal_filial'), 
    'Тестовая услуга QA')

'Проверка то что вывелась правильная услуга'
WebUI.verifyElementText(findTestObject('Добавление услуги на вкладке Услуги филиалов на странице Услуги (Test case)/verif_name_on_modal_filial'), 
    'Тестовая услуга QA')

'Проверка то что вывелся правильный код'
WebUI.verifyElementText(findTestObject('Добавление услуги на вкладке Услуги филиалов на странице Услуги (Test case)/verif_kod_on_modal_filial_1'), 
    '43')

'Таб Добавить к филиалу'
WebUI.click(findTestObject('Object Repository/Добавление услуги на вкладке Услуги филиалов на странице Услуги (Test case)/tab_add_ysluga_in_filial'))

'Проверка то что таб сменил название на Добавлена к филиалу'
WebUI.verifyElementText(findTestObject('Добавление услуги на вкладке Услуги филиалов на странице Услуги (Test case)/verif_ysluga_add_in_filial'), 
    'Добавлена к филиалу')

WebUI.sendKeys(findTestObject('Object Repository/Добавление услуги на вкладке Услуги филиалов на странице Услуги (Test case)/input_search_ysluga_on_modal_filial'), 
    Keys.chord(Keys.CONTROL, 'A', Keys.BACK_SPACE))

'Ввод 2 услуги в поиск'
WebUI.setText(findTestObject('Object Repository/Добавление услуги на вкладке Услуги филиалов на странице Услуги (Test case)/input_search_ysluga_on_modal_filial'), 
    'Тестовая услуга два')

'Таб Добавить к филиалу'
WebUI.click(findTestObject('Object Repository/Добавление услуги на вкладке Услуги филиалов на странице Услуги (Test case)/tab_add_ysluga_in_filial'))

'Проверка то что таб сменил название на Добавлена к филиалу'
WebUI.verifyElementText(findTestObject('Добавление услуги на вкладке Услуги филиалов на странице Услуги (Test case)/verif_ysluga_add_in_filial'), 
    'Добавлена к филиалу')

'Проверка то что вывелась правильная услуга'
WebUI.verifyElementText(findTestObject('Добавление услуги на вкладке Услуги филиалов на странице Услуги (Test case)/verif_name_on_modal_filial'), 
    'Тестовая услуга два')

'Проверка то что вывелся правильный код'
WebUI.verifyElementText(findTestObject('Добавление услуги на вкладке Услуги филиалов на странице Услуги (Test case)/verif_kod_on_modal_filial_2'), 
    '577')

WebUI.click(findTestObject('Object Repository/Добавление услуги на вкладке Услуги филиалов на странице Услуги (Test case)/tab_close_modal_filial'))

WebUI.closeBrowser()

