import java.io.*;
import java.util.Scanner;

/* Examples using the Scanner class
 * - by default uses whitespace as the delimiter
 */
public class JavaScanner {
    public static void main(String [] args) throws IOException {

        simpleRead();
        simpleReadWithDelimiter();
        simpleReadInts();
        simpleReadLines();
    }

    public static void simpleRead() throws IOException {
        Scanner s = null;
        try {
           //s = new Scanner(new File("one-number-per-line.txt"));
           s = new Scanner(new File("lorem-ipsum.txt"));
           while (s.hasNext()) {
               System.out.println(s.next());
           }
        }
        finally {
            if (s != null) s.close();
        }
    }

    public static void simpleReadWithDelimiter() throws IOException {
        Scanner s = null;
        try {
           s = new Scanner(new File("numbers.csv"));
           s.useDelimiter(",");
           while (s.hasNext()) {
               System.out.println(s.next());
           }
        }
        finally {
            if (s != null) s.close();
        }
    }

    public static void simpleReadInts() throws IOException {
        Scanner s = null;
        try {
           s = new Scanner(new File("example.txt"));
           while (s.hasNext()) {
               if (s.hasNextInt()) System.out.println(s.nextInt());
               else s.next();
           }
        }
        finally {
            if (s != null) s.close();
        }
    }

    public static void simpleReadLines() throws IOException {
        Scanner s = null;
        try {
           s = new Scanner(new File("example.txt"));
           while (s.hasNextLine()) {
               System.out.println(s.nextLine());
           }
        }
        finally {
            if (s != null) s.close();
        }
    }
}
