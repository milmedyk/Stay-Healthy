package pl.coderslab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pl.coderslab.entity.User;

@Repository
	public interface UserRepository extends JpaRepository<User, Long>{
	User findByLogin(String login);
	User findByEmail(String email);
	User findByPassword(String password);
	
//	@Query("SELECT b From Users b WHERE b.Users LIKE %login%")
//	User findByLogin(@Param("login") String login);
//	@Query("SELECT u From Users u WHERE u.login = :login")
//	User findByLogin(@Param("login") String login);
//	@Query("SELECT u From User u WHERE u.email = :email")
//	String findByEmail1(@Param("email") String email);
////		User findFirstByFirstNameOrLastName(String firstName, String lastName);
//		@Query("SELECT b From Users b WHERE b.Users LIKE %login%")
//		User findByLogin(@Param("login") String login);
//		@Query("SELECT b From Users b WHERE b.Users LIKE %password%")
//		User findByPassword(@Param("password") String password);
////		@Query("SELECT b From Users b WHERE b.Users LIKE %login% AND ")
////		List<User> findDaysByUserId();
////		
////		User findByName(String firstName);
//		
//		User saveUser(User user);
//		@Query ("SELECT e FROM User ")
//		List<User> getAll();
	
}

	

