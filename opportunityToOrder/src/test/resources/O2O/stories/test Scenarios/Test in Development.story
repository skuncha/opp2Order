
Narrative:
In order to Create a Billing Agency Accounts
As a Sales Reprasentative
I want to login to SalesforceGlue and able to create a 'Billing Agency Account'

Scenario: Sales Executive will be able to create opportunityToOrder for a customer type Client

Meta:
@author Srinivasa Kuncha
@tags feature: OpportunityToOrder

Given Sales Executive is on the Salesfoce Login Page
When  Sales Executive login to glue with valid credentials by supplying [username] and [password]
When  Sales Executive clicks on 'Accounts' Tab on glue Home page
And   Sales Executive clicks on 'New' button
And   Sales Executive search for an account on Account Search Screen using [searchAccountName]
And   Sales Executive clicks on 'NewAccount' button from search results section
And   Sales Executive selects record type as 'Advertiser' and clicks on 'Continue' button
When  Sales Executive supply input as required to create customer account:
|ElementName 	|ElementValue							|
|accountType	|Client									|
|accountName	|RegressionTest 						|
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
When Sales Executive clicks on edit button to create Industry Category
And  Sales Executive supply input for [mainCategory], [subCategory] and [minorCategory]
And  Sales Executive clicks on Save button
When Sales Executive integrates customer account with CCI
And  Sales Executive clicks on a record under Account Mapping Tab
Then Sales Executive should see customer account mapping details returned from CCI when verified
When Sales Executive clicks on 'Opportunity To Order' link to create Opportunity
And  Sales Executive supplies input data from CSV [file] to create Opportunity
Then Sales Executive should be able to create Opportunity successfully
When Sales Executive clicks on 'New Opportunity Line' button to create Opportunity line
And  Sales Executive supplies input data from CSV [file] to create Opportunity Line
Then Sales Executive should be able to create Opportunity Line successfully
When Sales Executive selects 'Opportunity Line(s)' to be converted as an Order
Then Sales Executive should be able to open Order plugin with Opportunity Line details successfully

Examples:
|username												|password		|searchAccountName	|mainCategory	|subCategory			|minorCategory				|file											|
|srinivasa.kuncha@mailnewspapers.co.uk.mail.systemtest	|test1234		|xyz123				|30 - RETAIL	|30.04 - RETAIL GENERAL |30.04.00 - RETAIL GENERAL	|src\main\resources\OpportunityToOrder.csv		|

Scenario: Sales Executive will be able to create opportunityToOrder for a customer type Brand whose parent is Direct Advertiser 

Meta:
@author Srinivasa Kuncha
@tags feature: OpportunityToOrder

Given Sales Executive is on the Salesfoce Login Page
When  Sales Executive login to glue with valid credentials by supplying [username] and [password]
When  Sales Executive clicks on 'Accounts' Tab on glue Home page
And   Sales Executive clicks on 'New' button
And   Sales Executive search for an account on Account Search Screen using [searchAccountName]
And   Sales Executive clicks on 'NewAccount' button from search results section
And   Sales Executive selects record type as 'Advertiser' and clicks on 'Continue' button
When  Sales Executive supply input as required to create customer account:
|ElementName 	|ElementValue							|
|accountType	|Brand									|
|accountName	|RegressionTest 						|
|parentaccount	|Srini Test								|
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
When Sales Executive clicks on edit button to create Industry Category
And  Sales Executive supply input for [mainCategory], [subCategory] and [minorCategory]
And  Sales Executive clicks on Save button
When Sales Executive integrates customer account with CCI
And  Sales Executive clicks on a record under Account Mapping Tab
Then Sales Executive should see customer account mapping details returned from CCI when verified
When Sales Executive clicks on 'Opportunity To Order' link to create Opportunity
And  Sales Executive supplies input data from CSV [file] to create Opportunity
Then Sales Executive should be able to create Opportunity successfully
When Sales Executive clicks on 'New Opportunity Line' button to create Opportunity line
And  Sales Executive supplies input data from CSV [file] to create Opportunity Line
Then Sales Executive should be able to create Opportunity Line successfully
When Sales Executive selects 'Opportunity Line(s)' to be converted as an Order
Then Sales Executive should be able to open Order plugin with Opportunity Line details successfully

