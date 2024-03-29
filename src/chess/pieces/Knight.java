package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Knight extends ChessPiece {

    public Knight(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "N";
    }

    private boolean canMove (Position position){
        ChessPiece temp = (ChessPiece) getBoard().piece(position);
        return temp == null || temp.getColor() != getColor();
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] matrix = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position temp = new Position(0,0);

        temp.setValues(position.getRow() - 1, position.getColumn() - 2);
        if (getBoard().positionExists(temp) && canMove(temp)){
            matrix[temp.getRow()][temp.getColumn()] = true;
        }

        temp.setValues(position.getRow() - 2, position.getColumn() - 1);
        if (getBoard().positionExists(temp) && canMove(temp)){
            matrix[temp.getRow()][temp.getColumn()] = true;
        }

        temp.setValues(position.getRow() - 2, position.getColumn() + 1);
        if (getBoard().positionExists(temp) && canMove(temp)){
            matrix[temp.getRow()][temp.getColumn()] = true;
        }

        temp.setValues(position.getRow() - 1, position.getColumn() + 2);
        if (getBoard().positionExists(temp) && canMove(temp)){
            matrix[temp.getRow()][temp.getColumn()] = true;
        }

        temp.setValues(position.getRow() + 1, position.getColumn() + 2);
        if (getBoard().positionExists(temp) && canMove(temp)){
            matrix[temp.getRow()][temp.getColumn()] = true;
        }

        temp.setValues(position.getRow() + 2, position.getColumn() + 1);
        if (getBoard().positionExists(temp) && canMove(temp)){
            matrix[temp.getRow()][temp.getColumn()] = true;
        }

        temp.setValues(position.getRow() + 2, position.getColumn() - 1);
        if (getBoard().positionExists(temp) && canMove(temp)){
            matrix[temp.getRow()][temp.getColumn()] = true;
        }

        temp.setValues(position.getRow() + 1, position.getColumn() - 2);
        if (getBoard().positionExists(temp) && canMove(temp)){
            matrix[temp.getRow()][temp.getColumn()] = true;
        }

        return matrix;
    }
}
