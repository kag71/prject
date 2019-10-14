/**
 * Created by Maximilian_Wittig on 04.10.2018.
 */

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;


public class HelloWorldTest {

  @Test
  public void HelloTest(){
    String expected = "Hello World!".toLowerCase();
    ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
    // "Temporäre Konsole" liest Ausgabe der Methode ein
    System.setOut(new PrintStream(baos1));
    // Aufruf von Hello World!
    HelloWorld.main(null);
    System.out.flush();
    assertEquals(expected, baos1.toString().toLowerCase().trim());
  }
}
