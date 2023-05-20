package classes;
import java.time.LocalDate;
import java.time.Period;

import org.mindrot.jbcrypt.BCrypt;



public class Persona {
	private String nome;
	private String cognome;
	private LocalDate data_di_nascita;
	private String username;
	private String password;
	
	public boolean is_maggiorenne () {
		LocalDate now= LocalDate.now();
		Period periodo=this.getData_di_nascita().until(now);
		int age= periodo.getYears();
		if(age>=18)
			return true;
		else
			return false;
		
	}
	
	public Persona(String nome, String cognome, LocalDate data_di_nascita) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.data_di_nascita = data_di_nascita;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public LocalDate getData_di_nascita() {
		return data_di_nascita;
	}
	public void setData_di_nascita(LocalDate data_di_nascita) {
		this.data_di_nascita = data_di_nascita;
	}
	
	@Override
	public String toString() {
		return "Persona [getNome()=" + getNome() + ", getCognome()=" + getCognome() + ", getData_di_nascita()="
				+ getData_di_nascita() + "]";
	}
	
	public static void main (String [] args) {
		Persona p1=new Persona("Pippo", "puppo", LocalDate.of(2005, 5, 20));
		System.out.println(p1.getData_di_nascita());
		System.out.println(p1.is_maggiorenne());
	}
	
	
	public void set_password(String passw) {
		String salt = BCrypt.gensalt();
		String hashedPassword = BCrypt.hashpw(passw, salt);
		this.password=hashedPassword;
		
	}
	
	public boolean test_password (String passwordfornita) {

		if (BCrypt.checkpw(passwordfornita, this.getPassword())) {
		    // La password fornita è corretta
			return true;
		} else {
		    // La password fornita non è corretta
			return false;
		}
		
		
	}
	
	
	public String getUsername() {
		return username;
	}




	public void setUsername(String username) {
		this.username = username;
	}

	
	
	public String getPassword() {
		return password;
	}
}
