package FifthWeek;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ���� {
	
	public static void main(String[] args) {
		int ����;
		int ����1;
		int ����2;
		Scanner Scan = new Scanner(System.in);
	
		
		do { System.out.println("�������ּ��� 0.�Ͻ����� 1.���� 2.��� 3.�԰��ñ� 4.�޽� 5.���"); 
			���� = Scan.nextInt(); 
			switch(����) {
			case 0: 
				System.out.println("�Ͻ�����");
				do { System.out.println("�������ּ��� 1.���ӱ�Ģ 2.������� 3.�ڷΰ���(�����簳)"); 
				����1 = Scan.nextInt(); 
				switch(����1) {
				case 1:  
					System.out.println("���ӱ�Ģ�μ⸦ �����ϼ̽��ϴ�..");
				break;
				case 2: System.out.println("��������μ⸦ �����ϼ̽��ϴ�..");
				break;
				case 3: System.out.println("�ڷΰ���(�����簳)�� �����ϼ̽��ϴ�.");
				break;
				}	
				}while(����1 !=3);
			break;
			case 1: 
				System.out.println("����");
				do { System.out.println("�������ּ��� 1.��Ұ�����ġ���� 2.������ȣ������ 3.�ڷΰ���"); 
				����1 = Scan.nextInt(); 
				switch(����1) {
				case 1:  
					System.out.println("��Ұ�����ġ������ �����ϼ̽��ϴ�..");
				break;
				case 2: System.out.println("������ȣ�������� �����ϼ̽��ϴ�..");
				break;
				case 3: System.out.println("�ڷΰ��⸦ �����ϼ̽��ϴ�.");
				break;
				}	
				}while(����1 !=3);
			break;
			case 2: 
				System.out.println("���");
				do { System.out.println("�������ּ��� 0.�ڶ���ִ� ���ڼ� 1.���ڽɱ� 2.���ֱ� 3.�ڷΰ���"); 
				����1 = Scan.nextInt(); 
				switch(����1) {
				case 0:  
					System.out.println("�ڶ���ִ� ���ڼ��� �����ϼ̽��ϴ�.");
				break;
				case 1: System.out.println("���ڽɱ⸦ �����ϼ̽��ϴ�.");
				break;
				case 2: System.out.println("���ֱ⸦ �����ϼ̽��ϴ�.");
				break;
				case 3: System.out.println("�ڷΰ��⸦ �����ϼ̽��ϴ�.");
				break;
				}	
				}while(����1 !=3);
			break;
			case 3: 
				System.out.println("�԰��ñ�");
				do { System.out.println("�������ּ��� 1.���ڸԱ� 2.�����ñ� 3.�ڷΰ���"); 
				����1 = Scan.nextInt(); 
				switch(����1) {
				case 1: System.out.println("���ڸԱ⸦ �����ϼ̽��ϴ�.");
				break;
				case 2: System.out.println("�����ñ⸦ �����ϼ̽��ϴ�.");
				break;
				case 3: System.out.println("�ڷΰ��⸦ �����ϼ̽��ϴ�.");
				break;
				}	
				}while(����1 !=3);
			break;
				
			case 4: 
				System.out.println("�޽�");
				do { System.out.println("�������ּ��� 1.�Ϲ��޽� 2.���ڱ� 3.�ڷΰ���"); 
				����1 = Scan.nextInt(); 
				switch(����1) {
				case 1:  
					System.out.println("�Ϲ��޽��� �����ϼ̽��ϴ�.");
					do { System.out.println("�����������������ּ��� ���罬���ִ����Դϴ�. 1.������º��� 2.�Ϲ��޽ı׸��α�"); 
					����2 = Scan.nextInt(); 
					switch(����2) {
					case 1:  System.out.println("������º��⸦ �����ϼ̽��ϴ�.");
                                       ������.��������μ�();
					break;
					case 2: System.out.println("�Ϲ��޽��޽ı׸��α⸦ �����ϼ̽��ϴ�.");
					break;
					}	
					}while(����2 !=2);
				break;
				case 2:
					System.out.println("���ڱ⸦ �����ϼ̽��ϴ�.");
					do { System.out.println("�����������������ּ��� �������ڴ����Դϴ�. 1.������º��� 2.��׸��ڱ�"); 
					����2 = Scan.nextInt(); 
					switch(����2) {
					case 1:  System.out.println("������º��⸦ �����ϼ̽��ϴ�.");
					        ������.��������μ�();
					break;
					case 2: System.out.println("��׸��ڱ⸦ �����ϼ̽��ϴ�.");
					break;
					}	
					}while(����2 !=2);	
				break;
				case 3: System.out.println("�ڷΰ��⸦ �����ϼ̽��ϴ�.");
				break;
				}	
				}while(����1 !=3);	
			break;
			
			case 5: 
				System.out.println("���");
				do { System.out.println("�������ּ��� 1.��������� 2.�ܰ��ȣŽ�� 3.�ڷΰ���"); 
				����1 = Scan.nextInt(); 
				switch(����1) {
				case 1:  
					System.out.println("������ ����� �����ϼ̽��ϴ�.");
					do { System.out.println("�����������������ּ��� 1.��ȣ�ޱ� 2.��ȣ������ 3.�ڷΰ���"); 
					����2 = Scan.nextInt(); 
					switch(����2) {
					case 1:  System.out.println("�������� ��ȣ�ޱ⸦ �����ϼ̽��ϴ�.");

					break;
					case 2: System.out.println("������ ��ȣ�����⸦ �����ϼ̽��ϴ�.");
					break;
					case 3: System.out.println("�ڷΰ��⸦ �����ϼ̽��ϴ�.");
					break;
					}	
					}while(����2 !=3);
				break;
				case 2:
					System.out.println("�ܰ��ȣŽ���� �����ϼ̽��ϴ�.");
					do { System.out.println("�����������������ּ��� 1.��ȣ�ޱ� 2.��ȣ������ 3.�ڷΰ���"); 
					����2 = Scan.nextInt(); 
					switch(����2) {
					case 1:  System.out.println("�ܰ迡�� ��ȣ�ޱ⸦ �����ϼ̽��ϴ�.");

					break;
					case 2: System.out.println("�ܰ�� ��ȣ�����⸦ �����ϼ̽��ϴ�.");
					break;
					case 3: System.out.println("�ڷΰ��⸦ �����ϼ̽��ϴ�.");
					break;
					}	
					}while(����2 !=3);	
				break;
				case 3: System.out.println("�ڷΰ��⸦ �����ϼ̽��ϴ�.");
				break;
				}	
				}while(����1 !=3);	
			break;
			
		    
			}	
		}while(true);
		
	}

}


//case 1: 
//	System.out.println("������ �����ϼ̽��ϴ�.");
//	do { System.out.println("�������ּ��� 1.���ǻ�� 2.�����ȱ� 3.������"); 
//	����1 = Scan.nextInt(); 
//	switch(����1) {
//	case 1:  
//		System.out.println("���ǻ�⸦ �����ϼ̽��ϴ�.");
//		do { System.out.println("�����������������ּ��� 1.�� 2.���� 3.������"); 
//		����2 = Scan.nextInt(); 
//		switch(����2) {
//		case 1:  System.out.println("�˻�⸦ �����ϼ̽��ϴ�.");
//
//		break;
//		case 2: System.out.println("���л�⸦ �����ϼ̽��ϴ�.");
//		break;
//		case 3: System.out.println("�����⸦ �����ϼ̽��ϴ�.");
//		break;
//		}	
//		}while(����2 !=3);
//	break;
//	case 2: System.out.println("�����ȱ⸦ �����ϼ̽��ϴ�.");
//	break;
//	case 3: System.out.println("�����⸦ �����ϼ̽��ϴ�.");
//	break;
//	}	
//	}while(����1 !=3);
