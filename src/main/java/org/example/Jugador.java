package org.example;

import java.util.ArrayList;

public class Jugador {
    private ArrayList<Carta> mano;

    public Jugador() {
        mano = new ArrayList<>();
    }

    public void pedirCarta(Mazo mazo) {
        Carta carta = mazo.repartirCarta();
        if (carta != null) {
            mano.add(carta);
        }
    }

    public int calcularPuntos() {
        int total = 0;
        int ases = 0;
        for (Carta carta : mano) {
            if (carta.getValor() > 10) {
                total += 10;
            } else if (carta.getValor() == 1) {
                ases++;
                total += 11;
            } else {
                total += carta.getValor();
            }
        }
        while (total > 21 && ases > 0) {
            total -= 10;
            ases--;
        }
        return total;
    }
    public ArrayList<Carta> getMano() {
        return mano;
    }
}
