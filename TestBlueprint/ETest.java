import org.junit.Assert;
import org.junit.Test;

import java.io.*;


/**
 * Created by Benedikt on 27.10.2016.
 */
public class ETest {
    private static final InputStream sIn = System.in;
    public static final PrintStream sOut = System.out;

    static void inputOutput(String input, String output) {
        try {
            InputStream inputStream = new ByteArrayInputStream(input.getBytes("UTF-8"));
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outputStream));
            System.setIn(inputStream);

            main(new String[1]);

            System.out.flush();
            System.setIn(sIn);
            System.setOut(sOut);

            String[] shouldOut = outputStream.toString("UTF-8").trim().split("\n");
            for (int i = 0; i < shouldOut.length; i++) {
                shouldOut[i] = shouldOut[i].trim();
            }
            String[] isOut = output.split("\n");
            for (int i = 0; i < isOut.length; i++) {
                isOut[i] = isOut[i].trim();
            }
            Assert.assertArrayEquals(shouldOut, isOut);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void firstGivenTest() throws IOException {
        String input = "";
        String shouldOutput = "";
        inputOutput(input, shouldOutput);
    }

    @Test
    public void secondGivenTest() throws IOException {
        String input = "";
        String shouldOutput = "";
        inputOutput(input, shouldOutput);
    }

//    @Test
//    public void Test() throws IOException {
//        String input = "";
//        String shouldOutput = "";
//        inputOutput(input, shouldOutput);
//    }
}
