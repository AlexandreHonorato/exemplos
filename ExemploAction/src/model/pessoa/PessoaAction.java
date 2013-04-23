package model.pessoa;

import org.apache.struts2.config.Result;
import org.apache.struts2.config.Results;

import util.HibernateUtil;

@Results({
	@Result(name = "success", value = "main.jsp"),
	@Result(name = "showSave", value = "showPessoa.jsp"),
	@Result(name = "showDelete", value = "main.jsp"),
	@Result(name = "showUpdate", value = "showPessoa.jsp"),
	@Result(name = "showPessoa", value = "showPessoa.jsp")
})
public class PessoaAction {
	
	private PessoaService service = new PessoaService();
	
	private Pessoa pessoa;
	
	private Long id;
	
	static {
		HibernateUtil.session = HibernateUtil.getSessionFactory().openSession();
	}
	
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
