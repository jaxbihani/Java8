package patterns;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExecuteAround {

    public static String processFile() throws IOException {
        try( BufferedReader br = new BufferedReader((new FileReader("/tmp/a.txt")))){
            // .. some other code which is fixed
            return br.readLine();
        }
    }

    public static String processFile1(BufferedReaderProcessor p) throws IOException {
        try( BufferedReader br = new BufferedReader((new FileReader("/tmp/a.txt")))){
            return p.process(br);
        }
    }

    public static void invoke() throws IOException {
        String oneLine = processFile1(br -> br.readLine());
        System.out.println("Onleine outout : " +oneLine);
        //String oneLine1 = processFile1(BufferedReader::readLine);
        String twoLines = processFile1((BufferedReader br) -> br.readLine() + br.readLine());
        System.out.println("Onleine outout : " +twoLines);
    }

}
