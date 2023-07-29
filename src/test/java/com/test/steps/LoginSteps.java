package com.test.steps;

import com.test.screen.ScreenHome;
import com.test.screen.ScreenLogin;
import com.test.screen.Utils;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class LoginSteps {

    ScreenLogin login = new ScreenLogin();
    ScreenHome home = new ScreenHome();
    Utils utils = new Utils();

    @Dado("^que eu estou na tela de login$")
    public void que_eu_estou_na_tela_de_login()  {
        login.btnLogin.isDisplayed();
    }

    @E("^eu preencheer meu nome de usuário e senha corretos$")
    public void eu_preencheer_meu_nome_de_usuário_e_senha_corretos()  {
        login.writeEmail();
        login.writePass();
    }

    @Quando("^clicar no logar$")
    public void clicar_no_logar()  {
        login.clickButtonEnter();
    }

    @Então("^devo ser redirecionado para home$")
    public void devo_ser_redirecionado_para_home()  {
        home.SelectAddress.isDisplayed();
    }

    @Dado("^que eu realizo login com sucesso$")
    public void que_eu_realizo_login_com_sucesso()  {
        login.writeEmail();
        login.writePass();
        login.clickButtonEnter();
        home.SelectAddress.isDisplayed();
    }

}