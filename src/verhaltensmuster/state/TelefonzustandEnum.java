package verhaltensmuster.state;

public enum TelefonzustandEnum {

    AUFGELEGT (){
        @Override
        public TelefonzustandEnum abheben() {
            System.out.println("abheben");
            return TelefonzustandEnum.ABGEHOBEN;
        }
        @Override
        public TelefonzustandEnum anrufAnnehmen() {
            System.out.println("anrufAnnehmen");
            return TelefonzustandEnum.VERBUNDEN;
        }
    },
    ABGEHOBEN (){
        @Override
        public TelefonzustandEnum waehlen() {
            System.out.println("wählen");
            return TelefonzustandEnum.VERBUNDEN;
        }

        @Override
        public TelefonzustandEnum auflegen() {
            System.out.println("auflegen");
            return TelefonzustandEnum.AUFGELEGT;
        }
    },
    VERBUNDEN (){
        @Override
        public TelefonzustandEnum auflegen() {
            System.out.println("auflegen");
            return TelefonzustandEnum.AUFGELEGT;
        }

        @Override
        public TelefonzustandEnum sprechen() {
            System.out.println("sprechen");
            return TelefonzustandEnum.VERBUNDEN;
        }
    };

    String IM_AKTUELLEN_ZUSTAND_NICHT_MOEGLICH = " im aktuellen Zustand nicht möglich";

    public TelefonzustandEnum auflegen(){
        return throwException("auflegen");
    };
    public TelefonzustandEnum anrufAnnehmen(){
        return throwException("anrufAnnehmen");
    };
    public TelefonzustandEnum sprechen(){
        return throwException("sprechen");
    };
    public TelefonzustandEnum waehlen(){
        return throwException("waehlen");
    };
    public TelefonzustandEnum abheben(){
        return throwException("abheben");
    };

    private TelefonzustandEnum throwException(String zustand) {
        throw new IllegalStateException(zustand + IM_AKTUELLEN_ZUSTAND_NICHT_MOEGLICH);
    }

}
