
public class page24
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Car car1;
		car1 = new Car();
		
		car1.setCar(1234, 20.5);
		System.out.println(car1);
	}
}
	class Car
	{
		protected int num;
		protected double gas;
		
		public Car()
		{
			num = 0;
			gas = 0.0;
			System.out.println("�Ͳ��F���l");
		}
	
		public void setCar(int n,double g)
		{
			num = n;
			gas = g;
			System.out.println("�N�����]�w��"+num+"�A�T�o�q�]�w��"+gas);
		}

		
		public String toString()
		{
			String str = "����"+num+"�T�o�q"+gas;
			return str;
		}
	}
	