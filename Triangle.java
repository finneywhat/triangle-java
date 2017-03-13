import java.util.Arrays;

class Triangle {
  public int side1;
  public int side2;
  public int side3;

  public Triangle(int inputSide1, int inputSide2, int inputSide3) {
    side1 = inputSide1;
    side2 = inputSide2;
    side3 = inputSide3;
  }

  public boolean isTriangle() {
    int[] sides = {side1, side2, side3};
    Arrays.sort(sides);
    if (sides[0] + sides[1] <= sides[2]) {
      return false;
    } else {
      return true;
    }
  }

  public String triangleType() {
    String type;
    if (isTriangle()) {
      if (side1 == side2 && side2 == side3) {
        type = "an Equilateral triangle";
      } else if (side1 == side2 || side2 == side3 || side1 == side3) {
        type = "an Isosceles triangle";
      } else {
        type = "a Scalene triangle";
      }
    } else {
      type = "not a triangle";
    }
    return type;
  }
}
