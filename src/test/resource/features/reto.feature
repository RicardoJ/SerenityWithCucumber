Feature: search in google accenture and sign in 


  Scenario: search accenture and sign in 
    Given Ricardo open the browser
    When I want search 'accenture' in google
    And i get in  to page of accenture
    And  get in to accenture page Sign in
    Then in the page is word 'Ingresar con e-mail y contraseña'
   

