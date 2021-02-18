
class StringBufferDemo {
    /** Constructor. */
    protected StringBufferDemo() {
    }
    public StringBufferDemo(String string) {
		// TODO Auto-generated constructor stub
	}
	public static void main(final String []args) {

    	   StringBuffer buf = new StringBuffer("Java");
    	    buf.append(" Guide Ver1/"); // append // Java Guide Ver1/7
    	    buf.append(7);
    	    int index = 5;   // Insert  // Java Student Guide Ver1/7 
    	    buf.insert(index, "Student ");                               
    	    index = 6;      // Set  // Java Student Guide Ver1.7
    	    buf.setCharAt(index, '+');                                    
    	    int start = 24;   // Replace  // Java Student Guide Ver1.8
    	    int end = 25;
    	buf.replace(24, 25, "8");
    	//Convert to string
    	System.out.println(buf.toString());
    	   
    
    }
	
}