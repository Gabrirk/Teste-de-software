#language:pt
@acessar_varios_componentes_html
Funcionalidade: Acessar varios componentes html

  Contexto:
    Dado que o usuario acessou o arquivo Campo de treinamento

  @validar_todos_os_componentes
  Cenario: validar todos os componentes
    Quando o usuario digitar seu nome
    Entao o resultado do campo nome sera seu nome
    Quando o usuario digitar seu sobrenome
    Entao o resultado do campo sobrenome sera seu sobrenome
    Quando o usuario escolher seu sexo
    Entao o elemento sexo ficara selecionado
    Quando o usuario escolher sua comida preferida
    Entao a sua comida preferida ficara selecionada
    Quando o usuario escolher sua escolaridade
    Entao a escolaridade devera ficar selecionada
    Quando o usuario escolher seu esporte
    Entao o esporte ficara selecionado
    Quando o usuario escrever uma sugestao
    Entao a sugestao ficara salva
    Quando o usuario clicar no botao cadastrar
    Entao as informacoes aparecerao no fim da pagina

  @interagir_alert
  Cenario: validar alert
    Quando o usuario clicar no botao Alert
    Entao deve aparecer uma mensagem de alert simples
    Quando o usuario confirmar o alert
    Entao o alert sera fechado

  @interagir_confirm
  Cenario: validar confirm
    Quando o usuario clicar no botao Confirm
    Entao deve aparecer uma mensagem de confirm
    Quando o usuario clicar no botao OK
    Entao ele ira para pagina de confirmacao
    Quando o usuario clicar em OK novamente
    Entao ele voltara para pagina principal

  @interagir_confirm_2
  Cenario: validar confirm 2
    Quando o usuario clicar no botao Confirm
    Entao deve aparecer uma mensagem de confirm
    Quando o usuario clicar em cancelar
    Entao ele ira receber a mensagem de negado
    Quando o usuario clicar em OK negado
    Entao ele voltara para pagina principal

  @interagir_prompt
  Cenario: validar prompt
    Quando o usuario clicar no botao Prompt
    Entao deve aparecer uma mensagem para colocar o numero
    Quando o usuario digitar o numero e clicar ok
    Entao deve aparecer uma mensagem com o numero informado


