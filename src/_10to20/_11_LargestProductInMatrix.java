package _10to20;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _11_LargestProductInMatrix {


    public static void main(String[] args){

        String fileName = "C://Users/ASUS/IdeaProjects/projectEulerProblems/src/files/problem11.txt";
        //String fileName = "C://Users/ASUS/Downloads/pathsum.txt";
        List<String> list = new ArrayList<>();
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            list = stream.collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        int n = list.size();
        String[][] matrixString = new String[n][n];
        Integer[][] matrix = new Integer[n][n];
        int j=0;
        for(String s : list){
            matrixString[j] = s.split(",");
            j++;
        }

        for(int i=0;i<n;i++){
            for(int k=0;k<n;k++){
                matrix[i][k] = Integer.parseInt(matrixString[i][k]);
            }
        }
        getGreatestProduct(matrix);
    }

    private static void getGreatestProduct(Integer[][] matrix){
        Integer greatest=0;
        for (int i=0;i<16;i++) {
            for (int j = 0; j < 16; j++) {
                Integer prodH = matrix[i][j] * matrix[i + 1][j] * matrix[i + 2][j] * matrix[i + 3][j];
                Integer prodV= matrix[j][i] * matrix[j + 1][i] * matrix[j + 2][i] * matrix[j + 3][i];
                Integer prodD=  matrix[i][j] * matrix[i + 1][j+1] * matrix[i + 2][j+2] * matrix[i + 3][j+3];
                Integer prodAD=  matrix[i+3][j] * matrix[i + 2][j+1] * matrix[i + 1][j+2] * matrix[i][j+3];
                Integer max = Integer.max(Integer.max(prodAD,prodD),Integer.max(prodH,prodV));
                if( max> greatest){
                    greatest = max;
                }
            }
        }
        System.out.println("max = " + greatest);
    }
}