$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Travelcash.feature");
formatter.feature({
  "line": 1,
  "name": "Travelcash validation",
  "description": "",
  "id": "travelcash-validation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 20,
  "name": "Travelcash currency validation",
  "description": "",
  "id": "travelcash-validation;travelcash-currency-validation",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@TCTest"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "User is on the Travelcash page",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "currency is selected",
  "rows": [
    {
      "cells": [
        "Currency",
        "value"
      ],
      "line": 24
    },
    {
      "cells": [
        "$ Hong Kong Dollar",
        "10000"
      ],
      "line": 25
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "clicks on Order now for Travelcash",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "order Travelcash page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "TravelcashStep.user_is_on_the_Travelcash_page()"
});
formatter.result({
  "duration": 36772640300,
  "status": "passed"
});
formatter.match({
  "location": "TravelcashStep.currency_is_selected(DataTable)"
});
formatter.result({
  "duration": 4727101000,
  "status": "passed"
});
formatter.match({
  "location": "TravelcashStep.clicks_on_Order_now_for_Travelcash()"
});
formatter.result({
  "duration": 147702600,
  "status": "passed"
});
formatter.match({
  "location": "TravelcashStep.order_Travelcash_page_is_displayed()"
});
formatter.result({
  "duration": 5955158500,
  "status": "passed"
});
});