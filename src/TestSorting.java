public class TestSorting {

    public static void sort(int[]a, int beg, int end){

        if(end-beg>1){
            int m = (beg+end)>>1;
            sort(a, beg,m);
            sort(a,m,end);
            merge(a,beg,m,end);
        }

    }

    public static void merge(int[]a, int beg, int m, int end){

        int[]b = new int[end-beg];
        int j=beg, k = m, i=0;

        while(j<m && k< end){

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

            int m = (end+beg)>>1;
            int j=beg,k=end;

            while(j<=k){
                while(a[j]<a[m]) j++;
                while(a[k]>a[m]) k--;

                if(j<=k){
                    int temp = a[j];
                    a[j] = a[k];
                    a[k]=temp;
                }

                if(j == m) m = k;
                else if (k == m) m = j;

                j++;
                k--;
            }

            quickSort(a,beg,k);
            quickSort(a,j,end);


        }
    }

    public static void main(String[] args) {
        int[]a= new int[]{1,2,3,4,5,5,4,3,2,1};
        //sort(a,0,a.length);
        quickSort(a,0,a.length-1);
        for (int n:
             a) {
            System.out.println(n);
        }
    }
}
