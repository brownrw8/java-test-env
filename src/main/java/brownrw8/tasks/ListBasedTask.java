package brownrw8.tasks;

import java.util.List;

public class ListBasedTask extends AbstractTask<List, Integer>{
    private List input;
    private Integer output;

    public ListBasedTask(List input) {
        this.input = input;
    }

    public void execute(){
        this.output = task(input);
    }

    protected Integer task(List input) {
        return input.size();
    }

    public Integer getResult() {
        return output;
    }
}
