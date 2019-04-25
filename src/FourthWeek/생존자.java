package FourthWeek;

public class 생존자 extends 캐릭터{
	static String 이름 ="";
	static String 직업명;
	static int 생존일수;
	static int 체력;
	static int 포만감;
	static int 남은행동수;
	static int 남은감자수;
	static boolean 배고픔사망 = false;
	static boolean 산소공급장치사망 = false;
	static boolean 구조선도착 = false;
	static int 구조선이오기까지;
	static boolean 구조신호기기수리활성화 =false;


	static String 초기상태인쇄() {
		String output = "";
		//Static의 성질이 잘 이해가 안된다. (일단 왠만하면 Static으로 해서 쓰고있기는 하지만..)
		화성탐사기지.산소공급장치현재수리도 = 화성생태계.산소공급장치초기값랜덤;
		화성탐사기지.구조신호기기현재수리도 = 화성생태계.구조신호기기초기값랜덤;
		화성탐사기지.감자현재농사도 = 화성생태계.감자현재농사도초기값랜덤;
		생존자.생존일수 = 1;
		생존자.남은감자수 = 화성생태계.남은감자수초기값랜덤;

		생존자.체력 = 100;
		생존자.포만감 = 100;
		생존자.남은행동수 = 3;

		output += "--------------초기값 설정---------------\n"+
				"이름: " + 이름 + "\n" +
				"현재직업: " + 직업명 +"\n" +
				"산소공급장치현재수리도 : " + 화성탐사기지.산소공급장치현재수리도 + "\n"+
				"구조신호기기현재수리도 : " + 화성탐사기지.구조신호기기현재수리도 + "\n"+
				"감자현재농사도 : " + 화성탐사기지.감자현재농사도 + "\n"+
				"생존일수 : " + 생존일수 +"일차"+ "\n"+
				"남은감자수 : " + 남은감자수 + "\n"+
				"체력 : " + 체력 + "\n"+
				"포만감 : " + 포만감 + "\n"+
				"남은행동수 : " + 남은행동수 + "\n" +
	            "화성생태계의 영향으로 초기값이 다음과 같이 설정되었습니다. \n";
	       
		return output;
	}
	
	public static void 초기상태선언() {
		화성탐사기지.산소공급장치현재수리도 = 화성생태계.산소공급장치초기값랜덤;
		화성탐사기지.구조신호기기현재수리도 = 화성생태계.구조신호기기초기값랜덤;
		화성탐사기지.감자현재농사도 = 화성생태계.감자현재농사도초기값랜덤;
		생존자.생존일수 = 1;
		생존자.남은감자수 = 화성생태계.남은감자수초기값랜덤;

		생존자.체력 = 100;
		생존자.포만감 = 100;
		생존자.남은행동수 = 3;
	}

	public void 현재상태인쇄엔지니어() {
		String output = "";
		//Static의 성질이 잘 이해가 안된다. (일단 왠만하면 Static으로 해서 쓰고있기는 하지만..)
		
		System.out.println("    \n  ★ 현재상태 ★  \n    ");
		System.out.println("이름: " + 이름 + "                               수리능력: " + "성공시+" + 엔지니어.수리능력);
		System.out.println("직업: " + 직업명 + "                                 수리능력각성도: " + 엔지니어.수리능력각성도);
		System.out.println("산소공급장치현재수리도 : " + 화성탐사기지.산소공급장치현재수리도 + "               농사능력: " + "성공시+"+ 엔지니어.농사능력 );
		System.out.println("구조신호기기현재수리도 : " + 화성탐사기지.구조신호기기현재수리도 + "               수리성공확률 :" + 엔지니어.수리성공확률*100 +"%");
		System.out.println("감자현재농사도 : " + 화성탐사기지.감자현재농사도 + "                     농사성공확률 :" + 엔지니어.농사성공확률*100 + "%" );
		System.out.println("생존일수 : " + 생존일수 +"일차");
		System.out.println("남은감자수 : " + 남은감자수 );
		System.out.println("체력 : " + 체력);
		System.out.println("포만감 : " + 포만감);
		System.out.println("남은행동수 : " + 남은행동수 );
		if(엔지니어.수리능력각성발휘 ==true) {
			System.out.println("수리능력각성발휘: 수리능력각성 ");
		} else {
			System.out.println("수리능력각성발휘: 수리능력\"미\"각성 ");
		}
		if(엔지니어.수리능력각성발휘 ==true) {
    		System.out.println("칭호 : " + 엔지니어.칭호);  
    	} else {
    		System.out.println("칭호 : 칭호없음");  
    	}
		if(생존자.구조신호기기수리활성화) {
			System.out.println("구조신호를 보냈습니다. 구조일까지 " + 생존자.구조선이오기까지 + "일 남았습니다.");
			System.out.println("구조선이 올때까지 \"배고픔으로 인한 체력저하\" 혹은 \"산소공급장치고장\"으로 사망하지 않으면 지구로 돌아갈 수 있습니다.");
		}

	}
	
