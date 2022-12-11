package advanced.fileIO.multiDimentionalArrays;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class reafFileMine {

    static String location = System.getProperty("user.dir");
    static String localPath = "/src/advanced/fileIO/multiDimentionalArrays/secret.properties";
    static final String path = location + localPath;
    static FileReader fileReader;
    static BufferedReader bufferedReader;

    public static void main(String[] args) {

        String data = "";
        try { fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            try {
                while ((data = bufferedReader.readLine()) != null){
                    System.out.println(data);
                }
            }catch (Exception e){
                e.printStackTrace();
                System.out.println("Unable to read file");
            }
        } catch (FileNotFoundException ef){
            System.out.println("file not found!");
        }
        finally {
            try {
                bufferedReader.close();
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }
}
