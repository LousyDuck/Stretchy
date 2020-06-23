import java.util.function.Supplier;

public interface TensorValue<T> extends Supplier<T> {
    TensorValue<T> add(TensorValue<T> value);
    TensorValue<T> sub(TensorValue<T> value);
    TensorValue<T> mul(TensorValue<T> value);
    TensorValue<T> div(TensorValue<T> value);
}
