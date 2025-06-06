package com.nep.entity;

import java.io.Serializable;

public class Admin extends Operator implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "Admin [getLoginCode()=" + getLoginCode() + ", getPassword()=" + getPassword() + ", getRealName()="
				+ getRealName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
