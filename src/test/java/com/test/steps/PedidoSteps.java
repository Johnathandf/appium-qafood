package com.test.steps;

import com.test.Hooks;
import com.test.screen.*;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class PedidoSteps {

    ScreenHome home = new ScreenHome();
    ScreenRstaurante restaurante = new ScreenRstaurante();
    ScreenCarrinho cart = new ScreenCarrinho();
    Utils utils = new Utils();
    Hooks hooks = new Hooks();
    ScreenPagamento pagamento = new ScreenPagamento();
    ScreenPedido pedido = new ScreenPedido();

    @Dado("^eu adicione um produto no carrinho$")
    public void eu_adicione_um_produto_no_carrinho()  {
            home.SelectAddress.click();
            home.PoupUpPermitir.click();
            home.Restaurante.click();
            restaurante.AddItem.click();
            utils.scroll(0.8,0.2);
            restaurante.AddItemRefri.click();
            restaurante.IrAoCarrinho.click();
    }

    @Quando("^eu preencher as informações do pedido$")
    public void eu_clicar_em_confirmar_pedido()  {
            cart.botaoConfirmarPedido.click();
            hooks.ScollPlatform();
            pagamento.elementoDinheiro.click();
            pagamento.botaoFazerPedido.click();
    }

    @Então("^devo ser redirecionado para tela de confirmação de pedido$")
    public void devo_ser_redirecionado_para_tela_de_confirmação_de_pedido() {
            pedido.txtPedidoRealizado.isDisplayed();
    }

    @Quando("^acionar o botão limpar$")
    public void acionar_o_botão_limpar() {
            pedido.excluirProdutos.click();
            pedido.limparProdutos.click();

    }

    @Dado("^preencho o campo pesquisa com restaurante desejado$")
    public void preencho_o_campo_pesquisa_com_restaurante_desejado() {
            pedido.writeRestaurante();
            pedido.restaurante.isDisplayed();
            pedido.restaurante.click();
    }

    @Então("^valido a tela de confirmação$")
    public void valido_a_tela_de_confirmação() {
           pedido.nomeRestauranteDetalheCompra();
           pedido.totalCompra();
    }


    @Então("^o aplicativo exclui os produtos existentes na sacola$")
    public void o_aplicativo_exclui_os_produtos_existentes_na_sacola() {
            pedido.naoExisteProdutos.isDisplayed();
    }

}