	public void 현재상태인쇄농식물학자() {
		String output = "";
		//Static의 성질이 잘 이해가 안된다. (일단 왠만하면 Static으로 해서 쓰고있기는 하지만..)
		
		System.out.println("    \n  ★ 현재상태 ★  \n    ");
		System.out.println("이름: " + 이름 + "                              수리능력: " + "성공시+" + 농식물학자.수리능력);
		System.out.println("직업: " + 직업명 + "                               농사능력각성도: " + 농식물학자.농사능력각성도);
		System.out.println("산소공급장치현재수리도 : " + 화성탐사기지.산소공급장치현재수리도 + "               농사능력: " + "성공시+"+ 농식물학자.농사능력 );
		System.out.println("구조신호기기현재수리도 : " + 화성탐사기지.구조신호기기현재수리도 + "               수리성공확률 :" + 농식물학자.수리성공확률*100 +"%");
		System.out.println("감자현재농사도 : " + 화성탐사기지.감자현재농사도 + "                     농사성공확률 :" + 농식물학자.농사성공확률*100 + "%" );
		System.out.println("생존일수 : " + 생존일수 +"일차");
		System.out.println("남은감자수 : " + 남은감자수 );
		System.out.println("체력 : " + 체력);
		System.out.println("포만감 : " + 포만감);
		System.out.println("남은행동수 : " + 남은행동수 );
		if(농식물학자.농사능력각성발휘 ==true) {
			System.out.println("농사능력각성발휘: 농사능력각성 ");
		} else {
			System.out.println("농사능력각성발휘: 농사능력\"미\"각성 ");
		}
		if(농식물학자.농사능력각성발휘 ==true) {
    		System.out.println("칭호 : " + 농식물학자.칭호);  
    	} else {
    		System.out.println("칭호 : 칭호없음");  
    	}
		if(생존자.구조신호기기수리활성화) {
			System.out.println("구조신호를 보냈습니다. 구조일까지 " + 생존자.구조선이오기까지 + "일 남았습니다.");
			System.out.println("구조선이 올때까지 \"배고픔으로 인한 체력저하\" 혹은 \"산소공급장치고장\"으로 사망하지 않으면 지구로 돌아갈 수 있습니다.");
		}

	}
	
	/*public void 현재상태인쇄() {
		String output = "";
		//Static의 성질이 잘 이해가 안된다. (일단 왠만하면 Static으로 해서 쓰고있기는 하지만..)
		
		System.out.println("      ★ 현재상태 ★           ");
		System.out.println("이름: " + 이름);
		System.out.println("직업: " + 직업명 );
		System.out.println("산소공급장치현재수리도 : " + 화성탐사기지.산소공급장치현재수리도 );
		System.out.println("구조신호기기현재수리도 : " + 화성탐사기지.구조신호기기현재수리도 );
		System.out.println("감자현재농사도 : " + 화성탐사기지.감자현재농사도 );
		System.out.println("생존일수 : " + 생존일수 +"일차");
		System.out.println("남은감자수 : " + 남은감자수 );
		System.out.println("체력 : " + 체력);
		System.out.println("포만감 : " + 포만감);
		System.out.println("남은행동수 : " + 남은행동수 );
		if(생존자.구조신호기기수리활성화) {
			System.out.println("구조신호를 보냈습니다. 구조일까지 " + 생존자.구조선이오기까지 + "일 남았습니다.");
			System.out.println("구조선이 올때까지 \"배고픔으로 인한 체력저하\" 혹은 \"산소공급장치고장\"으로 사망하지 않으면 지구로 돌아갈 수 있습니다.");
		}

	}*/






}
