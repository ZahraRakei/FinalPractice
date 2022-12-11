package stringMethods;

public class StringMethodsPractice {


    public static void main(String[] args) {

        reverseText("Mary");
       if( isPalindrome("Mom")){
           System.out.println("is palindrome");
       } else{
           System.out.println("isn't palindrome");
       }

    }

//            String text = "bahamas";

    public static char[] reverseText(String text) {
        char[] textArray = text.toLowerCase().toCharArray();
        int length = textArray.length;
        char[] reversedArray = new char[length];
        for (int i = length - 1; i >= 0; i--) {
            reversedArray[(length - 1) - i] = textArray[i];
        }


        for (char c : reversedArray) {
            System.out.println(c);
        }


//
//
        return reversedArray;
    }

    public static boolean isPalindrome(String text) {
       char[] normalArray = text.toLowerCase().toCharArray();
       char[] reversedArray = reverseText(text);

       int length = normalArray.length;


       for (int i = 0 ; i < length; i++){
           if (normalArray[i] != reversedArray[i]){


               return false;
           }
           }


        return true;
    }
}

