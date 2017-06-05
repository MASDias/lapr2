package lapr.project.utils;

import java.util.SortedMap;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class CSVParser {

    public void writeKeywordsToCSVFile(SortedMap[] ranking, String file) {
        try {
            FileWriter writer = new FileWriter(file);

            writer.append("Keyword");
            writer.append(";");
            writer.append("Aceite");
            writer.append(";");
            writer.append("Rejeitada");
            writer.append(System.lineSeparator());

            SortedMap rankingAceites = ranking[0];
            SortedMap rankingRejeitadas = ranking[1];

            Set<String> keywordAceites = rankingAceites.keySet();

            for (String keyword : keywordAceites) {
                writer.append(keyword);
                writer.append(";");
                writer.append(rankingAceites.get(keyword).toString());
                writer.append(";");
                writer.append(rankingRejeitadas.get(keyword).toString());
                writer.append(System.lineSeparator());
            }

            writer.flush();
            writer.close();

        } catch (IOException ex) {
            Logger.getLogger(CSVParser.class.getName()).log(Level.SEVERE, null, ex);  
        }
    }
}
