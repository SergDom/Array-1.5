public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        int[] firstArr = new int[3];

        double[] secondArr = new double[] {1.57,7.654, 9.986};

        int [] thirdArr = new int[4];
        thirdArr [0] = 2;
        thirdArr [1] = 4;
        thirdArr [2] = 8;
        thirdArr [3] = 10;

        System.out.println();
        System.out.println("Задание 2");

        firstArr [0] = 1;
        firstArr [1] = 2;
        firstArr [2] = 3;
        for (int i=0; i<3; i++) {
        System.out.print(firstArr[i] + " , ");
        }
        System.out.println();
        for (int j=0; j<3; j++) {
            System.out.print(secondArr[j] + " , ");
        }
        System.out.println();

        for (int k=0; k<4; k++) {
           System.out.print(thirdArr[k] + " , ");

        }

        System.out.println();
        System.out.println("Задание 3");
        for (int i=firstArr.length-1; i>=0; i--) {
            System.out.print(firstArr[i] + " ");}

        System.out.println();
        for (int j=secondArr.length-1; j>=0; j--) {
            System.out.print(secondArr[j] + " ");}

        System.out.println();
        System.out.println("Задание 4");

        for (; i % 2 !=0; i++) {
        System.out.print(firstArr[i] + " , ");}
    }
}