_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/PICurrent.java
    void setORBInitializing( boolean init ) {

    /**
     * Called from ORB when the ORBInitializers are about to start
     * initializing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/PICurrent.java
    void resetSlotTable( ) {

    /**
     * This method resets all the slot data to null in the
     * Slot Table which is on the top of SlotTableStack.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/PICurrent.java
    public Any get_slot( int id ) throws InvalidSlot

    /**
     * This method gets the slot data at the given slot id (index) from the
     * Slot Table which is on the top of the SlotTableStack.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/PICurrent.java
    public void set_slot( int id, Any data ) throws InvalidSlot

    /**
     * This method sets the slot data at the given slot id (index) in the
     * Slot Table which is on the top of the SlotTableStack.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/PICurrent.java
    void popSlotTable( ) {

    /**
     * This method pops a SlotTable on the SlotTableStack.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/PICurrent.java
    void pushSlotTable( ) {

    /**
     * This method pushes a SlotTable on the SlotTableStack. When there is
     * a resolve_initial_references("PICurrent") after this call. The new
     * PICurrent will be returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/PICurrent.java
    SlotTable getSlotTable( ) {

    /**
     * This method gets the SlotTable which is on the top of the
     * ThreadLocalStack.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/PICurrent.java
    int allocateSlotId( ) {

    /**
     * This method will be called from ORBInitInfo.allocate_slot_id( ).
     * simply returns a slot id by incrementing slotCounter.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/PICurrent.java
    PICurrent( ORB myORB ) {

    /**
     * PICurrent constructor which will be called for every ORB
     * initialization.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/PICurrent.java
public class PICurrent extends org.omg.CORBA.LocalObject

/**
 * PICurrent is the implementation of Current as specified in the Portable
 * Interceptors Spec orbos/99-12-02.
 * IMPORTANT: PICurrent is implemented with the assumption that get_slot()
 * or set_slot() will not be called in ORBInitializer.pre_init() and
 * post_init().
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/PICurrent.java
    void setORBInitializing( boolean init ) {

    /**
     * Called from ORB when the ORBInitializers are about to start
     * initializing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/PICurrent.java
    void resetSlotTable( ) {

    /**
     * This method resets all the slot data to null in the
     * Slot Table which is on the top of SlotTableStack.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/PICurrent.java
    public Any get_slot( int id ) throws InvalidSlot

    /**
     * This method gets the slot data at the given slot id (index) from the
     * Slot Table which is on the top of the SlotTableStack.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/PICurrent.java
    public void set_slot( int id, Any data ) throws InvalidSlot

    /**
     * This method sets the slot data at the given slot id (index) in the
     * Slot Table which is on the top of the SlotTableStack.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/PICurrent.java
    void popSlotTable( ) {

    /**
     * This method pops a SlotTable on the SlotTableStack.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/PICurrent.java
    void pushSlotTable( ) {

    /**
     * This method pushes a SlotTable on the SlotTableStack. When there is
     * a resolve_initial_references("PICurrent") after this call. The new
     * PICurrent will be returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/PICurrent.java
    SlotTable getSlotTable( ) {

    /**
     * This method gets the SlotTable which is on the top of the
     * ThreadLocalStack.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/PICurrent.java
    int allocateSlotId( ) {

    /**
     * This method will be called from ORBInitInfo.allocate_slot_id( ).
     * simply returns a slot id by incrementing slotCounter.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/PICurrent.java
    PICurrent( ORB myORB ) {

    /**
     * PICurrent constructor which will be called for every ORB
     * initialization.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/PICurrent.java
public class PICurrent extends org.omg.CORBA.LocalObject

/**
 * PICurrent is the implementation of Current as specified in the Portable
 * Interceptors Spec orbos/99-12-02.
 * IMPORTANT: PICurrent is implemented with the assumption that get_slot()
 * or set_slot() will not be called in ORBInitializer.pre_init() and
 * post_init().
 */
