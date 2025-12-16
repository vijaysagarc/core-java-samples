package claude;

// Demonstration
public class Main {
    public static void main(String[] args) {
        ObjectLifecycle obj1 = new ObjectLifecycle("Object1");
        ObjectLifecycle obj2 = new ObjectLifecycle("Object2");

        System.out.println("Current object count: " + ObjectLifecycle.getObjectCount());

        // Make objects eligible for garbage collection
        obj1 = null;
        obj2 = null;

        // Suggest garbage collection (not guaranteed to run immediately)
        System.gc();

        // Give garbage collector time to run
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
