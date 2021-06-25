import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class Main {
    public static void main(String[] args) {
        Object [][] info = {
                {"Name" ,  "Email" , "Phone Number", "Credit Card" },
                {"Anetta Pozer", "apozer0@gizmodo.com", "631-331-4898",	3552421786057285L},
                {"Ilario Overlow", "ioverlow1@sakura.ne.jp", "512-969-3178", 5007666062273933L},
                {"Jenni Bowdery", "jbowdery2@creativecommons.org", "240-981-3226" ,	3574299080159492L},
                {"Phyllys Karppi",	"pkarppi3@cnbc.com", "628-686-9886", 3589734035932315L},
                {"Adelbert Yitzovicz",	"ayitzovicz4@jigsy.com", "203-467-0276", 3576321404492926L}

        };


        System.out.println(arrayToListOfMaps(info));

    }


    public static List<Map<String, Object>>  arrayToListOfMaps(Object[][] arr){

        List<Map<String, Object>> listOfMaps = new ArrayList<>();

        String[][] table = new String[0][];
        String[] headerRow = table[0];

        for (int i = 1; i < table.length; i++) {

            Map<String, Object> row = new LinkedHashMap<>();

            for (int j = 0; j < table[i].length; j++) {
                row.put(headerRow[j], table[i][j]);
            }
            listOfMaps.add(row);
        }

        for (Map<String, Object> row : listOfMaps) {

            System.out.println(row);
        }



        return listOfMaps;

    }
}