public class Rectangle {
	private int width, height;

	public Rectangle (){
		this(10,10);
	}
	public Rectangle(int width, int height){
		setHeight(height);
		setWidth(width);
	}
	public Rectangle(Rectangle other){
		this.height = other.height;
		this.width = other.width;
	}

	public boolean setHeight(int height) {
		if (height < 0) {
			return false;
		}else {
			this.height = height;
			return true;
		}
	}
	public boolean setWidth(int width) {
		if (width < 0 ) {
			return false;
		}else {
			this.width = width;
			return true;
		}
	}
	public int getHeight() {
		return height;
	}
	public int getWidth() {
		return width;
	}
	public int getScope(){
		return (width +height)*2;
	}
	public int getArea(){
		return  width*height;
	}
	public void rectangleShapeWithAsterisk(){
		rectangleShapeWithChar('*');
	}
	public void rectangleShapeWithChar(char ch){
		for (int i = 0; i < this.height; i++) {
			for (int j = 0; j < this.width; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
		System.out.println();
	}


}
//**** = i =  שורה נגיד 4
//**** = J = עמודה נגידה 3
//****
//  אורך * רוחב = P
//  H=אורך*2 רוחב*2