
public class VerticalCharPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="This is truely fatastic";
		String[] tmp = str.split(" ");
		//calculate length of longest token;
		int n=0;
		
		for(String s:tmp) {
			if(s.length() > n) {
				n = s.length();
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<tmp.length;j++) {
				if( i<tmp[j].length())
				System.out.print(tmp[j].charAt(i));
			}
			System.out.println("\n");
		}

	}

}
