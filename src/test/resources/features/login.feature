#language: pt

  @login
Funcionalidade: Login no aplicativo
  Como um usuário registrado
  Eu quero fazer login no aplicativo
  Para acessar meus recursos pessoais

  @LoginSuccess
  Cenário: Login bem-sucedido
    Dado que eu estou na tela de login
    Quando eu preencheer meu nome de usuário e senha corretos
    E clicar no logar
    Então devo ser redirecionado para home

  @LoginSuccess-2
  Cenário: Login bem-sucedido com usuário e senha
    Dado que eu realizo login com sucesso




