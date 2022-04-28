/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ccc.cancer;

/**
 *
 * @author Hamzi
 */
public class Cancer {
    public static String[][] CancerCells = new String[15][15];
    public static void main(String[] args) {
        
        for(int i = 0; i < CancerCells.length;i++){
      for(int j = 0; j<CancerCells[0].length;j++){
          int rnd = (int) (Math.random()*2)+1;
          //System.out.println(rnd);
          if(rnd == 1){
              CancerCells[i][j] = "+";
          }
          else{
              CancerCells[i][j] = "-";
          }
      }
}
        System.out.println("Before cancer has been removed:");
        for(int i = 0; i < CancerCells.length;i++){
      for(int j = 0; j<CancerCells[0].length;j++){
          System.out.print(CancerCells[i][j]);
      }
      System.out.println("");
}
        System.out.println("After cancer has been removed");
        for(int i = 0; i < CancerCells.length;i++){
      for(int j = 0; j<CancerCells[0].length;j++){
          if(CancerCells[i][j].equals("-")){
          cancerRemover(i,j);
          }
      }
}

        
        for(int i = 0; i < CancerCells.length;i++){
      for(int j = 0; j<CancerCells[0].length;j++){
          System.out.print(CancerCells[i][j]);
      }
      System.out.println("");
}
}
    public static void cancerRemover(int row, int col) {
        
    if (CancerCells[row][col].equals("-")) {
      CancerCells[row][col] = " ";
      try{
      cancerRemover(row - 1, col - 1);
      cancerRemover(row - 1, col);
      cancerRemover(row - 1, col + 1);
      cancerRemover(row, col - 1);
      cancerRemover(row, col + 1);
      cancerRemover(row + 1, col - 1);
      cancerRemover(row + 1, col);
      cancerRemover(row + 1, col + 1);
    }catch(ArrayIndexOutOfBoundsException e){
            }
    }
  }
}