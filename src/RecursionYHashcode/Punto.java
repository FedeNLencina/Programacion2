package RecursionYHashcode;

public class Punto {
	private int x;
	private int y;

	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}

//	public boolean equals(Punto other) {
//		return (other!=null && this.getX() == other.getX()
//							&& this.getY() == other.getY());
//	}

	
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}


	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj != null && obj.getClass() == this.getClass()) {
			Punto other = (Punto) obj;
			result = (this.getX() == other.getX() && this.getY() == other.getY());
		}
		return result;
	}

	@Override
	public int hashCode() {
		return (41 * (41 + getX()) + getY());
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}

}
