# API ViaCEP em Java

Projeto em Java que consome a API do ViaCEP para consultar endereços a partir de um CEP informado pelo usuário e salvar o resultado em um arquivo JSON.

## Funcionalidades

* Consulta de CEP pela API ViaCEP
* Conversão de JSON com Gson
* Geração de arquivo `endereco.json`
* Tratamento básico de erros

## Tecnologias

* Java 17+
* Gson
* HttpClient
* Git e GitHub

## Estrutura do Projeto

```text
src/
├── Principal.java
├── ConsultaCEP.java
├── Endereco.java
└── GeradorDeArquivo.java
```

## Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/alexialberiz/api_viacep.git
```

2. Abra o projeto na IDE.
3. Adicione a dependência do Gson.
4. Execute `Principal.java`.

## Exemplo de Uso

```text
Digite um CEP:
01001000
```

Arquivo gerado:

```text
endereco.json
```

## API Utilizada

[https://viacep.com.br/](https://viacep.com.br/)

## Autora

Alexia Alberiz
