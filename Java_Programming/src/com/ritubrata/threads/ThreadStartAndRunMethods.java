package com.ritubrata.threads;

public class ThreadStartAndRunMethods extends Thread{
	@Override
	public void run(){
		for(int i=1;i<5;i++){
			try{
				Thread.sleep(500);
			}catch(final InterruptedException e){
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(final String args[]){
		final ThreadStartAndRunMethods t1=new ThreadStartAndRunMethods();

		//if we call start and run then print like 1 1 2 2 3 3 4 4
		t1.start();
		t1.run();

		//if we call run and start then print like 1 2 3 4 1 2 3 4
		t1.run();
		t1.start(); // it will give IllegalThreadStateException as t1 is already started


	}
}
