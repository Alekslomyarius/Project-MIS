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

def bodyAth = WS.sendRequest(findTestObject('Authorization'))

def access_token = WS.getElementPropertyValue(bodyAth, 'user.access_token')

GlobalVariable.access_token = access_token


Date todaysDate = new Date()

def screenFormattedDate = todaysDate.format('yyyy-MM-dd')

GlobalVariable.screenFormattedDate = screenFormattedDate

def body = WS.sendRequest(findTestObject('get сервис', [('GlobalVariable.screenFormattedDate') : GlobalVariable.screenFormattedDate
            , ('access_token') : GlobalVariable.access_token]))

while (WS.verifyElementPropertyValue(body, 'results[0].doctors_consults[0].consults[0]', null, FailureHandling.OPTIONAL) == 
false) {
    def ID = WS.getElementPropertyValue(body, 'results[0].doctors_consults[0].consults[0].id')

    GlobalVariable.ID = ID

    WS.sendRequest(findTestObject('DELETE консультаций', [('ID') : GlobalVariable.ID, ('access_token') : GlobalVariable.access_token]))

    body = WS.sendRequest(findTestObject('get сервис', [('GlobalVariable.screenFormattedDate') : GlobalVariable.screenFormattedDate
                , ('access_token') : GlobalVariable.access_token]))
}

