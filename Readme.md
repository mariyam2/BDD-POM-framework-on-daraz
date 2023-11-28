Guidelines for Running this Project and configuration and 
Project Composition
Go to the Master Branch
Go to Terminal of the Project or gitbash and type in the following Command
git checkout master
Then follow the steps below.

1. Install all POM.xml file dependencies
2. Project consist of Three Sections
    - Feature Files
      - Contains all the tests into Gherkin Language(Given, When and Then)
      - \Automation_SELJAVA\src\test\java\Features
    - Step Definition
      - Contains the Glue code that works as a bridge for running the test
      - Automation_SELJAVA\src\test\java\StepDefinition
    - Pages Files
      - Contains all the elements and the methods. 
      - SmallWorld\src\test\java\Pages
4. To Run all the tests Go to Test Runner file and execute it. It will Run all in a sequence
5. To Execute tests in Allure Reports.
   Run the command "allure serve allure-results"
   
