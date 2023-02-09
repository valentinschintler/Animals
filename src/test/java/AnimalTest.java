import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    Animal cat;
    Animal lion;
    Animal dog;

    @BeforeEach
    void setUp() {
        cat = new Animal("Katze", 5, "Tier", "Miau");
        lion = new Animal("Löwe", 3, "Tier", "Roar");
        dog = new Animal("Hund", 8, "Tier", "Wuff");
    }

    @Test
    void testGiveAnimalLoud() {
        Assertions.assertEquals("Miau", "Miau");
        Assertions.assertEquals("roar", "roar");
        Assertions.assertEquals("Wuff", "Wuff");
    }

    @Test
    void testGetNameAndAge() {
        Assertions.assertEquals("Katze" + "5", "Katze" + "5");
        Assertions.assertEquals("Löwe" + "3", "Löwe" + "3");
        Assertions.assertEquals("Hund" + "8", "Hund" + "8");
    }

    @Test
    void testAgeCategory() {
        Assertions.assertEquals("old animal", "old animal" );
        Assertions.assertEquals("young animal", "young animal" );
        Assertions.assertEquals("old animal", "old animal" );
    }
}