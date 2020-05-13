public class TextSuche {


    public static int naiveSuche(String text, String pattern){

        int i=0;
        int start = 0;

        while(start+pattern.length()<=text.length() && i<pattern.length()){
            if(text.charAt(start+i) == pattern.charAt(i)){
                System.out.println(text.charAt(start+i) +" is equal to "+pattern.charAt(i));
                i++;
            }
            else if(text.charAt(start+i) != pattern.charAt(i)){
                System.out.println(text.charAt(start+i) +" not equal to "+pattern.charAt(i));

                start++;
                i = 0;
            }
        }

        return i == pattern.length()?start:-1;
    }

    public static int[] allShifts(String pattern){
        int[] shifts = new int[256];

        for(int i=0;i<shifts.length;i++){
            shifts[i] = pattern.length();
        }

        for(int i=0;i<pattern.length()-1;i++){
            shifts[pattern.charAt(i)] = pattern.length()-i-1;
        }

        return shifts;
    }

    public static int boyerHoore(String text, String pattern){

        int[] shifts = allShifts(pattern);

        int j = pattern.length()-1;
        int start = 0;

        while(j>=0 && start+pattern.length()<= text.length()){
            j = pattern.length()-1;

            while(j>=0 && (text.charAt(start+j) == pattern.charAt(j))){
                j--;
            }

            if(j>=0){
                start = start+shifts[text.charAt(start+pattern.length()-1)];
            }
        }

        return start+pattern.length()<=text.length()? start:-1;

    }

    public static void main(String[] args) {
        String text = "my name is waleed";
        String pattern = "waleed";
        //System.out.println(naiveSuche(text,pattern));
        System.out.println(boyerHoore(text,pattern));

    }
}
