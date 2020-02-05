public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

   public void info(){
       System.out.println("plate: "+food);
   }
   public boolean decreaseFood(int n){
        if(food<n) {
            return false;
        }
           else
           {
               food-=n;
               return true;
           }
   }
}
