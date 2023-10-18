package com.sunbeam;

public class Box<DATATYPE extends Displayable> {
		private DATATYPE data;
		
		public void set(DATATYPE data) {
			this.data = data;
		}
		
		public DATATYPE get() {
			return this.data;
		}
}
