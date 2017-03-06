package by.it.SergeiSor.jd01_03;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
//        String Line=InOut.consoleReadLine();
        String line = " 9 8 7 6 5 4 3 2 1";
        System.out.println(line);
        double[] a = InOut.readDoubleArrayFromLine(line);
        InOut.printDoubleArray(a, "A", 4);
        Arrays.sort(a);
        //Util.sort(a);
        InOut.printDoubleArray(a, "A", 4);
    }
}
