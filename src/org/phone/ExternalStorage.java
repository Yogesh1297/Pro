package org.phone;

public class ExternalStorage {

	public void size() {
		System.out.println("External Storage is 120GB");
	}
	public static void main(String[] args) {
		ExternalStorage ex= new ExternalStorage();
		InternalStorage in= new InternalStorage();
		ex.size();
		in.processorName();
		in.ramSize();
	}
}
