package first;

public class FirstClass {
    private static int a;
	public static int g;
	public static int l;
	public static int v;

    public static void set (int value) {
        a = value;
    }

    public static int get () {
        return a;
    }

    public static void main(String args[]) {
        FirstClass firstClass = new FirstClass();
        firstClass.set(5);
        System.out.println(firstClass.get());
    }
}

