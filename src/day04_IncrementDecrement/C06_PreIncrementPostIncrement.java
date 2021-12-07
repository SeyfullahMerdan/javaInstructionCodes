package day04_IncrementDecrement;

public class C06_PreIncrementPostIncrement {

	public static void main(String[] args) {
		
		// PreIncrement ve PostIncrement sadece sayi++ veya sayi-- yazimi için geerlidir.
		
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
		
		System.out.println(++sayi); // 15 i arttýrdý ve 16yý yazdýrdý
		System.out.println(sayi++); // 16 yý yazdýrdý ve sonrasýnda 17ye arttýrdý
		System.out.println(sayi);
		
	}

}
