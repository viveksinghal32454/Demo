package com.vivek;

public class DefaultValue {
	int a;
	float b; 
	char c;
	boolean d;
	String s;
	static boolean j;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k;
		float f=12.3f;//all decimal values are double so hum f lagayenge uske last mein
		DefaultValue df = new DefaultValue();
		System.out.println(df.a);//0
		System.out.println(df.b);//0.0
		System.out.println(df.c);//  and /u000 this in question
		System.out.println(df.d);//false
		System.out.println(df.s);//null
//		System.out.println(k); // This shows error because of local variable
		System.out.println(j);//ISmein static liya hai to object ke bina use ho sakta hai
//		System.out.println(st.j +" "+DefaultValue.j +" "+j);//Ye diffrent type of j call dikaya gaya hai

	}

}
