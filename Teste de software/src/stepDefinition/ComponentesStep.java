package stepDefinition;

import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;
import io.cucumber.stepexpression.StepExpression;
import util.Componentes;

public class ComponentesStep {

    Componentes componentes = new Componentes();

    @Dado("que o usuario acessou o arquivo Campo de treinamento")
    public void que_o_usuario_acessou_o_a_arquivo_Campo_de_treinamento(){
        componentes.inicializar();
    }

    //NOME
    @Quando("o usuario digitar seu nome")
    public void o_usuario_digitar_seu_nome(){
        componentes.testarNomeTextField();
    }
    @Entao("o resultado do campo nome sera seu nome")
    public void o_resultado_do_campo_sera_seu_nome(){
        componentes.validarNomeTextField();
    }

    //SOBRENOME
    @Quando("o usuario digitar seu sobrenome")
    public void o_usuario_digitar_seu_sobrenome(){
        componentes.testarSobrenomeTextField();
    }
    @Entao("o resultado do campo sobrenome sera seu sobrenome")
    public void o_resultado_do_campo_sera_seu_sobrenome(){
        componentes.validarSobrenomeTextField();
    }

    //SEXO
    @Quando("o usuario escolher seu sexo")
    public void o_usuario_escolher_seu_sexo(){
        componentes.testarSexoRadioButton();
    }
    @Entao("o elemento sexo ficara selecionado")
    public void o_elemento_sexo_ficara_selecionado(){
        componentes.validarSexoRadioButton();
    }

    //COMIDA PREFERIDA
    @Quando("o usuario escolher sua comida preferida")
    public void o_usuario_escolher_sua_comida_preferida(){
        componentes.testarComidaFavoritaRadioButton();
    }
    @Entao("a sua comida preferida ficara selecionada")
    public void a_sua_comida_preferida_ficara_selecionada(){
        componentes.validarComidaFavoritaRadioButton();
    }

    //ESCOLARIDADE
    @Quando("o usuario escolher sua escolaridade")
    public void o_usuario_escolher_sua_escolaridade(){
        componentes.testarEscolaridadeComboBox();
    }
    @Entao("a escolaridade devera ficar selecionada")
    public void a_escolaridade_devera_ficar_selecionada(){
        componentes.validarEscolaridadeComboBox();
    }

    //ESPORTE
    @Quando("o usuario escolher seu esporte")
    public void o_usuario_escolher_seu_esporte(){
        componentes.testarEsporteComboBoxMultiplo();
    }
    @Entao("o esporte ficara selecionado")
    public void o_esporte_ficara_selecionado(){
        componentes.validarEsporteComboBoxMultiplo();
    }

    //SUGESTAO
    @Quando("o usuario escrever uma sugestao")
    public void o_usuario_escrever_uma_sugestao(){
        componentes.testarSugestaoTextArea();
    }
    @Entao("a sugestao ficara salva")
    public void a_sugestao_ficara_salva(){
        componentes.validarSugestaoTextArea();
    }

    //CADASTRO
    @Quando("o usuario clicar no botao cadastrar")
    public void o_usuario_clicar_no_botao_cadastrar(){
        componentes.selecionarCadastrarBotao();
    }
    @Entao("as informacoes aparecerao no fim da pagina")
    public void as_informacoes_aparecerao_no_fim_da_pagina(){
        componentes.validarCadastrarBotao();
        componentes.fecharNavegador();
    }

    //ALERT
    @Quando("o usuario clicar no botao Alert")
    public void o_usuario_clicar_no_botao_alert(){
        componentes.clicarAlert();
    }
    @Entao("deve aparecer uma mensagem de alert simples")
    public void deve_aparecer_uma_mensagem_de_alert_simples(){
        componentes.verificarAlert();
    }
    @Quando("o usuario confirmar o alert")
    public void o_usuario_confirmar_o_alert(){
        componentes.fecharAlert();
    }
    @Entao("o alert sera fechado")
    public void o_alert_sera_fechado(){
        componentes.verificarAlertFechado();
    }

    //CONFIRM
    @Quando("o usuario clicar no botao Confirm")
    public void o_usuario_clicar_no_botao_confirm(){
        componentes.clicarConfirm();
    }
    @Entao("deve aparecer uma mensagem de confirm")
    public void deve_aparecer_uma_mensagem_de_confirm(){
        componentes.verificarConfirm();
    }
    @Quando("o usuario clicar no botao OK")
    public void o_usuario_clicar_no_botao_ok(){
        componentes.aceitar();
    }
    @Entao("ele ira para pagina de confirmacao")
    public void ele_ira_para_pagina_de_confirmacao(){
        componentes.verificarConfirmado();
    }
    @Quando("o usuario clicar em OK novamente")
    public void o_usuario_clicar_em_OK_novamente(){
        componentes.aceitar();
    }
    @Entao("ele voltara para pagina principal")
    public void ele_voltara_para_pagina_principal(){
        componentes.verificarAlertFechado();
    }

    //CONFIRM2
    @Quando("o usuario clicar em cancelar")
    public void o_usuario_clicar_em_cancelar(){
        componentes.clicarCancelar();
    }
    @Entao("ele ira receber a mensagem de negado")
    public void ele_ira_receber_a_mensagem_de_negado(){
        componentes.verificarCancelar();
    }
    @Quando("o usuario clicar em OK negado")
    public void o_usuario_clicar_em_OK_negado(){
        componentes.aceitar();
    }

    //PROMPT
    @Quando("o usuario clicar no botao Prompt")
    public void o_usuario_clicar_no_botao_prompt(){
        componentes.clicarPrompt();
    }
    @Entao("deve aparecer uma mensagem para colocar o numero")
    public void deve_aparecer_uma_mensagem_para_colocar_o_numero(){
        componentes.verificarPrompt();
    }



}

