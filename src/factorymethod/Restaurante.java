package factorymethod;

public abstract class Restaurante {

    // Factory Method
    public abstract Comida criarComida();

    public void fazerPedido() {

        Comida comida = criarComida();

        comida.preparar();

    }

}