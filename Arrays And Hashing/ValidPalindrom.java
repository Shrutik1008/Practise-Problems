public class ValidPalindrom {
    public static void main(String[] args) {
      
        String str = "Was it a car or a cat I saw";
        str= str.toLowerCase();
        str =str.replaceAll("[^a-z0-9]","");
        String rev= new StringBuilder().append(str).reverse().toString();
        if(str.equals(rev)){
            System.out.println("The string is a palindrome");
        }else{
            System.out.println("The string is not a palindrome");   
        }
    }


}



