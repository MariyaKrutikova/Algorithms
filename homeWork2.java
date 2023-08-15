/** Реализовать алгоритм пирамидальной сортировки (сортировка кучей). */
import java.util.Random;

public class homeWork2 {
    public static void main(String[] args) {

        int size = 8;
        int min = 0;
        int max = 8;
        int[] array = getRandomArr(size, min, max);
        printArr(array);
        heapSort(array);
        printArr(array);

    }

    /**
    * @apiNote print array into console
    * @param arr - array to print
    */
    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
        
    /**
    * create psevdo-random int array
    * @param size - size of the array to form
    * @param min - min value of array
    * @param max - max value of array
    * @return - array created
    */
    private static int[] getRandomArr(int size, int min, int max) {
        Random rand = new Random();
        int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = rand.nextInt((max - min) + 1) + min;
            }
        return arr;
    }

    
    /**
    * @param array - исходный массив
    * @param heapSize - размер кучи
    * @param rootIndex - индекс корня кучи
    * @apiNote Метод реализующий пиромидально сортировки, принимающий на вход три аргумента
    */
    public static void heapCreate(int[] array, int heapSize, int rootIndex) {
        int largest = rootIndex;
        int leftChild = 2*largest+1;
        int rightChild = 2*largest+2;

        if(leftChild < heapSize && array[leftChild] > array[largest]) {
            largest = leftChild;
        }

        if(rightChild < heapSize && array[rightChild] > array[largest]) {
            largest = rightChild;
        }

        if (largest != rootIndex) {
            int temp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = temp;

            heapCreate(array, heapSize, largest);
        }        
    }

    /**
     * 
     * @param array - исходный массив
     * @apiNote - метод пирамидальной сортировки
     */
    public static void heapSort(int[] array) {
        for (int i = array.length/2-1; i >=0 ; i--) {
            heapCreate(array, array.length, i);
        }

        for (int i = array.length-1; i >=0 ; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapCreate(array, i, 0);
        }
    }
}

    