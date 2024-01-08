package workshop1;

import java.util.*;
import Data.*;

public class WorkShop1 {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String kitu = sc.nextLine();          
            switch (kitu) {
                case "C01":
                    C01.main();
                    break;
                case "C02":
                    C02.main();
                    break;
                case "C03":
                    C03.main();
                    break;
                case "C04":
                    C04.main();
                    break;
                case "C05":
                    C05.main();
                    break;
                case "C06":
                    C06.main();
                    break;
                case "C07":
                    C07.main();
                    break;
                case "C08":
                    C08.main();
                    break;
                case "C09":
                    C09.main();
                    break;
                case "C10":
                    C10.main();
                    break;
                case "C11":
                    C11.main();
                    break;
                case "C12":
                    C12.main();
                    break;
                default:
                    System.out.println("Input again!!!");
                    
            }
    }

}
