package SamplePrograms;

public class CharecterOccu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="communication";
		for(char c='a';c<='z';c++){
			int k=0;
			for(int j=0;j<str.length();j++){
				char ch=str.charAt(j);
				if(ch==c){
					k++;
				}
			}
			if(k>1){
				System.out.println("Charecter "+c+" has coccured "+k+" times");
			}
		}

	}

}
