#language: pt

@pedido
Funcionalidade: Realizar  Pedido No APP
  Como um usuário registrado
  Eu quero fazer pedido no aplicativo


  @pedidoSuccess
  Cenário: Pedido com sucesso
    Dado que eu realizo login com sucesso
    E eu adicione um produto no carrinho
    Quando eu preencher as informações do pedido
    Então devo ser redirecionado para tela de confirmação de pedido

  @pedidoTwoItens
  Cenário: Pedido com sucesso dois itens
    Dado que eu realizo login com sucesso
    E eu adicione um produto no carrinho
    Quando eu preencher as informações do pedido
    Então devo ser redirecionado para tela de confirmação de pedido


  @limparSacola
  Cenário: Limpar produtos da sacola
    Dado que eu realizo login com sucesso
    E eu adicione um produto no carrinho
    Quando acionar o botão limpar
    Então o aplicativo exclui os produtos existentes na sacola

  @pesquisaSuccess
  Cenário: Pesquisar restaurante e fazer pedido
    Dado que eu realizo login com sucesso
    E preencho o campo pesquisa com restaurante desejado
    E eu adicione um produto no carrinho
    Quando eu preencher as informações do pedido
    Então devo ser redirecionado para tela de confirmação de pedido
    E valido a tela de confirmação

