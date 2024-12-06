class TextReader {
    private int antalRader = 0;
    private int antalTecken = 0;

    public void läggTillRad(String rad) {
        antalRader++;
        antalTecken += rad.length();
    }

    public int getAntalRader() {
        return antalRader;
    }

    public int getAntalTecken() {
        return antalTecken;
    }
}
