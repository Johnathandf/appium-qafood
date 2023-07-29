
## Introdução

Este é um projeto de automação de testes que demonstra como realizar testes em aplicativos móveis usando Java, Appium e Cucumber, com o ambiente de desenvolvimento configurado no IntelliJ IDEA. O projeto foi projetado para executar cenários de teste automatizados em aplicativos móveis.  


## Pré-requisitos

Antes de executar o projeto de automação de testes, verifique se você possui os seguintes softwares instalados:

Java Development Kit (JDK): Versão 8 ou posterior.
IntelliJ IDEA: É recomendada a versão mais recente.
Appium: Instale e configure o Appium para interagir com dispositivos móveis.
Android SDK: Certifique-se de ter o Android SDK instalado e configurado.
Emulador Android ou Dispositivo Real: Tenha um emulador Android ou um dispositivo real conectado ao sistema para testes.
Configuração
Clone este repositório em sua máquina local.

Abra o IntelliJ IDEA e importe o projeto selecionando "Importar Projeto" e escolhendo o diretório do projeto.

Configure o SDK do projeto para usar o JDK 8 ou posterior:

Vá em "Arquivo" > "Estrutura do Projeto".
Em "SDK do Projeto", selecione a versão adequada do JDK.
Clique em "OK" para aplicar as alterações.
Instale as dependências necessárias:

Appium Java Client: Adicione a biblioteca Appium Java Client ao seu projeto. Você pode fazer isso adicionando a dependência ao arquivo pom.xml se estiver usando o Maven ou ao arquivo build.gradle se estiver usando o Gradle.
Configure a configuração do Appium:

Atualize o endereço do servidor Appium e as capacidades desejadas no código de teste ou use arquivos de configuração conforme necessário para se conectar ao seu dispositivo móvel.
Certifique-se de que o emulador Android ou o dispositivo real esteja conectado e configurado corretamente com os drivers necessários.  


## Executando os Testes

Para executar os testes automatizados usando o Cucumber, navegue até o pacote de testes (geralmente src/test/java) e localize a classe de execução do Cucumber.

Execute a classe de execução do Cucumber como um teste JUnit para iniciar a execução dos testes. Você verá o Appium interagindo com o dispositivo móvel especificado, e os cenários de teste serão executados com base nos arquivos de funcionalidades (feature) no diretório src/test/resources.

## Escrevendo Cenários de Teste
Para criar novos cenários de teste, adicione arquivos de funcionalidades (feature) ao diretório src/test/resources. Esses arquivos de funcionalidades devem definir o comportamento do aplicativo usando a sintaxe Gherkin.

Crie classes de definição de passos correspondentes no pacote de testes (geralmente src/test/java) para mapear os passos Gherkin para o código Java.  


## Relatórios
O Cucumber gera um relatório após cada execução de teste, facilitando a análise dos resultados dos testes. Por padrão, os relatórios estarão disponíveis no diretório target/cucumber-reports.  


## Notas Adicionais
Certifique-se de lidar com quaisquer problemas de sincronização ao interagir com elementos móveis.
Use asserções apropriadas para validar os resultados esperados em seus cenários de teste.
Garanta que você tenha as permissões necessárias e acesso ao aplicativo móvel em teste.  


## Contribuição
Se você encontrar problemas ou tiver sugestões de melhoria, sinta-se à vontade para criar um pull request ou abrir uma issue neste repositório.  


Feliz teste! 😊
