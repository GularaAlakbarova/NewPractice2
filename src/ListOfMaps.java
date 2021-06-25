import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class ListOfMaps {
    public static void main(String[] args) {
        String[][] table = {
                {"id", "first_name", "last_name", "email", "gender", "ip_address"},
                {"1", "Thatcher", "Woodyear", "twoodyear0@bravesites.com", "Non-binary", "212.73.182.135"},
                {"2", "Janis", "Belden", "jbelden1@comcast.net", "Genderfluid", "238.14.135.252"}

        };

        //        {id=1, first_name=Thatcher, last_name=Woodyear, email=twoodyear0@bravesites.com, gender=Non-binary, ip_address=212.73.182.135}
//        {id=2, first_name=Janis, last_name=Belden, email=jbelden1@comcast.net, gender=Genderfluid, ip_address=238.14.135.252}

        List<Map<String, String>> listOfMaps = new ArrayList<>();

        String[] headerRow = table[0];

        for (int i = 1; i < table.length; i++) {

            Map<String, String> row = new LinkedHashMap<>();

            for (int j = 0; j < table[i].length; j++) {
                row.put(headerRow[j], table[i][j]);
            }
            listOfMaps.add(row);
        }

        for (Map<String, String> row : listOfMaps) {

            System.out.println(row);
        }

        System.out.println(listOfMaps.get(1).get("email"));
    }
}