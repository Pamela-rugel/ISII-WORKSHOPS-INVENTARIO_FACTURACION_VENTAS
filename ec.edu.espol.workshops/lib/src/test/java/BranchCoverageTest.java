package ec.edu.espol.workshops;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
public class BranchCoverageTest {
	@Test
    public void TBC01(){
       InputStream stdin = System.in;
       System.setIn(new ByteArrayInputStream("24\nM\nfalse\ntrue\n".getBytes()));

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
    public void TBC02(){
       InputStream stdin = System.in;
       System.setIn(new ByteArrayInputStream("55a\n55\nM\nfalse\ntrue\n".getBytes()));

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
    public void TBC03(){
       InputStream stdin = System.in;
       System.setIn(new ByteArrayInputStream("19\nO\nF\nfalse\ntrue\n".getBytes()));

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
    public void TBC04(){
	      InputStream stdin = System.in;
	       System.setIn(new ByteArrayInputStream("24\nM\nfff\nfalse\nfalse\n".getBytes()));

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
	@Test
    public void TBC05(){
       InputStream stdin = System.in;
       System.setIn(new ByteArrayInputStream("24\nM\nfalse\nok\ntrue\n".getBytes()));

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
    public void TBC06(){
       InputStream stdin = System.in;
       System.setIn(new ByteArrayInputStream("94\nM\nfalse\ntrue\n".getBytes()));

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