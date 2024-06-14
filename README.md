# MS-EMAIL

MS-EMAIL é um microserviço projetado para facilitar o envio de e-mails usando o Amazon SES (Simple Email Service) e a integração com o RabbitMQ para gerenciamento de filas de mensagens. Este projeto foi desenvolvido para fins educacionais, proporcionando uma excelente oportunidade para aprender e implementar tecnologias modernas de mensageria e serviços em nuvem.

## Índice

1. [Demonstração](#Demonstração)
2. [Tecnologias Utilizadas](#tecnologias-utilizadas)
3. [Instalação](#instalação)
4. [Como Usar](#como-usar)
5. [Contribuição](#contribuição)
6. [Licença](#licença)

## Demonstração

- Prints: 

Requisição:

<img src="/assets/Request.png">

Email:

<img src="/assets/email.png">

<a name="tecnologias-utilizadas"></a>

## Tecnologias Utilizadas

As principais tecnologias, frameworks e ferramentas utilizadas no projeto:

- Spring Boot

- Java 17

- ASW SES

- RabbitMQ

- CloudAMQP

- PostgreSQL

- Docker

  

## Instalação

Para instalação do projetos, execute os seguintes comdandos:

```
git clone https://github.com/pedrohma07/ms-email.git
cd ms-email
```
```
echo "spring.application.name=ms-email
server.port=8080

spring.datasource.url=jdbc:postgresql://localhost:5432/ms_email
spring.datasource.username=root
spring.datasource.password=senha-postgres
spring.jpa.hibernate.ddl-auto=update

aws.region=sua-region
aws.accessKeyId=Sua-accessKeyId
aws.secretKey=Sua-secretKey

spring.rabbitmq.addresses=addresses-do-cloudAMQP
spring.rabbitmq.queue=ms.email" > src/main/resources/application.properties

```

Como maven, docker e o java devidamente instalados execute os seguintes comando:

```
docker compose up -d
```

```
mvn clean install
```

<a name="como-usar"></a>

## Como Usar

Para executar execute os seguintes comandos:

```
mvn spring-boot:run
```

E usando o Postman, Insomnia ou outra ferramenta semelhante para fazer a requisição.

## Contribuição

Se você deseja contribuir para o projeto, siga estas etapas: 

1. Faça um fork do projeto. 
2. Crie uma branch para sua feature (`git checkout -b feature/MinhaFeature`). 
3. Faça commit de suas alterações (`git commit -am 'Adicionando uma nova feature'`).
4. Faça push para a branch (`git push origin feature/MinhaFeature`). 
5. Abra um Pull Request. Após o envio do Pull Request, ele será revisado pelo mantenedor do projeto. Contribuições são bem-vindas! Qualquer ajuda para melhorar este projeto é muito apreciada.

## Licença

Este projeto está licenciado sob os termos da Licença MIT. Consulte o arquivo [LICENSE](LICENSE) para obter mais detalhes.