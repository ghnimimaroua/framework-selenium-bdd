$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("authentification/Authentification.feature");
formatter.feature({
  "line": 2,
  "name": "Authentification - OrangeHRM",
  "description": "En tant que utilisateur je souhaite m\u0027authentifier",
  "id": "authentification---orangehrm",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@authentification"
    }
  ]
});
formatter.before({
  "duration": 7346055700,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Authentification - OrangeHRM",
  "description": "",
  "id": "authentification---orangehrm;authentification---orangehrm",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@authentification"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "J ouvre l application OrangeHrm",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Je saisie le login",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Je saisie le mot de passe",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Je clique sur le bouton login",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Je verifie le compte admin",
  "keyword": "Then "
});
formatter.match({
  "location": "AutentificationStepDefinition.jOuvreLApplicationOrangeHrm()"
});
formatter.result({
  "duration": 4266058800,
  "status": "passed"
});
formatter.match({
  "location": "AutentificationStepDefinition.jeSaisieLeLogin()"
});
formatter.result({
  "duration": 20500,
  "status": "passed"
});
formatter.match({
  "location": "AutentificationStepDefinition.jeSaisieLeMotDePasse()"
});
formatter.result({
  "duration": 24200,
  "status": "passed"
});
formatter.match({
  "location": "AutentificationStepDefinition.jeCliqueSurLeBoutonLogin()"
});
formatter.result({
  "duration": 98200,
  "status": "passed"
});
formatter.match({
  "location": "AutentificationStepDefinition.jeVerifieLeCompteAdmin()"
});
formatter.result({
  "duration": 29200,
  "status": "passed"
});
formatter.after({
  "duration": 2100725100,
  "status": "passed"
});
});