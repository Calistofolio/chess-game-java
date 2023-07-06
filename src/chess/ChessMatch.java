package chess;

import boardgame.Board;

public class ChessMatch {
	private Board board;
	private Integer turn;
	private Boolean check;
	private Boolean checkmate;
	private ChessPiece enPassantVunerable;
	private ChessPiece promoted;
	
	public ChessMatch() {
		board = new Board(8,8);
	}

	public Integer getTurn() {
		return turn;
	}

	public Boolean getCheck() {
		return check;
	}


	public Boolean getCheckmate() {
		return checkmate;
	}


	public ChessPiece getEnPassantVunerable() {
		return enPassantVunerable;
	}


	public ChessPiece getPromoted() {
		return promoted;
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for(int i=0; i<board.getRows(); i++) {
			for(int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i,j);
			}
		}
		return mat;
	}

	
}
