package ec.edu.espol.workshops;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class PathCoverageTest {
	@Test
    public void IP_001(){
       InputStream stdin = System.in;
       System.setIn(new ByteArrayInputStream("22\nM\nfalse\ntrue\n".getBytes()));

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
    public void IP_002(){
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream("hello\n60\nM\nfalse\ntrue\n".getBytes()));

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
    public void IP_003(){
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream("66\nhello\nM\ntrue\ntrue\n".getBytes()));

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
    public void IP_004(){
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream("16\nM\nhello\ntrue\ntrue\n".getBytes()));

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
    public void IP_005(){
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream("22\nM\nfalse\nhello\ntrue\n".getBytes()));

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
    public void IP_006(){
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream("60\nM\ntrue\nfalse\n".getBytes()));

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
    public void IP_007(){
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream("4j\n46\nG\nF\ntrue\ntrue\n".getBytes()));

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOutputStream);
        PrintStream stdout = System.out;
        System.setOut(ps);

        CarInsurance.main(new String[0]);

        System.setIn(stdin);
        System.setOut(stdout);

        String outputText = byteArrayOutputStream.toString();
        String[] arr = outputText.split("\n");
        String[] resultados = new String[] {"200"};
        Assert.assertTrue(arr[arr.length-1].contains(resultados[0]));
     }
	
	
	@Test
    public void IP_008(){
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream("81\nM\nfalse\ntrue\n".getBytes()));

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
    public void IP_009(){
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream("30\nM\nfalse\ntrue\n".getBytes()));

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOutputStream);
        PrintStream stdout = System.out;
        System.setOut(ps);

        CarInsurance.main(new String[0]);

        System.setIn(stdin);
        System.setOut(stdout);

        String outputText = byteArrayOutputStream.toString();
        String[] arr = outputText.split("\n");
        String[] resultados = new String[] {"500"};
        Assert.assertTrue(arr[arr.length-1].contains(resultados[0]));
     }
	
	
}