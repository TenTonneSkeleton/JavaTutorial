package Lesson012;

public class UseTwoDimensionalMass {
    public static void main(String[] args) {
        int rows=9,cols=9;
        int[][] table = new int[rows][cols];
        String text = "\t|\t";
        for (int k=1;k<=cols;k++){
            text += k+"\t";
        }
        text="\n";
        for (int i=1; i<=10+8*cols;i++){
            text+="\n";
        }
        for (int i=0; i<table.length;i++){
            text+="\n"+(i+1)+"\n|]n";
        }
    }
}
