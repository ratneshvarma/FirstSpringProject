package spring.rat;

/**
 * Created by ratnesh on 14/3/16.
 */

public class Resturant {
   HotDrink hotDrink;
    Resturant(HotDrink hotDrink){
        this.hotDrink=hotDrink;
    }

   public  void prepareHotDink() {
       hotDrink.prepareHotDrink();
   }
}
