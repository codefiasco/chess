package org.academiadecodigo.chess.movable.piece;

import org.academiadecodigo.chess.Constants;
import org.academiadecodigo.chess.Position.Position;

import java.util.LinkedList;
import java.util.List;

public class Rook extends Piece {

    public Rook(int col, int row) {
        super(PieceType.ROOK, col, row);
    }

    @Override
    public Position[] possibleMoves() {
        List<Position> moves = new LinkedList<>();

        for (int i = 1; i < Constants.BOARD_SIZE; i++) {

            //TOP
            if (pos.getRow() - i >= 0) {
                moves.add(new Position(pos.getCol(), pos.getRow() - i));
            }

            // RIGHT
            if (pos.getCol() + i < Constants.BOARD_SIZE) {
                moves.add(new Position(pos.getCol() + i, pos.getRow()));
            }

            // BOTTOM
            if (pos.getRow() + i < Constants.BOARD_SIZE) {
                moves.add(new Position(pos.getCol(), pos.getRow() + i));
            }

            // LEFT
            if (pos.getCol() - i >= 0) {
                moves.add(new Position(pos.getCol() - i, pos.getRow()));
            }
        }

        return moves.toArray(new Position[0]);
    }
}