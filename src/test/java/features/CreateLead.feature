@Babu
Feature: New Create Lead

@sanity
Scenario Outline: Cteate one new Lead with below values

Given Enter userName <username>
And Enter password <password>
And click Login
And click CRM/SFA
And click Leads
And click Create Lead Link
And Enter Company Name <company>
And Enter First Name <fname>
And Enter Last Name <lname>
And Click Create Lead Button
#And Verify First Name <fname>

Examples: 
|username|password|company|fname|lname|
|DemoSalesManager|crmsfa|TL|Babu|M|
#|Democsr|crmsfa|Qeagle|Gopi|J|











