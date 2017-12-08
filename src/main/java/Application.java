import brownrw8.tasks.ListBasedTask;

import java.util.*;

public class Application {
    public static void main(String [ ] args)
    {
        List<String> L = new ArrayList<String>();
        L.add("Test String 1");
        L.add("Test String 2");
        L.add("Test String 3");
        L.add("Test String 4");

        ListBasedTask task = new ListBasedTask(L);
        task.execute();
        System.out.println(task.getResult() + "");
    }
}
