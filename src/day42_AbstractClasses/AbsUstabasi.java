package day42_AbstractClasses;

public class AbsUstabasi extends AbsIsci {

	// Concrete bir child class parenti olan abstrat classlardaki tüm abstract methodlarý implement etmelidir!**
	
  public static void main (String[] args) {
	  
	  Ustabasi usb=new Ustabasi();
	  
	  usb.mesai();
	  usb.maas();
	  usb.statu();
	  
  }
   
  
   // public abstract void vardiya()  Bu class concret oldugu için burada abstract method oluþturulamaz!!
  
  
	@Override
	public void mesai() {
		System.out.println("Arýza çözülene kadar çalýþýr. imza: Ustabaþý");
		
	}

	@Override
	public void maas() {
		System.out.println("Aylýk 10.000 Tldir. imza: Ustabaþý");
		
	}

	@Override
	public void statu() {
		System.out.println("Bu classdaki tüm personel ustabasidir. Ýmza: Ustabaþý");
	}

	@Override
	public void kategori() {  // Java itiraz etti, bu methodu sonradan ekledim. Java hemen uyardý ve ekle dedi!.
		
	}

}
