package com.linkedin.entities.database;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

import static javax.persistence.TemporalType.DATE;

@Data
@NoArgsConstructor
@Table(name = "users")
@Entity
@DynamicUpdate
public class User implements Serializable {
	private static final long serialVersionUID = 3097430508040456243L;

	@Id
	@Column(name = "user_id")
	private Long id;

	@NotNull
	@Column(name = "name")
	private String name;

	@NotNull
	@Column(name = "surname")
	private String surname;

	@NotNull
	@Column(name = "username")
	private String username;

	@NotNull
	@Column(name = "email", nullable = false)
	private String email;

	@NotNull
	@Temporal(DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name = "birthdate")
	private Date birthdate;
	@NotNull
	@Temporal(DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name = "date_created")
	private Date dateCreated;
	@NotNull
	@Column(name = "address")
	private String address;
	@NotNull
	@Column(name = "phone_number")
	private String phoneNumber;
	@NotNull
	@Column(name = "img_path")
	private String imgPath;
}
