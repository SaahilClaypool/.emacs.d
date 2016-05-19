_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/encoding/CDROutputStream_1_0.java
    private void writeNestingLevel() {

    /**
     * Handles ORB versioning of the end tag.  Should only
     * be called if chunking.
     *
     * If talking to our older ORBs (Standard Extension,
     * Kestrel, and Ladybird), write the end flag that takes
     * into account all enclosing valuetypes.
     *
     * If talking a newer or foreign ORB, or if the orb
     * instance is null, write the end flag that only takes
     * into account the enclosing chunked valuetypes.
     */
