public class Main {
    public static void main(String[] args) {
        Methods dt = new Methods();
        // Task №1-2
        System.out.println(dt.findSymbolOccurrence("HilleL!", 'L')); // Expected result: 3
        // Task №3
        System.out.println(dt.findWordPosition("Hillel!", "EL")); // Expected result: 4
        System.out.println(dt.findWordPosition("Hillel!", "go")); // Expected result: -1
        // Task №4
        System.out.println(dt.stringReverse1("Hillel!")); // Revers string variant #1. Expected result: !lelliH
        System.out.println(dt.stringReverse2("school")); // Revers string variant #2(better). Expected result: loohcs

        // Task №5 (To much easy option) =)))
        String s = "abcdcba";
        String s2 = "abcdca";
        System.out.println("\nTask №5 (isPolindrom)");
        System.out.print(s+"->"+s.equals(new StringBuilder(s).reverse().toString())+"; "); // Expected result: true
        System.out.print(s2+"->");
        System.out.println(s.equals(new StringBuilder(s2).reverse().toString())); // Expected result: false
        // Task №5 (Variant №2)
        System.out.print(s+"->");
        System.out.print(dt.isPalindrome(s));  // Expected result: true
        System.out.print("; "+s2+"->");
        System.out.println(dt.isPalindrome(s2)); // Expected result: false


    }
}
