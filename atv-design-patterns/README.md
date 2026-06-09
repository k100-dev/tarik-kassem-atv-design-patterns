# Atividade: Design Patterns

Repositório desenvolvido para a atividade individual de Design Patterns.

Foram implementados 3 padrões de projeto:

- **Factory Method** — Padrão Criacional
- **Adapter** — Padrão Estrutural
- **Strategy** — Padrão Comportamental

Cada implementação está separada em uma pasta própria, contendo o código-fonte e um exemplo de execução.

## Estrutura do projeto

```txt
atv-design-patterns/
├── factory-method/
│   └── src/
├── adapter/
│   └── src/
└── strategy/
    └── src/
```

## Tecnologias utilizadas

- Java
- Programação Orientada a Objetos
- Design Patterns

## Como executar

Acesse a pasta `src` de cada padrão, compile os arquivos `.java` e execute a classe `Main`.

### Factory Method

```bash
cd factory-method/src
javac *.java
java Main
```

### Adapter

```bash
cd adapter/src
javac *.java
java Main
```

### Strategy

```bash
cd strategy/src
javac *.java
java Main
```

## Padrões implementados

### Factory Method

O padrão Factory Method foi utilizado para criar notificações por diferentes canais, como Email, SMS e Push Notification, sem que o código cliente precise instanciar diretamente as classes concretas.

### Adapter

O padrão Adapter foi utilizado para permitir que uma aplicação nova, baseada na interface `Logger`, consiga utilizar internamente uma classe legada chamada `LegacyLogger`, sem depender diretamente dela.

### Strategy

O padrão Strategy foi utilizado para permitir que um carrinho aplique diferentes formas de desconto, como ausência de desconto, desconto percentual e desconto fixo, podendo trocar a estratégia em tempo de execução.
