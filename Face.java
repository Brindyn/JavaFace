// Brindyn Schultz
// Object-Oriented Programming

// Imported packages needed for Face Class
import java.awt.Color;
import java.util.Random;


// Face Class
class Face {
    public int width;
    public int height;
    public int x;
    public int y;
    public String smilingStatus;
    public Color eyeColor;
    // Used for the toString() function
    public Boolean printed = false;

    // Getters and Setters for member variables
    public int getWidth() {
        return width;
    }
    public void setWidth(int updatedWidth) {
        width = updatedWidth;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int updatedHeight) {
        height = updatedHeight;
    }
    public int getX() {
        return x;
    }
    public void setX(int updatedX) {
        x = updatedX;
    }
    public int getY() {
        return y;
    }
    public void setY(int updatedY) {
        y = updatedY;
    }
    public String getSmilingStatus() {
        return smilingStatus;
    }
    public void setSmilingStatus(String updatedSmilingStatus) {
        smilingStatus = updatedSmilingStatus;
    }
    public Color getEyeColor() {
        return eyeColor;
    }
    public void setEyeColor(Color updatedEyeColor) {
        eyeColor = updatedEyeColor;
    }
    // Prints all of the characteristics of the face to the console when a face is drawn.
    public void facesToString(int number, int xValue, int yValue, int widthValue, int heightValue, String smilingStatusValue){
        // Does not reprint characteristics when the window is resized.
        if (printed == false){
            System.out.println("Face "+number+" has an x value of "+xValue+", a y value of "+yValue+", a width of "+widthValue+", a height of "+heightValue+", and is a "+smilingStatusValue+" face.");
            printed = true;
        }
    }

	// Constructors (3 depending on how random you want the face to be)
    Face() { // random everything
        Random rand = new Random();
        // randomizes shape
        setWidth(rand.nextInt(150)+150); // ranges from 150-300 width
        setHeight(rand.nextInt(150)+150); // ranges from 150-300 height
        setX(rand.nextInt(500)); // ranges from 0-500 x
        setY(rand.nextInt(500)); // ranges from 0-500 y
        // randomize the smiling status
        switch(rand.nextInt(3)) {
            case 0:
                setSmilingStatus("Smiling");
                // 50-50 chance to be green or blue
                switch(rand.nextInt(2)) {
                    case 0:
                        setEyeColor(Color.GREEN);
                        break;
                    case 1:
                        setEyeColor(Color.BLUE);
                        break;
                }
                break;
            case 1:
                setSmilingStatus("Frowning");
                setEyeColor(Color.RED);
                break;
            case 2:
                setSmilingStatus("Neutral");
                setEyeColor(Color.YELLOW);
                break;
        }
    }
    Face(int faceWidth, int faceHeight, int faceX, int faceY) { // set height, width, x, and y
        Random rand = new Random();
        setWidth(faceWidth);
        setHeight(faceHeight);
        setX(faceX);
        setY(faceY);
        // randomize the smiling status
        switch(rand.nextInt(3)) {
            case 0:
                setSmilingStatus("Smiling");
                // 50-50 chance to be green or blue
                switch(rand.nextInt(2)) {
                    case 0:
                        setEyeColor(Color.GREEN);
                        break;
                    case 1:
                        setEyeColor(Color.BLUE);
                        break;
                }
                break;
            case 1:
                setSmilingStatus("Frowning");
                setEyeColor(Color.RED);
                break;
            case 2:
                setSmilingStatus("Neutral");
                setEyeColor(Color.YELLOW);
                break;
        }
    }
    Face(int faceWidth, int faceHeight, int faceX, int faceY, String faceSmilingStatus, Color faceEyeColor) { // no randomness
        setWidth(faceWidth);
        setHeight(faceHeight);
        setX(faceX);
        setY(faceY);
        setSmilingStatus(faceSmilingStatus);
        setEyeColor(faceEyeColor);
    }
}