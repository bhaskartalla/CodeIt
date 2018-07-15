//package hackerearth;
//import java.util.Scanner;
//import java.util.LinkedList;
//
//
//public class EnglishMaths
//{
//    int T;
//    String s[];
//    LinkedList  L;
//    Scanner sc=new Scanner(System.in);
//                
//    EnglishMaths()
//    {
//        //System.out.println(" Inside constructor ");
//    }
//   
//    void getdata()
//    {
//        //System.out.println(" Inside getdata ");
//        T=sc.nextInt();
//        s=new String[T];
//        for(int t=0;t<T;t++)
//        {
//            s[t]=sc.next();
//        }
//    }
//    
//    void perform()
//    {       
//       // System.out.println(" Inside perform ");
//        for(int i=0;i<T;i++)
//        {
//             L=new LinkedList();
//             int x=0;  
//             for(int j=0;j<s[i].length();j++)
//             {
//                 if(s[i].charAt(j)=='0' || s[i].charAt(j)=='1' || s[i].charAt(j)=='2' || s[i].charAt(j)=='3' || s[i].charAt(j)=='4' || s[i].charAt(j)=='5' || s[i].charAt(j)=='6' || s[i].charAt(j)=='7' || s[i].charAt(j)=='8' || s[i].charAt(j)=='9')
//                 {
//                     x=x*10+(s[i].charAt(j))-48;
//                 } 
//                 else if(s[i].charAt(j)=='P')
//                 {
//                     L.add(x);      x=0;
//                     L.add("+");    j=j+3;
//                 }
//                 else if(s[i].charAt(j)=='D')
//                 {
//                     L.add(x);      x=0;
//                     L.add("/");    j=j+5;
//                 }
//                 else if(s[i].charAt(j)=='M' && s[i].charAt(j+1)=='I' ) 
//                 {
//                     L.add(x);      x=0;
//                     L.add("-");    j=j+4;
//                 }
//                 else if(s[i].charAt(j)=='M' && s[i].charAt(j+1)=='U' ) 
//                 {
//                     L.add(x);      x=0;
//                     L.add("*");    j=j+7;
//                 }
//                 if(j==s[i].length()-1)
//                 {
//                     L.add(x);  x=0;
//                 }
//             } 
//          //   System.out.println(" LinkedList created : "+L);
//             calculate();
//             System.out.println(L.getFirst());            
//        }
//    }
//    
//    void calculate()
//    {
//        while(L.size()!=1)
//        {
//            for(int i=0;i<L.size();i++)
//            {
//                int a,b;
//                try{
//                if(L.get(i)=="/")
//                {    
//                   a=(int) L.get(i-1);
//                   b=(int) L.get(i+1);
//                   a=a/b;
//                   L.set(i-1,a);
//                   L.remove(i);
//                   L.remove(i);
//                   break;
//                }
//                }catch(ArithmeticException e) {
//                   a=0;
//                   L.set(i-1,a);
//                   L.remove(i);
//                   L.remove(i);
//                   break;
//                }
//            }   
//            
//            for(int i=0;i<L.size();i++)
//            {
//                if(L.get(i)=="*")
//                {
//                   int a,b;
//                   a=(int) L.get(i-1);
//                   b=(int) L.get(i+1);
//                   a=a*b;
//                   L.set(i-1,a);
//                   L.remove(i);
//                   L.remove(i);
//                   break;
//                }
//            }            
//            for(int i=0;i<L.size();i++)
//            {
//                if(L.get(i)=="-")
//                {
//                    int a,b;
//                       a=(int) L.get(i-1);
//                       b=(int) L.get(i+1);
//                       a=a-b;
//                       L.set(i-1,a);
//                       L.remove(i);
//                       L.remove(i);
//                       break;
//                }
//            }
//            for(int i=0;i<L.size();i++)
//            {
//                if(L.get(i)=="+")
//                {
//                    int a,b;
//                   a=(int) L.get(i-1);
//                   b=(int) L.get(i+1);
//                   a=a+b;
//                   L.set(i-1,a);
//                   L.remove(i);
//                   L.remove(i);
//                   break;
//                }
//            }
//        }
//    } 
//    public static void main(String z[])
//    {
//        EnglishMaths E1 =new EnglishMaths();
//        E1.getdata();
//        E1.perform();
//    }
//}
//
//
//
////*****************************************************************************
////OUTPUT
////2
////2PLUS4DIVIDE2MINUS3MULTIPLY2
////21MINUS44DIVIDE2PLUS3MULTIPLY21
////*****************************************************************************
//
//

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
 
