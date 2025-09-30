public class _60_ShortestPath {
    
    public static int shortestPath(String str){
        if(str.length() == 0) return -1;
        int x = 0;
        int y = 0;
        int path = 0;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == 'N' || str.charAt(i) == 'n' ) y++;
            else if(str.charAt(i) == 'E' || str.charAt(i) == 'e' ) x++;
            else if(str.charAt(i) == 'S' || str.charAt(i) == 's' ) y--;
            else if(str.charAt(i) == 'W' || str.charAt(i) == 'w' ) x--;
            else{
                return -2;
            }
        }

        path = (int) Math.sqrt((x*x) + (y*y));
        return path;
    }
    
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        int ans = shortestPath(str);
        if(ans == -1) System.out.println("No instructions given");
        else if(ans == -2) System.out.println("Invalid instruction in string.");
        else{
            System.out.println("Shortest path is " + ans);
        }

    }
}
