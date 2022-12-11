package advanced.fileIO.multiDimentionalArrays;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class readProperties {

    static String location = System.getProperty("user.dir");
    static String filePath = "/src/advanced/fileIO/multiDimentionalArrays/secret.properties";
    static final String path = location + filePath;
    static FileReader fileReader;
    static BufferedReader bufferedReader;


    public static void main(String[] args) throws FileNotFoundException {
        String data = "";

       try{
           fileReader = new FileReader(path);
           bufferedReader = new BufferedReader(fileReader);
           try {
               while ((data = bufferedReader.readLine()) != null){
                   System.out.println(data);
               }
           } catch (Exception e1){
               System.out.println("Unable to read line");
           }

    }catch(FileNotFoundException ex){
           ex.printStackTrace();
           System.out.println("file not found");
       } finally {
           try {
               bufferedReader.close();
           } catch (Exception e){
               e.printStackTrace();
               System.out.println("Unable to close buffered reader");
           }
       }
       }

}
