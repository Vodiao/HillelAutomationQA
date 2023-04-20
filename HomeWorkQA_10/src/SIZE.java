public enum SIZE {

    SMALL("S", 50, 60),
    MEDIUM("M", 60, 70),
    LARGE("L", 70, 80),
    EXTRA_LARGE("XL", 80, 90);

    private final String abbreviation;
    private final int width;
    private final int length;

    private SIZE(String abbreviation, int width, int length) {
        this.abbreviation = abbreviation;
        this.width = width;
        this.length = length;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return  abbreviation + " size: " + "width=" + width +" , " + "length=" + length +  '.';
    }
}
