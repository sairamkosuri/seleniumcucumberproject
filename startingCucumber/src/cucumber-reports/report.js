$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/skeleton/login.feature");
formatter.feature({
  "name": "login feature for demo webshop",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "valid login scenario",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "url for demowebshop \"http://demowebshop.tricentis.com/login\"",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters \"\u003cusername\u003e\" as username",
  "keyword": "When "
});
formatter.step({
  "name": "user enters \"\u003cpassword\u003e\" as password",
  "keyword": "And "
});
formatter.step({
  "name": "user is in webshop as \"\u003ctype\u003e\"",
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
        "type"
      ]
    },
    {
      "cells": [
        "askmail@email.com",
        "abc123",
        "admin"
      ]
    },
    {
      "cells": [
        "askmail@ymail.com",
        "abc123",
        "guest"
      ]
    },
    {
      "cells": [
        "askmail@gmail.com",
        "abc123",
        "vendor"
      ]
    }
  ]
});
formatter.scenario({
  "name": "valid login scenario",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "url for demowebshop \"http://demowebshop.tricentis.com/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "login.url_for_demowebshop(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters \"askmail@email.com\" as username",
  "keyword": "When "
});
formatter.match({
  "location": "login.user_enters_as_username(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters \"abc123\" as password",
  "keyword": "And "
});
formatter.match({
  "location": "login.user_enters_as_password(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user is in webshop as \"admin\"",
  "keyword": "Then "
});
formatter.match({
  "location": "login.user_is_in_webshop(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "valid login scenario",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "url for demowebshop \"http://demowebshop.tricentis.com/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "login.url_for_demowebshop(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters \"askmail@ymail.com\" as username",
  "keyword": "When "
});
formatter.match({
  "location": "login.user_enters_as_username(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters \"abc123\" as password",
  "keyword": "And "
});
formatter.match({
  "location": "login.user_enters_as_password(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user is in webshop as \"guest\"",
  "keyword": "Then "
});
formatter.match({
  "location": "login.user_is_in_webshop(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "valid login scenario",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "url for demowebshop \"http://demowebshop.tricentis.com/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "login.url_for_demowebshop(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters \"askmail@gmail.com\" as username",
  "keyword": "When "
});
formatter.match({
  "location": "login.user_enters_as_username(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters \"abc123\" as password",
  "keyword": "And "
});
formatter.match({
  "location": "login.user_enters_as_password(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user is in webshop as \"vendor\"",
  "keyword": "Then "
});
formatter.match({
  "location": "login.user_is_in_webshop(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Data Table Example",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Admin of the test me app enters",
  "rows": [
    {
      "cells": [
        "electronics",
        "head phones",
        "1"
      ]
    },
    {
      "cells": [
        "apparels",
        "sweat shirt",
        "2"
      ]
    },
    {
      "cells": [
        "electronics",
        "USB",
        "2"
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "login.admin_of_the_test_me_app_enters(DataTable)"
});
formatter.result({
  "status": "skipped"
});
});