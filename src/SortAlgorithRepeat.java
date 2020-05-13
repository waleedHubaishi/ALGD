public class SortAlgorithRepeat {

    public static void selectionSort(int[]a){
        for(int i=0;i<a.length;i++){
            int min=i;
            for(int j=0;j<a.length;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
    }

    public static void bubbleSort(int[]a){
        for(int i=0;i<a.length-1;i++){
            for(int j=a.length-1;j>i;j--){
                if(a[j-1] > a[j]){
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
            }
        }
    }

    public static void insertionSort(int[]a){
        for(int i=1;i<a.length;i++){
            for(int j=i;j>0 && a[j]<a[j-1];j--){
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
            }
        }
    }
}
