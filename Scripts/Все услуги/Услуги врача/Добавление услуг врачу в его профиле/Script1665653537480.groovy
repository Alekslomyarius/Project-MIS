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

'Страница Врачи клиники'
WebUI.click(findTestObject('Object Repository/Добавление услуг врачу и Удаление услуг врачу в его профиле/page_vrach_kliniki'))

'Поиск врача'
WebUI.setText(findTestObject('Object Repository/Добавление услуг врачу и Удаление услуг врачу в его профиле/input_search_in_page_vrach'), 
    GlobalVariable.Test_vrach_familia)

'Открыть профиль врача'
WebUI.click(findTestObject('Object Repository/Добавление услуг врачу и Удаление услуг врачу в его профиле/profile_vrach_in_page_vrach_kliniki'))

'Открыть вкладка Основная информация'
WebUI.click(findTestObject('Object Repository/Добавление услуг врачу и Удаление услуг врачу в его профиле/vkladka_osnovnay_information_in_profile_vrach'))

'Проверка плейсхолдера'
WebUI.verifyElementText(findTestObject('Добавление услуг врачу и Удаление услуг врачу в его профиле/no_data_placholder_in_blok_yslugi'), 
    'Нет данных')

'Кнопка добавить данные'
WebUI.click(findTestObject('Object Repository/Добавление услуг врачу и Удаление услуг врачу в его профиле/tab_add_yslugi_for_vrach'))

'Проверка заголовка модального окна'
WebUI.verifyElementText(findTestObject('Добавление услуг врачу и Удаление услуг врачу в его профиле/h_add_ysluga_on_modal_vrach'), 
    'Добавить услугу')

WebUI.click(findTestObject('Object Repository/Добавление услуг врачу и Удаление услуг врачу в его профиле/pole_filiala_on_modal_vrach'))

'Поиск нужного филиала'
WebUI.setText(findTestObject('Object Repository/Добавление услуг врачу и Удаление услуг врачу в его профиле/input__filiala_on_modal_vrach'), 
    'Автотест')

WebUI.sendKeys(findTestObject('Object Repository/Добавление услуг врачу и Удаление услуг врачу в его профиле/input__filiala_on_modal_vrach'), 
    Keys.chord(Keys.ENTER))

'Отметить все услуги'
WebUI.click(findTestObject('Object Repository/Добавление услуг врачу и Удаление услуг врачу в его профиле/chekbox_all_yslugi'))

'Кнопка отменить'
WebUI.click(findTestObject('Object Repository/Добавление услуг врачу и Удаление услуг врачу в его профиле/tab_otmena_on_modal_add_vrach'))

'Таб нет на модальном окне'
WebUI.click(findTestObject('Object Repository/Добавление услуг врачу и Удаление услуг врачу в его профиле/tab_no_on_modal_vrach'))

'Кнопка Сохранить'
WebUI.click(findTestObject('Object Repository/Добавление услуг врачу и Удаление услуг врачу в его профиле/tab_save_on_modal_vrach'))

'Проверка алерта'
WebUI.verifyElementText(findTestObject('Добавление услуг врачу и Удаление услуг врачу в его профиле/verif_alert_succsess_on_modal_vrach'), 
    'Успешно')

WebUI.verifyElementText(findTestObject('Object Repository/Добавление услуг врачу и Удаление услуг врачу в его профиле/verif_name_1_on_add_vrach'), 
    'Тестовая услуга QA')

WebUI.verifyElementText(findTestObject('Object Repository/Добавление услуг врачу и Удаление услуг врачу в его профиле/verif_name_2_on_add_vrach'), 
    'Тестовая услуга два')

'Кнопка добавить данные'
WebUI.click(findTestObject('Object Repository/Добавление услуг врачу и Удаление услуг врачу в его профиле/tab_add_yslugi_for_vrach'))

WebUI.click(findTestObject('Object Repository/Добавление услуг врачу и Удаление услуг врачу в его профиле/pole_filiala_on_modal_vrach'))

'Поиск нужного филиала'
WebUI.setText(findTestObject('Object Repository/Добавление услуг врачу и Удаление услуг врачу в его профиле/input__filiala_on_modal_vrach'), 
    'Автотест')

WebUI.sendKeys(findTestObject('Object Repository/Добавление услуг врачу и Удаление услуг врачу в его профиле/input__filiala_on_modal_vrach'), 
    Keys.chord(Keys.ENTER))

'Проверка плейсхолдера то что нет больше услуг'
WebUI.verifyElementText(findTestObject('Object Repository/Добавление услуг врачу и Удаление услуг врачу в его профиле/placeholder_no_yslog_on_modal_vrach'), 
    'Список услуг пуст')

'Закрыть модальное окно'
WebUI.click(findTestObject('Object Repository/Добавление услуг врачу и Удаление услуг врачу в его профиле/svg_X_on_modal_crach'), 
    FailureHandling.STOP_ON_FAILURE)

'Удаление всех услуг'
while (WebUI.verifyElementVisible(findTestObject('Object Repository/Добавление услуг врачу и Удаление услуг врачу в его профиле/button__delete_ysluga_on_modal_vrach'), 
    FailureHandling.OPTIONAL) == true) {
    'Нажать на кнопку удаления'
    WebUI.click(findTestObject('Object Repository/Добавление услуг врачу и Удаление услуг врачу в его профиле/button__delete_ysluga_on_modal_vrach'), 
        FailureHandling.STOP_ON_FAILURE)

    'Таб Да на модальном окне удаления услуги'
    WebUI.click(findTestObject('Object Repository/Добавление услуг врачу и Удаление услуг врачу в его профиле/tab_yes_on_modal_vrach'), 
        FailureHandling.STOP_ON_FAILURE)

    'Проверка алерта'
    WebUI.verifyElementText(findTestObject('Добавление услуг врачу и Удаление услуг врачу в его профиле/verif_alert_succsess_on_modal_vrach'), 
        'Успешно', FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)
}

'Проверка плейсхолдера'
WebUI.verifyElementText(findTestObject('Добавление услуг врачу и Удаление услуг врачу в его профиле/no_data_placholder_in_blok_yslugi'), 
    'Нет данных', FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

