package verhaltensmuster.templateMethod;

public abstract class Game
{
    /// <summary>
    /// Template Method
    /// </summary>
    public void Play()
    {
        // Spiel starten
        InitGame();

        // SOlange Spielt nicht beendet ist
        while (!IsFinished())
        {

            // Eingabe Spielzug
            GetInput();

            // Ausgabe Antwort
            ShowOutput();
        }

        // Spiel beenden
        EndGame();
    }

    protected abstract boolean IsFinished();

    protected abstract void EndGame();

    protected abstract void ShowOutput();

    protected abstract void GetInput();

    protected abstract void InitGame();
}