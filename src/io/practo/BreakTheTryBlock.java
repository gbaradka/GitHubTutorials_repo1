package io.practo;

public class BreakTheTryBlock {

	public static void main(String[] args) {
		
		System.out.println();
		
		System.out.println("in try");
		l:try {
			if(3>2) {
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			System.out.println("in finally");
			break l;
		}
	
		System.out.println("out of try");
	}
	
	
	public static void m() {
		
	}

}
