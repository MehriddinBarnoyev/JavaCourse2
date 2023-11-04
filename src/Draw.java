public class Draw implements Printable {

    public void print(){
        System.out.println("Hello interfase");
    }

    public static void main(String[] args) {


        Draw draw = new Draw();
        draw.print();
    }
}
