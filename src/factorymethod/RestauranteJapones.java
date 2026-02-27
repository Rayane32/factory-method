package factorymethod;

public class RestauranteJapones extends Restaurante {

    @Override
    public Comida criarComida() {
        return new Sushi();
    }

}