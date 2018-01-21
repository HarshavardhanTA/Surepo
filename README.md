Google's gmail Login page Automation

=================

An Implementation of Google's gmail Login page test case automation in Java using the PageObject pattern with Selenium WebDriver.
===============

Task:

Open site - https://www.google.co.uk/

Click on gmail link

On the login page, click on create an account

Fill in the details without filling in user name

Click on 'Next step'

Verify the error message prompting for the user name.




Building

--------

The application is built using Maven:


`mvn package`




Tests

-----

Like all good software applications, the source code has a suite of Unit Tests. These can be found in the src/test/java directory 
and can be run through maven:


`mvn test`
