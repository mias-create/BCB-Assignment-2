package firstcode;

public class main {
    public static int countEvenNum(int[] arr, int size) {
        int count = 0;
        for(int i = 0; i < size; i++) {
            if(arr[i] % 2 == 0)
                count++;
        }
        return count;
    }


    public static void main(String[] args) {
        int[] foo = {0, 1, 2, 3, 4};
        int[] centi = new int[100];
        int fooE;
        int barE;

        for(int i = 0; i < 100; i++) {
            centi[i] = i;
        }

        fooE = countEvenNum(foo, 5);
        barE = countEvenNum(centi, 100);

        System.out.println("The number of even numbers in foo is: " + fooE);
        System.out.println("The number of even numbers in centi is: " + barE);

    }
}
