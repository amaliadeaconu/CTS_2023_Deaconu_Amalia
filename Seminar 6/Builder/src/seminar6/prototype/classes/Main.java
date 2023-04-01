package seminar6.prototype.classes;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String,Integer> documente = new HashMap<>();
        documente.put("CI",2);
        documente.put("ADV",6);
        documente.put("CERTIFICAT",4);
        ContBancar contBancar = new ContBancar("Andrei",10,documente);
        ContBancar contBancar1 = (ContBancar) contBancar.copiaza();
        System.out.println(contBancar);
        System.out.println(contBancar1);
    }
}
