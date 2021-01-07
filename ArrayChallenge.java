public class ArrayChallenge{
    public static void main(String[] args) {
        int[] data = {2,6,40,10,5};
        System.out.println(search(data, 10));
        sort(data);
        printArray(data);
    }

    public static int search(int[] data, int number){
        for (int i =0; i < data.length; i++){
            if (data[i] == number){
                return i;
            }
        }
        return -1;
    }

    public static void sort(int[] data){
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
    public static void printArray(int[] data){
        for (int i =0; i < data.length; i++){
            System.out.println(data[i]);
        }
    }
}