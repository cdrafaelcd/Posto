package PostoDeSaude.Entity.Enums;

public enum ConsultaStatus {
	
	CONSULTA_AGENDADA(2),
	CONSULTA_REALIZADA(1),
	CONSULTA_CANCELADA(3);
	

	private int code;
	
	private ConsultaStatus(int code) {
		this.code = code;
	}
	
	public int getcode() {
		return code;
	}
	
	public static ConsultaStatus valueOf(int code) {
		for (ConsultaStatus value : ConsultaStatus.values()) {
			return value;
		}
		
	
	throw new IllegalArgumentException("Codigo ConsultaStatus invalido");
	}
}
