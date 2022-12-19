package de.delusions.aoc.advent2022;

import de.delusions.aoc.util.Day;

import java.util.List;
import java.util.stream.Stream;

public class Day2 extends Day<Integer> {
    Day2() {
        super( 2, "Rock Paper Scissors" );
    }

    @Override
    public Integer part1( Stream<String> input ) {
        return input.map( line -> {
            int opponent = ( line.charAt( 0 ) + 1 ) % 3 + 1;
            int me = ( line.charAt( 2 ) - 1 ) % 3 + 1;
            return me + ( me - opponent == 0 ? 3 : ( List.of( 1, -2 ).contains( me - opponent ) ? 6 : 0 ) );
        } ).reduce( 0, Integer::sum );
    }

    @Override
    public  Integer part2( Stream<String> input ) {
        return input.map( line -> List.of( "fnord", "B X", "C X", "A X", "A Y", "B Y", "C Y", "C Z", "A Z", "B Z" ) //
            .indexOf( line ) ).reduce( 0, Integer::sum );
    }
}
