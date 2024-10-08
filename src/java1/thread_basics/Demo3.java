package java1.thread_basics;

import java.util.concurrent.TimeUnit;

public class Demo3 {

	public static void main(String[] args) {
		System.out.println("Thread Name: "+Thread.currentThread());
		Task task = new Task();
		Thread t = new Thread(task);
		t.setName("Runnable Thread");
		t.setPriority(Thread.MAX_PRIORITY);
		t.start();

		CreateNewThread myNewThread = new CreateNewThread();
		Thread thread =  new Thread(myNewThread);
		thread.setName("MyNewThread Thread");
		
		thread.setPriority(Thread.MIN_PRIORITY);
		System.out.println(thread.getName()+ " starts to run");
		thread.start();
		try {
			thread.sleep(3000);
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			thread.join();
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("inside main...");
	}
}

//Thread implementation
class Task implements Runnable{

	@Override
	public void run() {
		System.out.println("inside run of task..");
		System.out.println("name of Thread: "+Thread.currentThread().getName());
		go();
		
	}
	private void go() {
		System.out.println("inside go...");
		more();
	}
	private void more() {
		System.out.println("inside more...");
	}
	
}
class CreateNewThread implements Runnable{
	Thread t;
	public void run() {
		System.out.println(" My New thread created ");
	}
}
