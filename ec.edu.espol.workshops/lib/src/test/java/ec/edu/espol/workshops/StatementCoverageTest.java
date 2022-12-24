package ec.edu.espol.workshops;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
public class StatementCoverageTest {
	@Test
    public void pathTest1(){
       InputStream stdin = System.in;
       System.setIn(new ByteArrayInputStream("2y\n24\nM\nfalse\ntrue\n".getBytes()));

       ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
       PrintStream ps = new PrintStream(byteArrayOutputStream);
       PrintStream stdout = System.out;
       System.setOut(ps);

       CarInsurance.main(new String[0]);

       System.setIn(stdin);
       System.setOut(stdout);

       String outputText = byteArrayOutputStream.toString();
       String[] arr = outputText.split("\n");
       String[] resultados = new String[] {"2000"};
       Assert.assertTrue(arr[arr.length-1].contains(resultados[0]));
    }
	@Test
    public void pathTest2(){
       InputStream stdin = System.in;
       System.setIn(new ByteArrayInputStream("47\nH\nM\ngg\nfalse\ntrue\n".getBytes()));

       ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
       PrintStream ps = new PrintStream(byteArrayOutputStream);
       PrintStream stdout = System.out;
       System.setOut(ps);

       CarInsurance.main(new String[0]);

       System.setIn(stdin);
       System.setOut(stdout);

       String outputText = byteArrayOutputStream.toString();
       String[] arr = outputText.split("\n");
       String[] resultados = new String[] {"400"};
       Assert.assertTrue(arr[arr.length-1].contains(resultados[0]));
    }
	@Test
    public void pathTest3(){
       InputStream stdin = System.in;
       System.setIn(new ByteArrayInputStream("66\nM\ntrue\nok\ntrue\n".getBytes()));

       ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
       PrintStream ps = new PrintStream(byteArrayOutputStream);
       PrintStream stdout = System.out;
       System.setOut(ps);

       CarInsurance.main(new String[0]);

       System.setIn(stdin);
       System.setOut(stdout);

       String outputText = byteArrayOutputStream.toString();
       String[] arr = outputText.split("\n");
       String[] resultados = new String[] {"300"};
       Assert.assertTrue(arr[arr.length-1].contains(resultados[0]));
    }
	@Test
    public void pathTest4(){
       InputStream stdin = System.in;
       System.setIn(new ByteArrayInputStream("88\nM\ntrue\nfalse\n".getBytes()));

       ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
       PrintStream ps = new PrintStream(byteArrayOutputStream);
       PrintStream stdout = System.out;
       System.setOut(ps);

       CarInsurance.main(new String[0]);

       System.setIn(stdin);
       System.setOut(stdout);

       String outputText = byteArrayOutputStream.toString();
       String[] arr = outputText.split("\n");
       String[] resultados = new String[] {"-1"};
       Assert.assertTrue(arr[arr.length-1].contains(resultados[0]));
    }
}