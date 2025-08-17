package service.edd;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ListaTest {
    private Lista lista;

    @Before
    public void setUp() throws Exception {
        lista = new Lista("MiLista");
    }

    @Test
    public void testListaVaciaInicialmente() {
        assertTrue(lista.estaVacia());
    }

    @Test
    public void testListaNoVaciaDespuesDeInsertar() {
        lista.insertarAlFrente("Primer Elemento");
        assertFalse(lista.estaVacia());
    }
}
