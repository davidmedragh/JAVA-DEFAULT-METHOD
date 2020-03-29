/**
 * 
 */
package com.dmedragh.defaultMethod;

/**
 * @author dmedragh
 *
 */
public class PersonnePhysique implements Personne {

	private int age;
	private String nom;

	/**
	 * 
	 */
	public PersonnePhysique() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getAge() {
		return this.age;
	}
	
	public String getNom() {
		return this.nom;
		
	}

}
