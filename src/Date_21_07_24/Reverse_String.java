package Date_21_07_24;

public class Reverse_String {
    public static void main(String[] args) {
//        String as= "Ashpak Shaikh is my Name";
//        String reverse = " ";
//        for (int i = 0; i < as.length() ; i++) {
//            reverse = as.charAt(i)+reverse;
//
//        }
//        System.out.println(reverse);
//
//        }
        String original = "Hello, World!";
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        System.out.println("Original string: " + original);
        System.out.println("Reversed string: " + reversed);
}

}

