import brownrw8.tasks.*;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class TaskTestSuite {

    @Test
    public void testListBasedTask() {
        List<String> L = new ArrayList<>();
        L.add("Test String 1");
        L.add("Test String 2");
        L.add("Test String 3");
        L.add("Test String 4");

        ListBasedTask task = new ListBasedTask(L);
        task.execute();

        assertTrue(4 == task.getResult());
    }

    @Test
    public void testMapBasedTask() {
        Map<String, String> M = new HashMap<>();
        M.put("Test Key 1", "Test String 1");
        M.put("Test Key 2", "Test String 2");
        M.put("Test Key 3", "Test String 3");
        M.put("Test Key 4", "Test String 4");

        MapBasedTask task = new MapBasedTask(M);
        task.execute();

        assertTrue(4 == task.getResult());
    }

    @Test
    public void testStringBasedTask() {
        String S = "Cool";

        StringBasedTask task = new StringBasedTask(S);
        task.execute();

        assertTrue(4 == task.getResult());
    }
}