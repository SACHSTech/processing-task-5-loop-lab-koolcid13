import processing.core.PApplet;

/**
* A program Sketch.java that implements the picture provided with 8 sections using nested loops
* @author: Avin A.
*
*/

public class Sketch extends PApplet {
	
  public void settings() {
	// dimensions of the window
    size(1200, 600);
  }

  public void setup() {
    // sets blue background
    background(45, 150, 207);
  }

  public void draw() {
	
    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();

  }


  
  // Draws the outlines for all sections

  public void draw_section_outlines() {
    stroke(0);
    noFill();

    // draw bottom row boxes
    rect(0,300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // draw top row boxes
    rect(0,0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  

  public void draw_section1(){
    int intX = 0;
    int intY = 0;

    // first for goes row by row and second for goes column by column
    for (int intRow = 0; intRow < 30; intRow ++) {
      for (int intColumn = 0; intColumn < 30; intColumn ++) {
        intX = 3 + intColumn * 10;  // adds 10 pixels to x coordinates
        intY = 300 + 3 + intRow * 10; // adds 10 pixels to y coordinates

        // sets colours
        fill(255);
        noStroke();
        // draws the square in white
        rect(intX, intY, 5, 5);

      }
    }
  }

  /**
   * Use the modulus operator and an if statement to select the color
   * Don't loop from 30 to 60 to shift everything over, just add 300 to x.
   */
  public void draw_section2(){
    int intX = 0;
    int intY = 0;

    // first for goes row by row and second for goes column by column
    for (int intRow = 0; intRow < 30; intRow ++) {
      for (int intColumn = 0; intColumn < 30; intColumn ++) {
        intX = 300 + 3 + intColumn * 10; // adds 10 pixels to x coordinates
        intY = 300 + 3 + intRow * 10; // adds 10 pixels to y coordinates
        
        // colour is set based on whether the column number (intColumn) is even or odd
        if (intColumn % 2 == 0) {
          fill(255);
        }
        else {
          fill (0);
        }

        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }

  /**
   * Use the modulus operator and an if/else statement to select the color.
   * Don't use multiple 'if' statements.
   */
  public void draw_section3(){
    int intX = 0;
    int intY = 0;

    // first for goes row by row and second for goes column by column
    for (int intRow = 0; intRow < 30; intRow ++) {
      for (int intColumn = 0; intColumn < 30; intColumn ++) {
        intX = 600 + 3 + intColumn * 10;
        intY = 300 + 3 + intRow * 10; 

        // colour is set based on whether the row number (intRow) is even or odd
        if (intRow % 2 == 0) {
          fill(0);
        }
        else {
          fill (255);
        }

        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }

  /**
   * Use the modulus operator and just one 'if' statement to select the color.
   */
  public void draw_section4(){
    int intX = 0;
    int intY = 0;

    // first for goes row by row and second for goes column by column
    for (int intRow = 0; intRow < 30; intRow ++) {
      for (int intColumn = 0; intColumn < 30; intColumn ++) {
        intX = 900 + 3 + intColumn * 10;
        intY = 300 + 3 + intRow * 10; 

        // colour is set based on the parity of the row and column numbers
        if (intRow % 2 == 1 && intColumn % 2 == 0) {
          fill(255);
        }
        else {
          fill (0);
        }

        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }

  /**
   * Do NOT use 'if' statements to complete 5-8. Manipulate the loops instead
   */
  public void draw_section5(){
    int intX = 0;
    int intY = 0;

    /**
     * first for sets the number of rows going from 0 to 29
     * second for goes from 0 to less than the row number (ex: 0-0, 0-1, 0-2, and so on)
     * goes row by row from top to bottow and right to left increasing the number of squares drawn in each row
     */
     for (int intRow = 0; intRow < 30; intRow ++) {
      for (int intColumn = 0; intColumn < intRow; intColumn ++) {
        // first square is drawn at the top right of the section
        intX = 300 - 8 - intColumn * 10; // subtracts 10 pixels from the x coordinates
        intY = 3 + intRow * 10; // adds 10 pixels to y coordinates
        
        fill (255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }

  public void draw_section6(){
    int intX = 0;
    int intY = 0;

    /**
     * first for sets the number of rows going from 1 to 30
     * second for goes from 0 to less than the row number (ex: 0-1, 0-2, and so on)
     * goes row by row from top to bottow and left to right increasing the number of squares drawn in each row
     */
    for (int intRow = 1; intRow <= 30; intRow ++) {
      for (int intColumn = 0; intColumn < intRow; intColumn ++) {
        // first square is drawn at the top left of the section
        intX = 300 + 3 + intColumn * 10; // adds 10 pixels to x coordinates
        intY = 3 + (intRow - 1) * 10; // adds 10 pixels to y coordinates
        
        fill (255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }

  public void draw_section7(){
    int intX = 0;
    int intY = 0;

    /**
     * first for sets the number of rows going from 1 to 30
     * second for goes from 0 to less than the row number (ex: 0-1, 0-2, and so on)
     * goes row by row from bottow to top and left to right increasing the number of squares drawn in each row
     */
    for (int intRow = 1; intRow <= 30; intRow ++) {
      for (int intColumn = 0; intColumn < intRow; intColumn ++) {
        // first square is drawn at the bottom left of the section
        intX = 600 + 3 + intColumn * 10; // adds 10 pixels to x coordinates
        intY = 300 - 8 - (intRow - 1) * 10; // subtracts 10 pixels from y coordinates
        
        fill (255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }
  
  public void draw_section8(){
    int intX = 0;
    int intY = 0;

    /**
     * first for sets the number of rows going from 1 to 30
     * second for goes from 0 to less than the row number (ex: 0-1, 0-2, and so on)
     * goes row by row from bottow to top and right to left increasing the number of squares drawn in each row
     */
    for (int intRow = 1; intRow <= 30; intRow ++) {
      for (int intColumn = 0; intColumn < intRow; intColumn ++) {
        // first square is drawn at the bottom right of the section
        intX = 1200 - 8 - intColumn * 10; // subtracts 10 pixels from the x coordinates
        intY = 300 - 8 - (intRow - 1) * 10; // subtracts 10 pixels from the y coordinates
        
        fill (255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }

}