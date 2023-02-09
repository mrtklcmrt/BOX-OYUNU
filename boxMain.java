package boxOyunu;

public class boxMain {

    public static void main(String[] args) {

        fighter mert =new fighter("MERT",450,45,89,21,54);
        fighter ugur =new fighter("UGUR",450,45,90,24,43);
        fight match1 =new fight(80,100,mert,ugur);
        match1.start();







    }
}
