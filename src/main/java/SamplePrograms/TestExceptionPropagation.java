package SamplePrograms;

public class TestExceptionPropagation {

		void m(){  
			int data=50/0;  
		}  
		void n(){  
			m();  
		}  
		void p(){  
			try{  
				n();  
			}catch(Exception e){System.out.println("exception handled");}  
		}  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestExceptionPropagation obj=new TestExceptionPropagation();  
		obj.p();  
		System.out.println("normal flow...");  
	}
}
