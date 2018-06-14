import Carros.Carro;
import Carros.Carro;
import Edificaciones.centroMando;

import java.util.ArrayList;

public class ListaCarros {
    private ArrayList<Carro> carros;

    public ListaCarros() {
        carros = new ArrayList<>();
    }

    public void add(Carro car){

        carros.add(car);
    }

    public void mostrar() {
        for (Carro e : carros) {
            System.out.println(e.nombre());
        }
    }


    public String buscar (String busca){
        for(Carro e : carros){
            if(e.nombre() == busca){
                return  e.nombre();
            }
        }
         return null;
        }
    }


