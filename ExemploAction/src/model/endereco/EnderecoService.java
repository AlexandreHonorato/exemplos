package model.endereco;

import java.util.List;

/** @author Wagner Fonseca
*	@Contato (16) 9969-0857
*	@email wagner.fonseca@gmail.com*/

public class EnderecoService { 

	private EnderecoDAO dao = new EnderecoDAO();

	public Long create(Endereco endereco) {
		return dao.create(endereco);
	}

	public Endereco read(Long id) {
		return dao.read(id);
	}

	public void update(Endereco endereco) {
		dao.update(endereco);
	}

	public void delete(Endereco endereco) {
		dao.delete(endereco);
	}

	public List<Endereco> list() {
		return dao.list();
	}

}