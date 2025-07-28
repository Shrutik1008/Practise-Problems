import java.util.HashSet;
public class ContainDuplicate{
    public static void main(String[] args) {

        int[] a ={1,2,3,4,5,5,5,6,6};
        remove(a);
    }
    public static void remove(int[] a){
           HashSet<Integer> s = new HashSet<>();
            int n= a.length;
        for(int i=0;i<n;i++){
            s.add(a[i]);
        }

        System.out.println(s);
    }

}
