/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
	
	public static void testRotateRight() {
		
		Picture temple = new Picture("temple.jpg");
		temple.explore();
		temple.rotateRight();
		temple.explore();
	}
	
	public static void testGetLargestRGBForColumn(int col) {
		
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		int[] rgbArray = beach.getLargestRGBForColumn(col);
		System.out.println("Largest Red "+rgbArray[0]);
		System.out.println("Largest Green "+rgbArray[1]);
		System.out.println("Largest Blue "+rgbArray[2]);

	}
	
	public static void testSecondEdgeDetection()
	  {
	    Picture swan = new Picture("myImage.jpg");
	    swan.secondEdgeDetection(10);
	    swan.explore();
	  }
	
	 public static void testMyCollage()
	  {
	    Picture canvas = new Picture("moon-surface.jpg");
	    canvas.myCollage();
	    canvas.explore();
	  }
	
	public static void testSecondCopy()
	  {
		 Picture seagull = new Picture("seagull.jpg");
		    seagull.explore();
		    seagull.secondCopy(seagull, 0, 0, 234, 324, 240, 343);
		    seagull.explore();
	  }
	
	public static void testMirrorGull()
	  {
		 Picture seagull = new Picture("seagull.jpg");
		    seagull.explore();
		    seagull.mirrorGull();
		    seagull.explore();
	  }
	
	public static void testMirrorArms()
	  {
		 Picture snowman = new Picture("snowman.jpg");
		    snowman.explore();
		    snowman.mirrorArms();
		    snowman.explore();
	  }
	
	public static void testMirrorDiagnol()
	  {
		 Picture beach = new Picture("beach.jpg");
		    beach.explore();
		    beach.mirrorDiagnol();
		    beach.explore();
	  }
	
	public static void testMirrorHorizontalBotToTop()
	  {
		 Picture redMotorcycle = new Picture("redMotorcycle.jpg");
		    redMotorcycle.explore();
		    redMotorcycle.mirrorHorizontalBotToTop();
		    redMotorcycle.explore();
	  }
	
	public static void testMirrorHorizontal()
	  {
		 Picture redMotorcycle = new Picture("redMotorcycle.jpg");
		    redMotorcycle.explore();
		    redMotorcycle.mirrorHorizontal();
		    redMotorcycle.explore();
	  }
	
	public static void testMirrorVerticalRightToLeft()
	  {
		 Picture redMotorcycle = new Picture("redMotorcycle.jpg");
		    redMotorcycle.explore();
		    redMotorcycle.mirrorVertical();
		    redMotorcycle.explore();
	  }
	
	public static void testFixUnderwater()
	  {
	    Picture water = new Picture("water.jpg");
	    water.explore();
	    water.fixUnderwater();
	    water.explore();
	  }
	
	public static void testGreyScale()
	  {
	    Picture beach = new Picture("beach.jpg");
	    beach.explore();
	    beach.greyScale();
	    beach.explore();
	  }
	
	public static void testNegate()
	  {
	    Picture beach = new Picture("beach.jpg");
	    beach.explore();
	    beach.negate();
	    beach.explore();
	  }
	
	public static void testKeepOnlyBlue()
	  {
	    Picture beach = new Picture("beach.jpg");
	    beach.explore();
	    beach.keepOnlyBlue();
	    beach.explore();
	  }
	
	public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
	 // testRotateRight();
	testGetLargestRGBForColumn(55);
	//testSecondEdgeDetection();
	//testMyCollage();  
	//testSecondCopy();
	//testMirrorGull();
	//testMirrorArms();
	//testMirrorDiagnol();
	//testMirrorHorizontalBotToTop();
	//testMirrorHorizontal();
	//testMirrorVerticalRightToLeft();
	//testFixUnderwater();
	// testGreyScale();
	// testNegate();
	// testKeepOnlyBlue();
	// testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
	//testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}