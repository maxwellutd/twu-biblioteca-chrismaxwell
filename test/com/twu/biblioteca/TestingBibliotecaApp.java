package com.twu.biblioteca;




import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestingBibliotecaApp {

    @Test
    public void testWelcomeMessage() {
        assertEquals(true,BibliotecaApp.hasWelcomeMsg());

    }
}
