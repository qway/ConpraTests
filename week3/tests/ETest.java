package week3.tests;import org.junit.Assert;import org.junit.Test;import java.io.*;/** * Created by Benedikt on 27.10.2016. */public class ETest {    private static final InputStream sIn = System.in;    public static final PrintStream sOut = System.out;    static String inputOutput(String input) {        try {            InputStream inputStream = new ByteArrayInputStream(input.getBytes("UTF-8"));            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();            System.setOut(new PrintStream(outputStream));            System.setIn(inputStream);//            E.main(new String[1]);            System.out.flush();            System.setIn(sIn);            System.setOut(sOut);            return outputStream.toString("UTF-8").trim();        } catch (Exception e) {            e.printStackTrace();        }        return "";    }    @Test    public void firstGivenTest() throws IOException {        String input = "2\n" +                "5\n" +                "0 12 12 5 9\n" +                "12 0 14 7 11\n" +                "12 14 0 7 3\n" +                "5 7 7 0 4\n" +                "9 11 3 4 0\n" +                "\n" +                "6\n" +                "0 15 4 19 10 9\n" +                "15 0 11 4 5 16\n" +                "4 11 0 15 6 5\n" +                "19 4 15 0 9 20\n" +                "10 5 6 9 0 11\n" +                "9 16 5 20 11 0";        String shouldOutput = "Case #1: 1 4 5\n" +                "Case #2: 1 3 6";        Assert.assertEquals(shouldOutput.trim(), inputOutput(input));    }    @Test    public void secondGivenTest() throws IOException {        String input = "6\n" +                "4\n" +                "0 4 13 3\n" +                "4 0 9 7\n" +                "13 9 0 16\n" +                "3 7 16 0\n" +                "\n" +                "5\n" +                "0 6 22 13 28\n" +                "6 0 16 7 22\n" +                "22 16 0 9 6\n" +                "13 7 9 0 15\n" +                "28 22 6 15 0\n" +                "\n" +                "6\n" +                "0 12 3 8 17 21\n" +                "12 0 15 4 5 9\n" +                "3 15 0 11 20 24\n" +                "8 4 11 0 9 13\n" +                "17 5 20 9 0 4\n" +                "21 9 24 13 4 0\n" +                "\n" +                "4\n" +                "0 5 10 14\n" +                "5 0 5 9\n" +                "10 5 0 14\n" +                "14 9 14 0\n" +                "\n" +                "5\n" +                "0 5 7 8 12\n" +                "5 0 12 13 7\n" +                "7 12 0 15 19\n" +                "8 13 15 0 20\n" +                "12 7 19 20 0\n" +                "\n" +                "4\n" +                "0 16 8 12\n" +                "16 0 8 4\n" +                "8 8 0 4\n" +                "12 4 4 0";        String shouldOutput = "Case #1: 1 4\n" +                "Case #2: 1 2 4 3 5\n" +                "Case #3: 1 4 2 5 6\n" +                "Case #4: 1 2 4\n" +                "Case #5: 1 2 5\n" +                "Case #6: 1 3 4";        Assert.assertEquals(shouldOutput.trim(), inputOutput(input));    }//    @Test//    public void Test() throws IOException {//        String input = "";//        String shouldOutput = "";//        Assert.assertEquals(shouldOutput.trim(), inputOutput(input));//    }}