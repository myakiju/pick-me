# Pick Me - API Rest com Springboot
É um projeto criado para o Workshop do Devs JavaGirl Summit.

## Objetivo
O objetivo desse workshop será construir uma API Rest com telas para um CRUD básico. O foco principal é ensinar como construir uma aplicação do zero mais do que programar e criar suas funcionalidades. Daremos mais ênfase em como os componentes se relacionam e em suas configurações. Não ensinaremos a construir muitos algoritmos, mas deixaremos os códigos comentados para que todo mundo consiga ter uma ideia do que o programa faz.

## Motivação
Percebemos que muitas pessoas que começam a programar tem dificuldade de relacionar os tutoriais clássicos de algoritmos feitos no terminal com situações práticas para o dia-a-dia. Portanto decidimos trazer algo mais próximo do “mundo real” e que ajude a praticar seus algoritmos no maravilhoso mundo da web.

## O que esse workshop não é
Pelo fato do tempo ser curto, esse workshop não será uma aula de programação pois em poucas horas não seria possível passar muito conteúdo útil. Por isso decidimos apresentar recursos para que seus estudo de programação fiquem mais divertidos e mais próximos das aplicações de mercado. Caso queiram saber mais sobre cursos online ou livros, ficaremos felizes em indicar.

## O que vamos usar
- Spring Initializr [https://start.spring.io/]
- Github 
- Eclipse [https://www.eclipse.org/downloads/]
- Java 8+ 
- Maven

## Configurando seu ambiente
Caso essa seja sua primeira vez programando com Java, não se preocupe. Preparamos um tutorial para te ajudar. Caso já tenha um ambiente configurado, você pode conferir se não está faltando nada. **Para essa etapa é importante que você tenha privilégios de Administrador na sua máquina**. Acesse a [Wiki](https://github.com/myakiju/pick-me/wiki) do projeto para saber mais sobre as configurações necessárias.

## Em caso de dúvidas ou problemas na configurações
Se deu alguma coisa errada, você pode entrar em contato com a gente no slack da comunidade ou por e-mail para Juliana (j.myaki@gmail.com) ou para a Nara (nara.sakamoto@gmail.com) . Se você ainda não está no nosso slack, peça um convite pra nós por e-mail. Recomendamos muito que entre no slack, pois lá temos muitas interações e mais pessoas pra ajudar em diversos assuntos.


## Rodando o projeto
Para rodar o projeto, você pode utilizar o comando do Maven Wrapper no terminal na raiz do seu projeto:
```
$ ./mvnw clean spring-boot:run
```
Ou, para utilizar o comando do maven, digite:
```
$ mvn clean spring-boot:run
```
Quando o serviço estiver iniciado, você verá uma mensagem parecida com essa no terminal:
```
Started PickMeApplication in 2.803 seconds
```

## Testando os serviços
Para testar, utilize a collection do Postman ou os seguintes endpoints

[![Run in Postman](https://run.pstmn.io/button.svg)](https://www.getpostman.com/collections/35dc1d36596d8a4e7834)

### Hello World

``` GET http://localhost:8080/hello``` 

``` GET http://localhost:8080/hello/{nome}```

### Person CRUD

- Buscar todas as pessoas 
```GET http://localhost:8080/people```

- Buscar pessoa por ID
```GET http://localhost:8080/person/{id}```

- Salvar nova pessoa 
```POST http://localhost:8080/person``` 
  passando JSON no body da requisição 
```
    {
        "name": "Nome da pessoa",
        "email": "email@pessoa.com"
    }
```
- Editar pessoa ```PUT http://localhost:8080/person/{id-da-pessoa-a-editar}```
  passando JSON no body da requisição 
```
    {
        "name": "Novo Nome da pessoa",
        "email": "novo-email@pessoa.com"
    }
```
- Deletar pessoa ```DELETE http://localhost:8080/person/{id}```

