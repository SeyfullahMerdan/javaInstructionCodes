package day42_AbstractClasses;

public class AbsUstabasi extends AbsIsci {

	// Concrete bir child class parenti olan abstrat classlardaki t�m abstract methodlar� implement etmelidir!**
	
  public static void main (String[] args) {
	  
	  Ustabasi usb=new Ustabasi();
	  
	  usb.mesai();
	  usb.maas();
	  usb.statu();
	  
  }
   
  
   // public abstract void vardiya()  Bu class concret oldugu i�in burada abstract method olu�turulamaz!!
  
  
	@Override
	public void mesai() {
		System.out.println("Ar�za ��z�lene kadar �al���r. imza: Ustaba��");
		
	}

	@Override
	public void maas() {
		System.out.println("Ayl�k 10.000 Tldir. imza: Ustaba��");
		
	}

	@Override
	public void statu() {
		System.out.println("Bu classdaki t�m personel ustabasidir. �mza: Ustaba��");
	}

	@Override
	public void kategori() {  // Java itiraz etti, bu methodu sonradan ekledim. Java hemen uyard� ve ekle dedi!.
		
	}

}
