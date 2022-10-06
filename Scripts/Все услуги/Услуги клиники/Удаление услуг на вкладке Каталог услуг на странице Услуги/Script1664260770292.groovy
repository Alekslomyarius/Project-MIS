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
WebUI.verifyElementText(findTestObject('Object Repository/Добавление услуги на вкладке Каталог услуг на странице Услуги (Test case)/h_page_yslugi'), 
    'Услуги')

'Ввод названия услуги в фильтр поиск'
WebUI.setText(findTestObject('Object Repository/Добавление услуги на вкладке Каталог услуг на странице Услуги (Test case)/input_search_in_page_yslugi'), 
    'Тестовая услуга QA')

'Проверка названия услуги'
WebUI.verifyElementText(findTestObject('Object Repository/Добавление услуги на вкладке Каталог услуг на странице Услуги (Test case)/verif_add_ysluga_number_1'), 
    'Тестовая услуга QA')

'Кнопка удалить'
WebUI.click(findTestObject('Object Repository/Удаление услуг на вкладке Каталог услуг на странице Услуги (Test case)/button_delete_ysluga'))

'Проверка название услуги на модальном окне'
WebUI.verifyElementText(findTestObject('Удаление услуг на вкладке Каталог услуг на странице Услуги (Test case)/Verif_name_ysluga_delete_modal_1'), 
    'Тестовая услуга QA')

'Таб да на модальном окне удаления услуги'
WebUI.click(findTestObject('Object Repository/Удаление услуг на вкладке Каталог услуг на странице Услуги (Test case)/tab_yes_modal_delete'))

'Алерт успешно'
WebUI.verifyElementText(findTestObject('Object Repository/Редактирование услуги на вкладке Каталог услуг на странице Услуги (Test case)/verif_alert_edit_succsess'), 
    'Успешно')

'Ввод названия услуги в фильтр поиск'
WebUI.sendKeys(findTestObject('Object Repository/Добавление услуги на вкладке Каталог услуг на странице Услуги (Test case)/input_search_in_page_yslugi'), 
    Keys.chord(Keys.CONTROL, 'A', Keys.BACK_SPACE))

'Ввод названия услуги в фильтр поиск'
WebUI.setText(findTestObject('Object Repository/Добавление услуги на вкладке Каталог услуг на странице Услуги (Test case)/input_search_in_page_yslugi'), 
    'Тестовая услуга два')

'Кнопка удалить'
WebUI.click(findTestObject('Object Repository/Удаление услуг на вкладке Каталог услуг на странице Услуги (Test case)/button_delete_ysluga'))

'Проверка название услуги'
WebUI.verifyElementText(findTestObject('Удаление услуг на вкладке Каталог услуг на странице Услуги (Test case)/Verif_name_ysluga_delete_modal_2'), 
    'Тестовая услуга два')

'Таб нет на модальном окне удаления услуги'
WebUI.click(findTestObject('Object Repository/Удаление услуг на вкладке Каталог услуг на странице Услуги (Test case)/tab_no_modal_delete'))

'Кнопка удалить'
WebUI.click(findTestObject('Object Repository/Удаление услуг на вкладке Каталог услуг на странице Услуги (Test case)/button_delete_ysluga'))

'Проверка название услуги на модальном окне'
WebUI.verifyElementText(findTestObject('Object Repository/Удаление услуг на вкладке Каталог услуг на странице Услуги (Test case)/Verif_name_ysluga_delete_modal_2'), 
    'Тестовая услуга два')

'Таб да на модальном окне удаления услуги'
WebUI.click(findTestObject('Object Repository/Удаление услуг на вкладке Каталог услуг на странице Услуги (Test case)/tab_yes_modal_delete'))

'Алерт успешно'
WebUI.verifyElementText(findTestObject('Object Repository/Редактирование услуги на вкладке Каталог услуг на странице Услуги (Test case)/verif_alert_edit_succsess'), 
    'Успешно')

WebUI.closeBrowser()

