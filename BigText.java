import java.util.Scanner;

public class BigText{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = scanner.nextLine();
		AlphabetPrinter.print(word);
		scanner.close();
	}
}

class AlphabetPrinter{

	public static void print(String word){
		print(word, 5);
	}
	
	public static void print(String word, int noOfSpace){
		String space = "";
		for (int i = 0; i < noOfSpace; i++) {
			space+=" ";
		}
		char[] chars = word.toUpperCase().toCharArray();
		int len = chars.length;
		String[] toprint = new String[Alphabet.HEIGHT];
		for (int i = 0; i < toprint.length; i++) {
			toprint[i]=new String();
		}
		for(int i =0; i<len; i++){
			char c = chars[i];
			String bigText = Alphabet.getAlphabet(c);
			String[] splitedText = bigText.split("\n");
			for (int j = 0; j < Alphabet.HEIGHT; j++) {
				toprint[j]+=varify(splitedText[j])+space;
			}
		}
		printer(toprint);
	}

	private static String varify(String alphabet){
		while(alphabet.length()<Alphabet.WIDTH) alphabet+=" ";
		return alphabet;
	}

	private static void printer(String[] toprint){
		for (String print : toprint) {
			System.out.println(print);
		}
	}
}

class Alphabet{

	public static final int HEIGHT = 5;
	public static final int WIDTH = 9;


	public static String getAlphabet(char alpha){
		switch (alpha){
			case 'A': return A;
			case 'B': return B;
			case 'C': return C;
			case 'D': return D;
			case 'E': return E;
			case 'F': return F;
			case 'G': return G;
			case 'H': return H;
			case 'I': return I;
			case 'J': return J;
			case 'K': return K;
			case 'L': return L;
			case 'M': return M;
			case 'N': return N;
			case 'O': return O;
			case 'P': return P;
			case 'Q': return Q;
			case 'R': return R;
			case 'S': return S;
			case 'T': return T;
			case 'U': return U;
			case 'V': return V;
			case 'W': return W;
			case 'X': return X;
			case 'Y': return Y;
			case 'Z': return Z;
		}
		return null;
	}
	
	public static final String A = """
    *
   * *
  *   *
 * * * *
*       *
""";
	public static final String B = """
* * * *
*       *
* * * *
*       *
* * * *""";
	public static final String C = """
  * * * *
*        
*        
*        
  * * * *""";
	public static final String D = """
* * * *
*       *
*       *
*       *
* * * *""";
	public static final String E = """
* * * * *
*        
* * * *
*        
* * * * *""";
	public static final String F = """
* * * * *
*        
* * * *
*        
*        """;
	public static final String G = """
 * * * * 
*        
*   * * *
*      * 
 * * * *""";
	public static final String H = """
*       *
*       *
* * * * *
*       *
*       *""";
	public static final String I = """
* * * * *
    *
    *
    *
* * * * *""";

	public static final String J = """
* * * * *
      *
	  *
 *    *
  * * *""";

	public static final String K = """
*       *
*     *
* * *
*     *
*       *""";

	public static final String L = """
*
*
*
*
* * * * *""";

	public static final String M = """
* *   * *
*  * *  *
*   *   *
*       *
*       *""";

public static final String N = """
*       *
* *     *
*   *   *
*     * *
*       *""";


	public static final String O = """
 * * * *
*       *
*       *
*       *
 * * * * """;

	public static final String P = """
* * * *
*       *
* * * * 
*
*""";

	public static final String Q = """
 * * * *
*       *
*  * *  *
* *   * *
 * * * * """;

	public static final String R = """
* * * *
*       *
* * * *
*     *
*       *""";

	public static final String S = """
 * * * *
*
  * * *
        *
* * * *""";


	public static final String T = """
* * * * *
    *
	*
	*
	*""";	

public static final String U = """
*       *
*       *
*       *
*       *
 * * * *""";

	public static final String V = """
*       *
 *     *
  *   *
   * *
    * """;


	public static final String W = """
*       *
*   *   *
*  * *  *
* *   * *
*       *""";


	public static final String X = """
*       *
  *   *
    *
  *   *
*       *""";

	public static final String Y = """
*       *
   * *
    *
	*
	*""";

	public static final String Z = """
* * * * *
      *
	*
  *
* * * * *""";
}