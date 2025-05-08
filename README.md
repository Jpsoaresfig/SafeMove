<h1>SafeMove 🚚</h1>

<p><strong>SafeMove</strong> is a web application developed in Java using Spring Boot, designed to manage the registration and movement of products across various agencies and destinations. The system enables efficient asset control, facilitating traceability and logistical organization.</p>

<h2>📋 Features</h2>
<ul>
  <li>Register and edit products with detailed information.</li>
  <li>Associate products with specific destinations.</li>
  <li>List and search registered products.</li>
  <li>User-friendly interface for data management.</li>
</ul>

<h2>⚙️ Technologies Used</h2>
<ul>
  <li>Java 17</li>
  <li>Spring Boot</li>
  <li>Spring MVC</li>
  <li>Hibernate / JPA</li>
  <li>Thymeleaf</li>
  <li>Maven</li>
  <li>Relational Database (e.g., MySQL or PostgreSQL)</li>
</ul>

<h2>🚀 How to Run the Project</h2>
<ol>
  <li><strong>Clone the repository:</strong>
    <pre><code>git clone https://github.com/Jpsoaresfig/SafeMove.git
cd SafeMove</code></pre>
  </li>
  <li><strong>Configure the database:</strong>
    <ul>
      <li>Create a database in your preferred RDBMS.</li>
      <li>Update the connection settings in the <code>application.properties</code> file located in <code>src/main/resources/</code>.</li>
    </ul>
  </li>
  <li><strong>Build and run the application:</strong>
    <pre><code>mvn spring-boot:run</code></pre>
  </li>
  <li><strong>Access the application:</strong>
    <ul>
      <li>Open your browser and navigate to <a href="http://localhost:8080">http://localhost:8080</a>.</li>
    </ul>
  </li>
</ol>

<h2>🗂️ Project Structure</h2>
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

<h2>🧑‍💻 Contributing</h2>
<p>Contributions are welcome! Feel free to open issues or submit pull requests.</p>

<h2>📄 License</h2>
<p>This project is licensed under the MIT License.</p>
