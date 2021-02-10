public class Instance {
    int age;

    public static void main(String args[]) {
        Instance student1 = new Instance();
        student1.age = 10;

        Instance student2 = new Instance();
        student2.age = 5;
        student2.setAge(15);

        System.out.println("Student 1 age is: " + student1.age); // print 10
        System.out.println("Student 2 age is: " + student2.age); // print 15
    }

    public void setAge(int newAge) {
        age = newAge;
    }

}
