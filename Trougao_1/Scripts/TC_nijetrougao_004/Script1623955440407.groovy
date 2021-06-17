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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://iteon.org/qa/01-trougao-v1/')

WebUI.setText(findTestObject('Object Repository/Page_/input_Jednakostranini trougao (sve tri stra_9f4979'), '1')

WebUI.setText(findTestObject('Object Repository/Page_/input_Jednakostranini trougao (sve tri stra_de46a7'), '2')

WebUI.setText(findTestObject('Object Repository/Page_/input_Jednakostranini trougao (sve tri stra_5324ef'), '3')

WebUI.click(findTestObject('Object Repository/Page_/input_Jednakostranini trougao (sve tri stra_6bca0c'))

WebUI.verifyElementText(findTestObject('Page_/label_Trougao je raznostranian'), 'Nije trougao.')

WebUI.closeBrowser()

