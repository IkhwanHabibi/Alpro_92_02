package ch02;

public class Pegawai {
	
	String nik;
	String nama;
	String jabatan;
	boolean isAktif;

	public String getNik() {
		return nik;
	}

	public String getNama() {
		return nama;
	}

	public String getJabatan() {
		return jabatan;
	}

	public boolean isAktif() {
		return isAktif;
	}

	public void cetak() {
		System.out.print("Nik : " + nik);
		System.out.print("Nama : " + nama);
		System.out.print("Jabatan : " + jabatan);
		System.out.print("Status : " + isAktif);

	}

}