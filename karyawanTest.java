public class karyawanTest{
	public static void main(String[] args) {
		Designer x = new Designer();
		x.setNama("Pricilia");
		System.out.println("Nama Karyawan :" + x.getNama());
		x.setAlamat("Jatibarang");
		System.out.println("Nama Karyawan :" + x.getAlamat());
		x.addGaji(50);
		x.addGaji(20,"Anda dapat bonus");
		x.addGaji(20);
		System.out.println("");

		Programmer y = new Programmer();
		y.setNama("Dwi");
		System.out.println("Nama Karyawan :" + x.getNama());
		y.setAlamat("Indramayu");
		System.out.println("Nama Karyawan :" + x.getAlamat());
		y.addGaji(50);
		y.addGaji(35,"Anda dapat bonus");
		y.addGaji(10);
		System.out.println("");

		Pm z = new Pm();
		z.setNama("Widyaastari");
		System.out.println("Nama Karyawan :" + x.getNama());
		z.setAlamat("Lohbener");
		System.out.println("Nama Karyawan :" + x.getAlamat());
		z.addGaji(50);
		z.addGaji(50,"Anda dapat bonus");
		z.addGaji(15);
		System.out.println("");

	}
}