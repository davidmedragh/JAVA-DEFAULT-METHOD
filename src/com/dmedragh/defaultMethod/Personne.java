package com.dmedragh.defaultMethod;
/**
 * 
 */

/**
 * @author dmedragh
 *
 */
public interface Personne {
	default int getAge() {
		return -1;
	}
	String getNom();

}
