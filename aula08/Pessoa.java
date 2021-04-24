
public class Pessoa implements Comparable<Pessoa>
{
  private Data nascimento;
  private String nome;
  
  public Pessoa(Data nascimento, String nome){
	  this.nascimento = nascimento;
	  this.nome = nome;
  }
  public String nome(){
	  return nome;
  }
  public Data nascimento(){
	  return nascimento;
  }
  
  public String toString(){
	  String result = nome +" "+ nascimento.toString();
	  return result;
  }
  
  public int compareTo(Pessoa p2){
	int ser;
	if(nascimento.mes() > p2.nascimento.mes()){
		ser = -1;
	}
	if(nascimento.mes() < p2.nascimento.mes()){
		ser = 1;
	}
	else{
		if(nascimento.dia() > p2.nascimento.dia()){
			ser = -1;
		}
		if(nascimento.dia() < p2.nascimento.dia()){
			ser = 1;
		}
		else{ser = 0;}
	}
	return ser;
  }
}
