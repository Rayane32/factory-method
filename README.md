# Factory Method – Exemplo com Comida 🍣🍕

Este projeto demonstra o padrão de projeto **Factory Method** em Java, usando o exemplo de um sistema de restaurantes que cria diferentes tipos de comida.

## Objetivo

Mostrar como o padrão Factory Method permite criar objetos sem especificar suas classes concretas diretamente, delegando a criação para subclasses.

## Estrutura

* **Comida.java** → Interface (Product)
* **Sushi.java / Pizza.java** → Produtos concretos (ConcreteProduct)
* **Restaurante.java** → Classe criadora (Creator)
* **RestauranteJapones.java / RestauranteItaliano.java** → Criadores concretos (ConcreteCreator)
* **Main.java** → Classe cliente (Client)

## Execução

Execute a classe `Main.java`.

Saída esperada:

```
Preparando Sushi 🍣
Preparando Pizza 🍕
```

## Padrão utilizado

O **Factory Method** define um método para criar objetos, permitindo que subclasses decidam qual objeto será criado.

---

**Autor:** Rayane Cavalcanti da Silva
**Linguagem:** Java
**IDE:** IntelliJ IDEA
