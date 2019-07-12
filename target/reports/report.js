$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Search_sel.feature");
formatter.feature({
  "line": 1,
  "name": "Search the cart",
  "description": "",
  "id": "search-the-cart",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Search the cart for vegetables",
  "description": "",
  "id": "search-the-cart;search-the-cart-for-vegetables",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Selenium,"
    },
    {
      "line": 3,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "the user is on landing the page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user searched for Cucumber",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "\"Cucumber\" results are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Search.the_user_is_on_landing_the_page()"
});
formatter.result({
  "duration": 9978323024,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cucumber",
      "offset": 18
    }
  ],
  "location": "Search.user_searched_for(String)"
});
formatter.result({
  "duration": 2438989709,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cucumber",
      "offset": 1
    }
  ],
  "location": "Search.results_are_displayed(String)"
});
formatter.result({
  "duration": 2047870123,
  "status": "passed"
});
formatter.after({
  "duration": 118409684,
  "status": "passed"
});
});