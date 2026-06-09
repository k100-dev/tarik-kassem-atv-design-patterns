# Adapter

## Objetivo

Implementar um adaptador para permitir que uma aplicação nova, baseada na interface `Logger`, utilize uma classe legada chamada `LegacyLogger`.

A classe cliente `Application` depende apenas da interface `Logger`, sem conhecer diretamente a classe legada.

## Saída esperada

```txt
[INFO] Iniciando aplicação
[ERROR] Falha ao conectar no banco
```
