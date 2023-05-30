package org.example;

import java.util.Iterator;

public class Contador {

    public static Integer contarJogadoresAtivosNoServidor(Servidor servidor) {
        int quantidade = 0;
        for (Jogador jogador : servidor) {
            if (jogador.isAtivo()) {
                quantidade++;
            }
        }
        return quantidade;
    }
    public static Integer contarJogadoresAfkNoServidor(Servidor servidor) {
        int quantidade = 0;
        for (Jogador jogador : servidor) {
            if (!jogador.isAtivo()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalJogadoresNoServidor(Servidor servidor) {
        int quantidade = 0;
        for (Iterator a = servidor.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }
}
