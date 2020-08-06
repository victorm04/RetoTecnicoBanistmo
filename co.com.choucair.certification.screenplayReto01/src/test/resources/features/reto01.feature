@stories
Feature: Banistmo's tarifario
  As a potential client I want to see the deposit rate pdf

  @scenario1
  Scenario: Validate tarifario pdf
    Given than Victor visit the banistmo website
    When he go to the tarifarios section
    And he select the deposit pdf
    Then he verify that the pdf is the correct one