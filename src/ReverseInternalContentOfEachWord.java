
public class ReverseInternalContentOfEachWord {

	public static void main(String[] args) {
		String s1 = "ideal Software Solution";
		String[] words = s1.split(" ");
		String rwords[]= new String[words.length];
		int k=0;
		for(String w:words) {
			char cw[] = w.toCharArray();
			char cw1[] = new char[cw.length];
			int index =0;
			for(int i=cw.length-1;i>=0;i--) {
				cw1[index] = cw[i];
				index++;
			}
			rwords[k] = new String(cw1);
			k++;
		}
		for(String w1:rwords) {
			System.out.println(w1);
		}
	}

}
