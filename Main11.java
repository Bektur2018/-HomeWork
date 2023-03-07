package Aravan;

public class Main11 {
    static String[] array = new String[]{"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI",
            "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV",};
    public static boolean roman(String one){
        for (int i = 0; i < array.length; i++) {
            if (one.equals(array[i])){
                return true;

            }
        }
        return false;
    }
    public static int  general(String alburo){
        for (int i = 0; i < array.length; i++) {
            if (alburo.equals(array[i])){
                return i;
            }

        }
        return -1;
    }
    public static String convertTo(int arab) {
        return array[arab];
    }
}
