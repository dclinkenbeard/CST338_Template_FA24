import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;
import org.junit.jupiter.api.Test;

class MainTest {

  @Test
  void adderTest(){
    Random random = new Random();
    double x;
    double y;
    for (int i = 0; i < 500; i++) {
      x = random.nextInt(Double.SIZE/2);
      y = random.nextInt(Double.SIZE/2);

      assertEquals(x+y,Main.add(x,y));

    }
  }

}