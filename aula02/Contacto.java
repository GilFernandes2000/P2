public class Contacto {
  private String nome;
  private String telefone;
  private String eMail;
  
  public Contacto(String nome, String telefone, String eMail){
	  nome = nome;
	  telefone = telefone;
	  eMail = eMail;
  }
  public Contacto(String nome, String telefone){
	  nome = nome;
	  telefone = telefone;
  }
  
  public String nome() {
	  return nome;
  }
  public String telefone() {
	  return telefone;
  }
  public String eMail() {
	  return eMail;
  } 
  
}
