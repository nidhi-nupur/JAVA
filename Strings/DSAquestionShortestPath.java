public class DSAquestionShortestPath {

    public static float CalculateShortestPath(String path) {
        int x = 0;
        int y = 0;
        for(int i=0; i<path.length(); i++) { // TC = O(n).
            char direction = path.charAt(i);
            if(direction == 'N') { // for North
                y++;
            }
            // for South
            else if(direction == 'S') {
                y--;
            }
            // for East
            else if(direction == 'E') {
                x++;
            }
            // for West
            else if(direction == 'W'){
                x--;
            }
            else {
                return 0;
            }
        }
        int Xsqr = x*x;
        int Ysqr = y*y;
        float displacement = (float)Math.sqrt(Xsqr + Ysqr);
        return displacement;
    }
    public static void main(String[] args) {
        // String path = "WNEENESENNN";
        // String path = "NS";
        // String path = "NNSSN";
        String path = "Nidhi Nupur";
        System.out.println("Displacement = " + CalculateShortestPath(path));
    }
}