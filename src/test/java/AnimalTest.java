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
        Assertions.assertEquals("Miau", cat.animalLoud);
        Assertions.assertEquals("Roar", lion.animalLoud);
        Assertions.assertEquals("Wuff", dog.animalLoud);
    }

    @Test
    void testGetNameAndAge() {
        Assertions.assertEquals("Katze" + "5", cat.getNameAndAge());
        Assertions.assertEquals("Löwe" + "3", lion.getNameAndAge());
        Assertions.assertEquals("Hund" + "8", dog.getNameAndAge());
    }

    @Test
    void testAgeCategory() {
        Assertions.assertEquals("old animal", cat.ageCategory());
        Assertions.assertEquals("young animal", lion.ageCategory());
        Assertions.assertEquals("old animal", dog.ageCategory());
    }
}