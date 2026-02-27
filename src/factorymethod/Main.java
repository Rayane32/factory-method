package factorymethod;

public class Main {

    public static void main(String[] args) {

        Restaurante restaurante;

        restaurante = new RestauranteJapones();
        restaurante.fazerPedido();

        restaurante = new RestauranteItaliano();
        restaurante.fazerPedido();

    }

}