package javaworkshop;

public class Test04 {
	public static void main(String[] args) {
		for(int dic=1; dic<=6; dic++) {
			for(int dic2=1; dic2<=6; dic2++) {
				if(dic+dic2 == 6) {
					System.out.println(dic+"+"+dic2+"="+(dic+dic2));
				}
			}
		}
	}
}