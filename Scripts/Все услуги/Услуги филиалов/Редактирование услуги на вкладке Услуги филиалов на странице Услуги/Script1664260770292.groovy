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
WebUI.setText(findTestObject('Редактирование услуги на вкладке Услуги филиалов на странице Услуги (Test case)/input_search_yslugi_filiala'), 
    'Тестовая услуга QA')

'Проверка верной найденной услуги'
WebUI.verifyElementText(findTestObject('Object Repository/Редактирование услуги на вкладке Услуги филиалов на странице Услуги (Test case)/verif_name_yslugi_filiala'), 
    'Тестовая услуга QA')

'Проверка кода найденной услуги'
WebUI.verifyElementText(findTestObject('Object Repository/Редактирование услуги на вкладке Услуги филиалов на странице Услуги (Test case)/verif_kod_yslugi_filiala'), 
    '43')

'Кнопка редактировать'
WebUI.click(findTestObject('Object Repository/Редактирование услуги на вкладке Услуги филиалов на странице Услуги (Test case)/button__edit_yslugi_filiala'))

'Проверяет заголовок модального окна'
WebUI.verifyElementText(findTestObject('Редактирование услуги на вкладке Услуги филиалов на странице Услуги (Test case)/h_edit_ysluga_filiala'), 
    'Редактировать услугу')

WebUI.click(findTestObject('Object Repository/Редактирование услуги на вкладке Услуги филиалов на странице Услуги (Test case)/pole__dlitelnost_yslugi_filiala'))

'Вводим длительность '
WebUI.setText(findTestObject('Object Repository/Редактирование услуги на вкладке Услуги филиалов на странице Услуги (Test case)/input__dlitelnost_yslugi_filiala'), 
    '50')

WebUI.click(findTestObject('Object Repository/Редактирование услуги на вкладке Услуги филиалов на странице Услуги (Test case)/pole_cena_yslugi_filiala'))

'Вводим цену'
WebUI.setText(findTestObject('Object Repository/Редактирование услуги на вкладке Услуги филиалов на странице Услуги (Test case)/input__cena_yslugi_filiala'), 
    '1500')

'Таб Сохранить'
WebUI.click(findTestObject('Object Repository/Редактирование услуги на вкладке Услуги филиалов на странице Услуги (Test case)/tab_save_edit_filiala'))

'Алерт успешно'
WebUI.verifyElementText(findTestObject('Object Repository/Редактирование услуги на вкладке Каталог услуг на странице Услуги (Test case)/verif_alert_edit_succsess'), 
    'Успешно')

'Ввод 2 услуги в поиск'
WebUI.setText(findTestObject('Редактирование услуги на вкладке Услуги филиалов на странице Услуги (Test case)/input_search_yslugi_filiala'), 
    'Тестовая услуга два')

'Проверка верной найденной услуги'
WebUI.verifyElementText(findTestObject('Object Repository/Редактирование услуги на вкладке Услуги филиалов на странице Услуги (Test case)/verif_name_yslugi_filiala_2'), 
    'Тестовая услуга два')

'Проверка кода найденной услуги'
WebUI.verifyElementText(findTestObject('Object Repository/Редактирование услуги на вкладке Услуги филиалов на странице Услуги (Test case)/verif_kod_yslugi_filiala_2'), 
    '577')

'Таб редактировать 2 услугу'
WebUI.click(findTestObject('Object Repository/Редактирование услуги на вкладке Услуги филиалов на странице Услуги (Test case)/button__edit_yslugi_filiala'))

WebUI.click(findTestObject('Object Repository/Редактирование услуги на вкладке Услуги филиалов на странице Услуги (Test case)/pole__dlitelnost_yslugi_filiala'))

'Ввод длительности услуги'
WebUI.setText(findTestObject('Object Repository/Редактирование услуги на вкладке Услуги филиалов на странице Услуги (Test case)/input__dlitelnost_yslugi_filiala'), 
    '20')

WebUI.click(findTestObject('Object Repository/Редактирование услуги на вкладке Услуги филиалов на странице Услуги (Test case)/pole_cena_yslugi_filiala'))

'Ввод цены услуги'
WebUI.setText(findTestObject('Object Repository/Редактирование услуги на вкладке Услуги филиалов на странице Услуги (Test case)/input__cena_yslugi_filiala'), 
    '1000')

'Кнопка Сохранить'
WebUI.click(findTestObject('Object Repository/Редактирование услуги на вкладке Услуги филиалов на странице Услуги (Test case)/tab_save_edit_filiala'))

