@Babu
Feature: Duplicate Lead

@sanity
Scenario Outline:Duplicate an existing lead

Given Enter userName <username>
And Enter password <password>
And click Login
And click CRM/SFA
And click Leads
And click Find Link
And Enter Update Name Field <fname>
And click FindLead Button 
And Click on First Matching Link
And Click Duplicate Lead
And Click Submit
And Verify the First Name <fname>


Examples: 
|username|password|fname|fname|
|DemoSalesManager|crmsfa|Babu|Babu|
#|Democsr|crmsfa|Gopi|Gopi|











