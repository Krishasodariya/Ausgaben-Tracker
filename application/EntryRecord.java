package application;

//Import-Anweisungen fuer die Eigenschaftsklassen von JavaFX
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import java.time.LocalDate;

//Die Klasse Record repraesentiert einen Datensatz in der Anwendung
public class EntryRecord {
	
	// Deklaration von Eigenschaften fuer die Spalten der Tabelle
    private SimpleStringProperty DatumColumn;
    private SimpleStringProperty BeschreibungColumn;
    private SimpleDoubleProperty BetragColumn;
    private SimpleStringProperty TypColumn;

    // Konstruktor der Klasse Record, der die Werte fuer die Eigenschaften initialisiert
    public EntryRecord(LocalDate datumColumn, String beschreibungColumn, double betragColumn, String typColumn) {
        this.DatumColumn = new SimpleStringProperty(datumColumn.toString());
        this.BeschreibungColumn= new SimpleStringProperty(beschreibungColumn);
        this.BetragColumn = new SimpleDoubleProperty (betragColumn);
        this.TypColumn = new SimpleStringProperty(typColumn);
    }

    // Getter-Methode fuer die Datum-Spalte
    public String getDatumColumn() {
       return DatumColumn.get();
    }

    // Getter-Methode fuer die Beschreibung-Spalte
    public String getBeschreibungColumn() {
        return BeschreibungColumn.get();
    }

    // Getter-Methode fuer die Betrag-Spalte
    public Double getBetragColumn() {
        return BetragColumn.get();
    }

    // Getter-Methode fuer die Typ-Spalte
    public String getTypColumn() {
        return TypColumn.get();
    }
}
