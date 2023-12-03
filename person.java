public class person {
    public static void main(String[] args) {

        System.out.print(addNum(1, 2));
        System.out.println("This is a commit from new branch");
        System.out.println("Hello branch");
    }
    
    static int addNum(int a, int b) {
        System.out.println("Hello world");
        return a + b + 2 + 90 * b;
    }
}