Examples:
|username												|password		|searchAccountName	|mainCategory	|subCategory			|minorCategory				|file											|
|srinivasa.kuncha@mailnewspapers.co.uk.mail.systemtest	|test1234		|xyz123				|30 - RETAIL	|30.04 - RETAIL GENERAL |30.04.00 - RETAIL GENERAL	|src\main\resources\OpportunityToOrder.csv		|

Scenario: Sales Executive will be able to create opportunityToOrder for a brand new customer (Charity)

Meta:
@author Srinivasa Kuncha
@tags feature: OpportunityToOrder

Given Sales Executive is on the Salesfoce Login Page
When  Sales Executive login to glue with valid credentials by supplying [username] and [password]
When  Sales Executive clicks on 'Accounts' Tab on glue Home page
And   Sales Executive clicks on 'New' button
And   Sales Executive search for an account on Account Search Screen using [searchAccountName]
And   Sales Executive clicks on 'NewAccount' button from search results section
And   Sales Executive selects record type as 'Advertiser' and clicks on 'Continue' button
When  Sales Executive supply input as required to create customer account:
|ElementName 	|ElementValue							|
|accountType	|Charity								|
|accountName	|RegressionTest 						|
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
When Sales Executive clicks on edit button to create Industry Category
And  Sales Executive supply input for [mainCategory], [subCategory] and [minorCategory]
And  Sales Executive clicks on Save button
When Sales Executive integrates customer account with CCI
And  Sales Executive clicks on a record under Account Mapping Tab
Then Sales Executive should see customer account mapping details returned from CCI when verified
When Sales Executive clicks on a record under Finance Account Tab
Then Sales Executive should see finance account details
When Sales Executive clicks on 'Opportunity To Order' link to create Opportunity
And  Sales Executive supplies input data from CSV [file] to create Opportunity
Then Sales Executive should be able to create Opportunity successfully
When Sales Executive clicks on 'New Opportunity Line' button to create Opportunity line
And  Sales Executive supplies input data from CSV [file] to create Opportunity Line
Then Sales Executive should be able to create Opportunity Line successfully
When Sales Executive selects 'Opportunity Line(s)' to be converted as an Order
Then Sales Executive should be able to open Order plugin with Opportunity Line details successfully

Examples:
|username										|password		|searchAccountName	|mainCategory	|subCategory			|minorCategory				|file											|
|srinivasa.kuncha@mailnewspapers.co.uk.mail.systemtest	|test1234		|xyz123				|30 - RETAIL	|30.04 - RETAIL GENERAL |30.04.00 - RETAIL GENERAL	|src\main\resources\OpportunityToOrder.csv		|

Scenario: Sales Executive will be able to create opportunityToOrder for a brand new customer (Direct Advertiser)

Meta:
@author Srinivasa Kuncha
@tags feature: OpportunityToOrder

