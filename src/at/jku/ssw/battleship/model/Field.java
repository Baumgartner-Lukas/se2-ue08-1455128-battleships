package at.jku.ssw.battleship.model;

public class Field {
  private State grid[][];
  public Field(int size){
    if(size < 1)throw new IllegalArgumentException("Field size must be at least 1");
    grid = new State[size][size];
    for(int r = 0; r < size; r++){
      for(int c = 0; c < size; c++){
        grid[r][c] = State.FREE;
      }
    }
  }

  public State getState(int row, int column) {
    if((row > grid.length || row == -1) ||
            (column > grid.length || column == -1))return State.FREE;
    return grid[row][column];
  }

  public void setState(int row, int column, State newState){
    grid[row][column] = newState;
  }

  public int getSize() {
    return grid.length;
  }
}
