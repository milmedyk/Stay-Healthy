package pl.coderslab.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import pl.coderslab.entity.Product;


@Component
@Transactional
public class ProductDao {
	@PersistenceContext
	EntityManager em;

	public void save(Product entity) {
		this.em.persist(entity);
	}

	public void update(Product entity) {
		this.em.merge(entity);
	}

	public Product findById(long id) {
		return this.em.find(Product.class, id);
	}

	public void delete(Product entity) {
		this.em.remove(this.em.contains(entity) ? entity : this.em.merge(entity));
	}

	public List<Product> getAll() {
		Query query = this.em.createQuery("SELECT e FROM Product e");
		return query.getResultList();

		
		
	}
}