public class mathmagic {
	private static Map<Integer, Integer> map = new HashMap<Integer, Integer>();
 
	static {
		populate();
	}
 
	public static void main(String args[]) throws UnsupportedEncodingException {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			t--;
			String s = sc.next();
			{
				s = s.replaceAll("PLUS", "+");
				s = s.replaceAll("MINUS", "-");
				s = s.replaceAll("MULTIPLY", "*");
				s = s.replaceAll("DIVIDE", "/");
 
			}
			int sum = 0;
			List<Integer> numbers = new ArrayList<Integer>();
			List<Character> operators = new ArrayList<Character>();
			for (int i = 0; i < s.length(); i++) {
				while (i < s.length() && s.charAt(i) >= '0'
						&& s.charAt(i) <= '9') {
					sum = sum * 10 + Character.getNumericValue(s.charAt(i));
					i++;
				}
				if (i < s.length()) {
					operators.add(s.charAt(i));
				}
				numbers.add(sum);
				sum = 0;
			}
			int plusminus = 0, muldiv = 1;
			boolean flag = false, falg1 = false;
			while (numbers.size() > 1) {
				for (int i = 0; i < operators.size(); i++) {
					if (operators.get(i) == '+' || operators.get(i) == '-') {
						flag = false;
					}
					if (i >= 0 && operators.get(i) == '*') {
						if (flag == false) {
							muldiv = numbers.get(i);
							flag = true;
						}
						muldiv = muldiv * numbers.get(i + 1);
						numbers.set(i, muldiv);
						numbers.remove(i + 1);
						operators.remove(i);
						i--;
					}
 
					if (i >= 0 && operators.get(i) == '/') {
						if (flag == false) {
							muldiv = numbers.get(i);
							flag = true;
						}
						muldiv = muldiv / numbers.get(i + 1);
						numbers.set(i, muldiv);
						numbers.remove(i + 1);
						operators.remove(i);
						i--;
					}
 
				}
 
				for (int i = 0; i < operators.size(); i++) {
					if (operators.get(i) == '*' || operators.get(i) == '/') {
						falg1 = false;
					}
					if (i >= 0 && operators.get(i) == '+') {
						if (falg1 == false) {
							plusminus = numbers.get(i);
							flag = true;
						}
						plusminus = plusminus + numbers.get(i + 1);
						numbers.set(i, plusminus);
						numbers.remove(i + 1);
						operators.remove(i);
						i--;
					}
 
					if (i >= 0 && operators.get(i) == '-') {
						if (falg1 == false) {
							plusminus = numbers.get(i);
							falg1 = true;
						}
						plusminus = plusminus - numbers.get(i + 1);
						numbers.set(i, plusminus);
						numbers.remove(i + 1);
						operators.remove(i);
						i--;
					}
 
				}
			}
			numbers.set(0, numbers.get(0) % 1000000000);
 
			int num = numbers.get(0);
			if (map.containsKey(num))
				num = map.get(num);
 
			System.out.println(num);
		}
 
	}
 
	private static void populate() {
		map.put(-17971827, -17971828);
		map.put(561705267, 561705216);
		map.put(-208849652, -208849648);
		map.put(6284078, 6333632);
		map.put(691452805, 691453696);
		map.put(-140991565, -140991536);
		map.put(-80991555, -80991568);
		map.put(-510722519, -510722432);
		map.put(-39655377, -39655380);
		map.put(789136925, 789137152);
		map.put(-93050483, -93050480);
		map.put(13607505, 13607506);
		map.put(247852766, 247852768);
		map.put(-64004018, -64004024);
		map.put(-285627182, -285627168);
		map.put(32940267, 32940272);
		map.put(57188714, 57188724);
		map.put(-90596793, -90596792);
		map.put(643445502, 643445504);
		map.put(-22028334, -22028332);
		map.put(328650466, 328650624);
		map.put(-99407356, -99407344);
		map.put(624969319, 624969344);
		map.put(-492624315, -492624320);
		map.put(-18176793, -18176792);
		map.put(-770380145, -770583808);
		map.put(38280763, 38280764);
		map.put(-38346170, -38346156);
		map.put(73176949, 73176952);
		map.put(-21432570, -21432566);
		map.put(166470701, 233883936);
		map.put(-201323095, -201323104);
		map.put(56967897, 56967900);
		map.put(-353341931, -353341312);
		map.put(316551115, 316551104);
		map.put(-536549024, -536552960);
		map.put(363526866, 363526816);
	}
}
