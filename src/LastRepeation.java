public class LastRepeation {


    public static void insertionSort(int[]a){
        for(int i=1;i<a.length;i++){
            for(int j=i;j>0 && a[j]<a[j-1];j--){
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
            }
        }
    }

    public static void bubbleSort(int[]a){
        for(int i=0;i<a.length-1;i++){
            for(int j=a.length-1;j>i;j--){
                if(a[j]<a[j-1]){
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[]a){
        for(int i=0;i<a.length;i++){
            int min = i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min = j;
                }
            }

            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
    }

    public static void sort(int a[], int beg, int end){
        if(end-beg>1){
            int m = (beg+end)>>1;
            sort(a,beg,m);
            sort(a,m,end);
            merge(a,beg,m,end);
        }
    }

    public static void merge(int[]a, int beg, int m, int end){
        int[]b = new int[end-beg];
        int i = 0 , j=beg, k=m;

        while(j<m && k<end){
            if(a[j]<= a[k]){
                b[i++] = a[j++];
            }
            else{
                b[i++] = a[k++];
            }
        }

        while(j<m){
            b[i++] = a[j++];
        }

        while(i>0){
            i--;
            a[beg+i] = b[i];
        }
    }

    public static void quickSort(int[]a, int beg, int end){

        if(beg<end){

            int i=0,j=beg,k=end;
            int m = (beg+end)>>1;

            while(j<=k){
                while(a[j]<a[m])j++;
                while(a[k]>a[m]) k--;

                if(j<=k){
                    int temp = a[j];
                    a[j] = a[k];
                    a[k] = temp;

                    if(m == k) m = j;
                    else if (m == j ) m = k;

                    j++;
                    k--;


                }

            }

            quickSort(a,beg,k);
            quickSort(a,j,end);
        }

    }



    public static void main(String[] args) {
        int[]a = new int[]{1,3,4,3,2,1,5,7};

        //insertionSort(a);
        //bubbleSort(a);
        //selectionSort(a);
        //sort(a,0,a.length);
        quickSort(a,0,a.length-1);
        for (int n:
             a) {
            System.out.println(n);
        }
    }

}
