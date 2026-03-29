package centsible.functions;

import centsible.datas.AuditTrails;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

public class AuditFunction {
    
    private String dateTime, transaction, name;
    private String accID;
    
    String location = "";

    public AuditFunction() {
        File file = new File("");
        location = file.getAbsolutePath() + "\\Audit\\";//setting file loc.
    }

    public void createAudit(String name, String entry) {
        File f = new File(location + "Actions.txt");

        if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (Exception e) {
                System.out.println("Error (createAudit): " + e);
            }
        }
        writeToFile(entry, name, f);

    }

    public void writeToFile(String entry, String name, File f) {
        EncryptionDecryption ed = new EncryptionDecryption();
        
        String audit = "";
        BufferedReader br;
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter
                .ofPattern("MMMM dd, yyyy HH:mm:ss");

        try {
            br = new BufferedReader(new FileReader(f));
            while (br.ready()) {
                audit = audit + br.readLine() + "\n";
            }
            br.close();
            String temp = ed.encrypt(dtf.format(ldt)) + "\n" + ed.encrypt(entry)
                    + "\n" + ed.encrypt(name);
            audit = audit + temp;
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
            bw.write(audit);
            bw.flush();
            bw.close();
            
        } catch (Exception e) {
            System.out.println("Error (bufferedreader audit): " + e);
        }
    }
}
