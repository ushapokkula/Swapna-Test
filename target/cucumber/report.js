$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cucumber-features/create_entry.feature");
formatter.feature({
  "line": 2,
  "name": "Create an Hotel entry",
  "description": "",
  "id": "create-an-hotel-entry",
  "keyword": "Feature"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I navigate to the site",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click \"Login\" button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I login as an admin to the site with \"admin\" and \"password\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 10,
  "name": "Verify the creation of single entry",
  "description": "",
  "id": "create-an-hotel-entry;verify-the-creation-of-single-entry",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "I enter \"hotel-a\" as hotel name",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I enter \"address-a\" as address",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter \"owner-a\" as ownner",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I enter \"phonenumber-a\" as phonenumber",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter \"test@test.com\" as email",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click Create button",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I see that the record is created",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I navigate to the site",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click \"Login\" button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I login as an admin to the site with \"admin\" and \"password\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 20,
  "name": "Verify the deletion of created hotel entry",
  "description": "",
  "id": "create-an-hotel-entry;verify-the-deletion-of-created-hotel-entry",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "I delete the entry",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I see that the record is deleted",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I navigate to the site",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click \"Login\" button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I login as an admin to the site with \"admin\" and \"password\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 24,
  "name": "Verify the multiple hotel entry creation",
  "description": "",
  "id": "create-an-hotel-entry;verify-the-multiple-hotel-entry-creation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "I enter multiple entry of hotel creation with following details",
  "rows": [
    {
      "cells": [
        "hotel_name",
        "address_name",
        "owner_name",
        "phone_number",
        "email"
      ],
      "line": 26
    },
    {
      "cells": [
        "Hotel-1",
        "Address-1",
        "Owner-1",
        "9999999999",
        "test1@test.com"
      ],
      "line": 27
    },
    {
      "cells": [
        "Hotel-2",
        "Address-2",
        "Owner-2",
        "8888888888",
        "test2@test.com"
      ],
      "line": 28
    },
    {
      "cells": [
        "Hotel-3",
        "Address-3",
        "Owner-3",
        "7777777777",
        "test3@test.com"
      ],
      "line": 29
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "I see that the three record are created",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});