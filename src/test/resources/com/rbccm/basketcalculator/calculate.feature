Feature: Calculate total basket cost

    Scenario: a basket containing one of each fruit
        Given the following basket
          | BANANA  | 1        |
          | ORANGE  | 1        |
          | APPLE   | 1        |
          | LEMON   | 1        |
          | PEACH   | 1        |
        Then the total cost should be 18 pence

    Scenario: a basket containing two of each fruit
        Given the following basket
          | BANANA  | 2        |
          | ORANGE  | 2        |
          | APPLE   | 2        |
          | LEMON   | 2        |
          | PEACH   | 2        |
        Then the total cost should be 36 pence

    Scenario: a basket containing a banana
        Given the following basket
          | BANANA  | 1        |
        Then the total cost should be 1 pence

    Scenario: a basket containing an orange
        Given the following basket
          | ORANGE  | 1        |
        Then the total cost should be 2 pence

    Scenario: a basket containing an apple
        Given the following basket
          | APPLE   | 1        |
        Then the total cost should be 3 pence

    Scenario: a basket containing a lemon
        Given the following basket
          | LEMON   | 1        |
        Then the total cost should be 5 pence

    Scenario: a basket containing a peach
        Given the following basket
          | PEACH   | 1        |
        Then the total cost should be 7 pence
