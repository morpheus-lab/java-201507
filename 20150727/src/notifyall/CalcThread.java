package notifyall;

public class CalcThread extends Thread {
	
	SharedArea sharedArea;
	
	@Override
	public void run() {
		// 파이 계산
		double total = 0.0;
		for (int cnt = 1; cnt < 1000000000; cnt+=2) {
			if (cnt / 2 % 2 == 0) {
				total += 1.0 / cnt;
			} else {
				total -= 1.0 / cnt;
			}
		}
		// 계산 결과를 공유 객체의 멤버 변수에 저장
		sharedArea.result = total * 4;
		sharedArea.isReady = true;
		
		synchronized (sharedArea) {
			sharedArea.notifyAll();
		}
	}
	
}
