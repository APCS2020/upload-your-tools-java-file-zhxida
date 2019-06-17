import java.util.Scanner;

public class tools{
    /**print a line on the screen
     * @param length how many times print charactor str
     * @param str the charactor for print
     */
        //method 1
        public static void printLine(int length, String str){
            for(int i = 0; i < length; i++){
                System.out.print(str);
            }
            System.out.println();
        }
   
    /**print a square on the screen
     * @param length the dimension of the square
     * @param str the character for print
     */
        //method 2
        public static void printSquare(int length, String str){
            for(int i = 0; i < length; i++){
                printLine(length, str);
            }
        }
   
    /**print a rectangle on the screen
     * @param length the length of rectangle
     * @param width the width of rectangle
     * @param str the character for print
     */   
        //method 3
        public static void printRectangle(int length, int width, String str){
            for(int i = 0; i < width; i++){
                printLine(length, str);
            }
        }

    /** get an integer from user input
     * @param str the character you want to print before user input number
     */
        //get an integer from user input
        public static int getInt(String str){
            System.out.println(str);
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            return num;
            //input.close();
        }
       
        //get a String
        public static String getStra(){
            System.out.print("Enter a String:");
            Scanner in = new Scanner(System.in);
            String s = in.nextLine();
            return s;
        }

        public static String getStrb(String str){
            System.out.print(str);
            Scanner in = new Scanner(System.in);
            String s = in.nextLine();
            return s;
        }

        ///add method
        public static int add(int a, int b){
            return a + b;
        }

        /**change a to 5
         * but this method don't work as intended
         * because java pass parameter by value
         */
        public static void modify(int a){//local variable
            a = 5;
        }

        public static int change(int a){//return a new value minus 5
            return a - 5;
        }

        public static String getWeek(int a){
            if(a == 1){
                return "Monday";
            }else if(a == 2){
                return "Tuesday";
            }else if(a == 3){
                return "Wednsday";
            }else if(a == 4){
                return "Thurdasy";
            }else if(a == 5){
                return "Friday";
            }else if(a == 6){
                return "Saturday";
            }else if(a == 7){
                return "Sunday";
            }
            else{
                return "no result!";
            }
        }
}