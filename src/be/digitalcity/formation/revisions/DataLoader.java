package be.digitalcity.formation.revisions;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
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
        List<OptionsHotel> optionsHotelList = null;

        BufferedInputStream in = null;
        try {
            in = new
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
