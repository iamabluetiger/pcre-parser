package nl.bigo.pcreparser;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

/**
 * A small demo class that demonstrates how to use the
 * generated parser classes.
 */
public class Main {

  public static void main(String[] args) throws Exception {
    try {
      File file = new File("/Users/ten/private-repo/pcre-parser/allrules-test.txt");
      Scanner scan = new Scanner(file);
      while(scan.hasNextLine()){
        System.out.println(new Builder.Tree(scan.nextLine()).toStringASCII());
      }
    } catch (FileNotFoundException e) {
      // TODO: handle exception
    }
  }
}

