
public class page41
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Car car1 = new Car(1234,20.5);
		car1.vShow();
		car1.mShow();
	}
}
	interface iVehile
	{
		void vShow();
	}
	interface iMaterial
	{
		void mShow();
	}
	class Car implements iVehile,iMaterial
	{
		protected int num;
		protected double gas;
		
		public Car(int n, double g)
		{
			num = n;
			gas = g;
			System.out.println("生產了車號為"+num+"，汽油量為"+gas+"的車子");
		}
		public void vShow()
		{
			System.out.println("車號是"+ num);
			System.out.println("汽油量是"	+ gas);
		}
		public void mShow()
		{
			System.out.println("車子的材料是鐵");
		}
	}
	