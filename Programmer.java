public class Programmer extends Karyawan{
	public void addGaji (int duit){
		System.out.println("Gaji Anda : " + gaji);
		if((gaji + duit) <= maxGajiPro){
			gaji += duit;
			System.out.println("Gaji Anda yang sudah ditambah : " + duit);
			System.out.println("Gaji Anda Sekarang : " + gaji);
		}else{
			gaji = maxGajiPro;
			System.out.println("Gaji Anda kelebihan");
		}
	}

	public void addGaji (int duit, String pesan){
		System.out.println("Gaji Anda : " + gaji);
		if((gaji + duit) <= maxGajiPro){
			gaji += duit;
			System.out.println("Gaji Anda yang sudah ditambah : " + duit);
			System.out.println("Gaji Anda Sekarang : " + gaji);
			System.out.println("Pesan : " + pesan);
		}else{
			gaji = maxGajiPro;
			System.out.println("Gaji Anda kelebihan");
		}
	}

}