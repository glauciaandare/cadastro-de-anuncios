package br.com.glauciaandare.anuncios;

public class Anuncios {

		public String nomeUsuario;
		public String Cliente;
		public String dataInicio;
		public String datatermino;
		public Double investimentoDia;
		
		public Anuncios(String nomeUsuario, String cliente, String dataInicio, String datatermino,
				Double investimentoDia) {
			super();
			this.nomeUsuario = nomeUsuario;
			Cliente = cliente;
			this.dataInicio = dataInicio;
			this.datatermino = datatermino;
			this.investimentoDia = investimentoDia;
		}
		public Anuncios() {
			
		}
		public String getNomeUsuario() {
			return nomeUsuario;
		}
		public void setNomeUsuario(String nomeUsuario) {
			this.nomeUsuario = nomeUsuario;
		}
		public String getCliente() {
			return Cliente;
		}
		public void setCliente(String cliente) {
			Cliente = cliente;
		}
		public String getDataInicio() {
			return dataInicio;
		}
		public void setDataInicio(String dataInicio) {
			this.dataInicio = dataInicio;
		}
		public String getDatatermino() {
			return datatermino;
		}
		public void setDatatermino(String datatermino) {
			this.datatermino = datatermino;
		}
		public Double getInvestimentoDia() {
			return investimentoDia;
		}
		public void setInvestimentoDia(Double investimentoDia) {
			this.investimentoDia = investimentoDia;
		}
		
		
		
		
		

	

}
