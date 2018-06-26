package pl.coderslab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pl.coderslab.entity.Product;
import pl.coderslab.entity.User;

@Repository
	public interface DietaRepository extends JpaRepository<Product, Long>{
//	@Query("SELECT u From Product u where u.name = :name")
//	@Query("SELECT u From Product u WHERE u.name = :name")
//	User findByName(@Param("name") String name);
	
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

	

