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
@Table(name = "tb_Agendamento")
public class Agendamento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String cnpj;
	private String endereco;
	private String email;
	private int ddd;
	private int telefone;

	@ManyToOne
	@JoinColumn(name = "id_consulta")
	private Agendamento consulta;

	@ManyToOne
	@JoinColumn(name = "id_medicos")
	private Agendamento medicos;
	


	public Agendamento() {

	}

	public Agendamento(Long id, String cnpj, String endereco, String email, int ddd, int telefone, Agendamento consulta,
			Agendamento medicos) {
		super();
		this.id = id;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.email = email;
		this.ddd = ddd;
		this.telefone = telefone;
		this.consulta = consulta;
		this.medicos = medicos;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
		Agendamento other = (Agendamento) obj;
		return Objects.equals(id, other.id);
	}

}
