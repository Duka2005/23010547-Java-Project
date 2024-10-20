package main.java.qlct;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import main.java.qlct.view.TableView;

public class App {
    public static void main(String args[]) {
        try{
            File f = new File("data.json");
 
            if (f.exists()) {
            } else {
                FileWriter file = new FileWriter("data.json");
                file.write("[]");
                file.close();
            }
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new TableView().setVisible(true);
                }
            });
        } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
        }
    }
}