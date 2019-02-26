import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String tb_pegawai ="./pegawai.csv";
        String tb_project ="./project.csv";

        int index = getIndexByNameColumnPegawai("id_pegawai");
        System.out.println(getdataByColumn(tb_pegawai,0,1,2,3));
        System.out.println(getdataByColumn(tb_project, 0,1,2));
    }

    static int getIndexByNameColumnPegawai(String nameColumn){
        switch (nameColumn){
            case "id_pegawai":
                return 0;
        }
        return -1;
    }

    static StringBuilder getdataByColumn(String tbName,int... column){
        StringBuilder result = new StringBuilder();
        String line = "";
        String cvsSplitBy = ";";

        try (BufferedReader br = new BufferedReader(new FileReader(tbName))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] data = line.split(cvsSplitBy);
                //System.out.println(line);
                //System.out.println("Country [code= " + country[0] + " , name=" + country[1] + "]");
                for (int i = 0; i < column.length; i++) {
                    result.append(data[column[i]]+" ");
                }
                result.append("\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    static StringBuilder joinTwoTable(String tb1, String tb2, String[] state2, String[] state1){
        //getdataByColumn(tb2,);
        return null;
    }
    static StringBuilder getAllDataByTable(String tbName){
        StringBuilder result = new StringBuilder();
        String line = "";
        String cvsSplitBy = ";";

        try (BufferedReader br = new BufferedReader(new FileReader(tbName))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String data = line.replace(cvsSplitBy," ");
                //System.out.println(line);
                //System.out.println("Country [code= " + country[0] + " , name=" + country[1] + "]");
                result.append(data+"\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
