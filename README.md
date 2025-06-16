
# BancoDigitals Spring 🏦

Uma API REST desenvolvida com Spring Boot para gerenciar operações bancárias digitais (conta corrente e poupança), incluindo funcionalidades como depósito, saque e transferência.

---

## 📋 Tabela de Conteúdos

- [TECNOLOGIAS](#tecnologias)  
- [ESTRUTURA DO PROJETO](#estrutura-do-projeto)  
- [FUNCIONALIDADES](#funcionalidades)  
- [PRÉ‑REQUISITOS](#pr%C3%A9-requisitos)  
- [EXECUÇÃO](#execu%C3%A7%C3%A3o)  
- [CONFIGURAÇÕES](#configura%C3%A7%C3%B5es)  
- [ENDPOINTS](#endpoints)  
- [TESTES](#testes)  
- [CONTRIBUIÇÃO](#contribui%C3%A7%C3%A3o)  
- [LICENÇA](#licen%C3%A7a)  

---

## 🛠️ Tecnologias

- Java 17+  
- Spring Boot 3.x  
- Spring Web, Spring Data JPA  
- Banco de dados H2 / MySQL / PostgreSQL *(escolher conforme o projeto)*  
- Lombok (para redução de boilerplate)  
- Maven ou Gradle  

---

## 📁 Estrutura do Projeto

\`\`\`
├── src
│   ├── main
│   │   ├── java/com/seuprojeto
│   │   │   ├── controller       # APIs REST
│   │   │   ├── service          # Lógica de negócio
│   │   │   ├── model            # Entidades JPA
│   │   │   ├── repository       # Repositórios JPA
│   │   │   └── exception        # Tratamento de erros e exceptions
│   │   └── resources
│   │       ├── application.properties
│   │       └── data.sql        # Dados iniciais (opcional)
│   └── test                    # Testes unitários e de integração
└── pom.xml / build.gradle
\`\`\`

---

## 🚀 Funcionalidades

- **Conta Corrente**: depósito, saque, transferência  
- **Conta Poupança**: depósito, saque, transferência  
- Validações de saldo e limites  
- Tratamento de exceções com respostas HTTP adequadas (400, 404, etc.)  

---

## 📦 Pré‑Requisitos

- Java 17 ou superior  
- Maven 3.6+ / Gradle  
- (Opcional) Banco externo: MySQL/PostgreSQL

---

## ▶️ Como Executar

1. Clone o repositório:  
   \`\`\`bash
   git clone https://github.com/emersonpessoa01/bancodigitals-spring.git
   cd bancodigitals-spring
   \`\`\`

2. Execute via Maven:
   \`\`\`bash
   ./mvnw spring-boot:run
   \`\`\`
   Ou via Gradle:
   \`\`\`bash
   ./gradlew bootRun
   \`\`\`

3. Acesse \`http://localhost:8080\` para testar os endpoints.

---

## ⚙️ Configurações

Edite \`src/main/resources/application.properties\` para alterar configurações de banco de dados, porta, logs etc.

Exemplo:
\`\`\`
spring.datasource.url=jdbc:h2:mem:bancodigitals
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
\`\`\`

---

## 🧠 Endpoints (exemplos)

- \`POST /accounts\` – criar conta (corrente ou poupança)  
- \`GET /accounts/{id}\` – detalhes da conta  
- \`POST /accounts/{id}/deposit\` – depositar valor  
- \`POST /accounts/{id}/withdraw\` – sacar valor  
- \`POST /accounts/transfer\` – transferir entre contas  

---

## ✅ Testes

- Execute todos os testes:
  \`\`\`bash
  ./mvnw test
  \`\`\`
  Ou:
  \`\`\`bash
  ./gradlew test
  \`\`\`

---

## 🤝 Contribuição

1. Fork este repositório  
2. Crie uma branch com sua feature (\`git checkout -b feature/nome-item\`)  
3. Faça commit das suas melhorias (\`git commit -m 'Descrição da melhoria'\`)  
4. Push na branch (\`git push origin feature/nome-item\`)  
5. Abra um Pull Request

---

## 📄 Licença

Este projeto está sob a licença MIT. Consulte o arquivo \`LICENSE\` para mais detalhes.

---

## 🧾 Autor

**Emerson Pessoa** – Desenvolvedor Web  
- GitHub: [@emersonpessoa01](https://github.com/emersonpessoa01)  
- LinkedIn: /in/emersonpessoa01  

Obrigado por vir até aqui! Se tiver dúvidas ou sugestões, fique à vontade para abrir uma issue. 😊
