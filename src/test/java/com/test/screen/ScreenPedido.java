package com.test.screen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.junit.Assert;

public class ScreenPedido extends BaseScreen {


    @AndroidFindBy(accessibility = "order-sucess-txt")
    @iOSXCUITFindBy(accessibility = "order-sucess-txt")
    public MobileElement txtPedidoRealizado;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Você não possui produtos no carrinho!\"]")
    @iOSXCUITFindBy(accessibility = "Você não possui produtos no carrinho!")
    public MobileElement naoExisteProdutos;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"back\"])[2]/android.widget.TextView")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"back\"])[2]")
    public MobileElement excluirProdutos;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(accessibility = "Limpar")
    public MobileElement limparProdutos;

    @AndroidFindBy(xpath = "//XCUIElementTypeTextField[@name=\"search-field\"")
    @iOSXCUITFindBy(xpath = ("//XCUIElementTypeTextField[@name=\"search-field\"]"))
    public MobileElement pesquisaRestaurante;

    @AndroidFindBy(xpath = "//XCUIElementTypeTextField[@name=\"search-field\"")
    @iOSXCUITFindBy(id = "store-list-item")
    public MobileElement restaurante;

    @AndroidFindBy(xpath = "//XCUIElementTypeTextField[@name=\"search-field\"")
    @iOSXCUITFindBy(id = "total-order")
    public MobileElement totalPagamento;

    @AndroidFindBy(xpath = "//XCUIElementTypeTextField[@name=\"search-field\"")
    @iOSXCUITFindBy(id = "store-title")
    public MobileElement nomeRestaurante;

    public void writeRestaurante() {
        pesquisaRestaurante.sendKeys("Sh");
    }

    public void totalCompra() {
        String expectedText = "total-order";
        String actualText = totalPagamento.getText();
        Assert.assertEquals(expectedText, actualText);
    }

    public void nomeRestauranteDetalheCompra() {
        String expectedText = "store-title";
        String actualText = nomeRestaurante.getText();
        Assert.assertEquals(expectedText, actualText);
    }
}
