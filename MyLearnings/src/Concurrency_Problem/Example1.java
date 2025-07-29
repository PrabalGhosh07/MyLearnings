package Concurrency_Problem;

public class Example1 extends Thread{
	public static int amount=0;
	public static void main(String[] args) {
		Example1 thread = new Example1();
		thread.start();
		while(thread.isAlive()) {
			System.out.println("Waiting");
		}
		System.out.println(amount);
		amount++;
		amount++;
		System.out.println(amount);
	}
	public void run() {
		amount++;
	}
}
