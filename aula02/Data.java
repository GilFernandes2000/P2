import static java.lang.System.*;
import java.util.Calendar;

public class Data {
  private int dia, mes, ano;

  /** Inicia esta data com o dia de hoje. */
  public Data() {
    // Aqui usamos a classe Calendar da biblioteca standard para obter a data atual.
    Calendar today = Calendar.getInstance();
    dia = today.get(Calendar.DAY_OF_MONTH);
    mes = today.get(Calendar.MONTH) + 1;
    ano = today.get(Calendar.YEAR);
  }

  /** Inicia a data a partir do dia, mes e ano dados. */
  public Data(int dia, int mes, int ano) {
	this.dia = dia;
	this.mes = mes;
	this.ano = ano;
  }
  public Data(String data){
	  String[] d = data.split("-");
	  this.ano = Integer.parseInt(d[0]);
	  this.mes = Integer.parseInt(d[1]);
	  this.dia = Integer.parseInt(d[2]);
  }

  /** Devolve esta data segundo a norma ISO 8601. */
  public String toString() {
    return String.format("%04d-%02d-%02d", ano, mes, dia);
  }

  /** Indica se ano é bissexto. */
  public static boolean bissexto(int ano) {
    return ano%4 == 0 && ano%100 != 0 || ano%400 == 0;
  }
	public int dia(){
		return dia;
	}
	public int mes(){
		return mes;
	}
	public int ano(){
		return ano;
	}
  // Crie métodos para obter o dia, mes e ano da data.
  //...

  /** Dimensões dos meses num ano comum. */
  private static final
  int[] diasMesComum = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

  /** Devolve o número de dias do mês dado. */
  public static int diasDoMes(int mes, int ano) {
	boolean bi = bissexto(ano);
	
	if(bi){
		diasMesComum[1]++;
	}
	int dias = diasMesComum[mes];
	return dias;
  }

  /** Devolve o mes da data por extenso. */
  public String mesExtenso() {
	String[] meses = {"Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
	return meses[this.mes-1];
  }


  /** Devolve esta data por extenso. */
  public String extenso() {
    return String.format("%2d de %s de %4d\n", dia, mesExtenso(), ano);
  }

  /** Indica se um terno (dia, mes, ano) forma uma data válida. */
  public static boolean dataValida(int dia, int mes, int ano) {
    boolean ser = true;
    if(mes > 12 || mes < 1){
		ser = false;
	}
	if ( ano < 1){
		ser = false;
	}
	if( dia < 1 || dia > diasDoMes(mes, ano)){
		ser = false;
	}
	return ser;
  }


  public void seguinte() {
   if(this.dia < diasMesComum[this.mes-1]){
	   this.dia++;
   }
   else {
	   this.dia = 1;
	   if(this.mes < 12) {
		   this.mes++;
	   }
	   else {
		   this.mes = 1;
		   this.ano++;
	   }
   }
  
  }
  public int compareTo(Data y){
	  int ser = 0;
	  if(y.ano() == this.ano && y.mes() == this.mes && y.dia() == this.dia){
		  ser = 0;
	  }
	  else {
		  if( this.ano > y.ano()){
			  ser = 1;
		  }
		   else {
			  ser = -1;
		  }
		  if(this.mes > y.mes()){
			  ser = 1;
		  }
		   else {
			  ser = -1;
		  }
		  if(this.dia > y.dia()){
			  ser = 1;
		  }
		  else {
			  ser = -1;
		  }
	  }
	  return ser;
	  
  }

}

