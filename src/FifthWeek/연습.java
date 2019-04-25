package FifthWeek;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 연습 {
	
	public static void main(String[] args) {
		int 선택;
		int 선택1;
		int 선택2;
		Scanner Scan = new Scanner(System.in);
	
		
		do { System.out.println("선택해주세요 0.일시정지 1.수리 2.농사 3.먹고마시기 4.휴식 5.통신"); 
			선택 = Scan.nextInt(); 
			switch(선택) {
			case 0: 
				System.out.println("일시정지");
				do { System.out.println("선택해주세요 1.게임규칙 2.현재상태 3.뒤로가기(게임재개)"); 
				선택1 = Scan.nextInt(); 
				switch(선택1) {
				case 1:  
					System.out.println("게임규칙인쇄를 선택하셨습니다..");
				break;
				case 2: System.out.println("현재상태인쇄를 선택하셨습니다..");
				break;
				case 3: System.out.println("뒤로가기(게임재개)를 선택하셨습니다.");
				break;
				}	
				}while(선택1 !=3);
			break;
			case 1: 
				System.out.println("수리");
				do { System.out.println("선택해주세요 1.산소공급장치수리 2.구조신호기기수리 3.뒤로가기"); 
				선택1 = Scan.nextInt(); 
				switch(선택1) {
				case 1:  
					System.out.println("산소공급장치수리를 선택하셨습니다..");
				break;
				case 2: System.out.println("구조신호기기수리를 선택하셨습니다..");
				break;
				case 3: System.out.println("뒤로가기를 선택하셨습니다.");
				break;
				}	
				}while(선택1 !=3);
			break;
			case 2: 
				System.out.println("농사");
				do { System.out.println("선택해주세요 0.자라고있는 감자수 1.감자심기 2.물주기 3.뒤로가기"); 
				선택1 = Scan.nextInt(); 
				switch(선택1) {
				case 0:  
					System.out.println("자라고있는 감자수를 선택하셨습니다.");
				break;
				case 1: System.out.println("감자심기를 선택하셨습니다.");
				break;
				case 2: System.out.println("물주기를 선택하셨습니다.");
				break;
				case 3: System.out.println("뒤로가기를 선택하셨습니다.");
				break;
				}	
				}while(선택1 !=3);
			break;
			case 3: 
				System.out.println("먹고마시기");
				do { System.out.println("선택해주세요 1.감자먹기 2.물마시기 3.뒤로가기"); 
				선택1 = Scan.nextInt(); 
				switch(선택1) {
				case 1: System.out.println("감자먹기를 선택하셨습니다.");
				break;
				case 2: System.out.println("물마시기를 선택하셨습니다.");
				break;
				case 3: System.out.println("뒤로가기를 선택하셨습니다.");
				break;
				}	
				}while(선택1 !=3);
			break;
				
			case 4: 
				System.out.println("휴식");
				do { System.out.println("선택해주세요 1.일반휴식 2.잠자기 3.뒤로가기"); 
				선택1 = Scan.nextInt(); 
				switch(선택1) {
				case 1:  
					System.out.println("일반휴식을 선택하셨습니다.");
					do { System.out.println("무엇을할지선택해주세요 현재쉬고있는중입니다. 1.현재상태보기 2.일반휴식그만두기"); 
					선택2 = Scan.nextInt(); 
					switch(선택2) {
					case 1:  System.out.println("현재상태보기를 선택하셨습니다.");
                                       생존자.현재상태인쇄();
					break;
					case 2: System.out.println("일반휴식휴식그만두기를 선택하셨습니다.");
					break;
					}	
					}while(선택2 !=2);
				break;
				case 2:
					System.out.println("잠자기를 선택하셨습니다.");
					do { System.out.println("무엇을할지선택해주세요 현재잠자는중입니다. 1.현재상태보기 2.잠그만자기"); 
					선택2 = Scan.nextInt(); 
					switch(선택2) {
					case 1:  System.out.println("현재상태보기를 선택하셨습니다.");
					        생존자.현재상태인쇄();
					break;
					case 2: System.out.println("잠그만자기를 선택하셨습니다.");
					break;
					}	
					}while(선택2 !=2);	
				break;
				case 3: System.out.println("뒤로가기를 선택하셨습니다.");
				break;
				}	
				}while(선택1 !=3);	
			break;
			
			case 5: 
				System.out.println("통신");
				do { System.out.println("선택해주세요 1.지구와통신 2.외계신호탐지 3.뒤로가기"); 
				선택1 = Scan.nextInt(); 
				switch(선택1) {
				case 1:  
					System.out.println("지구와 통신을 선택하셨습니다.");
					do { System.out.println("무엇을할지선택해주세요 1.신호받기 2.신호보내기 3.뒤로가기"); 
					선택2 = Scan.nextInt(); 
					switch(선택2) {
					case 1:  System.out.println("지구에서 신호받기를 선택하셨습니다.");

					break;
					case 2: System.out.println("지구로 신호보내기를 선택하셨습니다.");
					break;
					case 3: System.out.println("뒤로가기를 선택하셨습니다.");
					break;
					}	
					}while(선택2 !=3);
				break;
				case 2:
					System.out.println("외계신호탐지를 선택하셨습니다.");
					do { System.out.println("무엇을할지선택해주세요 1.신호받기 2.신호보내기 3.뒤로가기"); 
					선택2 = Scan.nextInt(); 
					switch(선택2) {
					case 1:  System.out.println("외계에서 신호받기를 선택하셨습니다.");

					break;
					case 2: System.out.println("외계로 신호보내기를 선택하셨습니다.");
					break;
					case 3: System.out.println("뒤로가기를 선택하셨습니다.");
					break;
					}	
					}while(선택2 !=3);	
				break;
				case 3: System.out.println("뒤로가기를 선택하셨습니다.");
				break;
				}	
				}while(선택1 !=3);	
			break;
			
		    
			}	
		}while(true);
		
	}

}


//case 1: 
//	System.out.println("마을을 선택하셨습니다.");
//	do { System.out.println("선택해주세요 1.물건사기 2.물건팔기 3.나가기"); 
//	선택1 = Scan.nextInt(); 
//	switch(선택1) {
//	case 1:  
//		System.out.println("물건사기를 선택하셨습니다.");
//		do { System.out.println("무엇을살지선택해주세요 1.검 2.방패 3.나가기"); 
//		선택2 = Scan.nextInt(); 
//		switch(선택2) {
//		case 1:  System.out.println("검사기를 선택하셨습니다.");
//
//		break;
//		case 2: System.out.println("방패사기를 선택하셨습니다.");
//		break;
//		case 3: System.out.println("나가기를 선택하셨습니다.");
//		break;
//		}	
//		}while(선택2 !=3);
//	break;
//	case 2: System.out.println("물건팔기를 선택하셨습니다.");
//	break;
//	case 3: System.out.println("나가기를 선택하셨습니다.");
//	break;
//	}	
//	}while(선택1 !=3);
