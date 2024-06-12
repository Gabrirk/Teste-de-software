package util;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Componentes {

    private WebDriver driver;
    private Select combo;
    private WebElement botao;


    public void inicializar(){
        String chromeDriver = System.getProperty("user.dir") + "/drivers/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("file:///" + System.getProperty("user.dir") + "/resource/componentes.html");
    }

    public void fecharNavegador(){
        driver.quit();
    }

    //TESTAR NOME
    public void testarNomeTextField(){
        driver.findElement(By.id("elementosForm:nome")).sendKeys("nome");
    }
    public void validarNomeTextField(){
        Assert.assertEquals("nome", driver.findElement(By.id("elementosForm:nome")).getAttribute("value"));
    }

    //TESTAR SOBRENOME
    public void testarSobrenomeTextField(){
        driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("sobrenome");
    }
    public void validarSobrenomeTextField(){
        Assert.assertEquals("sobrenome", driver.findElement(By.id("elementosForm:sobrenome")).getAttribute("value"));
    }

    //TESTAR SEXO
    public void testarSexoRadioButton(){
        driver.findElement(By.id("elementosForm:sexo:1")).click();
    }
    public void validarSexoRadioButton(){
        Assert.assertTrue(driver.findElement(By.id("elementosForm:sexo:1")).isSelected());
    }

    //TESTAR COMIDA PREFERIDA
    public void testarComidaFavoritaRadioButton(){
        driver.findElement(By.id("elementosForm:comidaFavorita:0")).click();
    }
    public void validarComidaFavoritaRadioButton(){
        Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:0")).isSelected());
    }

    //TESTAR ESCOLARIDADE
    public void testarEscolaridadeComboBox(){
        WebElement elemento = driver.findElement(By.id("elementosForm:escolaridade"));
        combo = new Select(elemento);
        combo.selectByIndex(5);
    }
    public void validarEscolaridadeComboBox(){
        Assert.assertEquals("Especializacao", combo.getFirstSelectedOption().getText());
    }

    //TESTAR ESPORTE
    public void testarEsporteComboBoxMultiplo(){
        WebElement elemento = driver.findElement(By.id("elementosForm:esportes"));
        combo = new Select(elemento);
        combo.selectByVisibleText("O que eh esporte?");
    }
    public void validarEsporteComboBoxMultiplo(){
        List<WebElement> allSelectOptions = combo.getAllSelectedOptions();
        Assert.assertEquals(1,allSelectOptions.size());
    }

    //TESTAR SUGESTAO
    public void testarSugestaoTextArea(){
        driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("sugestoes");
    }
    public void validarSugestaoTextArea(){
        Assert.assertEquals("sugestoes", driver.findElement(By.id("elementosForm:sugestoes")).getAttribute("value"));
    }

    //TESTAR CADASTRO
    public void selecionarCadastrarBotao(){
        botao = driver.findElement(By.id("elementosForm:cadastrar"));
        botao.click();
    }
    public void validarCadastrarBotao(){
        WebElement mensagemConfirmacao = driver.findElement(By.id("resultado"));
        Assert.assertTrue(mensagemConfirmacao.isDisplayed());

        Assert.assertEquals("Cadastrado!", mensagemConfirmacao.findElement(By.tagName("span")).getText());

        Assert.assertEquals("Nome: nome", mensagemConfirmacao.findElement(By.id("descNome")).getText());
        Assert.assertEquals("Sobrenome: sobrenome", mensagemConfirmacao.findElement(By.id("descSobrenome")).getText());
        Assert.assertEquals("Sexo: Feminino", mensagemConfirmacao.findElement(By.id("descSexo")).getText());
        Assert.assertEquals("Comida: Carne", mensagemConfirmacao.findElement(By.id("descComida")).getText());
        Assert.assertEquals("Escolaridade: especializacao", mensagemConfirmacao.findElement(By.id("descEscolaridade")).getText());
        Assert.assertEquals("Esportes: O que eh esporte?", mensagemConfirmacao.findElement(By.id("descEsportes")).getText());
        Assert.assertEquals("Sugestoes: sugestoes", mensagemConfirmacao.findElement(By.id("descSugestoes")).getText());
    }

    //TESTAR ALERT
    public void clicarAlert(){
        botao = driver.findElement(By.id("alert"));
        botao.click();
    }
    public void verificarAlert(){
        Alert alert = driver.switchTo().alert();
        String alertMensagem = alert.getText();
        Assert.assertEquals("Alert Simples", alertMensagem);
    }
    public void fecharAlert(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public boolean verificarAlertFechado() {
        try {
            Alert alert = driver.switchTo().alert();
            return false;
        } catch (NoAlertPresentException e) {
            return true;
        }
    }

    //TESTAR CONFIRM
    public void clicarConfirm(){
        botao = driver.findElement(By.id("confirm"));
        botao.click();
    }
    public void verificarConfirm(){
        Alert alert = driver.switchTo().alert();
        String alertMensagem = alert.getText();
        Assert.assertEquals("Confirm Simples", alertMensagem);
    }
    public void aceitar(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void verificarConfirmado(){
        Alert alert = driver.switchTo().alert();
        String alertMensagem = alert.getText();
        Assert.assertEquals("Confirmado", alertMensagem);
    }

    //TESTAR CONFIRMAR 2

    public void clicarCancelar(){
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }
    public void verificarCancelar(){
        Alert alert = driver.switchTo().alert();
        String alertMensagem = alert.getText();
        Assert.assertEquals("Negado", alertMensagem);
    }


    //TESTAR PROMPT
    public void clicarPrompt(){
        botao = driver.findElement(By.id("prompt"));
        botao.click();
    }
    public void verificarPrompt(){
        Alert alert = driver.switchTo().alert();
        String alertMensagem = alert.getText();
        Assert.assertEquals("Digite um numero", alertMensagem);
    }


}

