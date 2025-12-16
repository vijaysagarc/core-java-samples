package claude;

public class InitializationOrder {
  /*
    private static int staticVar1 = initStatic("staticVar1");
    private int instanceVar1 = initInstance("instanceVar1");

    static {
        System.out.println("Static block 1");
        staticVar2 = 200;
    }

    {
        System.out.println("Instance block 1");
        instanceVar2 = 20;
    }

    private static int staticVar2 = initStatic("staticVar2");
    private int instanceVar2 = initInstance("instanceVar2");

    static {
        System.out.println("Static block 2");
    }

    {
        System.out.println("Instance block 2");
    }

    public InitializationOrder() {
        System.out.println("Constructor");
    }

    private static int initStatic(String name) {
        System.out.println("Initializing static: " + name);
        return 100;
    }

    private int initInstance(String name) {
        System.out.println("Initializing instance: " + name);
        return 10;
    }*/
  public InitializationOrder() {
      System.out.println("Constructor");
  }

    {
        System.out.println("Instance block 2");
    }
    private int x=initvar("instvar");
  private int initvar(String x){
      System.out.println(x);
      return 100;
  }
    static {
        System.out.println("outside static");
        InitializationOrder obj3 = new InitializationOrder();

    }

    public static void main(String[] args) {
        System.out.println("\nmain method call");
        InitializationOrder obj3 = new InitializationOrder();


    }
}