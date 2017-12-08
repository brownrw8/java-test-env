package brownrw8.tasks;

public class StringBasedTask extends AbstractTask<String, Integer>{
    private String input;
    private Integer output;

    public StringBasedTask(String input) {
        this.input = input;
    }

    public void execute(){
        this.output = task(input);
    }

    protected Integer task(String input) {
        return input.length();
    }

    public Integer getResult() {
        return output;
    }
}
