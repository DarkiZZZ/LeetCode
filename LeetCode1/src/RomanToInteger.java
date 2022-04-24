
public class RomanToInteger {

	public static void main(String[] args) {
//		 #9 - Roman to Integer(Checking)
//		==================================
		System.out.print(romanToInt("CD"));
//		==================================
	}
	
//	 #9 - Roman to Integer(Checking)
//	==================================
	public static int romanToInt(String s) {
		String[] s1 = s.split("");
		int answer = 0;
		for(int i = 0; i < s1.length; i++) {
			switch(s1[i]) {
			case "M":
				answer+=1000;
				break;
			case "D":
				answer+=500;
				break;
			case "C":
				if(i == s1.length - 1) {
					answer+=100;
				}else {
					switch(s1[i+1]) {
					case "D":
						answer+=400;
						i++;
						break;
					case "M":
						answer+=900;
						i++;
						break;
					default:
						answer+=100;
						break;
					}
				}
				break;
			case "L":
				answer+=50;
				break;
			case "X":
				if(i == s1.length - 1) {
					answer+=10;
				}else {
					switch(s1[i+1]) {
					case "L":
						answer+=40;
						i++;
						break;
					case "C":
						answer+=90;
						i++;
						break;
					default:
						answer+=10;
						break;
					}
				}break;
			case "V":
				answer+=5;
				break;
			case "I":
				if(i == s1.length - 1) {
					answer+=1;
				}else {
					switch(s1[i+1]) {
					case "V":
						answer+=4;
						i++;
						break;
					case "X":
						answer+=9;
						i++;
						break;
					default:
						answer+=1;
						break;
					}
				}break;
			}
		}
		return answer;
	}
//	==================================

}
