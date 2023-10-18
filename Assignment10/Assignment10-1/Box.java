package com.sunbeam;

public class Box<DATATYPE extends Employee> {
		DATATYPE data;
		
		public void set(DATATYPE data) {
			this.data = data;
		}
		
		public DATATYPE get() {
			return this.data;
		}
		
		public Double getTotalSal() {
			return data.calculateSal();
		}
}
