public class Main{
    public static void main(String[] args){
        Candy[][] box = new Candy[4][3];
        box[0][1] = new Candy("lime");
        box[1][1] = new Candy("orange");
        box[2][2] = new Candy("cherry");
        box[3][1] = new Candy("lemon");
        box[3][2] = new Candy("grape");
        BoxOfCandy b = new BoxOfCandy(box);
        System.out.println(b);
        System.out.println(b.moveCandyToFirstRow(2));
        System.out.println(b);

    }
}