package com.tavant.springrest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "account")
public class Account implements Comparable<Account> {
	
	@Id
	private Integer accountNumber;
	@NotBlank(message = "first name should not be blank")
	private String firstName;
	@NotBlank(message = "last name should not be blank")
	private String lastName;
	@NotBlank(message="email should not be blank")
	@Email(message="email should not be blank")
	private String email;
	private Long phoneNumber;
	@NotBlank(message= "Address should not be blank")
	@Size(max=50)
	private String address;
	
	@Override
	public int compareTo(Account o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
