package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {

	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	//logica para verificar a peça adversaria
	protected boolean isThereOpponentPiece(Position posistion) {
		ChessPiece p = (ChessPiece)getBoard().piece(posistion);
		return p != null && p.getColor() != color;
	}
	
}
