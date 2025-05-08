
</head>
<body>
  <h1>SafeMove 🚚</h1>
  <p>SafeMove é uma aplicação web desenvolvida em Java com Spring Boot, projetada para gerenciar o cadastro e movimentação de produtos entre diferentes agências e destinos. O sistema permite o controle eficiente de ativos, facilitando a rastreabilidade e a organização logística.</p>

  <h2>📋 Funcionalidades</h2>
  <ul>
    <li>Cadastro e edição de produtos com informações detalhadas.</li>
    <li>Associação de produtos a destinos específicos.</li>
    <li>Listagem e pesquisa de produtos cadastrados.</li>
    <li>Interface amigável para gerenciamento de dados.</li>
  </ul>

  <h2>⚙️ Tecnologias Utilizadas</h2>
  <ul>
    <li>Java 17</li>
    <li>Spring Boot</li>
    <li>Spring MVC</li>
    <li>Hibernate / JPA</li>
    <li>Thymeleaf</li>
    <li>Maven</li>
    <li>Banco de Dados Relacional (ex: MySQL ou PostgreSQL)</li>
  </ul>

  <h2>🚀 Como Executar o Projeto</h2>
  <ol>
    <li><strong>Clone o repositório:</strong>
      <pre><code>git clone https://github.com/Jpsoaresfig/SafeMove.git
cd SafeMove</code></pre>
    </li>
    <li><strong>Configure o banco de dados:</strong>
      <ul>
        <li>Crie um banco de dados no seu SGBD preferido.</li>
        <li>Atualize as configurações de conexão no arquivo <code>application.properties</code> localizado em <code>src/main/resources/</code>.</li>
      </ul>
    </li>
    <li><strong>Compile e execute a aplicação:</strong>
      <pre><code>mvn spring-boot:run</code></pre>
    </li>
    <li><strong>Acesse a aplicação:</strong>
      <ul>
        <li>Abra o navegador e vá para <a href="http://localhost:8080">http://localhost:8080</a>.</li>
      </ul>
    </li>
  </ol>

  <h2>🗂️ Estrutura do Projeto</h2>
  <pre><code>SafeMove/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── safemove/
│   │   │           ├── controllers/
│   │   │           ├── enums/
│   │   │           ├── models/
│   │   │           └── repositories/
│   │   └── resources/
│   │       ├── templates/
│   │       └── application.properties
├── pom.xml
└── README.md</code></pre>

  <h2>🧑‍💻 Contribuindo</h2>
  <p>Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.</p>

  <h2>📄 Licença</h2>
  <p>Este projeto está licenciado sob a <a href="https://opensource.org/licenses/MIT">MIT License</a>.</p>
</body>
</html>
