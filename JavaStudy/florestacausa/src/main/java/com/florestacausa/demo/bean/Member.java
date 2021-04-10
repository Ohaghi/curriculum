package com.florestacausa.demo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name="members")
public class Member{
	@Id
	private Integer roomno;

	@Column(nullable = false)
	private String first_name;

	@Column
	private String last_name;

	@Column
	private  int age;

}