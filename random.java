package pacotes;
import java.util.Random;

public class random {
    //começo do metodo main
    public static void main(String args []){
  

        for ( int i = 0; i < 4; i++)
        {
            

    System.out.println((i + 1) + " A jogada = " + (int) ( 1 + (Math.random() * 6)));
    
}
}
}