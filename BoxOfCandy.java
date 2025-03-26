public class BoxOfCandy{
    private Candy[][] box;
    public BoxOfCandy(Candy[][] b){
        box = b;
    }
    public String toString(){
        String s = "";
        for(int row = 0; row < box.length; row++)
        {
            for(int col = 0; col < box[0].length; col++)
            {
                s += box[row][col] + " ";
            }
            s += "\n";
        }
        return s;
    }
    public boolean moveCandyToFirstRow(int col){
        if (box[0][col] != null) return true;
        for (int i = 1; i < box.length; i++){
            if (box[i][col] != null){
                box[0][col] = box[i][col];
                box[i][col] = null;
                return true;
            }
        }
        return false;
    }
    public Candy removeNextByFlavor(String flavor){
        for (int r = box.length - 1; r >= 0; r--){
            for (int c = 0; c < box[0].length; c++){
                Candy p = box[r][c];
                if (p != null && p.getFlavor().equals(flavor)){
                    box[r][c] = null;
                    return p;
                }
            }
        }
        return null;
    }
}