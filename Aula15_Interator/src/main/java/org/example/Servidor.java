package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Servidor implements Iterable<Jogador>{
    private List<Jogador> jogadores = new ArrayList<Jogador>();

    public Servidor(Jogador... jogadores) {
        this.jogadores = Arrays.asList(jogadores);
    }
    @Override
    public Iterator<Jogador> iterator() {
        return jogadores.iterator();
    }

}
