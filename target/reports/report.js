$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("pedido.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 4,
  "name": "Realizar  Pedido No APP",
  "description": "Como um usuário registrado\nEu quero fazer pedido no aplicativo",
  "id": "realizar--pedido-no-app",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@pedido"
    }
  ]
});
formatter.before({
  "duration": 10236460292,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Pedido com sucesso",
  "description": "",
  "id": "realizar--pedido-no-app;pedido-com-sucesso",
  "type": "scenario",
  "keyword": "Cenário",
  "tags": [
    {
      "line": 9,
      "name": "@pedidoSuccess"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "que eu realizo login com sucesso",
  "keyword": "Dado "
});
formatter.step({
  "line": 12,
  "name": "eu adicione um produto no carrinho",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "eu preencher as informações do pedido",
  "keyword": "Quando "
});
formatter.step({
  "line": 14,
  "name": "devo ser redirecionado para tela de confirmação de pedido",
  "keyword": "Então "
});
formatter.match({
  "location": "LoginSteps.que_eu_realizo_login_com_sucesso()"
});
formatter.result({
  "duration": 7717997458,
  "status": "passed"
});
formatter.match({
  "location": "PedidoSteps.eu_adicione_um_produto_no_carrinho()"
});
formatter.result({
  "duration": 7244170834,
  "status": "passed"
});
formatter.match({
  "location": "PedidoSteps.eu_clicar_em_confirmar_pedido()"
});
formatter.result({
  "duration": 5456228334,
  "status": "passed"
});
formatter.match({
  "location": "PedidoSteps.devo_ser_redirecionado_para_tela_de_confirmação_de_pedido()"
});
formatter.result({
  "duration": 208585709,
  "status": "passed"
});
});