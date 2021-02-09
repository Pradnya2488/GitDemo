$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/java/Features/Home.feature");
formatter.feature({
  "name": "Home Page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Validate Home Page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Test"
    }
  ]
});
formatter.step({
  "name": "Navigate to Home page \"\u003curl\u003e\" using \"\u003cbrowsername\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "I click Alert button",
  "keyword": "When "
});
formatter.step({
  "name": "Verify Alert window is displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "browsername",
        "url"
      ]
    },
    {
      "cells": [
        "CR",
        "https://www.rahulshettyacademy.com/AutomationPractice/"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validate Home Page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Test"
    }
  ]
});
formatter.step({
  "name": "Navigate to Home page \"https://www.rahulshettyacademy.com/AutomationPractice/\" using \"CR\"",
  "keyword": "Given "
});
formatter.match({
  "location": "HomeStepDefinition.open_page_and_navigate_to(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Alert button",
  "keyword": "When "
});
formatter.match({
  "location": "HomeStepDefinition.i_click_Alert_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Alert window is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeStepDefinition.verify_Alert_window_is_displayed()"
});
formatter.result({
  "status": "passed"
});
});