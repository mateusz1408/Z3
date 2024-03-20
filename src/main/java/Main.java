// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Random;
public class Main {
  public static void main(String[] args) {
    Random random = new Random();
    int suma=0;
    System.out.println("Wygenerowane liczby:");

    for(int i=0; i<5; i++){

    int liczba = random.nextInt(100)+1;
      System.out.println(liczba);
      suma+=liczba;
      
    }
    System.out.println("Suma wygenerowanych liczb: "+suma);
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}