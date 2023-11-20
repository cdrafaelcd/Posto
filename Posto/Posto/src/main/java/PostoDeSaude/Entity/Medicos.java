package PostoDeSaude.Entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_Medicos")
public class Medicos implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private int cmr;
	private int cpf;
	private int idade;
	private String endereço;
	private String complemento;
	private int ddd;
	private int telefone;
	private String email;
	private String especialidade;
	
	
	@ManyToOne
	@JoinColumn(name = "id_Agendamento")
	private Agendamento medicos;
	
	@ManyToOne
	@JoinColumn(name = "id_paciente")
	private Medicos consulta;
	
	
	

	public Medicos () {
		
	}

	public Medicos(Long id, String name, int cmr, int cpf, int idade, String endereço, String complemento, int ddd,
			int telefone, String email, String especialidade) {
		super();
		this.id = id;
		this.name = name;
		this.cmr = cmr;
		this.cpf = cpf;
		this.idade = idade;
		this.endereço = endereço;
		this.complemento = complemento;
		this.ddd = ddd;
		this.telefone = telefone;
		this.email = email;
		this.especialidade = especialidade;

	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getCmr() {
		return cmr;
	}


	public void setCmr(int cmr) {
		this.cmr = cmr;
	}


	public int getCpf() {
		return cpf;
	}


	public void setCpf(int cpf) {
		this.cpf = cpf;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getEndereço() {
		return endereço;
	}


	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}


	public String getComplemento() {
		return complemento;
	}


	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}


	public int getDdd() {
		return ddd;
	}


	public void setDdd(int ddd) {
		this.ddd = ddd;
	}


	public int getTelefone() {
		return telefone;
	}


	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getEspecialidade() {
		return especialidade;
	}


	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}


	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Medicos other = (Medicos) obj;
		return Objects.equals(id, other.id);
	}	
	
	
}
