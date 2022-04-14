Ferramentas 

Intellij
Git
Git Desktop
Java Atual (Usando 18)
Maven


Ir em meu computador, Clicar em "Propriedades" e "Configurações Avançadas do Sistema", com a janela aberta clicar em "Variaveis de Ambiente".

JAVA_HOME - Inserir o caminho da pasta
M2_HOME - Inserir o caminho da pasta
ANDROID_HOME - Inserir o caminho da pasta

Path

%JAVA_HOME%\bin
%M2_HOME%\bin
%ANDROID_HOME%\tools
%ANDROID_HOME%\platform-tools

Configuração Intellij

File/Settings/Build Execution,Deployment/Build Tools/Maven/Importing

Clicar em Sources - Documentation - Annotations

File/Project Structure/Project ** Alterar para o SDK que está usando (Ex.: Java 18) ** /Modules ** Alterar Language para a que está usando (Ex.: 18)**

Baixar os drivers dos navegadores de acordo com a versão do navegador (chromedriver para Chrome e geckodriver para Firefox).
Colar o pom.xml no projeto, alterar o nome do projeto para o que foi criado em "artifactId" e o site em "groupId".
Colar os metodos e a classe executa, depois apenas inspecionar os elementos, escrever os casos de teste no cucumber e implementar os testes em steps/Testes.

Os testes podem ser rodados por linha de comando, pelo CMD e pelo Git Bash, entrando dentro da pasta do projeto e escrevendo "mvn clean install".
