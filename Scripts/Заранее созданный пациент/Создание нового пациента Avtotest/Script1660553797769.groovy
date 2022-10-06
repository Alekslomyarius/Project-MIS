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

'Переходим на страницу Пациенты\r\n'
WebUI.click(findTestObject('Object Repository/Регистрация пациента (Test case)/button_patients'))

'Сверяем заголовок на странице пациенты'
WebUI.verifyElementText(findTestObject('Object Repository/Регистрация пациента (Test case)/h_patients'), 'Пациенты')

'Кнопка добавить пациента'
WebUI.click(findTestObject('Object Repository/Регистрация пациента (Test case)/button_add_patient'))

'Проверка заголовка на странице добавления пациента\r\n'
WebUI.verifyElementText(findTestObject('Object Repository/Регистрация пациента (Test case)/h_add_patient'), 'Регистрация нового пациента')

'Ввод Фамилии'
WebUI.setText(findTestObject('Object Repository/Регистрация пациента (Test case)/input_Familia'), GlobalVariable.Test_patient_familia)

'Ввод Имени'
WebUI.setText(findTestObject('Object Repository/Регистрация пациента (Test case)/input__Name'), GlobalVariable.Test_patient_name)

'Ввод Фамилии'
WebUI.setText(findTestObject('Object Repository/Регистрация пациента (Test case)/input__Otchestvo'), GlobalVariable.Test_patient_otchestvo)

'Дата Дня рождения '
WebUI.setText(findTestObject('Object Repository/Регистрация пациента (Test case)/input__day'), '11')

'Месяц Дня рождения '
WebUI.setText(findTestObject('Object Repository/Регистрация пациента (Test case)/input__month'), '05')

'Год Дня рождения '
WebUI.setText(findTestObject('Object Repository/Регистрация пациента (Test case)/input__year'), '1995')

'Селект с выбором пола'
WebUI.click(findTestObject('Object Repository/Регистрация пациента (Test case)/button_gender'))

'Пол мужской'
WebUI.click(findTestObject('Object Repository/Регистрация пациента (Test case)/pol_men'))

'Ввод email'
not_run: WebUI.setText(findTestObject('Object Repository/Регистрация пациента (Test case)/input__email'), GlobalVariable.Test_email)

'Ввод телефона'
WebUI.click(findTestObject('Object Repository/Регистрация пациента (Test case)/input_Phone'), FailureHandling.STOP_ON_FAILURE)

'Ввод телефона'
WebUI.sendKeys(findTestObject('Object Repository/Регистрация пациента (Test case)/input_Phone'), Keys.chord(Keys.BACK_SPACE))

'Ввод телефона'
WebUI.setText(findTestObject('Object Repository/Регистрация пациента (Test case)/input_Phone'), GlobalVariable.Test_phone)

'Ввод телефона дополнительного'
WebUI.click(findTestObject('Регистрация пациента (Test case)/imput_dop_Phone'), FailureHandling.STOP_ON_FAILURE)

'Ввод телефона дополнительного'
WebUI.sendKeys(findTestObject('Регистрация пациента (Test case)/imput_dop_Phone'), Keys.chord(Keys.BACK_SPACE))

'Ввод телефона дополнительного'
WebUI.setText(findTestObject('Object Repository/Регистрация пациента (Test case)/imput_dop_Phone'), GlobalVariable.Test_phone)

'Ввод скрии и номера'
WebUI.setText(findTestObject('Object Repository/Регистрация пациента (Test case)/input_pasport_seria_i_number'), '8328427357')

'Датапикер паспорта'
WebUI.click(findTestObject('Регистрация пациента (Test case)/button_datapicer_ passport_vidacha'))

'Год'
WebUI.enhancedClick(findTestObject('Object Repository/Регистрация пациента (Test case)/button_2022'))

'Уменьшаем год на 10'
WebUI.enhancedClick(findTestObject('Object Repository/Регистрация пациента (Test case)/button_swap 10'))

'Выбираем июль'
WebUI.enhancedClick(findTestObject('Object Repository/Регистрация пациента (Test case)/month july'))

'3 число'
WebUI.enhancedClick(findTestObject('Object Repository/Регистрация пациента (Test case)/day 3'))

'Вводим кем выдан паспорт'
WebUI.setText(findTestObject('Object Repository/Регистрация пациента (Test case)/input__kem vidan'), 'Отделом УМС')

'Ввод страны'
WebUI.setText(findTestObject('Object Repository/Регистрация пациента (Test case)/input__country'), 'Россия')

'Ввод города'
WebUI.setText(findTestObject('Object Repository/Регистрация пациента (Test case)/input__city'), 'Тамбов')

'Ввод улицы'
not_run: WebUI.setText(findTestObject('Object Repository/Регистрация пациента (Test case)/input__address'), 'Советская д7')

'Ввод амбулаторной карты'
WebUI.scrollToElement(findTestObject('Object Repository/Регистрация пациента (Test case)/input__amb_cart'), 0)

'Ввод амбулаторной карты'
WebUI.setText(findTestObject('Object Repository/Регистрация пациента (Test case)/input__amb_cart'), '8437572726432NK')

'Ввод комментария'
WebUI.setText(findTestObject('Object Repository/Регистрация пациента (Test case)/input_comment'), 'Тест регресс')

'Кнопка Зарегистрироваться'
WebUI.click(findTestObject('Регистрация пациента (Test case)/button_registr'))

'Проверка алерта об успешном регистрировании пациента'
WebUI.verifyElementText(findTestObject('Object Repository/Регистрация пациента (Test case)/p_alert success'), 'Успешно')

WebUI.closeBrowser()

