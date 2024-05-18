public class Password {
    private static final String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String lower = "abcdefghijklmnopqrstuvwxyz";
    private static final String characters = "!#$%&*?";
    private static final String nums = "1234567890";

    public static String generatePassword(int length) throws Exception {
        if (length < 1 || length > 100) {
            throw new Exception("Please input a valid length");
        }
        
        String password = "";

        for (int i = 0; i < length; i++) {
            int random = (int) (Math.random() * 4);
            String selectedList = "";

            if (random == 0) {
                selectedList = upper;
            } else if (random == 1) {
                selectedList = lower;
            } else if (random == 2) {
                selectedList = characters;
            } else if (random == 3) {
                selectedList = nums;
            }
            
            int randomIndex = (int) (Math.random() * selectedList.length());
            password += selectedList.substring(randomIndex, randomIndex + 1);
        }
        
        return password;
    }
}
