package Practice;



public class ����4 {


	public static void main(String[] args) {
		����3 ������0 = new ����3("������0");
		����3 ������1 = new ����3("������1");
		����3 ������2 = new ����3("������2");

		Thread ������0���� = new Thread(������0);
		Thread ������1���� = new Thread(������1);
		Thread ������2���� = new Thread(������2);


		������0����.setPriority(1);
		������1����.setPriority(10);
		������2����.setPriority(10);

		//	     ������0����.getPriority(0);
		������0����.start();
		������1����.start();
		������2����.start();
	}
}
