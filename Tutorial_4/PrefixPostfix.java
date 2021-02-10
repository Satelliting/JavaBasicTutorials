package Tutorial_4;

public class PrefixPostfix {
    public static void main(String[] args) {
        // original value
        int i = 3;

        // postfix 4
        i++;

        // prefix 5
        ++i;

        // prefix: prints 6
        System.out.println("Prefix:" + ++i);

        // postfix: prints 6
        System.out.println("Postfix:" + i++);

        // final: prints 7
        System.out.println("Final Value:" + i);
    }
}
