public class MyInfo {

    public static void main(String[] args) {

        if (args.length < 3) {
            System.out.println("Usage: MyInfo <name> <age> <email>");
            return;
        }

        String name = args[0];
        String age = args[1];
        String email = args[2];

        System.out.println("My User Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
    }
}