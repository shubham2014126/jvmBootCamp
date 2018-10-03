public class Ques2 {

    public static void main(String[] args) {
        char temp;
        String str = "shubhamvirmani";
        char str1[] = str.toCharArray();
        for (int i = 0; i<str1.length; i++) {
            for (int j = 0; j < str1.length- 1; j++) {
                if (str1[j] > str1[j + 1]) {
                    temp = str1[j];
                    str1[j] = str1[j + 1];
                    str1[j + 1] = temp;

                }
            }
        }


        System.out.println(str1);
    }
}



