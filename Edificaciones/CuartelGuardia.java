package Edificaciones;

import Guerreros.Guerrero;
import Jugadores.Jugadores;
import Razas.*;



public class CuartelGuardia implements edificacion {

    int costo1= 200;
    int costo2= 200;
    int costo3= 100;

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
    public String nombre() {
        return "CUARTEL DE LA GUARDIA";
    }

    @Override
    public int vida() {
        return 0;
    }

    @Override
    public void funcion(centroMando cm) {

    }

    @Override
    public Guerrero funcionWar(centroMando cm) {
        return null;
    }

    @Override
    public void costo(centroMando cm) {
        System.out.println(
                "\nRUPIAS: "+ costo1+"\nKRONOLITO: "+costo2+"\nMATERIAL MAESTRO: "+costo3
        );
    }

}