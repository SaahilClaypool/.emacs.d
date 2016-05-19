_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/Map.java
        static DefaultRegionContainment  si = null;

        /** A global shared instance. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/Map.java
    static class DefaultRegionContainment implements RegionContainment {

    /**
     * An implementation that will return true if the x, y location is
     * inside a rectangle defined by origin 0, 0, and width equal to
     * width passed in, and height equal to height passed in.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/Map.java
        int           lastHeight;

        /** Last value of height passed in. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/Map.java
        int           lastWidth;

        /** Last value of width passed in. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/Map.java
        float[]       percentValues;

        /** Non-null indicates one of the values represents a percent. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/Map.java
        int           radiusSquared;

        /** Radius of the circle. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/Map.java
        int           y;

        /** Y origin of the circle. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/Map.java
        int           x;

        /** X origin of the circle. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/Map.java
    static class CircleRegionContainment implements RegionContainment {

    /**
     * Used to test for containment in a circular region.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/Map.java
        int               lastHeight;

        /** Last value of height passed in. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/Map.java
        int               lastWidth;

        /** Last value of width passed in. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/Map.java
        float[]           percentValues;

        /** If any value is a percent there will be an entry here for the
         * percent value. Use percentIndex to find out the index for it. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/Map.java
    static class PolygonRegionContainment extends Polygon implements

    /**
     * Used to test for containment in a polygon region.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/Map.java
        int           x1;

        /** Bottom right. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/Map.java
        int           x0;

        /** Top left. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/Map.java
        int           lastHeight;

        /** Last value of height passed in. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/Map.java
        int           lastWidth;

        /** Last value of width passed in. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/Map.java
        float[]       percents;

        /** Will be non-null if one of the values is a percent, and any value
         * that is non null indicates it is a percent
         * (order is x, y, width, height). */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/Map.java
    static class RectangleRegionContainment implements RegionContainment {

    /**
     * Used to test for containment in a rectangular region.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/Map.java
        public boolean contains(int x, int y, int width, int height);

        /**
         * Returns true if the location <code>x</code>, <code>y</code>
         * falls inside the region defined in the receiver.
         * <code>width</code>, <code>height</code> is the size of
         * the enclosing region.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/Map.java
    interface RegionContainment {

    /**
     * Defines the interface used for to check if a point is inside a
     * region.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/Map.java
    static protected int[] extractCoords(Object stringCoords) {

    /**
     * Creates and returns an array of integers from the String
     * <code>stringCoords</code>. If one of the values represents a
     * % the returned value with be negative. If a parse error results
     * from trying to parse one of the numbers null is returned.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/Map.java
    protected RegionContainment createRegionContainment

    /**
     * Creates and returns an instance of RegionContainment that can be
     * used to test if a particular point lies inside a region.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/Map.java
    public AttributeSet getArea(int x, int y, int width, int height) {

    /**
     * Returns the AttributeSet that contains the passed in location,
     * <code>x</code>, <code>y</code>. <code>width</code>, <code>height</code>
     * gives the size of the region the map is defined over. If a matching
     * area is found, the AttribueSet for it is returned.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/Map.java
    public AttributeSet[] getAreas() {

    /**
     * Returns the AttributeSets representing the differet areas of the Map.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/Map.java
    public void removeArea(AttributeSet as) {

    /**
     * Removes the previously created area.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/Map.java
    public void addArea(AttributeSet as) {

    /**
     * Defines a region of the Map, based on the passed in AttributeSet.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/Map.java
    public String getName() {

    /**
     * Returns the name of the Map.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/Map.java
    private Vector<RegionContainment>           areas;

    /** An array of RegionContainments, will slowly grow to match the
     * length of areaAttributes as needed. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/Map.java
    private Vector<AttributeSet>           areaAttributes;

    /** An array of AttributeSets. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/Map.java
    private String           name;

    /** Name of the Map. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/Map.java
class Map implements Serializable {

/**
 * Map is used to represent a map element that is part of an HTML document.
 * Once a Map has been created, and any number of areas have been added,
 * you can test if a point falls inside the map via the contains method.
 *
 * @author  Scott Violet
 */
