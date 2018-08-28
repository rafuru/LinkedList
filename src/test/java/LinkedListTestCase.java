import mx.rafuru.collections.BLinkedList;
import mx.rafuru.collections.BList;
import mx.rafuru.collections.exceptions.IndexOutOfBounds;
import mx.rafuru.linkedlist.model.Game;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LinkedListTestCase {

    BList<Game> games;

    @BeforeEach
    void init(){
        games = new BLinkedList();
    }

    @Test
    void addElement(){
        games.add(new Game("God of War","PS4"));
        assertEquals(1,games.size());
    }
    @Test
    void getElement(){
        games.add(new Game("God of War","PS4"));
        games.add(new Game("Persona 5","PS4"));
        games.add(new Game("Halo 5","Xbox One"));

        Game g = games.get(1);
        assertEquals("Persona 5",g.getTitulo());
    }

    @Test
    void indexOutOfBounds(){
        assertThrows(IndexOutOfBounds.class,()->{
            games.add(new Game("God of War","PS4"));
            games.get(2);
        });
    }
}