Given Sales Executive is on the Salesfoce Login Page
When  Sales Executive login to glue with valid credentials by supplying [username] and [password]
When  Sales Executive clicks on 'Accounts' Tab on glue Home page
And   Sales Executive clicks on 'New' button
And   Sales Executive search for an account on Account Search Screen using [searchAccountName]
And   Sales Executive clicks on 'NewAccount' button from search results section
And   Sales Executive selects record type as 'Advertiser' and clicks on 'Continue' button
When  Sales Executive supply input as required to create customer account:
|ElementName 	|ElementValue							|
|accountType	|Direct Advertiser						|
|accountName	|RegressionTest 						|
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
When Sales Executive clicks on edit button to create Industry Category
And  Sales Executive supply input for [mainCategory], [subCategory] and [minorCategory]
And  Sales Executive clicks on Save button
When Sales Executive integrates customer account with CCI
And  Sales Executive clicks on a record under Account Mapping Tab
Then Sales Executive should see customer account mapping details returned from CCI when verified
When Sales Executive clicks on a record under Finance Account Tab
Then Sales Executive should see finance account details
When Sales Executive clicks on 'Opportunity To Order' link to create Opportunity
And  Sales Executive supplies input data from CSV [file] to create Opportunity
Then Sales Executive should be able to create Opportunity successfully
When Sales Executive clicks on 'New Opportunity Line' button to create Opportunity line
And  Sales Executive supplies input data from CSV [file] to create Opportunity Line
Then Sales Executive should be able to create Opportunity Line successfully
When Sales Executive selects 'Opportunity Line(s)' to be converted as an Order
Then Sales Executive should be able to open Order plugin with Opportunity Line details successfully

Examples:
|username												|password		|searchAccountName	|mainCategory	|subCategory			|minorCategory				|file											|
|srinivasa.kuncha@mailnewspapers.co.uk.mail.systemtest	|test1234		|xyz123				|30 - RETAIL	|30.04 - RETAIL GENERAL |30.04.00 - RETAIL GENERAL	|src\main\resources\OpportunityToOrder.csv		|

Scenario: Sales Executive will be able to create opportunityToOrder for a brand new customer (Private Advertiser)

Meta:
@skip
@author Srinivasa Kuncha
@tags feature: OpportunityToOrder

Given Sales Executive is on the Salesfoce Login Page
When  Sales Executive login to glue with valid credentials by supplying [username] and [password]
When  Sales Executive clicks on 'Accounts' Tab on glue Home page
And   Sales Executive clicks on 'New' button
And   Sales Executive search for an account on Account Search Screen using [searchAccountName]
And   Sales Executive clicks on 'NewAccount' button from search results section
And   Sales Executive selects record type as 'Advertiser' and clicks on 'Continue' button
When  Sales Executive supply input as required to create customer account:
|ElementName 	|ElementValue							|
|accountType	|Private Advertiser						|
|salutation		|Mr.									|
|firstname		|Srinivasa								|
|accountName	|RegressionTest 						|
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
And  Sales Executive clicks on a record under Account Mapping Tab
Then Sales Executive should see customer account mapping details returned from CCI when verified
When Sales Executive clicks on a record under Finance Account Tab
Then Sales Executive should see finance account details
When Sales Executive clicks on 'Opportunity To Order' link to create Opportunity
And  Sales Executive supplies input data from CSV [file] to create Opportunity
Then Sales Executive should be able to create Opportunity successfully
When Sales Executive clicks on 'New Opportunity Line' button to create Opportunity line
And  Sales Executive supplies input data from CSV [file] to create Opportunity Line
Then Sales Executive should be able to create Opportunity Line successfully
When Sales Executive selects 'Opportunity Line(s)' to be converted as an Order
Then Sales Executive should be able to open Order plugin with Opportunity Line details successfully

Examples:
|username												|password		|searchAccountName	|mainCategory	|subCategory			|minorCategory				|file											|
|srinivasa.kuncha@mailnewspapers.co.uk.mail.systemtest	|test1234		|xyz123				|30 - RETAIL	|30.04 - RETAIL GENERAL |30.04.00 - RETAIL GENERAL	|src\main\resources\OpportunityToOrder.csv		|

Scenario: Sales Executive will be able to create opportunityToOrder for a customer type Client

Meta:
@author Srinivasa Kuncha
@tags feature: OpportunityToOrder

