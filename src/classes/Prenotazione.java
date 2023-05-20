package classes;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.LocalDateTime;

@SuppressWarnings("unused")
public class Prenotazione {
	
	private int id_prenotazione;
	private int n_persone;
	private LocalDateTime data_ora_prenotazione; 
	private LocalDateTime data_ora_prenotazione_locale;
	public Ristorante ristorante;
	private boolean confermata=false;
	//inserire a che cliente corrisponde
	
	
	public int getId_prenotazione() {
		return id_prenotazione;
	}
	public void setId_prenotazione(int id_prenotazione) {
		this.id_prenotazione = id_prenotazione;
	}
	public int getN_persone() {
		return n_persone;
	}
	public void setN_persone(int n_persone) {
		this.n_persone = n_persone;
	}
	public LocalDateTime getData_ora_prenotazione() {
		return data_ora_prenotazione;
	}
	public void setData_ora_prenotazione(LocalDateTime data_ora_prenotazione) {
		this.data_ora_prenotazione = LocalDateTime.now();
	}
	public LocalDateTime getData_ora_prenotazione_locale() {
		return data_ora_prenotazione_locale;
	}
	public void setData_ora_prenotazione_locale(LocalDateTime data_ora_prenotazione_locale) {
		this.data_ora_prenotazione_locale = data_ora_prenotazione_locale;
	}
	public Prenotazione(int id_prenotazione, int n_persone, LocalDateTime data_ora_prenotazione,
			LocalDateTime data_ora_prenotazione_locale, Ristorante ristorante) {
		super();
		this.id_prenotazione = id_prenotazione;
		this.n_persone = n_persone;
		this.data_ora_prenotazione = data_ora_prenotazione;
		this.data_ora_prenotazione_locale = data_ora_prenotazione_locale;
		this.ristorante = ristorante;
	}
	@Override
	public String toString() {
		return "Prenotazione [getId_prenotazione()=" + getId_prenotazione() + ", getN_persone()=" + getN_persone()
				+ ", getData_ora_prenotazione()=" + getData_ora_prenotazione() + ", getData_ora_prenotazione_locale()="
				+ getData_ora_prenotazione_locale() + "]";
	}




}
