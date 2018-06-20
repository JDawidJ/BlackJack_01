public enum CardValue {
    DWA(2),
    TRZY(3),
    CZTERY(4),
    PIĘĆ(5),
    SZEŚĆ(6),
    SIEDEM(7),
    OSIEM(8),
    DZIEWIĘĆ(9),
    DZIESIĘĆ(10),
    WALET(10),
    DAMA(10),
    KROL(10),
    AS(11);



    private final int value;

    CardValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
