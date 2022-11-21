public class Methods {

    // Task 1-2
    // Пошук символа проходить не залежно від регістру символів.
    // Привожу у верхній регістр.
    int findSymbolOccurrence(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.toUpperCase().charAt(i) == Character.toUpperCase(c))
                count++;
        }
        return count;
    }

    //Tska 3
    // Пошук символа проходить не залежно від регістру символів.
    // Привожу у верхній регістр.
    int findWordPosition(String source, String target) {
//        return source.indexOf(target);
        return source.toUpperCase().indexOf(target.toUpperCase());
    }

    // Task 4
    //Varian №1
    String stringReverse1(String str) {
        char[] stringRevers = new char[str.length()];
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            stringRevers[i] = str.charAt((str.length() - 1) - i);
            res += stringRevers[i];
        }
        return res;
    }

    //Varian №2 (better)
    String stringReverse2(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            res += str.charAt((str.length() - 1) - i);
        }
        return res;
    }

    // Task 5
    boolean isPalindrome(String value) {
        String s1 = "";
        String s2 = "";
            for (int j = 0; j < value.length(); j++) {
              s1+=value.charAt(j);
              s2+=value.charAt((value.length()-1)-j);
            }

        return s1.equals(s2);
    }

}
