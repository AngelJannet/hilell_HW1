import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text, please:");
        String  str=sc.nextLine();
        char [] array;
        array=str.toCharArray();
        for (int i=0; i< array.length;i++){
            if(i==0 && Character.isLetter(array[0])){
                array[0]=Character.toUpperCase(array[0]);
            }
            else if(!Character.isLetter(array[i]) && Character.isLetter(array[i+1])) {
                array[i + 1] = Character.toUpperCase(array[i + 1]);
            }
        }
        System.out.println(array);
    }
}
//    Given any sentence. Write a program that will change first letter of each word to capital letter
//
//EXAMPLE:
//        input:    "This is just an example string for test"
//        output: "This Is Just An Example String For Test"
