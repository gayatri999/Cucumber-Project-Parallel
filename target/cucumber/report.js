$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/Logfile.feature");
formatter.feature({
  "name": "Creating new Lead",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "create lead",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Launch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Logg.loginCL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "type userName as DemoSalesManager",
  "keyword": "And "
});
formatter.match({
  "location": "Logg.uname(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "type password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "Logg.pwd(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click SubmitButton",
  "keyword": "And "
});
formatter.match({
  "location": "Logg.submit()"
});
formatter.result({
  "status": "passed"
});
});