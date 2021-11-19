package com.arnab.learning.jpa.jpain10stpes;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.arnab.learning.jpa.jpain10stpes.entity.User;
import com.arnab.learning.jpa.jpain10stpes.service.UserDAOService;
import com.arnab.learning.jpa.jpain10stpes.service.UserRepository;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {

	private static final Logger log=LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
	
	/*@Autowired
	private UserDAOService userDAOService;*/
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		//Save User
		User user=new User("Jack","Admin");
		User user1=new User("Jill","Admin");
		/*long insert=userDAOService.insert(user);*/
		userRepository.save(user);
		userRepository.save(user1);
		log.info("User created with details {}",user);
		Optional<User> listOfUserWithId=userRepository.findById(1L);
		log.info("User retrieved with details {}",listOfUserWithId);
		List<User> allUsers=userRepository.findAll();
		log.info("All users retrieved {}",allUsers);
		
	}

}
