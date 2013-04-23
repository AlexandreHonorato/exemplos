package model.pessoa;

import java.util.List;

public class PessoaService {

	private PessoaDAO dao = new PessoaDAO();
	  
	public Long create(Pessoa pessoa) {
		return dao.create(pessoa);
	}
	
	public Pessoa read(Long id) {
		return dao.read(id);
	}
	
	public void update(Pessoa pessoa) {
		dao.update(pessoa);
	}
	
	public void delete(Pessoa pessoa) {
		dao.delete(pessoa);
	}
	
	public List<Pessoa> list() {
		return dao.list();
	}
	
}
