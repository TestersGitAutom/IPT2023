$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/login.feature");
formatter.feature({
  "name": "To validate the login  function of swaglabs application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To verify the product name after select the all product",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sc3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user has to navigate to the login page of swaglabs",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep.the_user_has_to_navigate_to_the_login_page_of_swaglabs()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enter the username \"username\" and password \"password\" and click login button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStep.the_user_enter_the_username_and_password_and_click_login_button(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should slect every product and view the same product what selected in previous page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.user_should_slect_every_product_and_view_the_same_product_what_selected_in_previous_page()"
});
formatter.result({
  "error_message": "org.openqa.selenium.InvalidSelectorException: invalid selector: Unable to locate an element with the xpath expression //div[@class\u003d\u0027inventory_item_name\u0027])[1] because of the following error:\nSyntaxError: Failed to execute \u0027evaluate\u0027 on \u0027Document\u0027: The string \u0027//div[@class\u003d\u0027inventory_item_name\u0027])[1]\u0027 is not a valid XPath expression.\n  (Session info: chrome\u003d114.0.5735.199)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/invalid_selector_exception.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-TQOH92NF\u0027, ip: \u0027192.168.43.81\u0027, os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_361\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 114.0.5735.199, chrome: {chromedriverVersion: 114.0.5735.90 (386bc09e8f4f..., userDataDir: C:\\Users\\ABINES~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:64123}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: ddb107c8f1948e81aaeb15c62b9b1e13\n*** Element info: {Using\u003dxpath, value\u003d//div[@class\u003d\u0027inventory_item_name\u0027])[1]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.pageobjects.ProductsPage.selectEveryProduct(ProductsPage.java:65)\r\n\tat org.stepdefinition.LoginStep.user_should_slect_every_product_and_view_the_same_product_what_selected_in_previous_page(LoginStep.java:98)\r\n\tat ✽.User should slect every product and view the same product what selected in previous page(file:src/test/resources/Features/login.feature:20)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});