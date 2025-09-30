public class _36_ShortestPath {
    
    public static float getPath(String path){
        int x = 0, y = 0;
        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);
            if(dir == 'N'){
                y++;
            }
            if(dir == 'E'){
                x++;
            }
            if(dir == 'W'){
                x--;
            }
            if(dir == 'S'){
                y--;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2+y2);
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        float p = getPath(path);
        System.out.println(p);
    }
}
