// problem 81

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class PathSum extends EulerProjectProblemAbstract {
    public static void main (String[] args){
        String fileName = "C://Users/ASUS/IdeaProjects/projectEulerProblems/src/files/p081_matrix.txt";
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

        getBestWay(matrix,n);
    }

    private static void getBestWay(Integer[][] grid, int gridSize){
        //calculate the solution for bottom and right
        for (int i = gridSize - 2; i >= 0; i--) {
            grid[gridSize - 1][i] += grid[gridSize - 1][i+1];
            grid[i][gridSize - 1] += grid[i+1][gridSize - 1];
        }

        for (int i = gridSize - 2; i >= 0; i--) {
            for (int j = gridSize - 2; j >= 0; j--) {
                grid[i][j] += Math.min(grid[i + 1][j], grid[i][j + 1]);
            }
        }

        System.out.println(grid[0][0]);
    }
}