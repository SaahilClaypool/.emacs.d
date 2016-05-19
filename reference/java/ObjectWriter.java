_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orbutil/ObjectWriter.java
    private static class IndentingObjectWriter extends ObjectWriter {

    /** Expected patterns:
    * startObject endObject( str )
    *   header( elem )\n
    * startObject ( startElement append* endElement ) * endObject
    *   header(\n
    *       append*\n *
    *   )\n
    */
