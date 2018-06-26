package pl.coderslab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pl.coderslab.entity.Product;
import pl.coderslab.entity.User;

@Repository
	public interface ProductRepository extends JpaRepository<Product, Long>{
	List<Product> findCaloriesByLoginLike(String login);

}

	

