package action;

import model.endereco.Endereco;
import model.endereco.EnderecoService;

import org.apache.struts2.config.Result;
import org.apache.struts2.config.Results;

@Results({
	@Result(name = "success", value = "editEndereco.jsp"),
	@Result(name = "showSave", value = "showEndereco.jsp"),
	@Result(name = "showDelete", value = "showEndereco.jsp"),
	@Result(name = "showUpdate", value = "showEndereco.jsp"),
	@Result(name = "showEndereco", value = "showEndereco.jsp")
})
public class EnderecoAction {
	
	private EnderecoService service = new EnderecoService();
	
	private Endereco endereco;
	
	private Long id;
	
	public String execute() {
		return "success";
	}
	
	public String save() {
		id = service.create(endereco);
		return "showSave";
	}
	
	public String delete() {
		service.delete(endereco);
		return "showDelete";
	}

	public String update() {
		service.update(endereco);
		return "showUpdate";
	}
	
	public String read() {
		endereco = service.read(id);
		return "showEndereco";
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
