_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/SlotTableStack.java
    SlotTable peekSlotTable( ) {

    /**
     * peekSlotTable gets the top SlotTable from the SlotTableStack without
     * popping.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/SlotTableStack.java
    void  popSlotTable( ) {

    /**
     * popSlotTable does the following
     * 1: pops the top SlotTable in the SlotTableStack
     *
     * 2: resets the slots in the SlotTable which resets the slotvalues to
     *    null if there are any previous sets.
     *
     * 3: puts the reset SlotTable into the SlotTablePool to reuse
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/SlotTableStack.java
    void pushSlotTable( ) {

    /**
     * pushSlotTable  pushes a fresh Slot Table on to the stack by doing the
     * following,
     * 1: Checks to see if there is any SlotTable in SlotTablePool
     *    If present then use that instance to push into the SlotTableStack
     *
     * 2: If there is no SlotTable in the pool, then creates a new one and
     *    pushes that into the SlotTableStack
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/SlotTableStack.java
    SlotTableStack( ORB orb, SlotTable table ) {

    /**
     * Constructs the stack and and SlotTablePool
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/SlotTableStack.java
        SlotTable getSlotTable( ) {

        /**
         * Gets SlotTable from the re-usable pool.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/SlotTableStack.java
        void putSlotTable( SlotTable table ) {

        /**
         * Puts SlotTable to the re-usable pool.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/SlotTableStack.java
public class SlotTableStack

/**
 * SlotTableStack is the container of SlotTable instances for each thread
 */
