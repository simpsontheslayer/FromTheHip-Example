import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//compiles and runs other java code

public class new1 {
    public static void main(String[] args) throws IOException{
        try {
            runProcess("javac -cp src src/com/journaldev/files/Test.java");
            System.out.println("**********");
            runProcess("java -cp src com/journaldev/files/Test Hi Pankaj");
        } 
	catch (Exception e) {
        }   
    }
    private static void printLines(String cmd, InputStream ins) throws Exception {
        String line = null;
        BufferedReader in = new BufferedReader(
            new InputStreamReader(ins));
        while ((line = in.readLine()) != null) {
            System.out.println(cmd + " " + line);
        }
      }
      private static void runProcess(String command) throws Exception {
        Process pro = Runtime.getRuntime().exec(command);
        printLines(command + " stdout:", pro.getInputStream());
        printLines(command + " stderr:", pro.getErrorStream());
        pro.waitFor();
        System.out.println(command + " exitValue() " + pro.exitValue());
      }
}