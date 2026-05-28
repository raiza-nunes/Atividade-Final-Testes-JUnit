# Atividade Final — Controle Acadêmico em Java

## Descrição do Projeto

Este projeto foi desenvolvido como atividade final da disciplina de Programação em Java.

O objetivo principal é criar um sistema simples de controle acadêmico utilizando os conceitos fundamentais da linguagem Java e testes automatizados com JUnit.

O sistema realiza operações relacionadas ao gerenciamento acadêmico e possui testes unitários para validar o funcionamento correto dos métodos implementados.

---

# Tecnologias Utilizadas

* Java
* IntelliJ IDEA
* JUnit 5

---

# Estrutura do Projeto

O projeto possui duas classes principais:

## ControleAcademicoService

Classe responsável pela lógica do sistema.

Nela estão implementados os métodos principais utilizados no controle acadêmico.

---

## ControleAcademicoServiceTest

Classe responsável pelos testes automatizados utilizando JUnit.

Os testes verificam se os métodos da classe principal estão funcionando corretamente.

---

# Como Executar o Projeto

## 1. Criar o Projeto no IntelliJ IDEA

1. Abrir o IntelliJ IDEA
2. Clicar em **New Project**
3. Definir:

   * **Nome:** `Atividade_Final`
   * **Language:** Java
   * **Build System:** IntelliJ

4. Clicar em **Create**

---

# Adicionar as Classes

Dentro da pasta `src`:

1. Criar a classe:

   * `ControleAcademicoService`

2. Criar a classe:

   * `ControleAcademicoServiceTest`

3. Colar os respectivos códigos em cada arquivo.

---

# Configuração do JUnit

Ao abrir a classe de testes, as anotações `@Test` podem aparecer em vermelho.

Para resolver:

1. Clicar sobre `@Test`

2. Pressionar:

```bash
Alt + Enter
```

3. Selecionar:

```bash
Add 'JUnit5' to classpath
```

O IntelliJ IDEA fará automaticamente:

* Download da biblioteca
* Configuração das dependências
* Integração do ambiente de testes

---

# Executando os Testes

1. Abrir a classe:

```bash
ControleAcademicoServiceTest
```

2. Clicar no botão de execução ao lado da classe

3. Selecionar:

```bash
Run 'ControleAcademicoServiceTest'
```

---

# Resultado Esperado

Após executar:

* Todos os testes devem aparecer como aprovados
* O painel inferior exibirá os testes executados com sucesso
* O sistema estará validado corretamente

---

# Objetivos de Aprendizagem

Com este projeto foi possível praticar:

* Programação Orientada a Objetos
* Criação de classes em Java
* Estruturação de projetos
* Testes unitários com JUnit
* Uso do IntelliJ IDEA
* Organização de código

---

# Considerações Finais

O IntelliJ IDEA facilitou significativamente o desenvolvimento do projeto, principalmente na configuração automática das bibliotecas e execução dos testes.

A utilização do JUnit tornou possível validar o comportamento do sistema de forma prática e organizada, garantindo maior confiabilidade ao código desenvolvido.
