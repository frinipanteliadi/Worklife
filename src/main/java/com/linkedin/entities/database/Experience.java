package com.linkedin.entities.database;

import com.linkedin.constants.Visible;
import lombok.Data;
import lombok.Generated;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

import static javax.persistence.TemporalType.DATE;

@Data
@Table(name = "experience")
@Entity
@DynamicUpdate

public class Experience implements Serializable {

	@Id
	@Column(name = "experience_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long experienceId;

	@Column(name = "user_id", nullable = false)
	private Long userId;

	@NotNull
	@Temporal(DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name = "starting_date")
	private Date startDate;

	@NotNull
	@Temporal(DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name = "ending_date")
	private Date endDate;


	@NotNull
	@Column(name = "title")
	private String title;


	@NotNull
	@Column(name = "company")
	private String company;

  @NotNull
  @Column(name = "visible")
  private Visible visible;
}
