package FourthWeek;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 화성에서살아남기 {


	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		생존자.초기상태선언();


		int 선택;


		do {
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			System.out.println( "\"화성에서 살아남기\" 게임을 시작하셨습니다. 생존자의 이름을 입력해주세요.");
			System.out.println( "한번 정하면 바꾸기 어려우니 신중히 선택해주시기 바랍니다.");
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

			생존자 생존자이름설정 = new 생존자(); 생존자이름설정.이름 =  Scan.nextLine();
			System.out.println( "이름을 \"" + 생존자이름설정.이름 +"\"으로 정하셨습니다. 이대로 진행하시겠습니까? 1.예 2.아니오"); //아니오 예외처리못함
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");



			선택 = Scan.nextInt();

			switch(선택) {
			case 1 :  
				System.out.println("게임은 진행합니다.");

				break;
			case 2 :
				System.out.println("다시 돌아갑니다.");

				break;
			default : 
				System.out.println("1과 2이외의 숫자를 입력하셨습니다. 다시 입력해주십시오");

				break;
			}
		} while(선택 != 1);






		boolean 엔지니어진행 = false;
		boolean 농식물학자진행 = false;


		do {
			System.out.println("게임규칙을 확인하시고 직업을 선택해주세요 1.엔지니어 2. 농식물학자 (한번 직업선택후 직업을 바꾸기 어려우니 신중히 선택히 주시기 바랍니다.)");
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			선택 = Scan.nextInt();

			switch(선택) {
			case 0 : 
				try{
					File file = new File("게임규칙.txt");
					Scanner sc = new Scanner(file);
					while (sc.hasNextLine()) {
						System.out.println(sc.nextLine());
					}
					sc.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}	break;

			case 1 : 엔지니어진행 = true;
			System.out.println("직업이 엔지니어로 선택되었습니다. 엔지니어는 행동당 수리+2, 농사+1의 특성을 가집니다.");
			System.out.println("초기값으로 화성생태계의 혹독한 모래폭풍의 영향에따라 최초의 수리도 및 농사도와 남은감자수가 랜덤으로 설정되었습니다.");
			System.out.println("이외에도 행동시 성공확률이 70%로 설정되어있습니다. 만약 숙련된 엔지니어로 전직시에는 90%로 적용됩니다. 자세한사항은 게임규칙을 참고해주세요!");
			생존자 생존직업설정을엔지니어로 = new 생존자(); 생존직업설정을엔지니어로.직업명 = "엔지니어";
			break;

			case 2 : 농식물학자진행 = true;
			System.out.println("직업이 농식물학자로 선택되었습니다. 농식물학자는 행동당 수리+1, 농사+2의 특성을 가집니다.");
			System.out.println("초기값으로 화성생태계의 혹독한 모래폭풍의 영향에따라 최초의 수리도 및 농사도와 남은감자수가 랜덤으로 설정되었습니다.");
			System.out.println("이외에도 행동시 성공확률이 70%로 설정되어있습니다. 만약 숙련된 농식물학자로 전직시에는 90%로 적용됩니다. 자세한사항은 게임규칙을 참고해주세요!");
			생존자 생존직업설정을농식물학자로 = new 생존자(); 생존직업설정을농식물학자로.직업명 = "농식물학자";
			break;

			default : System.out.println("0과 1과 2이외의 숫자를 입력하셨습니다. 다시 입력해주십시오");
			break;
			}
		} while(선택 !=1 && 선택 !=2);



		생존자 생존자게임시작 = new 생존자(); 
		엔지니어 엔지니어 = new 엔지니어();
		농식물학자 농식물학자 = new 농식물학자();

		if(엔지니어진행) {	
			do {생존자게임시작.현재상태인쇄엔지니어(); 
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
				System.out.println("숫자를 입력하세요(1,2,3은 행동을 소모합니다) 0.게임규칙 1.산소공급장치수리 2.구조신호기기수리 3.감자농사 4.감자먹기 5.하루 끝마치기");
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
				선택 = Scan.nextInt();

				switch(선택){
				case 0 : 
					try{
						File file = new File("게임규칙.txt");
						Scanner sc = new Scanner(file);
						while (sc.hasNextLine()) {
							System.out.println(sc.nextLine());
						}
						sc.close();
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					}	
					break;

				case 1 :
					엔지니어 산소공급장치수리 = new 엔지니어(); 산소공급장치수리.산소공급장치수리();
					break;			    	    
				case 2 : 
					엔지니어 구조신호기기수리 = new 엔지니어(); 구조신호기기수리.구조신호기기수리();
					break;
				case 3 :
					엔지니어 감자농사 = new 엔지니어(); 감자농사.감자농사();
					break;
				case 4 : 
					엔지니어 감자먹기 = new 엔지니어 (); 감자먹기.감자먹기();
					break;
				case 5 :
					엔지니어 하루끝마치기 = new 엔지니어(); 하루끝마치기.하루끝마치기();
					break;
				default : System.out.println("숫자를 다시 입력해주세요");
				    break;

				}

			} while(생존자.배고픔사망 != true && 생존자.산소공급장치사망 !=true && 생존자.구조선도착 !=true);
		}


		if(농식물학자진행) {


			do {생존자게임시작.현재상태인쇄농식물학자(); 
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
				System.out.println("숫자를 입력하세요(1,2,3은 행동을 소모합니다) 0.게임규칙 1.산소공급장치수리 2.구조신호기기수리 3.감자농사 4.감자먹기 5.하루 끝마치기");
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
				선택 = Scan.nextInt();

				switch(선택){
				case 0 : 
					try{
						File file = new File("게임규칙.txt");
						Scanner sc = new Scanner(file);
						while (sc.hasNextLine()) {
							System.out.println(sc.nextLine());
						}
						sc.close();
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					}	
					break;

				case 1 :
					농식물학자 산소공급장치수리 = new 농식물학자(); 산소공급장치수리.산소공급장치수리();
					break;

				case 2 : 
					농식물학자 구조신호기기수리 = new 농식물학자(); 구조신호기기수리.구조신호기기수리();
					break;
				case 3 :
					농식물학자 감자농사 = new 농식물학자(); 감자농사.감자농사();
					break;
				case 4 : 
					농식물학자 감자먹기 = new 농식물학자 (); 감자먹기.감자먹기();
					break;
				case 5 :
					농식물학자 하루끝마치기 = new 농식물학자(); 하루끝마치기.하루끝마치기();
					break;
				default : System.out.println("숫자를 다시 입력해 주세요");
				    break;
				}

			} while(생존자.배고픔사망 != true && 생존자.산소공급장치사망 !=true && 생존자.구조선도착 !=true);


		}

		if(생존자.배고픔사망) {
			System.out.print("당신은 " + 생존자.생존일수 + "일차까지 생존했지만, 굶주림으로 인해 사망하고 말았습니다.");

		}
		if(생존자.산소공급장치사망) {
			System.out.print("당신은 " + 생존자.생존일수 + "일차까지 생존했지만, 산소공급장치의 고장으로인해 사망하고 말았습니다.");
		}
		if(생존자.구조선도착) {
			System.out.print("!알림 미션성공!! 당신은 " + 생존자.생존일수 + "일차까지 생존해서, 결국 구조선을타고 집으로 돌아가게 되었습니다.");
		}
	}
}


