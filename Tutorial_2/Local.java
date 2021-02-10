public class Local {
    public void Age() {
        int age = 0;
        age = age + 5;
    }

    public static void main(String args[]) {
        int age = 50;
        System.out.println("Student age is: " + age); // print 50, not 5
    }
}
