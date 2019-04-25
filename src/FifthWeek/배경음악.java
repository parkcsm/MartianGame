package FifthWeek;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class 배경음악 extends Thread{
	
	
	private Player player;
	private boolean isLoop;
	private File file;
	private FileInputStream fis;
	private BufferedInputStream bis;
	
	public 배경음악(String name, boolean isLoop) {
		try {
		this.isLoop = isLoop;
		file = new File(화성에서살아남기.class.getResource("../음악창고/"+ name).toURI());
		fis = new FileInputStream(file);
		bis = new BufferedInputStream(fis);
		player = new Player(bis);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public int getTime() {
		if(player==null) 
			return 0;
		return player.getPosition();
	}
	
	public void close() {
		isLoop = false;
		player.close();
		this.interrupt();
	}

	@Override
	public void run() {
		try {
			do {
				player.play();
				fis = new FileInputStream(file);
				bis = new BufferedInputStream(fis);
				player = new Player(bis);
			} while(isLoop);
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
