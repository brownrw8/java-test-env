package brownrw8.tasks;

public interface TaskInterface<T, K> {
    void execute();
    K getResult();
}
