package fizzbuzz;

import jdk.nashorn.internal.objects.NativeString;

public class FizzBuzz {


    public static String fizzBuzz(String number) {
        int num = Integer.parseInt(number);
        if (num < 0 || num > 100) {
            return "Sai!!!!";
        } else {
            if (num % 15 == 0){
                return "FizzBuzz";
            } else if (num % 5 == 0 || containFive(number)){
                return "Buzz";
            } else if (num % 3 == 0 || containThree(number)){
                return "Fizz";
            } else {
                return "Convert to word";
            }
        }
    }

    private static boolean containThree(String number) {
        boolean check = false;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '3') {
                check = true;
                break;
            }
        }
        return check;
    }

    private static boolean containFive(String number) {
        boolean check = false;
        for (int i = 0; i < number.length(); i++){
            if (number.charAt(i) == '5'){
                check = true;
                break;
            }
        }
        return check;
    }
    public static String convertToWord(String number) {
        char[] numberByWord = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        String[] wordConvert = {"một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín", "mươi"};
        String firstWord = "";
        String secondWord = "";
        
        for (int j = 0; j < numberByWord.length; j++) {
            if (number.charAt(0) == numberByWord[j]) {
                firstWord += wordConvert[j];
                break;
            }
        }
        for (int j = 0; j < numberByWord.length; j++) {
            if (number.charAt(1) == numberByWord[j]) {
                secondWord += wordConvert[j];
                break;
            }
        }
        return firstWord + " " + secondWord;
    }
}
