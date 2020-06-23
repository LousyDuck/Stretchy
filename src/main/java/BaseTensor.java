import java.util.List;

public abstract class BaseTensor<T extends  TensorValue<?>> implements TensorValue<List<T>> {
    private final List<T> elements;

    protected BaseTensor(List<T> elements) {
        this.elements = elements;
    }

    @Override
    public List<T> get() {
        return elements;
    }
}
