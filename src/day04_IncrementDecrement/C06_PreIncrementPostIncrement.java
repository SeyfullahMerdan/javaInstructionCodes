package day04_IncrementDecrement;

public class C06_PreIncrementPostIncrement {

	public static void main(String[] args) {
		
		// PreIncrement ve PostIncrement sadece sayi++ veya sayi-- yazimi i�in geerlidir.
		
		int sayi=10;
		
		sayi++;
		sayi++;
		sayi++;
		
		System.out.println(sayi);  //13
		
		System.out.println(sayi++); // 13  bu satirda iki islem var
                                    // bir artirma , bir de yazdirma 
        
		System.out.println(sayi); // 14

                        // once artirmak sonra yazdirmak isterseniz ++sayi
                        // once yazdirmak sonra artirmak isterseniz sayi++

        System.out.println(++sayi); // 15 
		
		System.out.println(++sayi); // 15 i artt�rd� ve 16y� yazd�rd�
		System.out.println(sayi++); // 16 y� yazd�rd� ve sonras�nda 17ye artt�rd�
		System.out.println(sayi);
		
	}

}
