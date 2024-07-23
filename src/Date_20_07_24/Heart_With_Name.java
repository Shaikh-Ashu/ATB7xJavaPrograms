package Date_20_07_24;

public class Heart_With_Name {

        public static void main(String[] args) {
            String name = "Ashpak";
            int n = name.length();
            int mid = n / 2;

            // Print upper part of the heart
            for (int i = n/2; i <= n; i += 2) {
                for (int j = 1; j < n-i; j += 2) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                for (int j = 1; j <= n-i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            // Print middle part of the heart with name
            for (int i = n; i >= 1; i--) {
                for (int j = i; j < n; j++) {
                    System.out.print(" ");
                }
                if (i == mid) {
                    System.out.print(name);
                    for (int j = 1; j <= (i*2) - name.length(); j++) {
                        System.out.print("*");
                    }
                } else {
                    for (int j = 1; j <= (i*2)-1; j++) {
                        System.out.print("*");
                    }
                }
                System.out.println();
     }
}
    }


