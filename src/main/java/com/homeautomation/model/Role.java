package com.homeautomation.model;

import java.sql.Date;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="roles")
@Getter
@Setter
//NoArgsConstructor
//AllArgsConstructor
@ToString
@Data

public class Role {
	
	@Id
	@GeneratedValue(strategy=GenerationType.UUID)
	private UUID id;
	
	@Column(nullable=false,unique=false)
	private String name; 
	
	
//     public String getName() {
//		return name;
//	}


//	public void setName(String name) {
//		this.name = name;
//	}


	@CreationTimestamp
	@Column(nullable=false,updatable=false)
	private Date CreatedAt;
	
	
	@UpdateTimestamp
	@Column(nullable=false,updatable=false)
	private Date UpdatedAt;
	
	
	
	
	
	
	

}
