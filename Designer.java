public class Designer extends Karyawan{
	public void addGaji (int duit){
		System.out.println("Gaji Anda : " + gaji);
		if((gaji + duit) <= maxGajiDes){
			gaji += duit;
			System.out.println("Gaji Anda yang sudah ditambah : " + duit);
			System.out.println("Gaji Anda Sekarang : " + gaji);
		}else{
			gaji = maxGajiDes;
			System.out.println("Gaji Anda kelebihan");
		}
	}

	public void addGaji (int duit, String pesan){
		System.out.println("Gaji Anda : " + gaji);
		if((gaji + duit) <= maxGajiDes){
			gaji += duit;
			System.out.println("Gaji Anda yang sudah ditambah : " + duit);
			System.out.println("Gaji Anda Sekarang : " + gaji);
			System.out.println("Pesan : " + pesan);
		}else{
			gaji = maxGajiDes;
			System.out.println("Gaji Anda kelebihan");
		}
	}

}