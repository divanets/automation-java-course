package qa.tasks.lesson2.loops;

public class LoopWithStars {

    public static void main(String[] args) {
 /*       String ch = "******";
        String num = "1";

        for(int i=1; i<=7; i++) {
            System.out.println(num + ch);
            if(ch != null && ch.length() >0 ) {
                ch = ch.substring(0, ch.length()-1);
            }
            num = num + (i+1);
        }
        if ((num+ch).length() < 7 || (num+ch).length()> 7 ){
            System.out.println("Something does wrong! Incorrect length");
        }*/

        for (int i = 1; i < 8; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i; j < 7; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
