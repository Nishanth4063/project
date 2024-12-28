package BusResv;

public class Bus {
	private int busNo;
	private boolean Ac;
	private int capacity;
	private boolean ac;
	
	Bus(int no,boolean ac,int cap){
		this.busNo=no;
		this.Ac=ac;
		this.capacity=cap;
	}
	
	public int getBusno() {
		return busNo;
	}
	public boolean isAc() {
		return ac;
	}
	public int getCapacity(){
		return capacity;
	}
	public void setAc(boolean val) {
		ac=val;
	}
	public void setCapacity(int cap) {
		capacity = cap;
	}
	public void displayBusInfo(){
		System.out.println("Bus No:"+ busNo+"Ac:"+ac+"Total Capacity:"+capacity);
	}
	
}
