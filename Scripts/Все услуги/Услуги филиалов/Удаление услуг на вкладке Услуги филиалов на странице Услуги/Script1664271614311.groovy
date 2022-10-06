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

'Вкладка Услуги филиалов'
WebUI.click(findTestObject('Object Repository/Добавление услуги на вкладке Услуги филиалов на странице Услуги (Test case)/vkladka_yslugi_filialov'))

WebUI.click(findTestObject('Object Repository/Добавление услуги на вкладке Услуги филиалов на странице Услуги (Test case)/filter_filiali'))

'Выбор филиала'
WebUI.setText(findTestObject('Object Repository/Добавление услуги на вкладке Услуги филиалов на странице Услуги (Test case)/input_filial_on_page_yslugi'), 
    'Автотест')

'Подтверждение выбора филиала'
WebUI.sendKeys(findTestObject('Object Repository/Добавление услуги на вкладке Услуги филиалов на странице Услуги (Test case)/input_filial_on_page_yslugi'), 
    Keys.chord(Keys.ENTER))

'Ввод 1 услуги в поиск'
WebUI.setText(findTestObject('Object Repository/Удаление услуг на вкладке Услуги филиалов на странице Услуги/input_search_yslugi_filiala'), 
    'Тестовая услуга QA')

'Проверка верной найденной услуги'
WebUI.verifyElementText(findTestObject('Object Repository/Удаление услуг на вкладке Услуги филиалов на странице Услуги/verif_name_yslugi_filiala'), 
    'Тестовая услуга QA')

'Кнопка удаления услуги'
WebUI.click(findTestObject('Object Repository/Удаление услуг на вкладке Услуги филиалов на странице Услуги/button__delete_yslugu_filiala'))

'Таб Нет на модальном окне подтверждения удаления услуги'
WebUI.click(findTestObject('Object Repository/Удаление услуг на вкладке Услуги филиалов на странице Услуги/tab_no_delete_ysluga_filiala'))

'Проверка верной найденной услуги'
WebUI.verifyElementText(findTestObject('Object Repository/Удаление услуг на вкладке Услуги филиалов на странице Услуги/verif_name_yslugi_filiala'), 
    'Тестовая услуга QA')

'Кнопка удалить услуги'
WebUI.click(findTestObject('Object Repository/Удаление услуг на вкладке Услуги филиалов на странице Услуги/button__delete_yslugu_filiala'))

'Таб Да на модальном окне подтверждения удаления услуги'
WebUI.click(findTestObject('Object Repository/Удаление услуг на вкладке Услуги филиалов на странице Услуги/tab_yes_delete_ysluga_filiala'))

'Проверка алурта сохранения'
WebUI.verifyElementText(findTestObject('Object Repository/Удаление услуг на вкладке Услуги филиалов на странице Услуги/verif_alert_sucsecc_yslugi_filiala'), 
    'Успешно')

'Очистка поиска услуг'
WebUI.setText(findTestObject('Object Repository/Удаление услуг на вкладке Услуги филиалов на странице Услуги/input_search_yslugi_filiala'), 
    Keys.chord(Keys.CONTROL, 'A', Keys.BACK_SPACE))

'Ввод 2 услуги в поиск'
WebUI.setText(findTestObject('Object Repository/Удаление услуг на вкладке Услуги филиалов на странице Услуги/input_search_yslugi_filiala'), 
    'Тестовая услуга два')

'Проверка верной найденной услуги'
WebUI.verifyElementText(findTestObject('Object Repository/Удаление услуг на вкладке Услуги филиалов на странице Услуги/verif_name_yslugi_filiala_2'), 
    'Тестовая услуга два')

'Кнопка удалить 2 услуги'
WebUI.click(findTestObject('Object Repository/Удаление услуг на вкладке Услуги филиалов на странице Услуги/button__delete_yslugu_filiala'))

'Таб Да на модальном окне подтверждения удаления 2 услуги'
WebUI.click(findTestObject('Object Repository/Удаление услуг на вкладке Услуги филиалов на странице Услуги/tab_yes_delete_ysluga_filiala'))

WebUI.closeBrowser()

