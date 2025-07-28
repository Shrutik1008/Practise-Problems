import java.util.Arrays;

public class Anagram {
    public static void Anagrams(String Str1,String Str2){
        if(Str1.length() !=Str2.length()){
            System.out.println("Anagrams cannot be found");
            return;
        }

        char[] S1 = Str1.toCharArray();
        char[] S2 = Str2.toCharArray();
        Arrays.sort(S1);
        Arrays.sort(S2);
        if(Arrays.equals(S1,S2)){
            System.out.println("Anagrams found");
        }else{
            System.out.println("Anagrams cannot be found");
        }
    }

    public static void main(String[] args) {
        String Str1 = "listen";
        String Str2 = "silent";
        Anagrams(Str1, Str2);
    }
}
