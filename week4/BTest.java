package week4.tests;import org.junit.Assert;import org.junit.Test;import java.io.*;/** * Created by Benedikt on 27.10.2016. */public class BTest {    private static final InputStream sIn = System.in;    public static final PrintStream sOut = System.out;    static String inputOutput(String input) {        try {            InputStream inputStream = new ByteArrayInputStream(input.getBytes("UTF-8"));            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();            System.setOut(new PrintStream(outputStream));            System.setIn(inputStream);            week4.B.main(new String[1]);            System.out.flush();            System.setIn(sIn);            System.setOut(sOut);            return outputStream.toString("UTF-8").trim();        } catch (Exception e) {            e.printStackTrace();        }        return "";    }    @Test    public void firstGivenTest() throws IOException {        String input = "3\n" +                "\n" +                "4\n" +                "5 3 2 3 4\n" +                "3 1 4\n" +                "4 1 4\n" +                "2 0\n" +                "\n" +                "5\n" +                "6 4 2 3 4 5\n" +                "7 3 3 4 5\n" +                "3 2 4 5\n" +                "2 1 5\n" +                "2 0\n" +                "\n" +                "2\n" +                "3 1 2\n" +                "1 0\n";        String shouldOutput = "Case #1: 11\n" +                "Case #2: 20\n" +                "Case #3: 4";        Assert.assertEquals(shouldOutput.trim(), inputOutput(input));    }    @Test    public void secondGivenTest() throws IOException {        String input = "4\n" +                "5\n" +                "6 4 2 3 4 5\n" +                "4 3 4 3 5\n" +                "7 1 5\n" +                "8 1 5\n" +                "7 0\n" +                "\n" +                "8\n" +                "1 7 2 3 4 5 6 7 8\n" +                "7 6 3 4 7 5 6 8\n" +                "5 2 6 8\n" +                "5 4 6 5 7 8\n" +                "1 2 6 8\n" +                "2 2 7 8\n" +                "1 1 8\n" +                "3 0\n" +                "\n" +                "6\n" +                "4 5 2 3 4 5 6\n" +                "6 4 5 3 4 6\n" +                "4 2 5 6\n" +                "8 2 5 6\n" +                "2 1 6\n" +                "5 0\n" +                "\n" +                "8\n" +                "4 7 2 3 4 5 6 7 8\n" +                "6 2 6 8\n" +                "3 4 7 4 6 8\n" +                "3 3 5 7 8\n" +                "4 1 8\n" +                "7 2 7 8\n" +                "7 1 8\n" +                "8 0";        String shouldOutput = "Case #1: 25\n" +                "Case #2: 20\n" +                "Case #3: 25\n" +                "Case #4: 32";        Assert.assertEquals(shouldOutput.trim(), inputOutput(input));    }//    @Test//    public void Test() throws IOException {//        String input = "";//        String shouldOutput = "";//        Assert.assertEquals(shouldOutput.trim(), inputOutput(input));//    }}