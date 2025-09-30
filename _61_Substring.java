public class _61_Substring {

    public static void substring(String str, int si, int ed){
        for(int i = si; i<=ed; i++){
            System.out.println(str.charAt(i));
        }
    }

    public static void main(String arghs[]){
        String str = "I am Umar.";
        int si = 2;
        int ed = 6;
        substring(str,si,ed);
    }
}
