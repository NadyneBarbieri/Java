package boardgame;

public class Position {
	private int row;
	private int column;

	public Position(int row, int colomn) {
		this.row = row;
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColomn(int column) {
		this.column = column;
	}

	@Override
	public String toString() {
		return  row + ", " + column;
	}
	
}
