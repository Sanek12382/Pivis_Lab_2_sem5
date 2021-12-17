package model;

public enum UserRole {
    ;

    UserRole() {
    }

    public final int buyer = 1;
    public final int seller = 2;

    public int getBuyer() {
        return buyer;
    }

    public int getSeller() {
        return seller;
    }
}
