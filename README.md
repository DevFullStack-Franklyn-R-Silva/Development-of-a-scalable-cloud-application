# Desenvolvimento de uma aplicação em nuvem escalável

### O que precisa para rodar o projeto:

- Java 11+ [Clique aqui](https://www.oracle.com/java/technologies/javase/jdk19-archive-downloads.html)
- Maven 3.9.0+ [Clique aqui](https://maven.apache.org/download.cgi) 
- Colocar as variáveis de ambiente do JAVA e MAVEN [Clique aqui](https://www.jdevtreinamento.com.br/variaveis-de-ambiente-configuracao/#:~:text=No%20menu%20%C3%A0%20esquerda%20clique,em%20%5BVARI%C3%81VEIS%20DE%20AMBIENTE%5D.)
- MySQL server Community [Clique aqui](https://dev.mysql.com/downloads/mysql/)
- MySQL Workbench [Clique aqui](https://dev.mysql.com/downloads/workbench/) ou HeidiSQL [Clique aqui](https://www.heidisql.com/download.php)
- Spring Tools 4 [Clique aqui](https://spring.io/blog/2021/06/21/spring-tools-4-11-0-released)
- Docker [Clique aqui](https://www.docker.com/)

### Como funciona o projeto:
##### greeting-service
Inicialmente, nesta pasta ***_"greeting-service"_***, ela trabalhar com configurações personalizadas em Spring Boot usando YAML e a anotação @ConfigurationProperties.

`(A anotação @ConfigurationProperties é usada em Java para vincular propriedades de configuração definidas em arquivos de configuração externos a classes Java. Essa anotação permite que você injete propriedades de configuração em uma classe e use essas propriedades como atributos dessa classe.
Por exemplo, se você tiver um arquivo de configuração YAML que defina a propriedade greeting.message como "Hello", pode usar a anotação @ConfigurationProperties para vincular essa propriedade a uma classe Java. A classe Java deve ter um atributo correspondente à propriedade greeting.message e a anotação @ConfigurationProperties deve ser adicionada a essa classe com o valor "greeting" especificado como o prefixo da propriedade.
Em resumo, a anotação @ConfigurationProperties é usada para ler propriedades de configuração de arquivos externos e mapeá-las em atributos de classe em Java, tornando a configuração de aplicativos mais fácil e flexível.`

##### config-server
Na pasta ***_"config-server"_*** aqui é configurado um servidor próprio e personalizado, acessando as propriedades no github desse repositorio. [clique aqui](https://github.com/hadesfranklyn/config-server-spring-cloud)
