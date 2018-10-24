package template_method;

public abstract  class Father {
   public void play(){
	   System.out.println("������");
   }
   public void play2(){
	   System.out.println("������2");
   }
   public void play3(){
	   System.out.println("������3");
   }
   public abstract void play4();
   public void play5(){
	   System.out.println("������5");
   }
   public final void model(){
	   this.play();
	   this.play2();
	   this.play3();
	   this.play4();
	   this.play5();
   }
}
class Son extends Father{
   @Override
    public void play() {
	System.out.println("������");
     }
	@Override
	public void play4() {
		// TODO Auto-generated method stub
		System.out.println("������");
	}
	
}