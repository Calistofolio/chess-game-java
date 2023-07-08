package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	private Board board;
	private Integer turn;
	private Boolean check;
	private Boolean checkmate;
	private ChessPiece enPassantVunerable;
	private ChessPiece promoted;
	
	public ChessMatch() {
		board = new Board(8,8);
		initialSetup();
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
	
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition (column, row).toPosition());
	}

	public void initialSetup() {
		placeNewPiece('a', 1, new Rook(board, Color.WHITE));
		placeNewPiece('a', 8, new Rook(board, Color.BLACK));
		placeNewPiece('h', 1, new Rook(board, Color.WHITE));
		placeNewPiece('h', 8, new Rook(board, Color.BLACK));
		placeNewPiece('e', 8, new King(board, Color.BLACK));
		placeNewPiece('e', 1, new King(board, Color.WHITE));
	}
}
