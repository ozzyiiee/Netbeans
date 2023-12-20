package Mib20;

import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;

public class StartKlass {

        private static InfDB StartKlass;

        public static void main(String[] args) throws InfException {

            try {
                StartKlass = new InfDB("mibdb", "3306", "mibdba", "mibkey");

            } catch (InfException ex) {
                    Logger.getLogger(StartKlass.class.getName()).log(Level.SEVERE, null, ex);

            }
        } 
}