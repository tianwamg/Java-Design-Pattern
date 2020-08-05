package creational.Multiton;

public class DefaultObjectPool extends ObjectPool<String> {
    @Override
    public PooledObject<String> create() {
        return new PooledObject<>(new String(""+1));
    }

    public static void main(String[] args) {
        ObjectPool<String> objPool = new DefaultObjectPool();
        objPool.create();
        String obj = objPool.getObject();
        objPool.returnObject(obj);
        objPool.closeObjectPool();
    }
}
