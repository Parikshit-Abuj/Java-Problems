public class StringDigit {
    public static void main(String[] args) {

        String str = "12a3";

        for (int i = 0; i < str.length(); i++) {

            if (!Character.isDigit(str.charAt(i))) {
                System.out.println("String contains non-digit");
                return;
            }
        }

        System.out.println("Only digits");
    }
}
