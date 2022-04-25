package com.ms.jdbcdata;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserData {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Setter(value = AccessLevel.PRIVATE)
	private int userId;
	@Column(nullable = false, length = 20)
	private String userName;
	@Column(nullable = false)
	private String phoneNumber;
	@PrimaryKeyJoinColumn
	@Column(unique = true, nullable = false, length = 30)
	private String userEmail;
	@Column(nullable = false, length = 20)
	private String userPassword;

}
