package factorymethod;

public class Pizza implements Comida {

    @Override
    public void preparar() {
        System.out.println("Preparando Pizza!");
    }

}