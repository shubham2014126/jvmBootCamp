public class Q4 {

    public static void main(String args[]) {
        String data = "Hello HOW are you #123";
        int upper = 0;
        int lower = 0;
        int digit = 0;
        int others = 0;
        String Value=data.replaceAll(" ","");
        char[] charArray=Value.toCharArray();
        int totalChars= Value.length();

        for(int i=0; i<Value.length(); i++) {
            if (Character.isUpperCase(charArray[i])) {
                upper++;
            } else if(Character.isLowerCase(charArray[i])) {
                lower++;
            } else if(Character.isDigit(charArray[i])){
                digit++;
            } else {
                others++; }
        }
        System.out.println("Total length of the string :" +totalChars);
        System.out.println("Upper case :"+upper);
        System.out.println("Percentage of upper case letters: "+(upper*100)/totalChars);
        System.out.println("Lower case :"+lower);
        System.out.println("Percentage of lower case letters:"+(lower*100)/totalChars);
        System.out.println("Digit :"+digit);
        System.out.println("Percentage of digits :"+(digit*100)/totalChars);
        System.out.println("Others :"+others);
        System.out.println("Percentage of other characters :"+(others*100)/totalChars);
    }
}


