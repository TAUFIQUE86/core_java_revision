class SyncPrinter implements Runnable{

 Synchronized public void run(){

String name = Thread.currentThread().getName();
System.out.println(name + "Thread started printing");

for(int i=1 ; i<=3; i++){
System.out.println(name + " is printing ");

try
{
Thread.sleep(5000);



}catch(Exception e){

System.out.println("Smoe problem Occured");


}



}
System.outprintln(name + "completed printing");




}



}


class SyncTest{

public static void main(String[] args){

SyncPrinter sp = new SyncPrinter();
Thread t1 = new Thread(sp);
Thread t2 = new Thread(sp);
Thread t3 = new Thread(sp);
t1.setName("Men");
t2.setName("Women");
t3.setName("Child");

ti.start();
t2.start();
t3.start();

}

}