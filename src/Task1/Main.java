package Task1;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        final String fileIn = "in.txt";
        final String fileOut = "out.txt";
        int sizeWords = 0;

        BufferedReader br = new BufferedReader(new FileReader(fileIn));
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileOut));

        List<List<String>> arrString = new ArrayList<>();


        while (br.ready()){
            String str = br.readLine();
            List<String> arrayWords = Arrays.asList(str.split("\\t"));
            arrString.add(arrayWords);
            sizeWords = arrayWords.size();

        }

        int finalSizeWords = sizeWords;
        Collections.sort(arrString, new Comparator<List<String>>() {
            @Override
            public int compare(List<String> str1, List<String> str2) {
                for (int i = 0; i < finalSizeWords; i++){
                    if ((str1.get(i)).compareTo(str2.get(i)) == 0 && i + 1 < str1.size()){
                        int j = i++;
                        while ((str1.get(j)).compareTo(str2.get(j)) == 0){
                            j++;
                            return (str1.get(j)).compareTo(str2.get(j));
                        }
                    }else {
                        return (str1.get(i)).compareTo(str2.get(i));
                    }
                }
                return 0;
            }
        });


        for (int i = 0; i < arrString.size(); i++) {
            for (int j = 0; j < (arrString.get(i)).size(); j++) {
                bw.write((arrString.get(i)).get(j) + "\t");
            }
            bw.write("\n");
        }


        br.close();
        bw.close();

    }
}
