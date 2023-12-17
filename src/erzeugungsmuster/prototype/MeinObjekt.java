package erzeugungsmuster.prototype;

public class MeinObjekt implements Cloneable {

    int feld1;
    int feld2;

    MeinObjekt(int feld1, int feld2) {
        this.feld1 = feld1;
        this.feld2 = feld2;

    }

    @Override
    public MeinObjekt clone() {
        try {
            MeinObjekt clone = (MeinObjekt) super.clone();
            clone.feld1 = feld1;
            clone.feld2 = feld2;
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
