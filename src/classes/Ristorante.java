package classes;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Ristorante {
	private String nome;
	private String indirizzo;
	private int n_tavoli;
	ArrayList<String> tipo_cibo = new ArrayList<String>();
	Queue<Prenotazione> prenotazioni_in_attesa = new LinkedList<>();
	ArrayList<Prenotazione> prenotazioni_confermate = new ArrayList<Prenotazione>();
	
	
	public boolean add_prenotazione (Prenotazione nuova) {
		try {
			if (prenotazioni_in_attesa.add(nuova)==true) {
				prenotazioni_in_attesa.add(nuova);
				return true;
			}else {
				throw new Exception("Errore di prenotazione, riprova!");
			}
				
		}catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Ristorante Nome=" + getNome() + ", Indirizzo=" + getIndirizzo() + ", Numero tavoli="
				+ getN_tavoli() + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	public int getN_tavoli() {
		return n_tavoli;
	}
	public void setN_tavoli(int n_tavoli) {
		this.n_tavoli = n_tavoli;
	}
		
}
