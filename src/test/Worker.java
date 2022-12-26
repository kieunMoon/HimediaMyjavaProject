package test;

public class Worker extends Person {
	String WorkerNo;

	public String getWorkerNo() {
		return WorkerNo;
	}

	public void setWorkerNo(String workerNo) {
		//깜빡^^
		this.WorkerNo = workerNo;
	}
	public void print() {
		System.out.printf("%s\t%s\t%s\n", getName(), getPhone(), getWorkerNo());
	}
	public Worker(String name, String phone, String workerNo) {

		super(name,phone);
		//		super.setName(name);
//		super.setPhone(phone);
		this.WorkerNo = workerNo;
	}
	
}