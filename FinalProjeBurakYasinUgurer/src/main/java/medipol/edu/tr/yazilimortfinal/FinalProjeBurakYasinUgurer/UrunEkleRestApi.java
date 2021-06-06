package medipol.edu.tr.yazilimortfinal.FinalProjeBurakYasinUgurer;

import java.util.ArrayList;
import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/urunekle")


public class UrunEkleRestApi {

	
	public static List<String> urunadi = new ArrayList<>();

    @GetMapping("/listele")
    public static List<String> listele(){
        return urunadi;
    }

    @PostMapping("/ekle")
    public static String ekle(@RequestBody String urun) {
    	urunadi.add(urun);
        return urun;
    } 

    @PostMapping("/sil")
    public static String sil(@RequestBody String urun) {
    	urunadi.remove(urun);
        return urun;


    }
	
}
