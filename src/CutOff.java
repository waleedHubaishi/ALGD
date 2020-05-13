public class CutOff {


    public static void sort(int[]a){

    }

    public static void quickSort(int[]a, int beg, int end){
        if(beg<end){

            int m=(end+beg)>>1;
            int i=0,j=beg,k=end;

            while(j<=k){

                while(a[j]<a[m]) j++;
                while(a[k]>a[m]) k--;

                if(j<=k){
                    int temp = a[j];
                    a[j] = a[k];
                    a[k] = temp;

                    if(j == m) m=k;
                    else if(k == m) m=j;
                    j++;
                    k--;
                }

            }

            quickSort(a,beg,k);
            quickSort(a,j,end);

        }


    }

    public static void insertionSort(int[]a){
        for(int i=1;i<a.length;i++){
            for(int j=i;j>0 && a[j-1]>a[j];j--){
                int temp=a[j];
                a[j] = a[j-1];
                a[j-1]=temp;
            }
        }

    }
}
