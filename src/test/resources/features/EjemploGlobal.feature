Feature: Perform the sale of a raffle with an existing user in the application
  by logging into the sales application.

  @Scenariosaleraffecorrect
  Scenario: User go for the raffle sales application
    When User enters the correct values of to make the raffle
    Then User add 3 unit of Respirator Mask N95 to car

    @ScenarioDos
    Scenario Outline: User enters the rif sales app
      When User introduce the corr values of to make the raffle
        | <tipoRifa> | <cantidad>|
      Then User con the successful transaction message



      Examples:
        | tipoRifa | cantidad|
        | tapabocas N95 |  100 |
