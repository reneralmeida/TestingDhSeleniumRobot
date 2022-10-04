*** Variables ***
${SITE}     https://www.hurb.com/br
${NAVEGADOR}    Chrome
${BOTAO_COOKIES}  xpath=//*[@id="CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll"]
${BOTAO_PACOTES}  xpath=//*[@id="__next"]/div[1]/div[2]/div/div/div[1]/div/div/button[2]
${DESTINO}  Buenos Aires
${CAMPO_BUSCAR_DESTINO}  xpath=//*[@id="destination-input"]
${BOTA_PESQUISAR}  xpath=//*[@id="__next"]/div[1]/div[2]/div/div/div[2]/button
${RESULTADO}  xpath=//*[@id="__next"]/div/main/section/div[2]/a[1]/div[2]/div[1]/h3
${PACOTE_SELECIONADO}  xpath=//*[@id="__next"]/div/main/div[3]/aside/div/div/div[2]/button


*** Keywords ***
Dado que eu estou no site do Hurb
  Open Browser  ${SITE}  ${NAVEGADOR}
  Maximize Browser Window

Quando aceito os cookies do site
  Sleep  2
  Wait and Click  ${BOTAO_COOKIES}

E busco por um pacote de viagens para comprar Buenos Aires
  Wait and Click  ${BOTAO_PACOTES}
  Wait and Input Text  ${CAMPO_BUSCAR_DESTINO}  ${DESTINO}
  Wait and Click  ${BOTA_PESQUISAR}
  
E seleciono o primeiro resultado
  Wait and Click  ${RESULTADO}
  Switch Window  NEW
  Page Should Contain  Buenos Aires

Escolher pacote
  Wait and Click  ${PACOTE_SELECIONADO}

Wait and Click 
  [Arguments]  ${ELEMENTO}
  Wait Until Element is Visible  ${ELEMENTO}
  Wait Until Element is Enabled  ${ELEMENTO}
  Click Element  ${ELEMENTO}

Wait and Input Text
  [Arguments]  ${ELEMENTO}  ${TEXTO}
  Wait Until Element is Visible  ${ELEMENTO}
  Input Text  ${ELEMENTO}  ${TEXTO}
