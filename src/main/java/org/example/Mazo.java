package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Mazo {
    private ArrayList<Carta> cartas;
    private ArrayList<Carta> pilaDescarte;

    public Mazo() {
        this.cartas = new ArrayList<>();
        this.pilaDescarte = new ArrayList<>();
        String[] palos = {"Corazones", "Diamantes", "Tréboles", "Picas"};
        for (int i = 0; i < 2; i++) { // Dos mazos
            for (String palo : palos) {
                for (int valor = 1; valor <= 13; valor++) {
                    cartas.add(new Carta(valor, palo));
                }
            }
        }
        Collections.shuffle(cartas);
    }

    public Carta repartirCarta() {
        if (cartas.isEmpty() && !pilaDescarte.isEmpty()){
            cartas.addAll(pilaDescarte);
            pilaDescarte.clear();
            Collections.shuffle(cartas);
        }
        return cartas.remove(cartas.size() - 1);
    }
    public void agregarDescarte(Carta carta){
        pilaDescarte.add(carta);
    }

    public void reiniciarMazo(){
        cartas.addAll(pilaDescarte);
        pilaDescarte.clear();
        Collections.shuffle(cartas);
    }
}
