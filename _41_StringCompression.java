public class _41_StringCompression {

    public static String compress(String str){
        StringBuilder nb = new StringBuilder("");
        
        for(int i = 0; i < str.length(); i++){
            Integer count = 1;  
            while(i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)){
                count++;
                i++; 
            }
            nb.append(str.charAt(i));
            if(count > 1){
                nb.append(count);
            }
        }

        return nb.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbcccdd";
        String result = compress(str);
        System.out.println(result);
    }
}
