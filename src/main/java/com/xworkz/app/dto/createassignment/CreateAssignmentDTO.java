package com.xworkz.app.dto.createassignment;

import java.io.Serializable; 
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;


public class CreateAssignmentDTO implements Serializable {

/*	private int pin;*/
	private String topic;
	private String course;
	private String description;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date deadLine;
	private String uploadType;
	/*public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}*/
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDeadLine() {
		return deadLine;
	}
	public void setDeadLine(Date deadLine) {
		this.deadLine = deadLine;
	}
	public String getUploadType() {
		return uploadType;
	}
	public void setUploadType(String uploadType) {
		this.uploadType = uploadType;
	}
	@Override
	public String toString() {
		return "CreateAssignmentDTO [ topic=" + topic + ", course=" + course + ", description="
				+ description + ", deadLine=" + deadLine + ", uploadType=" + uploadType + "]";
	}
	
	
}
