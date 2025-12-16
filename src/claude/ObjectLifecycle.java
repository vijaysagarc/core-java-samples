package claude;

public class ObjectLifecycle {
    private String name;
    private static int objectCount = 0;

    // Constructor - called when object is created
    public ObjectLifecycle(String name) {
        this.name = name;
        objectCount++;
        System.out.println("Object '" + name + "' created. Total objects: " + objectCount);
    }

    // finalize() method - called before garbage collection
    @Override
    protected void finalize() throws Throwable {
        objectCount--;
        System.out.println("Object '" + name + "' is being garbage collected. Remaining: " + objectCount);
        super.finalize();
    }

    public static int getObjectCount() {
        return objectCount;
    }
}

