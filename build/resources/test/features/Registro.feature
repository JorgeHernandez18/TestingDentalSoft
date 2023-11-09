Feature: Save patient

  @Register
  Scenario: Save patient success
    Given that admin open dentalsoft page and login
    When user click  on  add patient
    And register the patient information and click on add patient
    Then admin can read the success message