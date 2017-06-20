public class main{
   public static void main(String[] args){
      int twosix = 0;
      int seven = 0;
      int tie = 0;
      int twosixtop = 0;
      int seventop = 0;
      int toptie = 0;
      for(int j = 0; j<1000000; j++){
         System.out.println(j+1 + "/1000000");
         int top = 0;
         int toptype = 0;
         int temp26 = 0;
         for(int i = 0; i < 6; i++){
            int addition = (int)(Math.random() * 6)+1;
            temp26 += addition;
            if(addition > top){
               top = addition;
            }
         }
         int temp262 = 0;
         for(int i = 0; i < 6; i++){
            int addition = (int)(Math.random() * 6)+1;
            temp262 += addition;
            if(addition > top){
               top = addition;
            }
         }
         if(temp262>temp26)
            temp26=temp262;
         int temp7 = 0;
         int[] temps7 = new int[7];
         for(int i = 0; i<7; i++){
            temps7[i] = (int)(Math.random() * 6)+1;
            if(temps7[i] > top){
               toptype = 1;
               top = temps7[i];
            }else if(toptype == 0 && temps7[i] == top){
               toptype = 2;
            }
         }
         int lowestidx = 0;
         for(int i = 1; i < 7; i++){
            if(temps7[i]<temps7[lowestidx]){
               lowestidx = i;
            }
         }
         temps7[lowestidx] = 0;
         for(int i = 0; i < 7; i++){
            temp7 += temps7[i];
         }
         if(temp7>temp26){
            seven++;
         }else if(temp26>temp7){
            twosix++;
         }else{
            tie++;
         }
         if(toptype == 0){
            twosixtop++;
         }else if(toptype == 1){
            seventop++;
         }else{
            toptie++;
         }
      }
      System.out.println("Two-Six Score: " + twosix);
      System.out.println("Best of Seven Score: " + seven);
      System.out.println("Tie Score: " + tie);
      System.out.println("Two-Six Tops: " + twosixtop);
      System.out.println("Seven Tops: " + seventop);
      System.out.println("Top Ties: " + toptie);
   }
}