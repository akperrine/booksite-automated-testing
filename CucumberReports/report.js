$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/addToCart.feature");
formatter.feature({
  "name": "Bookcart Application tests",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Add to cart",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user login into the application with \"\u003cusername\u003e\" \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user searches for a book \"\u003cbook\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user adds the book to the cart",
  "keyword": "When "
});
formatter.step({
  "name": "the cart badge should get updated",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "book"
      ]
    },
    {
      "cells": [
        "akperrine",
        "Practice123",
        "Roomies"
      ]
    },
    {
      "cells": [
        "akperrine",
        "Practice123",
        "The Simple Wild"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User navigates to the BookCart application",
  "keyword": "Given "
});
formatter.match({
  "location": "AddToCartSteps.userNavigatesToTheBookCartApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add to cart",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user login into the application with \"akperrine\" \"Practice123\"",
  "keyword": "And "
});
formatter.match({
  "location": "AddToCartSteps.userLoginIntoTheApplicationWith(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user searches for a book \"Roomies\"",
  "keyword": "And "
});
formatter.match({
  "location": "AddToCartSteps.userSearchesForABook(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user adds the book to the cart",
  "keyword": "When "
});
formatter.match({
  "location": "AddToCartSteps.userAddsTheBookToTheCart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the cart badge should get updated",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToCartSteps.theCartBadgeShouldGetUpdated()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User navigates to the BookCart application",
  "keyword": "Given "
});
formatter.match({
  "location": "AddToCartSteps.userNavigatesToTheBookCartApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add to cart",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user login into the application with \"akperrine\" \"Practice123\"",
  "keyword": "And "
});
formatter.match({
  "location": "AddToCartSteps.userLoginIntoTheApplicationWith(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user searches for a book \"The Simple Wild\"",
  "keyword": "And "
});
formatter.match({
  "location": "AddToCartSteps.userSearchesForABook(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user adds the book to the cart",
  "keyword": "When "
});
formatter.match({
  "location": "AddToCartSteps.userAddsTheBookToTheCart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the cart badge should get updated",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToCartSteps.theCartBadgeShouldGetUpdated()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/java/features/login.feature");
formatter.feature({
  "name": "Bookcart Application Tests",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User navigates to the BookCart application login",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.userNavigatesToTheBookCartApplicationLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on the login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.userClickOnTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login should be success",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User enters the username as \"akperrine\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.userEntersTheUsernameAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the password as \"Practice1234\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.userEntersThePasswordAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the login button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.userClicksOnTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login should be success",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.loginShouldBeSuccess()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User navigates to the BookCart application login",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.userNavigatesToTheBookCartApplicationLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on the login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.userClickOnTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login should not be success",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User enters the username as \"ak\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.userEntersTheUsernameAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the password as \"123\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.userEntersThePasswordAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the login button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.userClicksOnTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login should fail",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.loginShouldFail()"
});
formatter.result({
  "status": "passed"
});
});