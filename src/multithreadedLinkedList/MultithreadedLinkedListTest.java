package multithreadedLinkedList;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultithreadedLinkedListTest {
    private MultithreadedLinkedList mll;

    @Before
    public void setUp() throws Exception {
        mll = new MultithreadedLinkedList();

        mll.addPlanetToList(new Planet("Земля", 3, 5, 5));
        mll.addPlanetToList(new Planet("Меркурий", 1, 8, 8));
        mll.addPlanetToList(new Planet("Венера", 2, 6, 6));
        mll.addPlanetToList(new Planet("Марс", 4, 7, 7));
        mll.addPlanetToList(new Planet("Нептун", 8, 3, 4));
        mll.addPlanetToList(new Planet("Уран", 7, 4, 1));
        mll.addPlanetToList(new Planet("Сатурн", 6, 2, 3));
        mll.addPlanetToList(new Planet("Юпитер", 5, 1, 2));
    }

    @Test
    public void sortedByDistanceToSun() {
        // Given
        String[] planets = new String[]{"Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун"};
        int index = 0;

        // When // Then
        for (Planet p : mll) {
            assertEquals(planets[index], p.getName());
            index++;
        }
    }

    @Test
    public void sortedByMass() {
        // Given
        String[] planets = new String[]{"Юпитер", "Сатурн", "Нептун", "Уран", "Земля", "Венера", "Марс", "Меркурий"};
        int index = 0;
        mll.sortBy(MultithreadedLinkedList.SortBy.Mass);

        // When // Then
        for (Planet p : mll) {
            assertEquals(planets[index], p.getName());
            index++;
        }
    }

    @Test
    public void sortedDiameter() {
        // Given
        String[] planets = new String[]{"Уран", "Юпитер", "Сатурн", "Нептун", "Земля", "Венера", "Марс", "Меркурий"};
        int index = 0;
        mll.sortBy(MultithreadedLinkedList.SortBy.Diameter);

        // When // Then
        for (Planet p : mll) {
            assertEquals(planets[index], p.getName());
            index++;
        }
    }
}
