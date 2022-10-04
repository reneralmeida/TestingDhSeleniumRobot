*** Variables ***
${HOST}  https://pokeapi.co/api/v2

*** Keywords ***
Consulta de Pokemons
  Verificar name  bulbasaur
  Confere status code  200



Verificar name
  [Arguments]  ${NOME}
  Create Session  pokeapi  ${HOST}/pokemon-species/${NOME}
  ${RESPOSTA}=  GET On Session  pokeapi  ${HOST}/pokemon-species/${NOME}
  Set Test Variable   ${RESPOSTA}
  Set Test Variable   ${NOME}

Confere status code
  [Arguments]  ${STATUS}
  Should Be Equal As Strings  ${RESPOSTA.status_code}  ${STATUS}