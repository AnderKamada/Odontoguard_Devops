🦷 OdontoSpring API – Projeto DevOps FIAP
✅ Descrição
API REST desenvolvida em Java com Spring Boot para o gerenciamento de pacientes e tratamentos odontológicos. A aplicação permite realizar operações de CRUD em entidades com relacionamento entre tabelas.

☁️ Tecnologias utilizadas

Java 17 + Spring Boot -
PostgreSQL (Banco de dados em nuvem) -
Azure DevOps (CI/CD) -
Azure App Service -
Swagger (Documentação da API)

🚀 Como Executar a Pipeline no Azure DevOps

Clone este repositório

git clone https://github.com/AnderKamada/Odontoguard_Devops.git

Acesse o Azure DevOps

Pipeline CI/CD já configurada: (https://dev.azure.com/2TDSPC-2024-B/Odontoguard/_build)

Executar pipeline

A pipeline irá:

Fazer checkout do repositório

Instalar JDK 17

Rodar mvn clean package

Copiar e publicar o JAR como artefato

Fazer deploy no Azure App Service (odontospring-api)

Acesse a API publicada

https://odontospring-api-xxxxxx.azurewebsites.net/api/pacientes

Swagger

🧪 Testes via Swagger
Acesse o Swagger e teste todos os endpoints de forma intuitiva:

GET /api/pacientes

POST /api/pacientes

PUT /api/pacientes/{id}

DELETE /api/pacientes/{id}

E também os de tratamentos.

🗂️ Scripts JSON para Testes
json
Copiar
Editar
// POST /api/pacientes
{
  "nome": "João da Silva",
  "email": "joao@email.com"
}

// POST /api/tratamentos
{
  "descricao": "Limpeza",
  "valor": 150,
  "pacienteId": 1
}
