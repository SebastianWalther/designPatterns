/*--- (C) 1999-2023 Techniker Krankenkasse ---*/

package verhaltensmuster.templateMethod;

import java.util.Random;
import java.util.Scanner;

public class ZahlenRaten extends Game {

	int lastInput;
	int zuErratendeZahl;

	int anzahlVersuche;

	@Override
	protected boolean IsFinished() {
		return lastInput == zuErratendeZahl;
	}

	@Override
	protected void EndGame() {
		System.out.println("YEA!");
	}

	@Override
	protected void ShowOutput() {
		if (zuErratendeZahl > lastInput) {
			System.out.println(anzahlVersuche + ": Die Zahl ist gröesser");
		} else if (zuErratendeZahl < lastInput) {
			System.out.println(anzahlVersuche + ": Die Zahl ist kleiner");
		}
	}

	@Override
	protected void GetInput() {
		System.out.println("Bitte geben Sie eine Zahl ein: ");
		Scanner scanner = new Scanner(System.in);
		lastInput = scanner.nextInt();
		this.anzahlVersuche++;
	}

	@Override
	protected void InitGame() {
		System.out.println("Willkommen zu Zahlenraten-Spiel");
		this.zuErratendeZahl = new Random().nextInt(100);
	}
}

/*--- Formatiert nach TK Code Konventionen vom 05.03.2002 ---*/
