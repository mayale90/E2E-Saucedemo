Feature: Purchase Flow page saucedemo

  Background:
    #Login
    Given standard_user user enter your credentials correctly in page saucedemo.com:
      | username      |  password     |
      | standard_user |  secret_sauce |

  @id:1 @purchaseDirect @happyPath
  Scenario Outline: Saucedemo Purchase flow test
  #Flujo de compra en página saucedemo sin acceder al detalle de productos

    When Add two product to cart
    And Check cart with added products
    And Complete the order form  <firstname> <lastname> <zipcode> to finalize purchase
    Then Display text <message>

    Examples:
      | firstname | lastname | zipcode | message                   |
      | Mayra     | Romero   | 091701  | Thank you for your order! |

  @id:2 @purchaseDetailProduct @happyPath
  Scenario Outline: Saucedemo Purchase flow by opening product detail test
  #Flujo de compra en página saucedemo, agregando al carrito desde la pantalla de detalle de producto

    When Add two product to cart by opening product detail
    And Check cart with added products
    And Complete the order form  <firstname> <lastname> <zipcode> to finalize purchase
    Then Display text <message>

    Examples:
      | firstname | lastname | zipcode | message                   |
      | Mayra     | Romero   | 091701  | Thank you for your order! |
