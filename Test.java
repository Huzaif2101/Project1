public class Test {
    public static void main(String[] args) {
        Generator generator = new Generator();
        Password password = generator.generate(12, true, true, true, true);
        System.out.println("Test password: " + password);
    }
}
