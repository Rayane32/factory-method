package factorymethod;

public class Sushi implements Comida {

    @Override
    public void preparar() {
        System.out.println("Preparando Sushi!");
    }

}