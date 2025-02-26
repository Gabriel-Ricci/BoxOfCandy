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
            s += "\n"
        }
    }
    public boolean moveCandyToFirstRow(int col){

    }
    public Candy removeNextByFlavor(String flavor){

    }
}