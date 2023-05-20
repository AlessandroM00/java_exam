package classes;

import java.time.LocalDate;
import org.mindrot.jbcrypt.BCrypt;
import java.util.Scanner;

public class Cliente extends Persona {

	private static int id_cliente;
	
	
	public static int getId_cliente() {
		return id_cliente;
	}



	public static void setId_cliente(int id_cliente) {
		Cliente.id_cliente = id_cliente;
	}

	public Cliente(String nome, String cognome, LocalDate data_di_nascita) {
		super(nome, cognome, data_di_nascita);
		// TODO Auto-generated constructor stub
	}

	public static void main (String [] args) {
		Scanner tastiera= new Scanner(System.in);
		Cliente p1=new Cliente("Pippo", "puppo", LocalDate.of(2005, 5, 20));
		System.out.println("Inserisci la nuova password");
		String pass= tastiera.nextLine();
		p1.set_password(pass);
		System.out.println("Inserisci la password da testare");
		String pass2= tastiera.nextLine();
		System.out.println(p1.test_password(pass2));
	}
	
	
}
