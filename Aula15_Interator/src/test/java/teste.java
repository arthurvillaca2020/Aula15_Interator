import org.example.Contador;
import org.example.Jogador;
import org.example.Servidor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class teste {
    @Test
    void deveContaJogadoresAtivosNoServidor() {
        Servidor servidor = new Servidor(
                new Jogador("Marco", true),
                new Jogador("Arthur", false),
                new Jogador("Caio", false),
                new Jogador("Breno", false)
        );
        assertEquals(1, Contador.contarJogadoresAtivosNoServidor(servidor));
    }

    @Test
    void deveContaJogadoresAfkNoServidor() {
        Servidor servidor = new Servidor(
                new Jogador("Marco", true),
                new Jogador("Arthur", false),
                new Jogador("Caio", false),
                new Jogador("Breno", false)
        );
        assertEquals(3, Contador.contarJogadoresAfkNoServidor(servidor));
    }

    @Test
    void deveContarTotalDeJogadoresNoServidor() {
        Servidor servidor = new Servidor(
                new Jogador("Marco", true),
                new Jogador("Arthur", false),
                new Jogador("Caio", false),
                new Jogador("Breno", false)
        );
        assertEquals(4, Contador.contarTotalJogadoresNoServidor(servidor));
    }
}
