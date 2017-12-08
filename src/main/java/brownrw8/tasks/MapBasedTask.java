package brownrw8.tasks;

import java.util.Map;

public class MapBasedTask extends AbstractTask<Map, Integer>{
    private Map input;
    private Integer output;

    public MapBasedTask(Map input) {
        this.input = input;
    }

    public void execute(){
        this.output = task(input);
    }

    protected Integer task(Map input) {
        return input.size();
    }

    public Integer getResult() {
        return output;
    }
}