Given Sales Executive is on the Salesfoce Login Page
When  Sales Executive login to glue with valid credentials by supplying [username] and [password]
When  Sales Executive clicks on 'Accounts' Tab on glue Home page
And   Sales Executive clicks on 'New' button
And   Sales Executive search for an account on Account Search Screen using [searchAccountName]
And   Sales Executive clicks on 'NewAccount' button from search results section
And   Sales Executive selects record type as 'Advertiser' and clicks on 'Continue' button
When  Sales Executive supply input as required to create customer account:
|ElementName 	|ElementValue							|
|accountType	|Client									|
|accountName	|RegressionTest 						|
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
When Sales Executive clicks on edit button to create Industry Category
And  Sales Executive supply input for [mainCategory], [subCategory] and [minorCategory]
And  Sales Executive clicks on Save button
When Sales Executive integrates customer account with CCI
And  Sales Executive clicks on a record under Account Mapping Tab
Then Sales Executive should see customer account mapping details returned from CCI when verified
When Sales Executive clicks on 'Opportunity To Order' link to create Opportunity
And  Sales Executive supplies input data from CSV [file] to create Opportunity
Then Sales Executive should be able to create Opportunity successfully
When Sales Executive clicks on 'New Opportunity Line' button to create Opportunity line
And  Sales Executive supplies input data from CSV [file] to create Opportunity Line
Then Sales Executive should be able to create Opportunity Line successfully
When Sales Executive selects 'Opportunity Line(s)' to be converted as an Order
Then Sales Executive should be able to open Order plugin with Opportunity Line details successfully

Examples:
|username												|password		|searchAccountName	|mainCategory	|subCategory			|minorCategory				|file											|
|srinivasa.kuncha@mailnewspapers.co.uk.mail.systemtest	|test1234		|xyz123				|30 - RETAIL	|30.04 - RETAIL GENERAL |30.04.00 - RETAIL GENERAL	|src\main\resources\OpportunityToOrder.csv		|

Scenario: Sales Executive will be able to create opportunityToOrder for a customer type Brand whose parent is Client 

Meta:
@skip
@author Srinivasa Kuncha
@tags feature: OpportunityToOrder

Given Sales Executive is on the Salesfoce Login Page
When  Sales Executive login to glue with valid credentials by supplying [username] and [password]
When  Sales Executive clicks on 'Accounts' Tab on glue Home page
And   Sales Executive clicks on 'New' button
And   Sales Executive search for an account on Account Search Screen using [searchAccountName]
And   Sales Executive clicks on 'NewAccount' button from search results section
And   Sales Executive selects record type as 'Advertiser' and clicks on 'Continue' button
When  Sales Executive supply input as required to create customer account:
|ElementName 	|ElementValue							|
|accountType	|Brand									|
|accountName	|RegressionTest 						|
|parentaccount	|1430130968665 RegressionTest			|
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
When Sales Executive clicks on edit button to create Industry Category
And  Sales Executive supply input for [mainCategory], [subCategory] and [minorCategory]
And  Sales Executive clicks on Save button
When Sales Executive integrates customer account with CCI
And  Sales Executive clicks on a record under Account Mapping Tab
Then Sales Executive should see customer account mapping details returned from CCI when verified
When Sales Executive clicks on 'Opportunity To Order' link to create Opportunity
And  Sales Executive supplies input data from CSV [file] to create Opportunity
Then Sales Executive should be able to create Opportunity successfully
When Sales Executive clicks on 'New Opportunity Line' button to create Opportunity line
And  Sales Executive supplies input data from CSV [file] to create Opportunity Line
Then Sales Executive should be able to create Opportunity Line successfully
When Sales Executive selects 'Opportunity Line(s)' to be converted as an Order
Then Sales Executive should be able to open Order plugin with Opportunity Line details successfully

Examples:
|username												|password		|searchAccountName	|mainCategory	|subCategory			|minorCategory				|file											|
|srinivasa.kuncha@mailnewspapers.co.uk.mail.systemtest	|test1234		|xyz123				|30 - RETAIL	|30.04 - RETAIL GENERAL |30.04.00 - RETAIL GENERAL	|src\main\resources\OpportunityToOrder.csv		|

