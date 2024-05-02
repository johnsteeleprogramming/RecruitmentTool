package com.steele.recruitment;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.steele.recruitment.entity.SignUp;
import com.steele.recruitment.repository.SignUpRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class SignUpRepositoryTest {

	
	@Autowired
	private SignUpRepository signUpRepository;

	@Autowired
	private TestEntityManager testEntityManager;
	
	@Test
	public void testCreateSignUp() {
		SignUp signUp = new SignUp("johnsteele@email6", "0123456789", "John6", "Steele6");
		SignUp savedSignUp = signUpRepository.save(signUp);
		SignUp findSignUp = signUpRepository.getReferenceById(savedSignUp.getSignUpId());
		
		if(findSignUp != null) {
			signUpRepository.delete(findSignUp);
		}

		assertThat(findSignUp.getEmailAddress()).isEqualTo(signUp.getEmailAddress());
	}
	
	@Test
	public void testFindUserByEmail() {
		String emailAddress = "johnsteele@email2";
		int signUpId = 2;

		//User savedUser = userRepository.save(user);
		// savedUser.getId() != 0 but is an index provided by the database.

		//SignUp findSignUp = testEntityManager.find(SignUp.class, signUpId);
		//SignUp findSignUp = signUpRepository.findByEmail(emailAddress);
		//System.out.println(findSignUp.getFirstName());

//		if(findSignUp != null) {
//			signUpRepository.delete(findSignUp);
//		}
//		
//		assertThat(findUser.getEmail())
//			.isNotNull();
	}

}
