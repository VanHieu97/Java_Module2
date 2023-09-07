import java.util.Arrays;
import java.util.Scanner;

public class arr {

    //        Scanner input = new Scanner(System.in);
//        System.out.println("Nhập vào độ dài của mảng: ");
//        int length = input.nextInt();
//        int[] arr = new int[length];
//        int size = 0;
////        while (size != length){
////            System.out.println("Nhập vào phần tử thứ: "+size);
////            int element = input.nextInt();
////            arr[size] = element;
////            size++;
////        }
//        System.out.println(Arrays.toString(arr));
//        size = addElement(arr,1,size);
//        size = addElement(arr,2,size);
//        size = addElement(arr,3,size);
//        size = addElement(arr,4,size);
//        size = addElement(arr,5,size);
//        System.out.println(Arrays.toString(arr));
//        System.out.println("Số phần tử trong mảng là: "+ size);
//
//        size = delete(arr,3,size);
//        System.out.println(Arrays.toString(arr));
//        System.out.println("Số phần tử còn lại trong mảng là:"+size);
//        size = search(arr,3,size);
//        System.out.println("Vị trí tìm thấy phần tử có trong mảng là:"+size);
//
//
//    }
    // thêm phần tử vào mảng.
//    public static int addElement(int[] arr,int element,int size){
//       arr[size] = element;
//       size++;
//       return size;
//    }
//tìm vị trí phần tử trong mảng.
//    public static int search(int[]arr,int searchIndex,int size){
//        for (int i = 0; i < size; i++) {
//            if(arr[i] == searchIndex){
//                return i;
//            }
//        }
//        return -1;
//    }
    //xóa phần tử khỏi mảng.
//    public static int delete(int[]arr,int element,int size){
//        int index = search(arr,3,size);
//        for (int i = index; i < size-1 ; i++) {
//            arr[i] = arr[i+1];
//        }
//        arr[size-1]=0;
//        size--;
//        return size;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Nhập vào độ dài của mảng Arr: ");
//        int length = input.nextInt();
//        int[] Arr = new int[length];
//        int size = 0;
//        size = addElement(Arr, 1, size);
//        size = addElement(Arr, 2, size);
//        size = addElement(Arr, 3, size);
//        size = addElement(Arr, 4, size);
//        size = addElement(Arr, 5, size);
//        size = addElement(Arr, 6, size);
//        System.out.println("Số phần tử có trong mảng là: " + size);
//        System.out.println(Arrays.toString(Arr));
//        insertElement(Arr,3,6,size);

// thêm một phần từ mới.
    //    public static int addElement(int[] Arr, int element, int size) {
//        Arr[size] = element;
//        size++;
//        return size;
//    }
//    public static int insertElement(int[]Arr,int addElement, int Index,int size){
//        if(Index <= -1|| Index > Arr.length-1 || size == Arr.length){
//            System.out.println("Ko thể chèn thêm phần tử vào mảng full!");
//        }else {
//            for (int i = size; i > Index ; i--) {
//                Arr[i]=Arr[i-1];
//            }
//            Arr[Index] = addElement;
//            System.out.println(Arrays.toString(Arr));
//
//        }
//        return 1;

        //Gộp 2 mảng.
//        int[] numberA = {1, 2, 3, 4, 5, 6, 7};
//        int[] numberB = {11, 22, 33, 44, 55, 66, 77};
//        int[] numberC = new int[14];
//        int[] Arr = concatArr(numberA, numberB, numberC);
//        System.out.println(Arrays.toString(Arr));

//    public static int[] concatArr(int[] numberA,int[] numberB,int[] numberC){
//        int connection = 0;
//        for (int element : numberA) {
//            numberC[connection] = element;
//            connection++;
//        }
//        for (int element : numberB) {
//            numberC[connection] = element;
//            connection++;
//        }
//        return numberC;
//    }
public static void main(String[] args) {
    //Tìm max trong mảng 2 chiều.
//        int[][] number = {{1,2,3,4},{5,6,10,8,11}};
//        int maxArr = number[0][0];
//        for (int i = 0; i < number.length; i++) {
//            for (int j = 0; j < number[i].length; j++) {
//                if(maxArr < number[i][j]){
//                    maxArr = number[i][j];
//                }
//            }
//        }
//        System.out.println(maxArr);
    }
}





