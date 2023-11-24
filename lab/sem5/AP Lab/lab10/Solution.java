import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void a() {
        try {
            File file = new File("./TextFiles/TEXT.txt");
            FileWriter writer = new FileWriter(file);

            writer.write("Hello, this is a test file.\nThis file has two lines.\n");
            writer.close();

            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);

            int linesCount = 0;
            int wordsCount = 0;
            int charsCount = 0;

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                linesCount++;

                String[] words = line.split(" ");
                wordsCount += words.length;

                charsCount += line.length();
            }

            System.out.println("Number of lines: " + linesCount);
            System.out.println("Number of words: " + wordsCount);
            System.out.println("Number of characters: " + charsCount);

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void b() {
        try{
            File file1 = new File("./TextFiles/Source1.txt");
            File file2 = new File("./TextFiles/Source2.txt");
            Scanner sc1 = new Scanner(file1);
            Scanner sc2 = new Scanner(file2);
            List<Integer> arr = new ArrayList<>();
            while(sc1.hasNextInt()){
                arr.add(sc1.nextInt());
            }
            while(sc2.hasNextInt()){
                arr.add(sc2.nextInt());
            }
            arr.sort(null);
            while(arr.size()>0){
                System.out.print(arr.get(0)+" ");
                arr.remove(0);
            }
            sc1.close();
            sc2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static ArrayList<String> c(String filePath){
        ArrayList<String> arr = new ArrayList<>();
        try{
            FileReader file = new FileReader(filePath);
            BufferedReader reader = new BufferedReader(file);
            String line;
            while((line = reader.readLine()) != null){
                arr.add(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arr;
    }

    public static void d(String filePath, String oFileName) {
        ArrayList<String> arr = c(filePath);
        try{
            File file = new File(oFileName);
            FileWriter writer = new FileWriter(file, true);
            for(String s: arr){
                writer.write(s+"\n");
            }
            writer.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void e(String file1, String file2, String combined){
        d(file1, combined);
        d(file2, combined);
    }

    public static void f_encrypt(String PlainText, String CipherText){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Key(Number): ");
            int key = (sc.nextInt()%10);
            sc.close();
            ArrayList<String> arr = c(PlainText);
            ArrayList<String> newArr = new ArrayList<>(); 
            for(String s: arr){
                String result = "";
                if(key<0)
                    key=26+key;
                for(int i=0;i<s.length();i++){
                    System.out.println(result);
                    result+=(char)((s.charAt(i)+key));
                    // System.out.println((char)((s.charAt(i)+key))+ " " + (char)((s.charAt(i))));
                }
                newArr.add(result);
                System.out.println(s);
            }
            File file = new File(CipherText);
            FileWriter writer = new FileWriter(file);
            for(String s: newArr){
                writer.write(s+"\n");
            }
            writer.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    // public static void f_decrypt(String PlainText, String CipherText){
    //     try {
    //         Scanner sc = new Scanner(System.in);
    //         System.out.println("Enter the Key(Number): ");
    //         sc.nextLine();
    //         int key = (sc.nextInt()%10);
    //         sc.close();
    //         ArrayList<String> arr = c(CipherText);
    //         ArrayList<String> newArr = new ArrayList<>(); 
    //         for(String s: arr){
    //             String result = "";
    //             if(key<0)
    //                 key=26+key;
    //             for(int i=0;i<s.length();i++){
    //                 System.out.println(result);
    //                 result+=(char)((s.charAt(i)-key));
    //                 // System.out.println((char)((s.charAt(i)+key))+ " " + (char)((s.charAt(i))));
    //             }
    //             newArr.add(result);
    //             System.out.println(s);
    //         }
    //         File file = new File(PlainText);
    //         FileWriter writer = new FileWriter(file);
    //         for(String s: newArr){
    //             writer.write(s+"\n");
    //         }
    //         writer.close();

    //     } catch (Exception e) {
    //         System.out.println(e.getMessage());
    //     }
    // }
}
