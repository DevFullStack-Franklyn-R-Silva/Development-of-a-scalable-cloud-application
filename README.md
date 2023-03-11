# Documentação do projeto de desenvolvimento de uma aplicação em nuvem escalável

## Visão Geral
Imagine que temos um cliente que quer informações sobre um livro, como o título, o autor, a data de lançamento e o preço. Mas, o preço está em dólar e precisamos vender em diferentes mercados. Para isso, precisamos fazer um cálculo para converter o preço em moeda local e considerar impostos e outras coisas que podem afetar o preço final.

O projeto é composto por dois serviços: Book Service e Câmbio Service.

O Book Service é responsável por fornecer informações detalhadas sobre um livro, como o título, o autor, a data de lançamento e o preço. O Câmbio Service é responsável por fornecer informações sobre as taxas de câmbio e converter o preço do livro para a moeda local do cliente, levando em consideração impostos e outras taxas aplicáveis.

O projeto usa Spring Boot para gerenciar os microsserviços e Spring Cloud para gerenciar a comunicação entre os serviços. O Eureka é utilizado como servidor de descoberta de serviços.

## Arquitetura
O projeto segue uma arquitetura de microsserviços, em que cada serviço é independente e se comunica com outros serviços por meio de APIs RESTful. Cada serviço tem sua própria base de dados para armazenar e gerenciar seus dados.

## Endpoints
Os endpoints abaixo estão disponíveis nos serviços do projeto:



### Como executar o projeto:

- Java 11+ [Clique aqui](https://www.oracle.com/java/technologies/javase/jdk19-archive-downloads.html)
- Maven 3.9.0+ [Clique aqui](https://maven.apache.org/download.cgi) 
- Colocar as variáveis de ambiente do JAVA e MAVEN [Clique aqui](https://www.jdevtreinamento.com.br/variaveis-de-ambiente-configuracao/#:~:text=No%20menu%20%C3%A0%20esquerda%20clique,em%20%5BVARI%C3%81VEIS%20DE%20AMBIENTE%5D.)
- MySQL server Community [Clique aqui](https://dev.mysql.com/downloads/mysql/)
- MySQL Workbench [Clique aqui](https://dev.mysql.com/downloads/workbench/) ou HeidiSQL [Clique aqui](https://www.heidisql.com/download.php)
- Spring Tools 4 [Clique aqui](https://spring.io/blog/2021/06/21/spring-tools-4-11-0-released)
- Docker [Clique aqui](https://www.docker.com/)

### Executando o projeto
Para executar o projeto, siga as etapas abaixo:

1. Clone o repositório do projeto.
2. Acesse o diretório do projeto.



### Como funciona o projeto:

- Este dois projetos "greeting-service e config-server" tem como objetivo demonstrar como é feito saudações (Hello world) usando microsserviço.

#### greeting-service
Inicialmente, nesta pasta ***_"greeting-service"_***, ela trabalhar com configurações personalizadas em Spring Boot usando YAML e a anotação @ConfigurationProperties.

(A anotação @ConfigurationProperties é usada em Java para vincular propriedades de configuração definidas em arquivos de configuração externos a classes Java. Essa anotação permite que você injete propriedades de configuração em uma classe e use essas propriedades como atributos dessa classe.
Por exemplo, se você tiver um arquivo de configuração YAML que defina a propriedade greeting.message como "Hello", pode usar a anotação @ConfigurationProperties para vincular essa propriedade a uma classe Java. A classe Java deve ter um atributo correspondente à propriedade greeting.message e a anotação @ConfigurationProperties deve ser adicionada a essa classe com o valor "greeting" especificado como o prefixo da propriedade.
Em resumo, a anotação @ConfigurationProperties é usada para ler propriedades de configuração de arquivos externos e mapeá-las em atributos de classe em Java, tornando a configuração de aplicativos mais fácil e flexível.

O endpoint http://localhost:8000/actuator geralmente é utilizado em aplicações desenvolvidas em Spring Boot, uma estrutura de desenvolvimento de aplicativos Java. Este endpoint é fornecido pelo Spring Boot Actuator, que é um conjunto de recursos de monitoramento e gerenciamento de aplicativos.

###### Endpoints
```endpoints
http://localhost:8080/greeting
http://localhost:8080/greeting?name=Franklyn%20Roberto
```

#### config-server
Na pasta ***_"config-server"_*** aqui é configurado um servidor próprio e personalizado, acessando as propriedades no github desse repositorio. [clique aqui para ver o outro repositório.](https://github.com/hadesfranklyn/config-server-spring-cloud)

###### Endpoints
```endpoints
http://localhost:8888/greeting-service/default
http://localhost:8888/greeting-service/dev
http://localhost:8888/greeting-service/qa
http://localhost:8888/greeting-service/prod
http://localhost:8888/greeting-service/perf
```


#### cambio-service

 O ***_"cambio_service"_*** no banco tem as seguintes moedas BRL, USD, EUR, GBP, ARS, CLP, COP, MXN
 
 ###### Endpoints
```endpoints
 http://localhost:8000/cambio-service/8/USD/BRL
 http://localhost:8000/cambio-service/10/USD/EUR
 http://localhost:8000/cambio-service/8/BRL/MXN
 ```
