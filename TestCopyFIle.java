package CoppyFIle;

import java.io.*;

public class TestCopyFIle {
    public static void CopyFile(String file, String CopyFile) {

        try {
            File file1 = new File(file);
            FileWriter file2 = new FileWriter(CopyFile);
            if (!file1.exists()) {
                try {
                    file1.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                FileReader fileReader = new FileReader(file1);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    file2.write(line);
                }
                bufferedReader.close();
                file2.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //Copy 2 file co san neu chua co phai tao 2 file txt. File and FileWriter
        CopyFile("fileDemo.txt", "tambiet.txt");
    }
}
