public class App {
    public static void main(String[] args) throws Exception {
        String generatedPassword = Password.generatePassword(20);
        System.out.println(generatedPassword);
        
    }
}
