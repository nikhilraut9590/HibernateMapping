package com.hbm;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Address {
		
		@Id
		int addId;
		
		String pathName;
		@OneToOne
		Employee employee;
}
