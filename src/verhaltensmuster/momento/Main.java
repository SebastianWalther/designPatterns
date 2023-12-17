package verhaltensmuster.momento;

public class Main {
    public static void main(String[] args) {
        var urheber = new Urheber();
        var undoBuffer = new UndoBuffer(urheber);

        urheber.setzteZustand("A");
        undoBuffer.speichereZustand();

        urheber.setzteZustand("B");
        undoBuffer.speichereZustand();

        urheber.setzteZustand("C");
        undoBuffer.speichereZustand();

        urheber.setzteZustand("D");
        undoBuffer.speichereZustand();

        urheber.setzteZustand("E");
        undoBuffer.speichereZustand();

        undoBuffer.rueckgaengigZustand(3);


        urheber.zeigeZustand();


    }
}
