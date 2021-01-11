public class ArrayChallenge{
    public static void main(String[] args) {
        int[] data = {2,6,40,10,5};
        System.out.println(search(data, 10));
        bubbleSort(data);
        printArray(data);

        int[] data2 = {3,55,7,1,999};
        insertionSort(data2);
        printArray(data2);

        int[] data3 = {1,4,88,25,9};
        selectionSort(data3);
        printArray(data3);
    }

    public static int search(int[] data, int number){
        for (int i =0; i < data.length; i++){
            if (data[i] == number){
                return i;
            }
        }
        return -1;
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

    public static void printArray(int[] data){
        for (int i =0; i < data.length; i++){
            System.out.println(data[i]);
        }
    }
}