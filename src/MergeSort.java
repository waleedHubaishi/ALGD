public class MergeSort {

    public static void sort(int a[], int beg, int end){
        if(end-beg>1){
            int m = (beg+end)>>1;
            sort(a,beg,m);
            sort(a,m,end);
            merge(a,beg,m,end);
        }
    }

    public static void merge(int a[], int beg, int m, int end){

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

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,4,3,2,1};
        sort(arr,0,arr.length);

        for (int n:
             arr) {
            System.out.println(n);
        }
    }
}
