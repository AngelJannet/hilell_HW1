import java.util.Scanner;

public class Second {
    public static void main(String[] args) {

    int HumanYears=1;
    int CatYears=15;
    int DogYears=15;
        System.out.println("Please, enter HumanYears ");

        //user has 3 attempts to enter data
for (int i=1; i<4;) {
    Scanner sc = new Scanner(System.in);
    if (sc.hasNextInt()) {
        HumanYears = sc.nextInt();
        i=4;

        if (HumanYears==2) {
            CatYears= DogYears=24;
        }
        else if(HumanYears>2) {
            CatYears= CatYears+9+(HumanYears-2)*4;
            DogYears= DogYears+9+(HumanYears-2)*6;
        }
        System.out.println("HumanYears: "+ HumanYears);
        System.out.println("CatYears: "+ CatYears);
        System.out.println("DogYears: "+DogYears);

    } else {
        if(i==3){
            System.out.println("You've exhausted all your attempts!");
        }else
        System.out.println("It is not whole numbers! Please, enter HumanYears. You still have " +(3-i)+ " attempts");
        i++;
        continue;
    }
    sc.close();
}
    }
}
// I have a cat and a dog. I got them at the same time as kitten/puppy. That was humanYears years ago. Calculate their respective ages now.
//
//             NOTES:
//     humanYears >= 1
//     humanYears are whole numbers only
//
//     Cat Years:
//             15 cat years for first year
// +9 cat years for second year
// +4 cat years for each year after that
//
//     Dog Years:
//             15 dog years for first year
// +9 dog years for second year
// +6 dog years for each year after that
//
//     EXAMPLE output:
//     HumanYears: 4
//     CatYears: 32
//     DogYears: 36
