public class _74_RemoveDups {
    
    public static void removeDups(String str, int index, StringBuilder newString, boolean map[]){
        if(index == str.length()) return;
        if(map[str.charAt(index)-'a'] == false){
            map[str.charAt(index)-'a'] = true;
            newString.append(str.charAt(index));
            removeDups(str, index+1, newString, map);
        }
        else{
            removeDups(str, index+1, newString, map);
        }        
    }

    public static void main(String[] args) {
        String name = "umaramahmood";
        StringBuilder newString = new StringBuilder();
        boolean[] map = new boolean[26];
        removeDups(name, 0, newString, map);

        System.out.println(newString);
    }
}
