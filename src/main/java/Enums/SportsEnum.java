package Enums;

public enum SportsEnum {
    FOOTBALL(1), BASKETBALL(2);

    private Integer type;

    SportsEnum(Integer type) {
        this.type = type;
    }

    public Integer getType() {
        return type;
    }
}
