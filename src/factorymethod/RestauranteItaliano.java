package factorymethod;

public class RestauranteItaliano extends Restaurante {

    @Override
    public Comida criarComida() {
        return new Pizza();
    }

}