'Алерт успешно'
WebUI.verifyElementText(findTestObject('Object Repository/Редактирование услуги на вкладке Каталог услуг на странице Услуги (Test case)/verif_alert_edit_succsess'), 
    'Успешно')

'Проверка того что длительность появилась у услуги 2'
WebUI.verifyElementText(findTestObject('Object Repository/Редактирование услуги на вкладке Услуги филиалов на странице Услуги (Test case)/verif_dlitelnost_yslugi_filiala'), 
    '20 мин.')

'Проверка того что код появился у услуги 2'
WebUI.verifyElementText(findTestObject('Object Repository/Редактирование услуги на вкладке Услуги филиалов на странице Услуги (Test case)/verif_cena_yslugi_filiala'), 
    '1 000 ₽')

'Таб редактировать 2 услугу'
WebUI.click(findTestObject('Object Repository/Редактирование услуги на вкладке Услуги филиалов на странице Услуги (Test case)/button__edit_yslugi_filiala'))

WebUI.sendKeys(findTestObject('Object Repository/Редактирование услуги на вкладке Услуги филиалов на странице Услуги (Test case)/input__dlitelnost_yslugi_filiala'), 
    Keys.chord(Keys.CONTROL, 'A', Keys.BACK_SPACE))

'Ввод длительности услуги'
WebUI.setText(findTestObject('Object Repository/Редактирование услуги на вкладке Услуги филиалов на странице Услуги (Test case)/input__dlitelnost_yslugi_filiala'), 
    '15')

WebUI.sendKeys(findTestObject('Object Repository/Редактирование услуги на вкладке Услуги филиалов на странице Услуги (Test case)/input__cena_yslugi_filiala'), 
    Keys.chord(Keys.CONTROL, 'A', Keys.BACK_SPACE))

'Ввод цены услуги'
WebUI.setText(findTestObject('Object Repository/Редактирование услуги на вкладке Услуги филиалов на странице Услуги (Test case)/input__cena_yslugi_filiala'), 
    '1400')

'Таб отмена'
WebUI.click(findTestObject('Object Repository/Редактирование услуги на вкладке Услуги филиалов на странице Услуги (Test case)/tab_onmena_edit_filiala'))

'Таб Нет на модальном окне отмены'
WebUI.click(findTestObject('Object Repository/Редактирование услуги на вкладке Услуги филиалов на странице Услуги (Test case)/button_no_modal_edit_filiala'))

'Проверка что длительность услуги не изменилась'
WebUI.verifyElementText(findTestObject('Object Repository/Редактирование услуги на вкладке Услуги филиалов на странице Услуги (Test case)/verif_dlitelnost_yslugi_filiala'), 
    '20 мин.')

'Проверка что код услуги не изменился'
WebUI.verifyElementText(findTestObject('Object Repository/Редактирование услуги на вкладке Услуги филиалов на странице Услуги (Test case)/verif_cena_yslugi_filiala'), 
    '1 000 ₽')

'Таб редактировать услугу 2'
WebUI.click(findTestObject('Object Repository/Редактирование услуги на вкладке Услуги филиалов на странице Услуги (Test case)/button__edit_yslugi_filiala'))

WebUI.sendKeys(findTestObject('Object Repository/Редактирование услуги на вкладке Услуги филиалов на странице Услуги (Test case)/input__cena_yslugi_filiala'), 
    Keys.chord(Keys.CONTROL, 'A', Keys.BACK_SPACE))

'Ввод цены услуги'
WebUI.setText(findTestObject('Object Repository/Редактирование услуги на вкладке Услуги филиалов на странице Услуги (Test case)/input__cena_yslugi_filiala'), 
    '1600')

'Таб Сохранить'
WebUI.click(findTestObject('Object Repository/Редактирование услуги на вкладке Услуги филиалов на странице Услуги (Test case)/tab_save_edit_filiala'))

'Алерт успешно'
WebUI.verifyElementText(findTestObject('Object Repository/Редактирование услуги на вкладке Каталог услуг на странице Услуги (Test case)/verif_alert_edit_succsess'), 
    'Успешно')

'Проверка то что цена услуги 2 изменилась'
WebUI.verifyElementText(findTestObject('Object Repository/Редактирование услуги на вкладке Услуги филиалов на странице Услуги (Test case)/verif_cena_yslugi_edit_filiala_2'), 
    '1 600 ₽')

WebUI.closeBrowser()

