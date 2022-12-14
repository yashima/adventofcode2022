package de.delusions.aoc.util;

public enum Direction {

    north( "^" ), northeast( null ), east( ">" ), southeast( null ), south( "v" ), southwest( null ), west( "<" ), northwest( null );

    private final String symbol;

    Direction( String symbol ) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public Direction turnRight() {
        return turnRight( 90 );
    }

    public Direction turnRight( int degree ) {
        return values()[( ordinal() + ( degree / 45 ) ) % values().length];
    }

    public Direction turnLeft() {
        return turnLeft( 90 );
    }

    public Direction turnLeft( int degree ) {
        return values()[( ordinal() + ( ( 360 - degree ) / 45 ) ) % values().length];
    }
}
