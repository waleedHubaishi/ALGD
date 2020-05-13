public class QuickSort {

    public static void quickSort(int[]a, int beg, int end){
        if(beg<end){

            int j=beg;
            int k = end;
            int m=(beg+end)>>1;

            while(j<=k){

                while(a[j]<a[m]){j++;}
                while(a[k]>a[m]){k--;}

                if(j<=k){
                    int temp = a[j];
                    a[j] = a[k];
                    a[k] = temp;

                    if(j==m){ m = k;}
                    else if(k==m){m=j;}

                    j++;
                    k--;
                }

            }

            quickSort(a,beg,k);
            quickSort(a,j,end);

        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5,5,4,3,2,1};
        quickSort(a,0,a.length-1);
        for (int n:
             a) {
            System.out.println(n);
        }
    }
}
