public class SequnetialSearch {

    public static int seqSearch(int[]a, int value){

        int i=0;
        while(i<a.length && a[i]!=value){
            i++;
        }
        return i<a.length?i:-1;
    }

    public static boolean signWechsel(int[]a){

        int i=1;
        while(i<a.length && (a[i] == 0 || a[i-1] == 0 || (a[i]<0) != (a[i-1]<0))){
            i++;
        }

        return i==a.length;
    }

    public static int wordAppears(String[]words, String word){

        int i=0;
        while(i<words.length && !(words[i].equalsIgnoreCase(word))){
            i++;
        }

        return i==words.length?-1:i;
    }

    public static void dutchFlag(int[]a){
        int l = 0,m=0,h=a.length-1;

        while(m<=h){
            if(a[m] == 0){
                int temp = a[m];
                a[m] = a[l];
                a[l] = temp;
                l++;
                m++;
            }

             else if(a[m] == 1){
                m++;
            }

             else if(a[m] == 2){
                int temp = a[m];
                a[m] = a[h];
                a[h] = temp;
                h--;
            }
        }
    }

    public static int binarySearch21(int[]a, int value){
        int l=-1,h=a.length;

        while(l!=h){
            int m=(l+h)>>1;

            if(a[m]<=value){
                l = m+1;
            }
            else{
                h=m;
            }
        }
        return l-1;
    }

    public static void main(String[] args) {
        int[]a = new int[]{1,2,3,4,5,6,7};
        //System.out.println(seqSearch(a,1));

        int[]b = new int[]{1,-2,0,0,5,6,-7};
        //System.out.println(signWechsel(b));

        String[]words = new String[]{"this","is","a","test","Test"};
        //System.out.println(wordAppears(words,"Testt"));

        int[]c = new int[]{0,1,2,0,2,1,0,1,2};
       /* dutchFlag(c);
        for (int n:
             c) {
            System.out.println(n);
        }*/

       int[] d = new int[]{1,2,3,5,6,7,2,3,1,5,6,7};
        System.out.println(binarySearch21(d,4));

    }
}
