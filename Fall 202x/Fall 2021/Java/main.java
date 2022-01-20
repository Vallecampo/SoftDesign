public class MainClass {

ublic static void main(String[] args) {
    int foo = 2;
    myMethod(foo);
    System.out.println(foo);
}
public static void myMethod(int foo) {
    System.out.println("foo");
    foo = 5;
}
}