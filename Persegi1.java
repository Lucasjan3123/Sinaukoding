
    public class Persegi1 implements Persegi{
        
        int X;
     
        @Override
        public void LuasPersegi(int s) {
             X= s*s;
             System.out.println("Luas persegi :"+X);
        }
        @Override
        public void KelilingPersegi(int s) {
              X= 4*s;
              System.out.println("Keliling Persegi :"+X);
        }
    
  
   


}