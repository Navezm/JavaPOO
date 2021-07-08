package be.digitalcity.formation.files;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Main {

    public static void main(String[] args) throws IOException {
//        lireFichier("C:\\Users\\local_user\\Desktop\\Exercices\\Java OO\\POO\\src\\be\\digitalcity\\formation\\files\\fichier.txt");
//        lireFichierAvecBufferReader("C:\\\\Users\\\\local_user\\\\Desktop\\\\Exercices\\\\Java OO\\\\POO\\\\src\\\\be\\\\digitalcity\\\\formation\\\\files\\\\fichier.txt");
//        lireFichierAvecNewPackage("C:\\\\\\\\Users\\\\\\\\local_user\\\\\\\\Desktop\\\\\\\\Exercices\\\\\\\\Java OO\\\\\\\\POO\\\\\\\\src\\\\\\\\be\\\\\\\\digitalcity\\\\\\\\formation\\\\\\\\files\\\\\\\\fichier.txt");
//        ecrireFichier("C:\\\\Users\\\\local_user\\\\Desktop\\\\Exercices\\\\Java OO\\\\POO\\\\src\\\\be\\\\digitalcity\\\\formation\\\\files\\\\fichier.txt");
//        copieFichier("C:\\\\Users\\\\local_user\\\\Desktop\\\\Exercices\\\\Java OO\\\\POO\\\\src\\\\be\\\\digitalcity\\\\formation\\\\files\\\\fichier.txt");
        demoObjetIO("C:\\\\Users\\\\local_user\\\\Desktop\\\\Exercices\\\\Java OO\\\\POO\\\\src\\\\be\\\\digitalcity\\\\formation\\\\files\\\\voitures.txt");
    }

    public static void lireFichier(String path) throws IOException {

        FileInputStream fis = null;

        try {
            fis = new FileInputStream(path);
            byte[] buffer = new byte[8];

            int i = 0;
            while ((i = fis.read()) != -1) {
                System.out.println((char)i);
            }

        } catch(IOException e) {
            System.out.println(e.getMessage());
        } finally {
            fis.close();
        }

    }

    public static void lireFichierAvecBufferReader(String path) {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(path));

            String line;

            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void lireFichierAvecNewPackage(String path) {

        BufferedInputStream bis = null;
        FileInputStream fis = null;

        try {
            fis = new FileInputStream(path);
            bis = new BufferedInputStream(fis);

            long time = System.currentTimeMillis();
            int i = 0;
            while((i = bis.read()) != -1) {
                System.out.println((char)i);
            }
            System.out.println("Temps execution classique : " + (System.currentTimeMillis() - time));

            fis = new FileInputStream(path);
            FileChannel fc = fis.getChannel();
            ByteBuffer bBuff = ByteBuffer.allocate((int)fc.size());

            time = System.currentTimeMillis();

            fc.read(bBuff);
            bBuff.flip();

            byte[] resultat = bBuff.array();

            for (byte b : resultat) {
                System.out.println((char) b);
            }

            System.out.println("Temps exécution avec new package : " + (System.currentTimeMillis() - time));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static void ecrireFichier(String path) {
        try (PrintWriter out = new PrintWriter(path)) {
            for (int i = 0; i < 10; i++) {
                out.println("Bonjour " + i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

//        try {
//            out = new PrintWriter(path);
//            for (int i = 0; i < 10; i++) {
//                out.println("Bonjour " + i);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } finally {
//            if (out != null) {
//                out.close();
//            }
//        }
    }

    public static void copieFichier(String path) {

        try (FileInputStream fis = new FileInputStream(path)){
            FileOutputStream fos = new FileOutputStream("C:\\\\Users\\\\local_user\\\\Desktop\\\\Exercices\\\\Java OO\\\\POO\\\\src\\\\be\\\\digitalcity\\\\formation\\\\files\\\\fichier2.txt");
            byte[] buffer = new byte[1];
            while (fis.read(buffer) != -1) {
                fos.write(buffer);
            }
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void demoObjetIO(String path) {
        ObjectInputStream ois;
        ObjectOutputStream oos;

        try {
            // Ecriture dans le fichier
            oos = new ObjectOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(
                                    path
                            )
                    )
            );
            oos.writeObject(new Voiture("Audi", 1995));
            oos.writeObject(new Voiture("Renault", 1500));
            oos.close();

            // Lecture du fichier
            ois = new ObjectInputStream(
                    new BufferedInputStream(
                            new FileInputStream(
                                    path
                            )
                    )
            );
            System.out.println("Listing voiture");
            System.out.println(((Voiture)ois.readObject()).toString());
            System.out.println(((Voiture)ois.readObject()).toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
