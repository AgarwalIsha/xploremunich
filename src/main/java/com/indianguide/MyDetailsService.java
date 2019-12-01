/**
 * 
 */
package com.indianguide;

import javax.annotation.ManagedBean;

/**
 * @author Geeta
 *
 */
@ManagedBean
public class MyDetailsService {

    private String test = "test";

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}
   
}
