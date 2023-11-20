package PostoDeSaude.Config;

import java.time.Instant;
import java.util.Arrays;

import javax.xml.stream.events.Comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import PostoDeSaude.Entity.Agendamento;
import PostoDeSaude.Entity.Consulta;
import PostoDeSaude.Entity.Medicos;
import PostoDeSaude.Entity.Paciente;
import PostoDeSaude.Entity.Enums.ConsultaStatus;
import PostoDeSaude.Repository.AgendamentoRepository;
import PostoDeSaude.Repository.ConsultaRepository;
import PostoDeSaude.Repository.MedicosRepository;
import PostoDeSaude.Repository.PacienteRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	private static final Agendamento Agendamento = null;
	
	private static final Integer Consulta = null;
	
	private static final Long Medicos = null;
	
	private static final Comment moment = null;

	@Autowired
	private PacienteRepository pacienteRepository;
	
	@Autowired
	private ConsultaRepository consultaRepository;
	
	@Autowired
	private MedicosRepository medicosRepository;
	
	@Autowired
	private AgendamentoRepository agendamentoRepository;
	

	
	@Override
	public void run(String... args) throws Exception {
		
		Agendamento a1 = new Agendamento(null, "abcd","rua de Teste", "UC16@gmail.com",19,123456987,Agendamento,Agendamento);
		Agendamento a2 = new Agendamento(null, "efgh","rua de Teste2", "UC16@gmail.com",19,123456987,Agendamento,Agendamento);
		Agendamento a3 = new Agendamento(null, "ijkl","rua de Teste3", "UC16@gmail.com",19,123456987,Agendamento,Agendamento);
		
		
		
		Medicos m1 = new Medicos(null,"Robert",123456,123456789,20,"Rua teste","Bloco B", 19,989659632,"email@gmail.com", "Clinico geral");
		Medicos m2 = new Medicos(null,"Gabriel",123456,123456789,20,"Rua teste","Bloco B", 19,989659632,"email@gmail.com", "Pediatria");
		Medicos m3 = new Medicos(null,"Janna",123456,123456789,20,"Rua teste","Bloco B", 19,989659632,"email@gmail.com", "Dentista");
		
		
		Paciente p1 = new Paciente(null, "teste1@gmail.com", "senha123", "Rafael","Rua teste", 12345810, 25112000);
		Paciente p2 = new Paciente(null, "teste2@gmail.com", "senha123", "Rafae2","Rua teste", 12347810, 25122000);
		Paciente p3 = new Paciente(null, "teste3@gmail.com", "senha123", "Rafae3","Rua teste", 12345610, 25132000);

		Consulta c1 = new Consulta(null, Instant.parse("2019-06-20T19:53:07Z"), ConsultaStatus.CONSULTA_AGENDADA, p1, m1 );
		Consulta c2 = new Consulta(null, Instant.parse("2019-07-21T03:42:10Z"), ConsultaStatus.CONSULTA_REALIZADA, p2, m2);
		Consulta c3 = new Consulta(null, Instant.parse("2019-07-22T15:21:22Z"), ConsultaStatus.CONSULTA_CANCELADA, p1, m3); 
		
		
		
		agendamentoRepository.saveAll(Arrays.asList(a1, a2 , a3));
		medicosRepository.saveAll(Arrays.asList(m1, m2, m3));
		pacienteRepository.saveAll(Arrays.asList(p1, p2, p3));
		consultaRepository.saveAll(Arrays.asList(c1, c2, c3));
		

	}



	public static Integer getConsulta() {
		return Consulta;
	}



	public static Long getMedicos() {
		return Medicos;
	}



	public static Comment getMoment() {
		return moment;
	}
}
