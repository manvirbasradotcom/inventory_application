package repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import model.Server;

public interface ServerRepository extends PagingAndSortingRepository<Server,String>{
	
	List<Server> findByServerName(String server_name);

	List<Server> findByManagerNameContaining(String manager_name);
	
}