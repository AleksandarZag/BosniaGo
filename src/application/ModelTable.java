package application;

public class ModelTable {
	String id, imePrezime, spol, destinacija, brojKarti, brojTelefona;

	public ModelTable(String id, String imePrezime, String spol, 
			String destinacija, String brojKarti,
			String brojTelefona) {

		this.id = id;
		this.imePrezime = imePrezime;
		this.spol = spol;
		this.destinacija = destinacija;
		this.brojKarti = brojKarti;
		this.brojTelefona = brojTelefona;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getImePrezime() {
		return imePrezime;
	}

	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}

	public String getSpol() {
		return spol;
	}

	public void setSpol(String spol) {
		this.spol = spol;
	}

	public String getDestinacija() {
		return destinacija;
	}

	public void setDestinacija(String destinacija) {
		this.destinacija = destinacija;
	}

	public String getBrojKarti() {
		return brojKarti;
	}

	public void setBrojKarti(String brojKarti) {
		this.brojKarti = brojKarti;
	}

	public String getBrojTelefona() {
		return brojTelefona;
	}

	public void setBrojTelefona(String brojTelefona) {
		this.brojTelefona = brojTelefona;
	}

	

}
