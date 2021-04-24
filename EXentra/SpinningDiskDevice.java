public class SpinningDiskDevice 
{
   private int lastInput;
   private int segmentLength = 0;

   /**
      Constructs a spinning disk device.
   */
   public SpinningDiskDevice()
   {
      this.segmentLength = 0;
   }

   /**
      Processes a new input
      @param input 0 or 1
   */
   public void add(int input)
   {
	  if(input != lastInput)
	  {
		  segmentLength =1;
	  }
	  else
	  {
		  segmentLength++;
	  }
      lastInput = input;
   }

   /**
      Gets the length of the current segment.
   */
   public int getSegmentLength()
   {
      return segmentLength;
   }
}
