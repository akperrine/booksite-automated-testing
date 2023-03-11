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
        "ak",
        "Practice123",
        "The Simple Wild"
      ]
    }
  ],
  "tags": [
    {
      "name": "@one"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
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
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.scenario({
  "name": "Add to cart",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@one"
    }
  ]
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
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
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
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
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
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
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
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
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
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.scenario({
  "name": "Add to cart",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@one"
    }
  ]
});
formatter.step({
  "name": "user login into the application with \"ak\" \"Practice123\"",
  "keyword": "And "
});
formatter.match({
  "location": "AddToCartSteps.userLoginIntoTheApplicationWith(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
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
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
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
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
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
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});