public interface TensorValue {
    Object get();
    TensorValue add(TensorValue value);
    TensorValue sub(TensorValue value);
    TensorValue mul(TensorValue value);
    TensorValue div(TensorValue value);
}
