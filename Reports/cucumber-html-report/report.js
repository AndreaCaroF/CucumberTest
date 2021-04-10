$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/PruebaTuya.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author:"
    }
  ],
  "line": 3,
  "name": "",
  "description": "",
  "id": "",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@Prueba-tuya"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Scenario One for Advance and Buy",
  "description": "",
  "id": ";scenario-one-for-advance-and-buy",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@Avance"
    },
    {
      "line": 5,
      "name": "@Compra"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I succesfully load the page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I set the information for data type",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I select the option by simulation",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should be able to validate the data for the simulation",
  "keyword": "Then "
});
formatter.match({
  "location": "PruebaTuya.load_page()"
});
formatter.result({
  "duration": 11854448000,
  "status": "passed"
});
formatter.match({
  "location": "PruebaTuya.set_information()"
});
formatter.result({
  "duration": 1424055400,
  "status": "passed"
});
formatter.match({
  "location": "PruebaTuya.select_option()"
});
