package FourthWeek;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ȭ��������Ƴ��� {


	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		������.�ʱ���¼���();


		int ����;


		do {
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			System.out.println( "\"ȭ������ ��Ƴ���\" ������ �����ϼ̽��ϴ�. �������� �̸��� �Է����ּ���.");
			System.out.println( "�ѹ� ���ϸ� �ٲٱ� ������ ������ �������ֽñ� �ٶ��ϴ�.");
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

			������ �������̸����� = new ������(); �������̸�����.�̸� =  Scan.nextLine();
			System.out.println( "�̸��� \"" + �������̸�����.�̸� +"\"���� ���ϼ̽��ϴ�. �̴�� �����Ͻðڽ��ϱ�? 1.�� 2.�ƴϿ�"); //�ƴϿ� ����ó������
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");



			���� = Scan.nextInt();

			switch(����) {
			case 1 :  
				System.out.println("������ �����մϴ�.");

				break;
			case 2 :
				System.out.println("�ٽ� ���ư��ϴ�.");

				break;
			default : 
				System.out.println("1�� 2�̿��� ���ڸ� �Է��ϼ̽��ϴ�. �ٽ� �Է����ֽʽÿ�");

				break;
			}
		} while(���� != 1);






		boolean �����Ͼ����� = false;
		boolean ��Ĺ��������� = false;


		do {
			System.out.println("���ӱ�Ģ�� Ȯ���Ͻð� ������ �������ּ��� 1.�����Ͼ� 2. ��Ĺ����� (�ѹ� ���������� ������ �ٲٱ� ������ ������ ������ �ֽñ� �ٶ��ϴ�.)");
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			���� = Scan.nextInt();

			switch(����) {
			case 0 : 
				try{
					File file = new File("���ӱ�Ģ.txt");
					Scanner sc = new Scanner(file);
					while (sc.hasNextLine()) {
						System.out.println(sc.nextLine());
					}
					sc.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}	break;

			case 1 : �����Ͼ����� = true;
			System.out.println("������ �����Ͼ�� ���õǾ����ϴ�. �����Ͼ�� �ൿ�� ����+2, ���+1�� Ư���� �����ϴ�.");
			System.out.println("�ʱⰪ���� ȭ�����°��� Ȥ���� ����ǳ�� ���⿡���� ������ ������ �� ��絵�� �������ڼ��� �������� �����Ǿ����ϴ�.");
			System.out.println("�̿ܿ��� �ൿ�� ����Ȯ���� 70%�� �����Ǿ��ֽ��ϴ�. ���� ���õ� �����Ͼ�� �����ÿ��� 90%�� ����˴ϴ�. �ڼ��ѻ����� ���ӱ�Ģ�� �������ּ���!");
			������ �������������������Ͼ�� = new ������(); �������������������Ͼ��.������ = "�����Ͼ�";
			break;

			case 2 : ��Ĺ��������� = true;
			System.out.println("������ ��Ĺ����ڷ� ���õǾ����ϴ�. ��Ĺ����ڴ� �ൿ�� ����+1, ���+2�� Ư���� �����ϴ�.");
			System.out.println("�ʱⰪ���� ȭ�����°��� Ȥ���� ����ǳ�� ���⿡���� ������ ������ �� ��絵�� �������ڼ��� �������� �����Ǿ����ϴ�.");
			System.out.println("�̿ܿ��� �ൿ�� ����Ȯ���� 70%�� �����Ǿ��ֽ��ϴ�. ���� ���õ� ��Ĺ����ڷ� �����ÿ��� 90%�� ����˴ϴ�. �ڼ��ѻ����� ���ӱ�Ģ�� �������ּ���!");
			������ ����������������Ĺ����ڷ� = new ������(); ����������������Ĺ����ڷ�.������ = "��Ĺ�����";
			break;

			default : System.out.println("0�� 1�� 2�̿��� ���ڸ� �Է��ϼ̽��ϴ�. �ٽ� �Է����ֽʽÿ�");
			break;
			}
		} while(���� !=1 && ���� !=2);



		������ �����ڰ��ӽ��� = new ������(); 
		�����Ͼ� �����Ͼ� = new �����Ͼ�();
		��Ĺ����� ��Ĺ����� = new ��Ĺ�����();

		if(�����Ͼ�����) {	
			do {�����ڰ��ӽ���.��������μ⿣���Ͼ�(); 
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
				System.out.println("���ڸ� �Է��ϼ���(1,2,3�� �ൿ�� �Ҹ��մϴ�) 0.���ӱ�Ģ 1.��Ұ�����ġ���� 2.������ȣ������ 3.���ڳ�� 4.���ڸԱ� 5.�Ϸ� ����ġ��");
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
				���� = Scan.nextInt();

				switch(����){
				case 0 : 
					try{
						File file = new File("���ӱ�Ģ.txt");
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
					�����Ͼ� ��Ұ�����ġ���� = new �����Ͼ�(); ��Ұ�����ġ����.��Ұ�����ġ����();
					break;			    	    
				case 2 : 
					�����Ͼ� ������ȣ������ = new �����Ͼ�(); ������ȣ������.������ȣ������();
					break;
				case 3 :
					�����Ͼ� ���ڳ�� = new �����Ͼ�(); ���ڳ��.���ڳ��();
					break;
				case 4 : 
					�����Ͼ� ���ڸԱ� = new �����Ͼ� (); ���ڸԱ�.���ڸԱ�();
					break;
				case 5 :
					�����Ͼ� �Ϸ糡��ġ�� = new �����Ͼ�(); �Ϸ糡��ġ��.�Ϸ糡��ġ��();
					break;
				default : System.out.println("���ڸ� �ٽ� �Է����ּ���");
				    break;

				}

			} while(������.����Ļ�� != true && ������.��Ұ�����ġ��� !=true && ������.���������� !=true);
		}


		if(��Ĺ���������) {


			do {�����ڰ��ӽ���.��������μ��Ĺ�����(); 
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
				System.out.println("���ڸ� �Է��ϼ���(1,2,3�� �ൿ�� �Ҹ��մϴ�) 0.���ӱ�Ģ 1.��Ұ�����ġ���� 2.������ȣ������ 3.���ڳ�� 4.���ڸԱ� 5.�Ϸ� ����ġ��");
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
				���� = Scan.nextInt();

				switch(����){
				case 0 : 
					try{
						File file = new File("���ӱ�Ģ.txt");
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
					��Ĺ����� ��Ұ�����ġ���� = new ��Ĺ�����(); ��Ұ�����ġ����.��Ұ�����ġ����();
					break;

				case 2 : 
					��Ĺ����� ������ȣ������ = new ��Ĺ�����(); ������ȣ������.������ȣ������();
					break;
				case 3 :
					��Ĺ����� ���ڳ�� = new ��Ĺ�����(); ���ڳ��.���ڳ��();
					break;
				case 4 : 
					��Ĺ����� ���ڸԱ� = new ��Ĺ����� (); ���ڸԱ�.���ڸԱ�();
					break;
				case 5 :
					��Ĺ����� �Ϸ糡��ġ�� = new ��Ĺ�����(); �Ϸ糡��ġ��.�Ϸ糡��ġ��();
					break;
				default : System.out.println("���ڸ� �ٽ� �Է��� �ּ���");
				    break;
				}

			} while(������.����Ļ�� != true && ������.��Ұ�����ġ��� !=true && ������.���������� !=true);


		}

		if(������.����Ļ��) {
			System.out.print("����� " + ������.�����ϼ� + "�������� ����������, ���ָ����� ���� ����ϰ� ���ҽ��ϴ�.");

		}
		if(������.��Ұ�����ġ���) {
			System.out.print("����� " + ������.�����ϼ� + "�������� ����������, ��Ұ�����ġ�� ������������ ����ϰ� ���ҽ��ϴ�.");
		}
		if(������.����������) {
			System.out.print("!�˸� �̼Ǽ���!! ����� " + ������.�����ϼ� + "�������� �����ؼ�, �ᱹ ��������Ÿ�� ������ ���ư��� �Ǿ����ϴ�.");
		}
	}
}


