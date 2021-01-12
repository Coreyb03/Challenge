import java.util.Random;
public class ComparisonSorts {
    
    public static Random random = new Random();
    public static final int NUM_TEST = 10000;
    public static final int TEST_DATA_SIZE = 10;
    public static final int RANDOM_RANGE = 100;

    public static void main(String[] args) {
        testSort("selection", NUM_TEST);    
        testSort("insertion", NUM_TEST);
        testSort("bubble", NUM_TEST);
    }

    public static void testSort(String method, int times) {
        for (int test = 0; test < times; test++){
            int[] data = createTestData(TEST_DATA_SIZE);
            int[] orig = duplicate(data);
            
            sortUsing(data, method);
            
            if (!isSortedAsc(data)){
                printSortErrorMessage(method, data, orig);
                return;
            }
        }
        System.out.println("All tests sorted correctly for " + method + "\n");
    }

    public static void sortUsing(int[] data, String method){
        if (method.toLowerCase().equals("selection")){
            selectionSort(data);
        } else if(method.toLowerCase().equals("insertion") ){
            insertionSort(data);
        } else {
            bubbleSort(data);
        }
    }

    public static void printSortErrorMessage(String method, int[] data, int[] orig){
        System.out.println("Error, during " + method);
        System.out.println("Oringinal data: ");
        print(orig);
        System.out.println("After sorting: ");
        print(data);
        System.out.println();
    }

    public static int[] createTestData(int amount){
        int[] data = new int[amount];
        for (int i = 0; i < data.length; i++){
            data[i] = random.nextInt(RANDOM_RANGE);
        }
        return data;
    }


    public static void print(int[] data){
        System.out.print("[");
        for (int i = 0; i < data.length; i++){
            System.out.print(data[i]);
            if (i < data.length -1 ){
                System.out.print(",");
            }
        }
        System.out.print("]\n");
    }

    public static boolean isSortedAsc(int[] data){
        for (int i = 0;i < data.length -1 ;i++){
            if (data[i+1] < data[i]){
                return false;
            }
        }
        return true;
    }

    public static int[] duplicate(int[] data){
        int[] dup = new int[data.length];
        for (int i = 0; i < data.length; i++){
            dup[i] = data[i];
        } 
        return dup;
    }

    public static void bubbleSort(int[] data){
        for (int x = 1; x < data.length; x++ ){
            for (int i =0; i < data.length - x; i++){
                if (data[i] > data[i+1]){
                    int temp = data[i];
                    data[i] = data[i+1];
                    data[i+1] = temp;
                }
            }
        }
    }

    public static void insertionSort(int[] data){ 
        for (int i = 1; i < data.length; ++i) { 
            int temp = data[i]; 
            int j = i - 1; 
            while (j >= 0 && data[j] > temp) { 
                data[j + 1] = data[j]; 
                j = j - 1; 
            } 
            data[j + 1] = temp; 
        } 
    }

    public static void selectionSort(int[] data){
        for(int i = 0; i < data.length-1; i++){ 
            int min = i;
            for(int j = i+1; j < data.length; j++){
                if (data[min] > data[j]){
                    min = j;
                }
            }
            int temp = data[min]; 
            data[min] = data[i]; 
            data[i] = temp;
        }
    }
}
