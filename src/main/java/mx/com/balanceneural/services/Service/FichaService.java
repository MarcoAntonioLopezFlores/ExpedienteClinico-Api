package mx.com.balanceneural.services.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import mx.com.balanceneural.services.entity.Ficha;
import mx.com.balanceneural.services.repository.FichaRepository;

@Service
public class FichaService {

	@Autowired
	private FichaRepository fichaRepository;
	
	public Long save(Ficha ficha){
		fichaRepository.save(ficha);
        return ficha.getId();
    }
}
