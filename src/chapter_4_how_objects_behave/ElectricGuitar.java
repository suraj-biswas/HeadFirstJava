package chapter_4_how_objects_behave;

public class ElectricGuitar {
   private String brand;
   private int numOfPickups;
   private boolean rockstarUsesIt;

   public String getBrand() {
       return brand;
   }

   public void setBrand(String aBrand) {
      brand = aBrand;
   }

   public int getNumOfPickups() {
      return numOfPickups;
   }

   public void setNumOfPickups(int num) {
      numOfPickups = num;
   }

   public boolean getRockstarUsesIt() {
      return rockstarUsesIt;
   }

   public void setRockstarUsesIt(boolean yesOrNo) {
      rockstarUsesIt = yesOrNo;
   }
}
