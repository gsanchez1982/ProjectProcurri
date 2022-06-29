package net.codejava.services;

import net.codejava.entity.Deals;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import net.codejava.repositories.DealRepository;
import org.springframework.data.domain.Sort;

@Service
@Transactional
public class DealsService {

	@Autowired
	private DealRepository repo;
	
	public List<Deals> listAll() {
		return repo.findAll(Sort.by(Sort.Direction.ASC, "sInv", "ocDate"));
	}
	
	public void save(Deals listDeals) {
		repo.save(listDeals);
	}
	
	public Deals get(long id) {
		return repo.findById(id).get();
	}
	
	public void delete(long id) {
		repo.deleteById(id);
	}
}
