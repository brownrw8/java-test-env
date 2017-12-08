package brownrw8.tasks;

public abstract class AbstractTask<T, K> implements TaskInterface<T, K> {
    abstract K task(T input);
}
