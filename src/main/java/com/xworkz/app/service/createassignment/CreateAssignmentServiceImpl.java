package com.xworkz.app.service.createassignment;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.app.dao.createassignment.CreateAssignmentDAOImpl;
import com.xworkz.app.dto.createassignment.CreateAssignmentDTO;
import com.xworkz.app.entity.CreateAssignmentEntity;
import com.xworkz.app.util.RandomPasswordGenerator;
@Service
public class CreateAssignmentServiceImpl implements ICreateAssignmentService {
	@Autowired
	private CreateAssignmentDAOImpl createAssignmentDAO;
	@Autowired
	private RandomPasswordGenerator generator;
	public CreateAssignmentServiceImpl() {
		System.out.println("Create \t"+this.getClass().getSimpleName());
	}
	


	public long assignmentService(CreateAssignmentDTO createAssignmentDTO) {
		/*int assignmentId=createAssignmentDTO.getPin();*/
		String course=createAssignmentDTO.getCourse();
		String topic=createAssignmentDTO.getTopic();
		String type=createAssignmentDTO.getUploadType();
		Date deadLine=createAssignmentDTO.getDeadLine();
		String description=createAssignmentDTO.getDescription();
		
		CreateAssignmentEntity createAssignmentEntity=new CreateAssignmentEntity();
		
		createAssignmentEntity.setCourse(course);
		createAssignmentEntity.setTopic(topic);
		createAssignmentEntity.setDeadLine(deadLine);
		createAssignmentEntity.setDescription(description);
		createAssignmentEntity.setUploadType(type);
		
		int pin=generator.generateRandomPin();
		createAssignmentEntity.setPin(pin);
		createAssignmentDAO.saveCreatedAssignment(createAssignmentEntity);
		return pin;
	}

}
