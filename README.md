# 2nd Homework of the Java Test Automation Course (4th block) - Solvd Laba
This repository stores the 2nd homework given by our mentor in the 4th block of
the Java Test Automation Course at Solvd Laba. It consists in automating three web test using XPath and CSS 
selectors. Also, it was a requirement to use the class AbstractUIObject and use a DataProvider.

## Explanation
To fulfill the requirements of this homework, I followed the next steps:

<ol>
  <li>First I've created a page class. This class must extend from AbstractPage, and it has to override the constructor and
set it as public. We can create Abstract class named AbstractFacebookPage for example, in case that all the pages have a
common behavior such as a footer or a header and extract that common behavior in the abstract class.
The abstract class must extend from AbstractPage and the rest of pages must extend from that abstract class we’ve created.</li>
  
  <li>For each element, I used the FindBy annotation and specified the selector I wanted to use to find the element 
(xpath, id or css) and pass the xpath or expression. Then, below these annotations I created a private ExtendedWebElement,
emailInputField, for example.</li>

  <li> Also, we can create methods like typeEmail, typePassword, clickLoginButton, isLoginErrorMessagePresent. To write 
something we use the .type(String text) method from the web element. To click we use .click() but almost always when we 
use this click method, we have to return a new page. Other methods of ExtendedWebElement are getText(), 
getAttribute() and select(). If we clicked LoginButton then we have to return a new instance of the HomePage 
class. This HomePage class must extend from AbstractPage as well, as EVERY page. It means that we have to use 
the getDriver() method to pass it in its constructor.
And to know if the login was unsuccessful, we have to find an error message and create a method that returns true or 
false depending on if that message is present or not, using the .isElementPresent method. 
</li>
  <li>When I finished finding the elements and creating methods to interact with them, I created in the
src/test/com/solvd/automation/gui package a class named WebGithubTest which must implement IAbstractTest. After, I needed to 
create a method with the Test annotation and to create an instance of the page class. Finally, I used the .open() method to 
automatically open a session. Then, I needed to use the created methods to interact with the elements and press a
submit button at the end.
</li>
  <li>After doing the steps to perform an action, I had to assert something. For example, using 
assertTrue(loginPage.isLoginErrorMessagePresent(),”There was no error logging in”). 
In general, it is good to check if the elements are present before working with them.
Also, we can validate that the url of the page is the correct using the driver.getCurrentUrl().contains() or 
.equals() methods.
</li>
 <li>This is an additional step added after a correction made by my mentor. I realized that using the pause() method
to pause the thread, is not a good approach. Instead, we have to use the element.waitUntilElementDisappear() method or to
create a FluentWait instance to wait for events to perform specific actions. Also, I had created getters for each
ExtendedWebElement but my mentor told me that we don't create such getters.So, I've already corrected these mistakes :).
</li>
</ol>

## What did I learn?

Completing this homework I've learnt how to perform basic automated web testings with the Carina framework, which
uses Selenium, TestNG and other framework under the hood. I've learnt about the Page Object pattern, how to apply it
correctly and the best practices. I really enjoyed this homework and I realized that Test Automation is something amazing.

## Technologies

- Java
- Carina Framework

## Set-Up

To run this project you will need at least the version 11 of Java.
First, clone this repository in a folder of your PC.
You have to put the following command in a terminal:

```bash
  git clone this-repo-url
```
You will need an IDE to open the project folder and also Maven, to download
all the necessary dependencies. Once you are with the project opened, you
can either run the whole tests' classes from the com.solvd.automation.api 
package by pressing the green play button at class level or each method with 
the @Test annotation separately by pressing that button but at method level.
    A quicker way consists in using Maven. You just have to execute the
following command on the project's folder:

```bash
  mvn clean test -Dsuite=web-github
```

## Author

- [@Nazareno Bucciarelli](https://github.com/nazabucciarelli)
