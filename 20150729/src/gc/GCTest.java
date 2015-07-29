package gc;

import java.util.Scanner;

public class GCTest {
	
	public static class GCThread extends Thread {
		
		private boolean flag = true;
		
		public void terminate() {
			flag = false;
		}
		
		@Override
		public void run() {
			while (flag) {
				System.gc();	// GC를 실행 요청
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					break;
				}
			}
		}
	}
	
	public static class Garbage {
		private static int i = 0;
		private int myNum = i++;
		
		@Override
		public void finalize() throws Throwable {
			System.out.println(this.myNum + " - die");
			super.finalize();
		}
	}
	
	public static void main(String[] args) {
		
		GCThread gc = new GCThread();
		gc.start();
		
		Scanner sc = new Scanner(System.in);
		
		Garbage[] arr = new Garbage[100];
		
		while (true) {	// while 반복 시 마다 이전에 생성된
						// 객체 100개가 GC의 대상이 됨
			String line = sc.nextLine();
			if (line.equals("q")) {
				break;
			} else {
				for (int i = 0; i < arr.length; i++) {
					arr[i] = new Garbage();
				}
			}
		}
		
		sc.close();
		
		gc.terminate();
//		gc.interrupt();
	}
	
}
