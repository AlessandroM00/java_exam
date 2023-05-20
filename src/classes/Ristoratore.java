package classes;

import java.time.LocalDate;

public class Ristoratore extends Persona {

	private static int id_ristoratore;
	
	public Ristoratore(String nome, String cognome, LocalDate data_di_nascita) {
		super(nome, cognome, data_di_nascita);
		// TODO Auto-generated constructor stub
	}

	public static int getId_ristoratore() {
		return id_ristoratore;
	}

	public static void setId_ristoratore(int id_ristoratore) {
		Ristoratore.id_ristoratore = id_ristoratore;
	}

	
}
