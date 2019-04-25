package FifthWeek;

public class 생존자 extends 캐릭터{
	static boolean 엔지니어진행 = false;
	static boolean 농식물학자진행 = false;
	static String 이름 ="";
	static String 직업명;
	static int 생존일수;
	static int 체력;
	static int 포만감;
	static int 남은감자수;
	static int 남은물리터;
	static int 체내수분;
	static boolean 배고픔사망 = false;
	static boolean 산소공급장치사망 = false;
	static boolean 구조선도착 = false;
	static int 구조선이오기까지=9999;
	static boolean 통신기기수리활성화 =false;
    static int 집중도;
    static int 숙면도;
    static double 기본성공확률;
    
    

	
	
	public static void 초기상태선언() {
		화성탐사기지.산소공급장치현재수리도 = 난이도및랜덤.산소공급장치초기값랜덤;
		화성탐사기지.통신기기현재수리도 = 난이도및랜덤.통신기기초기값랜덤;
		생존자.생존일수 = 1;
		생존자.남은감자수 = 난이도및랜덤.남은감자수초기값랜덤;
            생존자.남은물리터 = 난이도및랜덤.남은물리터초기값랜덤;
		생존자.체력 =50;
		생존자.포만감 =40;
		생존자.체내수분 = 40;
		생존자.집중도=40;
	}

	static public void 현재상태인쇄() {

		if(엔지니어진행) {
			System.out.println("                                                                                                                                                                                      ★ 현재상태 ★      ");
			System.out.println(" ");
			System.out.println("                                                              이름: " + 이름 + "                          수리능력: " + "성공시 +"+ 엔지니어.수리능력);
			System.out.println("                                                              직업: " + 직업명 + "                        수리능력각성: " + 엔지니어.수리능력각성 + "(칭호:"+ 엔지니어.칭호+ ")");
			System.out.println("                                                              체력 : " + 체력 + "                            수리능력각성도: " + 엔지니어.수리능력각성도);
			System.out.println("                                                              집중도 : " + 생존자.집중도 + "                          수리성공확률 :" + (int)(엔지니어.수리성공확률*100) +"%" );
			System.out.println("                                                              포만감 : " + 포만감 +  "                          농사능력: " + "성공시 3초당 감자성장확률 +" + (int)(엔지니어.농사능력*100)+"%");
			System.out.println("                                                              체내수분 : " + 생존자.체내수분+ "                        농사성공확률 :" + (int)(엔지니어.농사성공확률*100) + "%"  );
			System.out.println("                                                              숙면도 : " + 생존자.숙면도 );
			System.out.println("                                                              "+"                                      심은감자수 : "+ 감자자랄때변화.심은감자수 );
			System.out.println("                                                              "+"남은감자수 : " + 남은감자수 + "                       심은감자수 성장정도 : " + 감자자랄때변화.심은감자수의자란정도);      
			System.out.println("                                                              "+"남은물리터 : " + 남은물리터 + "                       다자란감자수 : " + 감자자랄때변화.다자란감자수);
			System.out.println("                                                              " + "                                      현재감자의성장확률: 3초당 " + (int)(감자자랄때변화.물거름주기로인한자라는정도증가*100) + "%");
			System.out.println("                                                              산소공급장치현재수리도 : " + 화성탐사기지.산소공급장치현재수리도 );
			System.out.println("                                                              통신기기현재수리도 : " + 화성탐사기지.통신기기현재수리도 +  "               생존시간 : " +생존일수+"일차 "+ 시간.현재시간);

		}


		if(농식물학자진행) {
			System.out.println("                                                                                                                                                                                      ★ 현재상태 ★      ");
			System.out.println(" ");
			System.out.println("                                                              이름: " + 이름 + "                          농사능력: " + "성공시 3초당 감자성장확률 +" + (int)(농식물학자.농사능력*100)+"%");
			System.out.println("                                                              직업: " + 직업명 + "                      농사능력각성: " + 농식물학자.농사능력각성 + "(칭호:"+ 농식물학자.칭호+ ")");
			System.out.println("                                                              체력 : " + 체력 + "                             농사능력각성도: " + 농식물학자.농사능력각성도);
			System.out.println("                                                              집중도 : " + 생존자.집중도 + "                          농사성공확률 :" + (int)(농식물학자.농사성공확률*100) +"%" );
			System.out.println("                                                              포만감 : " + 포만감 +  "                          수리능력: " +"성공시 +"+농식물학자.수리능력);
			System.out.println("                                                              체내수분 : " + 생존자.체내수분+ "                        수리성공확률 :" + (int)(농식물학자.수리성공확률*100) + "%"  );
			System.out.println("                                                              숙면도 : " + 생존자.숙면도 );
			System.out.println("                                                              "+"                                      심은감자수 : "+ 감자자랄때변화.심은감자수 );
			System.out.println("                                                              "+"남은감자수 : " + 남은감자수 + "                       심은감자수 성장정도 : " + 감자자랄때변화.심은감자수의자란정도);      
			System.out.println("                                                              "+"남은물리터 : " + 남은물리터 + "                       다자란감자수 : " + 감자자랄때변화.다자란감자수);
			System.out.println("                                                              " + "                                      현재감자의성장확률: 3초당 " + (int)(감자자랄때변화.물거름주기로인한자라는정도증가*100) + "%");
			System.out.println("                                                              산소공급장치현재수리도 : " + 화성탐사기지.산소공급장치현재수리도 );
			System.out.println("                                                              통신기기현재수리도 : " + 화성탐사기지.통신기기현재수리도 +  "               생존시간 : " +생존일수+"일차 "+ 시간.현재시간);
		}	
	}

}
