public class String2 {
    public static boolean stringsCompare(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        for(int i = 0; i < str1.length(); i++){
            if(str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args){
        String str1 = "123qwe";
        String str2 = "123qwe";
        System.out.println(stringsCompare(str1, str2));
    }
}
