# Roteiro de viagens
Projeto final para a disciplina Arquitetura Java - Infnet - Professor Elberth Moraes

### 1. Acesso aos arquivos do projeto.
#### 1.1 Navegue até a pasta desejada para o clone;
#### 1.2 Clone o repositório através do comando: `git clone https://github.com/Raphael-Afonso/infnet-java-approteiroviagem`;

### 2. Importando projeto no Eclise.
#### 2.1 Inicie o Eclipse no workspace desejado;
#### 2.2 Navegue até File > Import > Maven > Existing Maven Projects;
#### 2.3 Selecione a pasta clonada do repositório no passo anterior;

### 3. Configuração do banco de dados.
#### 3.1 Uso do MySql com Docker-Compose;
##### 3.1.1 Navegue até a pasta raiz do projeto;
##### 3.1.2 Abra o arquivo docker-compose.yml e altere o usuário e senha para o desejado;
##### 3.1.3 Execute o seguinte comando: `docker-compose up -d`;
##### 3.1.4 O MySql estará disponível na porta 6033 e o phpMyAdmin na 8081;
#### 3.2 Caso opte por não utilizar o Docker, basta iniciar o serviço do MySql com seu provedor de preferência.
#### 3.3 Configurando o acesso do banco de dados na aplicação.
##### 3.3.1 Altere o arquivo application.properties localizado em /src/main/resources;
##### 3.3.2 Para spring.datasource.url Altere endereço, porta e database utilizados;
##### 3.3.3 Para spring.datasource.username Altere para o nome de usuário do MySql;
##### 3.3.4 Para spring.datasource.password Altere para a senha do MySql;

### 4. Iniciando a aplicação.
#### 4.1 Para iniciar a aplicação clique no pacote br.edu.infnet.approteiroviagem, selecione Run as > Maven Install;
#### 4.2 Em seguida no mesmo pacote selecione Run as > Java Application;

### 5. A aplicação
#### 5.1 Ao iniciar a aplicação irá popular o banco de dados com uma carga inicial, que poderá ser observada no console;
#### 5.2 A aplicação estará disponível na url: http://localhost:8080
#### 5.3 O backend do usuário [api-usuario] estará disponível na url: http://localhost:8082
#### 5.4 O backend do turista [api-turista] estará disponível na url: http://localhost:8083
#### 5.5 O backend dos serviços [api-servico] estará disponível na url: http://localhost:8084
#### 5.6 O backend do roteiro [api-roteiro] estará disponível na url: http://localhost:8085
