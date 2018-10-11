public class Karyawan{
	private String nama;
	private String alamat;
	protected int gaji;
	final int maxGajiDes = 70;
	final int maxGajiPro = 90;
	final int maxGajiPm = 100;

	public void addGaji (int duit){
		gaji += duit;
		System.out.println("Gaji yang Anda dapat : " + gaji);
	}

	public void addGaji (int duit, String pesan){
		gaji += duit;
		System.out.println("Gaji yang Anda dapat : " + gaji);
		System.out.println("Pesan : " + pesan);
	}

	public void setNama (String name){
		nama = name;
	}

	public void setAlamat (String address){
		alamat = address;
	}

	public String getNama(){
		return nama;
	}

	public String getAlamat(){
		return alamat;
	}

}