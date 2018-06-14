package Carros;

import Edificaciones.centroMando;

public class CarroOscuro implements Carro{

    int costo1= 200;
    int costo2= 200;
    int costo3= 100;

    @Override
    public Carro carro(){
        Carro carro = new CarroOscuro() {
        };
        System.out.println("has creado un carro oscuro");
        return carro;
    }

    @Override
    public int vida() {
        return 200;
    }

    @Override
    public int ataque() {
        return 50;
    }

    @Override
    public String nombre() {
        return "CARRO OSCURO";
    }

    @Override
    public boolean Sepuede(centroMando cm) {
        if (costo1 <= cm.recurso1 && costo2 <= cm.recurso2 && costo3 <= cm.recurso3) {
            cm.recurso1 = cm.recurso1 - costo1;
            cm.recurso2 = cm.recurso2 - costo2;
            cm.recurso3 = cm.recurso3 - costo3;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void costo(centroMando cm) {

    }
}
