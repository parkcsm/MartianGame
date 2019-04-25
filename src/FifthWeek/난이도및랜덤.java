package FifthWeek;

public class 난이도및랜덤 {
	//화성의 모래폭풍에 따라 현재 상태가 달라집니다.
	
	
	static int 산소공급장치초기값랜덤 = (int)(Math.random()*(51-50))+50;
	static int 통신기기초기값랜덤 = (int)(Math.random()*(99-98))+98;
	static int 남은감자수초기값랜덤    = (int)(Math.random()*(300-105))+105;
	static int 남은물리터초기값랜덤 =  (int)(Math.random()*(300-100))+100;
	
	static double 구조선이헤맬확률 = 0.55;
	
	static double 산소공급장치고장확률 = 0.1;
	static double 통신기기고장확률 = 0.1;
	
    static double 쉬는동안이득일확률 =0.85;
    static double 자는동안이득일확률숙면도10이상30미만 =0.5;
    static double 자는동안이득일확률숙면도30이상50미만 =0.6;
    static double 자는동안이득일확률숙면도50이상100미만 =0.7;
    static double 자는동안이득일확률숙면도100 =0.9;

}
