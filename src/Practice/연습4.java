package Practice;



public class 연습4 {


	public static void main(String[] args) {
		연습3 쓰레드0 = new 연습3("쓰레드0");
		연습3 쓰레드1 = new 연습3("쓰레드1");
		연습3 쓰레드2 = new 연습3("쓰레드2");

		Thread 쓰레드0실행 = new Thread(쓰레드0);
		Thread 쓰레드1실행 = new Thread(쓰레드1);
		Thread 쓰레드2실행 = new Thread(쓰레드2);


		쓰레드0실행.setPriority(1);
		쓰레드1실행.setPriority(10);
		쓰레드2실행.setPriority(10);

		//	     쓰레드0실행.getPriority(0);
		쓰레드0실행.start();
		쓰레드1실행.start();
		쓰레드2실행.start();
	}
}
