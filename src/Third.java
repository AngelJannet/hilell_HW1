public class Third {
    public static void main(String[] args) {
        for (int j=1, countz1=12 ,countz2=29; j<8; j++) {
            for (int i = 1; i < 30; i++) {

                if (j==1||j==7) {
                    System.out.print((i >= 1 && i <= 7 || i >= 12 && i <= 18 || i >= 23 && i <= 29)?"*":" ");
                }
                else {
                    System.out.print(i==1 || i==7|| i==countz1 || i==countz2?"*":" ");
                }
            }
            System.out.println();
            countz1++;
            countz2--;
        }
    }
}
//    Using ONLY loops and conditions write a program that prints these figures into output:
//
//
//        #######    #######    #######
//        #     #     #              #
//        #     #      #            #
//        #     #       #          #
//        #     #        #        #
//        #     #         #      #
//        #######    #######    #######
