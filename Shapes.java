package pack;

public abstract class Shapes
{
   private double var1;
   private double var2; 

   public void setv(double data1, double data2)
   {
      this.var1 = data1;
      this.var2 = data2;
   }

   public double geth() 
   {
       return var1;
   }
     
   public double getw() 
   {
       return var2;
   } 

   public abstract double getA();
   public abstract double getB();
}