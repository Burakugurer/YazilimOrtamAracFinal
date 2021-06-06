package medipol.edu.tr.yazilimortfinal.FinalProjeBurakYasinUgurer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.List;




@SpringBootTest
class FinalProjeBurakYasinUgurerApplicationTests {

	UrunEkleRestApi urunEkleRestApi = new UrunEkleRestApi();
    private static List<String> urunadi = UrunEkleRestApi.urunadi;

    @Test
    public void Listele() {
        List<String> sonuc = UrunEkleRestApi.listele();
        assertEquals(urunadi,sonuc);
    }

    @Test
    public void Ekle() {
        String urun = "Bilgisayar";
        String sonuc = UrunEkleRestApi.ekle(urun);
        assertEquals("Bilgisayar",sonuc);
    }

    @Test
    public void Sil() {
        String urun = "Bilgisayar";
        UrunEkleRestApi.urunadi.add(urun);
        String sonuc = UrunEkleRestApi.sil(urun);
        assertEquals("Bilgisayar",sonuc);
    }
		
		
	}


