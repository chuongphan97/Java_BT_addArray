import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size 1: ");

        int size1 = scanner.nextInt();
        int[] arr1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            arr1[i] = (int)Math.round(Math.random()*100+1);
        }
        System.out.print("Elements of arr1: ");
        for (int i :
                arr1) {
            System.out.print(i+"\t");
        }
        System.out.println();

        System.out.println("Enter size 2: ");

        int size2 = scanner.nextInt();
        int[] arr2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            arr2[i] = (int)Math.round(Math.random()*100+1);
        }
        System.out.print("Elements of arr2: ");
        for (int i :
                arr2) {
            System.out.print(i+"\t");
        }
        System.out.println();
        System.out.print("Elements of new array: ");
        int[] newArr = addArray(arr1,arr2);
        for (int i :
                newArr) {
            System.out.print(i+"\t");
        }


    }

    public static int[] addArray(int[] arr1, int[] arr2){
        int size = arr1.length + arr2.length;
        int[] newArr = new  int[size];
        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            newArr[i+arr1.length] = arr2[i];
        }
              {

        }
        return newArr;
    }
}
