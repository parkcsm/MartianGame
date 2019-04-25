package FifthWeek;

public class 농식물학자 extends 생존자{

	static double 농식물학자수리고유확률 = 0.1;
	static double 농식물학자농사고유확률 = 0.2;
	static int 수리능력 = 1; 
	static double 농사능력 = 0.04; 
	static int 농사능력각성도 =59;
	static boolean 농사능력각성발휘 = false;
	static double 수리성공확률 = 생존자.기본성공확률+ 농식물학자수리고유확률;
	static double 농사성공확률 = 생존자.기본성공확률+ 농식물학자농사고유확률;
    static String 칭호 = "농식물학자";
    static String 농사능력각성 = "각성 미완료";
    static boolean 구조선출발;
	




}


