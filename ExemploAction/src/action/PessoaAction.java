package action;

import model.pessoa.Pessoa;
import model.pessoa.PessoaService;

import org.apache.struts2.config.Result;
import org.apache.struts2.config.Results;

@Results({
	@Result(name = "success", value = "editPessoa.jsp"),
	@Result(name = "showSave", value = "showPessoa.jsp"),
	@Result(name = "showDelete", value = "showPessoa.jsp"),
	@Result(name = "showUpdate", value = "showPessoa.jsp"),
	@Result(name = "showPessoa", value = "showPessoa.jsp")
})
public class PessoaAction {
	
	private PessoaService service = new PessoaService();
	
	private Pessoa pessoa;
	
	private Long id;
	
	public String execute() {
		return "success";
	}
	
	public String save() {
		id = service.create(pessoa);
		return "showSave";
	}

	public String delete() {
		service.delete(pessoa);
		return "showDelete";
	}

	public String update() {
		service.update(pessoa);
		return "showUpdate";
	}
	
	public String read() {
		pessoa = service.read(id);
		return "showPessoa";
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

}
