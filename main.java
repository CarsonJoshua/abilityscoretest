public class main{
   public static void main(String[] args){
      //twosix counts trials where using the better of two sets of six ability scores granted higher ability score sum than the best six of seven ability scores
      int twosix = 0;
      //seven counts the oppsoite
      int seven = 0;
      //tie implied
      int tie = 0;
      //when teosix yields a higher highest score
      int twosixtop = 0;
      //the other way
      int seventop = 0;
      //they tie
      int toptie = 0;
      for(int j = 0; j<1000000; j++){
         System.out.println(j+1 + "/1000000");
         int top = 0;
         int toptype = 0;
         int temp26 = 0;
         //first set of six
         for(int i = 0; i < 6; i++){
            int addition = (int)(Math.random() * 6)+1;
            temp26 += addition;
            if(addition > top){
               top = addition;
            }
         }
         //second set of six
         int temp262 = 0;
         for(int i = 0; i < 6; i++){
            int addition = (int)(Math.random() * 6)+1;
            temp262 += addition;
            if(addition > top){
               top = addition;
            }
         }
         //better of two test
         if(temp262>temp26)
            temp26=temp262;
         int temp7 = 0;
         int[] temps7 = new int[7];
         //seven generator
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
         //remove lowest
         for(int i = 1; i < 7; i++){
            if(temps7[i]<temps7[lowestidx]){
               lowestidx = i;
            }
         }
         temps7[lowestidx] = 0;
         //sum
         for(int i = 0; i < 7; i++){
            temp7 += temps7[i];
         }
         //compare sevens versus two-six
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
      //output
      System.out.println("Two-Six Score: " + twosix);
      System.out.println("Best of Seven Score: " + seven);
      System.out.println("Tie Score: " + tie);
      System.out.println("Two-Six Tops: " + twosixtop);
      System.out.println("Seven Tops: " + seventop);
      System.out.println("Top Ties: " + toptie);
   }
}