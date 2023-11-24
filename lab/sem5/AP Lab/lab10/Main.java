import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        Solution.a();
        
        Solution.b();
        
        ArrayList<String> arr = Solution.c("./TextFiles/TEXT.txt");
        for (String string : arr) {
            System.out.println(string);
        }

        Solution.d("./TextFiles/TEXT.txt", "./TextFiles/Text-copy.txt");

        Solution.e("./TextFiles/Source1.txt", "./TextFiles/Source2.txt", "./TextFiles/sourcesCombined.txt");

        Solution.f_encrypt("./TextFiles/PlainText.txt", "./TextFiles/CipherText.txt");
        // Solution.f_decrypt("./TextFiles/DecryptedPlainText.txt", "./TextFiles/CipherText.txt");
 
    }
}