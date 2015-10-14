!--  srinivasa.kuncha@mailnewspapers.co.uk.mailonline.systemtest
!--  srinivasa.kuncha@mailnewspapers.co.uk.mail.systemtest

Scenario: 13. Sales Executive will be able to create an order with multiple packages

Meta:
@author Srinivasa Kuncha
@tags feature: OpportunityToOrder
@skip 
@ignored true

Given Sales Executive is on the Salesfoce Login Page
When  Sales Executive login to glue with valid credentials by supplying [username] and [password]
When  Sales Executive clicks on 'Accounts' Tab on glue Home page
And   Sales Executive search for an account on Account Search Screen using [searchAccountName]
And   Sales Executive clicks on 'NewAccount' button from search results section
And   Sales Executive selects record type as 'Advertiser' and clicks on 'Continue' button
When  Sales Executive supply input as required to create customer account:
|ElementName 	|ElementValue							|
|accountType	|Private Advertiser						|
|salutation		|Mr.									|
|firstname		|Srinivasa								|
|accountName	|Private Advertiser						|
|phoneNumber	|020 000000000							|
|billingStreet	|DMGT Street							|
|postCode		|BT60JH									|
And  Sales Executive clicks on 'Save' button
Then Sales Executive should be able to create new customer account successfully
When Sales Executive clicks on 'new Contact' button to create contact record for customer:
|ElementName 	|ElementValue							|
|firstName		|Srini									|
|lastName		|Test									|
|email			|srinivasa.kuncha@mailnewspapers.co.uk	|
Then Sales Executive should be able to create contact successfully
When Sales Executive integrates customer account with CCI
When Sales Executive clicks on 'Opportunity To Order' link to create Opportunity
And  Sales Executive supplies input data from CSV [file] to create Opportunity
Then Sales Executive should be able to create Opportunity successfully
When Sales Executive clicks on 'New Opportunity Line' button to create Opportunity line
And  Sales Executive supplies input data from CSV [file1] to create multiple Opportunity Line
Then Sales Executive should be able to create Opportunity Line successfully
When Sales Executive selects multiple packages to be converted as an Order
Then Sales Executive should be able to open Order plugin with Opportunity Line details successfully

Examples:
|username												|password		|searchAccountName	|file														|file1														|
|srinivasa.kuncha@mailnewspapers.co.uk.systest			|glue1234		|xyz123				|src\main\resources\OpportunityToOrderSingleLine.csv		|src\main\resources\OpportunityToOrderMultipackage.csv		|
