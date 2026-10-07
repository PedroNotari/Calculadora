# Calculadora Java

Projeto Java de uma calculadora para prática de programação, criado com o intuito de construir uma base mais sólida de lógica.

## Funcionalidades

- Soma, subtração, multiplicação e divisão
- Menu no console
- Tratamento de entradas inválidas.

## Tecnologias

- Java
- Eclipse
- Git e GitHub

## Estrutura do projeto

```
src/
└── calculadora/
    ├── model/     enum Operacao
    ├── service/   CalculadoraService (regras de cálculo)
    └── ui/        Principal (menu no console)
```

## Decisões de projeto

- Projeto separado por `ui`, `service` e `model` para melhor leitura do arquivo, separando por responsabilidades.
- No projeto usei o `double` para contas como `5 / 2` dar `2,5`.

## Melhorias

- Adicionar mais funcionalidades, progredindo para uma futura calculadora científica.
- Testes unitários com JUnit.
- Criar persistência de dados, salvando cálculos já feitos.
- Criar interface gráfica para melhor visualização de uma calculadora.
