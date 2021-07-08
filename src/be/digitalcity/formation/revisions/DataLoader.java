package be.digitalcity.formation.revisions;

import javax.swing.text.html.Option;
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

public class DataLoader {

    private static DataLoader instance;

    private DataLoader(){
    }

    public static DataLoader getInstance() {
        if (instance == null) {
            instance = new DataLoader();
        }
        return instance;
    }

    public List<OptionsHotel> load(String path) {
        List<OptionsHotel> optionsHotelList = new ArrayList<>();

        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(path));

            in.readLine(); // Read the first line

            String line;

            while((line = in.readLine()) != null){
                optionsHotelList.add(new OptionsHotel(line.split(",")));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


//        FileInputStream fis = null;
//
//        try {
//            fis = new FileInputStream(path);
//            FileChannel fc = fis.getChannel();
//            ByteBuffer bBuff = ByteBuffer.allocate((int)fc.size());
//
//            fc.read(bBuff);
//            bBuff.flip();
//
//            byte[] result = bBuff.array();
//
//            for (byte b : result) {
//
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        return optionsHotelList;
    }

}
