Feature: Coditas career Page feature

  Scenario: validating the coditas career functionality
    Given user navigate to url
    When user click on career button
    And user click on view all openings button
    And user click on Technology and Engineering link
    And  user click on one of the link
    And user click on Apply for this job button
    When user enters username, password and Experience and click on next button
    When user enter emailid, mobile no, location and click on next button
    When user enter company name, jobTitle, ctc, notice period, upload resume and click on submit button



