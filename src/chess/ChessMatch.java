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

	public void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(0,0));
		board.placePiece(new Rook(board, Color.WHITE), new Position(0,7));
		board.placePiece(new Rook(board, Color.WHITE), new Position(7,0));
		board.placePiece(new Rook(board, Color.WHITE), new Position(7,7));
		board.placePiece(new King(board, Color.BLACK), new Position(0,4));
		board.placePiece(new King(board, Color.BLACK), new Position(7,4));
	}
}
