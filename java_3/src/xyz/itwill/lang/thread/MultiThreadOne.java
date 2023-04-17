package xyz.itwill.lang.thread;

public class MultiThreadOne extends Thread {
	@Override
	public void run() {
		super.run();

		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(i);
			try {
				Thread.sleep(501);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
