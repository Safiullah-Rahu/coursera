package org.coursera.sda.ood;

public class Person {

	
	private String firstName = null;
	private String lastName = null;
	private int age = 0;
	private String organization = null;
	private String designation = null;
	private String country = null;


	Person() {
	}
	
	Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void introduce() {
		
		if((this.firstName == null) || (this.lastName == null)) {
			System.out.println("Enter both first and last names");
			return;
		}
		
		if(this.age < 1) {
			System.out.println("Enter age");
			return;			
		}
		
		if(this.country == null) {
			System.out.println("Enter country name");
			return;
		}
		
		if((this.organization == null) || (this.designation == null)) {
			System.out.println("Enter both organization and designation");
			return;
		}
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("Hi! My name is ");
		sb.append(this.firstName+" "+this.lastName);
		sb.append(". I am ");
		sb.append(this.age);
		sb.append(" years old.");
		sb.append(" I am from ");
		sb.append(this.country);
		sb.append(". I work as a ");
		sb.append(this.designation);
		sb.append(" at ");
		sb.append(this.organization);
		sb.append(".");
		
		
		System.out.println(sb.toString());
		return;
	}
	
	public static void main(String args[]) {

		Person p = new Person("Sai Nikhil", "Thirandas", 26);
		p.setCountry("India");
		p.setDesignation("Software Engineer");
		p.setOrganization("Oracle");
		p.introduce();
		
		return;
	}
	
}
