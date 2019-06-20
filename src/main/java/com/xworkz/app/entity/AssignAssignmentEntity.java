package com.xworkz.app.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="assign")
public class AssignAssignmentEntity implements Serializable {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;

	@Id
	@GenericGenerator(name="increment",strategy="increment")
	@GeneratedValue(generator="increment")	
	private int assignId;
	
	private String emailId;
	
	@ManyToOne
	@JoinColumn(name="pin")
	private CreateAssignmentEntity createAssignmentEntity;
	
	public AssignAssignmentEntity(){
		System.out.println("create "+this.getClass().getSimpleName());
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public CreateAssignmentEntity getCreateAssignmentEntity() {
		return createAssignmentEntity;
	}

	public void setCreateAssignmentEntity(CreateAssignmentEntity createAssignmentEntity) {
		this.createAssignmentEntity = createAssignmentEntity;
	}

	public int getAssignId() {
		return assignId;
	}

	public void setAssignId(int assignId) {
		this.assignId = assignId;
	}

	
	@Override
	public String toString() {
		return "AssignAssignmentEntity [emailId=" + emailId + "]";
	}

}
