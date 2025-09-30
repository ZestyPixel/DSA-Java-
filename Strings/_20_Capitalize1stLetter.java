public class _63_Capitalize1stLetter {
    public static void main(String[] args) {  
    String str = "i am umar";
    String str2 = str.toLowerCase();
    StringBuilder sb = new StringBuilder();
    boolean nextCapital = true;
    for(int i = 0; i<str2.length(); i++){
        if(nextCapital == true) {
            sb.append(Character.toUpperCase(str2.charAt(i)));
            nextCapital = false;
        }
        else if(str2.charAt(i) == ' '){
            sb.append(str2.charAt(i));
            nextCapital = true;
        }
        else{
            sb.append(str2.charAt(i));
            nextCapital = false;
        }
    }
    System.out.println(sb);
}
}
