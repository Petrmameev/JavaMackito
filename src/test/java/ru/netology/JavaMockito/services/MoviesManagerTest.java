import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviesManagerTest {
    @Test
    public void shouldShowThreeLastMovies(){
        MoviesManager manager = new MoviesManager();
        manager.add("first");
        manager.add("second");
        manager.add("third");

        String[] expected = {"first", "second", "third"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
