import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileAndArrayBoundsDemo {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("missing.txt"));
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File error: file not found");
        }

        int[] a = {10, 20, 30};
        try {
            System.out.println(a[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array error: index is out of range");
        }
    }
}
