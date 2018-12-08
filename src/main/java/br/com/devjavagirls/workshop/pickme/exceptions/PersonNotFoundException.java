package br.com.devjavagirls.workshop.pickme.exceptions;

public class PersonNotFoundException extends Exception {

	public PersonNotFoundException(long id){
		super(String.format("Couldn't find Person with id %d", id));
	}
	
	public PersonNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonNotFoundException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

	public PersonNotFoundException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public PersonNotFoundException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public PersonNotFoundException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

}
