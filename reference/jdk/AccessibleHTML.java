_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
    private class DocumentHandler implements DocumentListener {

    /**
     * DocumentListener installed on the current Document.  Will invoke
     * <code>update</code> on the <code>RootInfo</code> in response to
     * any event.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        protected void invalidate(boolean first) {

        /**
         * Invalidates the ElementInfo. Subclasses should override this
         * if they need to reset state once invalid.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        protected boolean validateIfNecessary() {

        /**
         * Validates the ElementInfo if necessary.  Some ElementInfos may
         * never be valid again.  You should check <code>isValid</code> before
         * using one.  This will reload the children and invoke
         * <code>validate</code> if the ElementInfo is invalid and can become
         * valid again. This will return true if the receiver is valid.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        protected int getIntAttr(AttributeSet attrs, Object key, int deflt) {

        /**
         * Convenience method for getting an integer attribute from the passed
         * in AttributeSet.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        protected AttributeSet getViewAttributes() {

        /**
         * Returns the AttributeSet associated with the View that is
         * representing this Element, this will
         * return null if the ElementInfo can't be validated.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        protected AttributeSet getAttributes() {

        /**
         * Returns the AttributeSet associated with the Element, this will
         * return null if the ElementInfo can't be validated.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        protected boolean isValid() {

        /**
         * Returns true if this ElementInfo is valid.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        public Rectangle getBounds() {

        /**
         * Returns the Bounds for this ElementInfo, or null
         * if the ElementInfo can't be validated.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        protected View getView() {

        /**
         * Returns the View corresponding to this ElementInfo, or null
         * if the ElementInfo can't be validated.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        protected void addChild(ElementInfo child) {

        /**
         * Adds a new child to this ElementInfo.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        public int getChildCount() {

        /**
         * Returns the number of children the ElementInfo contains.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        public ElementInfo getChild(int index) {

        /**
         * Returns the child ElementInfo at <code>index</code>, or null
         * if <code>index</code> isn't a valid index.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        public int indexOf(ElementInfo child) {

        /**
         * Returns the index of the specified child, or -1 if
         * <code>child</code> isn't a valid child.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        public ElementInfo getParent() {

        /**
         * Returns the parent of this Element, or null for the root.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        public Element getElement() {

        /**
         * Returns the Element this <code>ElementInfo</code> represents.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        public int getIndexInParent() {

        /**
         * Returns the index of the child in the parent, or -1 for the
         * root or if the parent isn't valid.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        protected void loadChildren(Element parent) {

        /**
         * Recreates the direct children of <code>info</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        protected void validate() {

        /**
         * Validates the receiver. This recreates the children as well. This
         * will be invoked within a <code>readLock</code>. If this is overriden
         * it MUST invoke supers implementation first!
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        ElementInfo(Element element, ElementInfo parent) {

        /**
         * Creates an ElementInfo representing <code>element</code> with
         * the specified parent.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        ElementInfo(Element element) {

        /**
         * Creates the root ElementInfo.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        private boolean canBeValid;

        /**
         * Indicates if the ElementInfo can become valid.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        private ElementInfo parent;

        /**
         * The parent ElementInfo, will be null for the root.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        private ArrayList<ElementInfo> children;

        /**
         * The children of this ElementInfo.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
    private class ElementInfo {

    /**
     * ElementInfo provides a slim down view of an Element.  Each ElementInfo
     * can have any number of child ElementInfos that are not necessarily
     * direct children of the Element. As the Document changes various
     * ElementInfos become invalidated. Before accessing a particular portion
     * of an ElementInfo you should make sure it is valid by invoking
     * <code>validateIfNecessary</code>, this will return true if
     * successful, on the other hand a false return value indicates the
     * ElementInfo is not valid and can never become valid again (usually
     * the result of the Element the ElementInfo encapsulates being removed).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            protected void invalidate(boolean first) {

            /**
             * Overriden to invalidate the TableRowElementInfo as well as
             * the TableCellElementInfo.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public int getColumnCount() {

            /**
             * Returns the colspan attribute.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public int getRowCount() {

            /**
             * Returns the rowspan attribute.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        private class TableCellElementInfo extends ElementInfo {

        /**
         * TableCellElementInfo is used to represents the cells of
         * the table.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            private int getColumnCount(int rowspan) {

            /**
             * Returns the column count of the number of columns that have
             * a rowcount >= rowspan.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            private void updateGrid(int row) {

            /**
             * Places the TableCellElementInfos for this element in
             * the grid.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            protected void invalidate(boolean first) {

            /**
             * Overriden to invalidate the table as well as
             * TableRowElementInfo.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public int getColumnCount() {

            /**
             * Returns the sum of the column spans of the individual
             * cells in this row.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public int getRowCount() {

            /**
             * Returns the max of the rowspans of the cells in this row.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
                public int [] getSelectedAccessibleColumns() {

                /**
                 * Returns the selected columns in a table.
                 *
                 * @return an array of selected columns where each element is a
                 * zero-based column of the table
                 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
                public int [] getSelectedAccessibleRows() {

                /**
                 * Returns the selected rows in a table.
                 *
                 * @return an array of selected rows where each element is a
                 * zero-based row of the table
                 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
                public boolean isAccessibleColumnSelected(int c) {

                /**
                 * Returns a boolean value indicating whether the specified column
                 * is selected.
                 *
                 * @param c zero-based column of the table
                 * @return the boolean value true if the specified column is selected.
                 * Otherwise, false.
                 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
                public boolean isAccessibleRowSelected(int r) {

                /**
                 * Returns a boolean value indicating whether the specified row
                 * is selected.
                 *
                 * @param r zero-based row of the table
                 * @return the boolean value true if the specified row is selected.
                 * Otherwise, false.
                 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
                public boolean isAccessibleSelected(int r, int c) {

                /**
                 * Returns a boolean value indicating whether the accessible at
                 * a specified row and column is selected.
                 *
                 * @param r zero-based row of the table
                 * @param c zero-based column of the table
                 * @return the boolean value true if the accessible at the
                 * row and column is selected. Otherwise, the boolean value
                 * false
                 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
                public void setAccessibleColumnDescription(int c, Accessible a) {

                /**
                 * Sets the description text of the specified column in the table.
                 *
                 * @param c zero-based column of the table
                 * @param a the text description of the column
                 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
                public Accessible getAccessibleColumnDescription(int c) {

                /**
                 * Returns the description text of the specified column in the table.
                 *
                 * @param c zero-based column of the table
                 * @return the text description of the column
                 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
                public void setAccessibleRowDescription(int r, Accessible a) {

                /**
                 * Sets the description text of the specified row of the table.
                 *
                 * @param r zero-based row of the table
                 * @param a the description of the row
                 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
                public Accessible getAccessibleRowDescription(int r) {

                /**
                 * Returns the description of the specified row in the table.
                 *
                 * @param r zero-based row of the table
                 * @return the description of the row
                 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
                public void setAccessibleColumnHeader(AccessibleTable table) {

                /**
                 * Sets the column headers.
                 *
                 * @param table an AccessibleTable representing the
                 * column headers
                 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
                public AccessibleTable getAccessibleColumnHeader() {

                /**
                 * Returns the column headers as an AccessibleTable.
                 *
                 * @return an AccessibleTable representing the column
                 * headers
                 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
                public void setAccessibleRowHeader(AccessibleTable table) {

                /**
                 * Sets the row headers.
                 *
                 * @param table an AccessibleTable representing the
                 * row headers
                 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
                public AccessibleTable getAccessibleRowHeader() {

                /**
                 * Returns the row headers as an AccessibleTable.
                 *
                 * @return an AccessibleTable representing the row
                 * headers
                 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
                public int getAccessibleColumnExtentAt(int r, int c) {

                /**
                 * Returns the number of columns occupied by the Accessible at
                 * a specified row and column in the table.
                 *
                 * @return the number of columns occupied by the Accessible at a
                 * given specified row and column
                 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
                public int getAccessibleRowExtentAt(int r, int c) {

                /**
                 * Returns the number of rows occupied by the Accessible at
                 * a specified row and column in the table.
                 *
                 * @return the number of rows occupied by the Accessible at a
                 * given specified (row, column)
                 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
                public Accessible getAccessibleAt(int r, int c) {

                /**
                 * Returns the Accessible at a specified row and column
                 * in the table.
                 *
                 * @param r zero-based row of the table
                 * @param c zero-based column of the table
                 * @return the Accessible at the specified row and column
                 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
                public int getAccessibleColumnCount() {

                /**
                 * Returns the number of columns in the table.
                 *
                 * @return the number of columns in the table
                 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
                public int getAccessibleRowCount() {

                /**
                 * Returns the number of rows in the table.
                 *
                 * @return the number of rows in the table
                 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
                public void setAccessibleSummary(Accessible a) {

                /**
                 * Sets the summary description of the table
                 *
                 * @param a the summary description of the table
                 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
                public Accessible getAccessibleSummary() {

                /**
                 * Returns the summary description of the table.
                 *
                 * @return the summary description of the table
                 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
                public void setAccessibleCaption(Accessible a) {

                /**
                 * Sets the caption for the table.
                 *
                 * @param a the caption for the table
                 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
                public Accessible getAccessibleCaption() {

                /**
                 * Returns the caption for the table.
                 *
                 * @return the caption for the table
                 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public String getAccessibleColumnHeader(int c) {

            /**
             * Returns the column header at a column in a table.
             * @param c zero-based column of the table
             *
             * @return a String representing the column header
             * if one exists; otherwise null.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public String getAccessibleRowHeader(int r) {

            /**
             * Returns the row header at a row in a table.
             * @param r zero-based row of the table
             *
             * @return a String representing the row header
             * if one exists; otherwise null.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public int getAccessibleIndex(int r, int c) {

            /**
             * Returns the index at a row and column in the table.
             *
             * @param r zero-based row of the table
             * @param c zero-based column of the table
             * @return the zero-based index in the table if one exists;
             * otherwise -1.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public int getAccessibleColumn(int index) {

            /**
             * Returns the column number of an index in the table.
             *
             * @param index the zero-based index in the table
             * @return the zero-based column of the table if one exists;
             * otherwise -1.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public int getAccessibleRow(int index) {

            /**
             * Returns the row number of an index in the table.
             *
             * @param index the zero-based index in the table
             * @return the zero-based row of the table if one exists;
             * otherwise -1.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public int [] getSelectedAccessibleColumns() {

            /**
             * Returns the selected columns in a table.
             *
             * @return an array of selected columns where each element is a
             * zero-based column of the table
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public int [] getSelectedAccessibleRows() {

            /**
             * Returns the selected rows in a table.
             *
             * @return an array of selected rows where each element is a
             * zero-based row of the table
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public boolean isAccessibleColumnSelected(int c) {

            /**
             * Returns a boolean value indicating whether the specified column
             * is selected.
             *
             * @param c zero-based column of the table
             * @return the boolean value true if the specified column is selected.
             * Otherwise, false.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public boolean isAccessibleRowSelected(int r) {

            /**
             * Returns a boolean value indicating whether the specified row
             * is selected.
             *
             * @param r zero-based row of the table
             * @return the boolean value true if the specified row is selected.
             * Otherwise, false.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public boolean isAccessibleSelected(int r, int c) {

            /**
             * Returns a boolean value indicating whether the accessible at
             * a specified row and column is selected.
             *
             * @param r zero-based row of the table
             * @param c zero-based column of the table
             * @return the boolean value true if the accessible at the
             * row and column is selected. Otherwise, the boolean value
             * false
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public void setAccessibleColumnDescription(int c, Accessible a) {

            /**
             * Sets the description text of the specified column in the table.
             *
             * @param c zero-based column of the table
             * @param a the text description of the column
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public Accessible getAccessibleColumnDescription(int c) {

            /**
             * Returns the description text of the specified column in the table.
             *
             * @param c zero-based column of the table
             * @return the text description of the column
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public void setAccessibleRowDescription(int r, Accessible a) {

            /**
             * Sets the description text of the specified row of the table.
             *
             * @param r zero-based row of the table
             * @param a the description of the row
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public Accessible getAccessibleRowDescription(int r) {

            /**
             * Returns the description of the specified row in the table.
             *
             * @param r zero-based row of the table
             * @return the description of the row
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public void setAccessibleColumnHeader(AccessibleTable table) {

            /**
             * Sets the column headers.
             *
             * @param table an AccessibleTable representing the
             * column headers
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public AccessibleTable getAccessibleColumnHeader() {

            /**
             * Returns the column headers as an AccessibleTable.
             *
             * @return an AccessibleTable representing the column
             * headers
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public void setAccessibleRowHeader(AccessibleTable table) {

            /**
             * Sets the row headers.
             *
             * @param table an AccessibleTable representing the
             * row headers
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public AccessibleTable getAccessibleRowHeader() {

            /**
             * Returns the row headers as an AccessibleTable.
             *
             * @return an AccessibleTable representing the row
             * headers
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public int getAccessibleColumnExtentAt(int r, int c) {

            /**
             * Returns the number of columns occupied by the Accessible at
             * a specified row and column in the table.
             *
             * @return the number of columns occupied by the Accessible at a
             * given specified row and column
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public int getAccessibleRowExtentAt(int r, int c) {

            /**
             * Returns the number of rows occupied by the Accessible at
             * a specified row and column in the table.
             *
             * @return the number of rows occupied by the Accessible at a
             * given specified (row, column)
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public Accessible getAccessibleAt(int r, int c) {

            /**
             * Returns the Accessible at a specified row and column
             * in the table.
             *
             * @param r zero-based row of the table
             * @param c zero-based column of the table
             * @return the Accessible at the specified row and column
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public int getAccessibleColumnCount() {

            /**
             * Returns the number of columns in the table.
             *
             * @return the number of columns in the table
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public int getAccessibleRowCount() {

            /**
             * Returns the number of rows in the table.
             *
             * @return the number of rows in the table
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public void setAccessibleSummary(Accessible a) {

            /**
             * Sets the summary description of the table
             *
             * @param a the summary description of the table
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public Accessible getAccessibleSummary() {

            /**
             * Returns the summary description of the table.
             *
             * @return the summary description of the table
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public void setAccessibleCaption(Accessible a) {

            /**
             * Sets the caption for the table.
             *
             * @param a the caption for the table
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public Accessible getAccessibleCaption() {

            /**
             * Returns the caption for the table.
             *
             * @return the caption for the table
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public Accessible getAccessibleChild(int i) {

            /**
             * Returns the specified Accessible child of the object.  The Accessible
             * children of an Accessible object are zero-based, so the first child
             * of an Accessible child is at index 0, the second child is at index 1,
             * and so on.
             *
             * @param i zero-based index of child
             * @return the Accessible child of the object
             * @see #getAccessibleChildrenCount
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public int getAccessibleChildrenCount() {

            /**
             * Returns the number of accessible children of the object.
             *
             * @return the number of accessible children of the object.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public int getAccessibleIndexInParent() {

            /**
             * Gets the 0-based index of this object in its accessible parent.
             *
             * @return the 0-based index of this object in its parent; -1 if this
             * object does not have an accessible parent.
             *
             * @see #getAccessibleParent
             * @see #getAccessibleChildrenCount
             * @gsee #getAccessibleChild
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public AccessibleRole getAccessibleRole() {

            /**
             * Gets the role of this object.  The role of the object is the generic
             * purpose or use of the class of this object.  For example, the role
             * of a push button is AccessibleRole.PUSH_BUTTON.  The roles in
             * AccessibleRole are provided so component developers can pick from
             * a set of predefined roles.  This enables assistive technologies to
             * provide a consistent interface to various tweaked subclasses of
             * components (e.g., use AccessibleRole.PUSH_BUTTON for all components
             * that act like a push button) as well as distinguish between subclasses
             * that behave differently (e.g., AccessibleRole.CHECK_BOX for check boxes
             * and AccessibleRole.RADIO_BUTTON for radio buttons).
             * <p>Note that the AccessibleRole class is also extensible, so
             * custom component developers can define their own AccessibleRole's
             * if the set of predefined roles is inadequate.
             *
             * @return an instance of AccessibleRole describing the role of the object
             * @see AccessibleRole
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public String getAccessibleDescription() {

            /**
             * Gets the accessibleDescription property of this object.  If this
             * property isn't set, returns the content type of this
             * <code>JEditorPane</code> instead (e.g. "plain/text", "html/text").
             *
             * @return the localized description of the object; <code>null</code>
             *  if this object does not have a description
             *
             * @see #setAccessibleName
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public String getAccessibleName() {

            /**
             * Gets the accessibleName property of this object.  The accessibleName
             * property of an object is a localized String that designates the purpose
             * of the object.  For example, the accessibleName property of a label
             * or button might be the text of the label or button itself.  In the
             * case of an object that doesn't display its name, the accessibleName
             * should still be set.  For example, in the case of a text field used
             * to enter the name of a city, the accessibleName for the en_US locale
             * could be 'city.'
             *
             * @return the localized name of the object; null if this
             * object does not have a name
             *
             * @see #setAccessibleName
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        public int getColumnCount() {

        /**
         * Returns the number of columns in the table.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        public int getRowCount() {

        /**
         * Returns the number of rows in the table.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        public int getColumnExtentAt(int r, int c) {

        /**
         * Returns the colspan of the specified entry.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        public int getRowExtentAt(int r, int c) {

        /**
         * Returns the rowspan of the specified entry.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        public TableCellElementInfo getCell(int r, int c) {

        /**
         * Returns the TableCellElementInfo by row and column.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        public TableRowElementInfo getRow(int index) {

        /**
         * Returns the TableCellElementInfo at the specified index.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        private void updateGrid() {

        /**
         * Updates the grid.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        protected void loadChildren(Element e) {

        /**
         * Overriden to only alloc instances of TableRowElementInfos.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        protected void validate() {

        /**
         * Overriden to update the grid when validating.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        private TableCellElementInfo[][] grid;

        /**
         * Allocation of the table by row x column. There may be holes (eg
         * nulls) depending upon the html, any cell that has a rowspan/colspan
         * > 1 will be contained multiple times in the grid.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
    private class TableElementInfo extends ElementInfo

    /**
     * TableElementInfo encapsulates information about a HTML.Tag.TABLE.
     * To make access fast it crates a grid containing the children to
     * allow for access by row, column. TableElementInfo will contain
     * TableRowElementInfos, which will contain TableCellElementInfos.
     * Any time one of the rows or columns becomes invalid the table is
     * invalidated.  This is because any time one of the child attributes
     * changes the size of the grid may have changed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public int getAccessibleIconHeight() {

            /**
             * Gets the height of the icon
             *
             * @return the height of the icon.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public int getAccessibleIconWidth() {

            /**
             * Gets the width of the icon
             *
             * @return the width of the icon.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public void setAccessibleIconDescription(String description) {

            /**
             * Sets the description of the icon.  This is meant to be a brief
             * textual description of the object.  For example, it might be
             * presented to a blind user to give an indication of the purpose
             * of the icon.
             *
             * @param description the description of the icon
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public String getAccessibleIconDescription() {

            /**
             * Gets the description of the icon.  This is meant to be a brief
             * textual description of the object.  For example, it might be
             * presented to a blind user to give an indication of the purpose
             * of the icon.
             *
             * @return the description of the icon
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public AccessibleRole getAccessibleRole() {

            /**
             * Gets the role of this object.  The role of the object is the generic
             * purpose or use of the class of this object.  For example, the role
             * of a push button is AccessibleRole.PUSH_BUTTON.  The roles in
             * AccessibleRole are provided so component developers can pick from
             * a set of predefined roles.  This enables assistive technologies to
             * provide a consistent interface to various tweaked subclasses of
             * components (e.g., use AccessibleRole.PUSH_BUTTON for all components
             * that act like a push button) as well as distinguish between subclasses
             * that behave differently (e.g., AccessibleRole.CHECK_BOX for check boxes
             * and AccessibleRole.RADIO_BUTTON for radio buttons).
             * <p>Note that the AccessibleRole class is also extensible, so
             * custom component developers can define their own AccessibleRole's
             * if the set of predefined roles is inadequate.
             *
             * @return an instance of AccessibleRole describing the role of the object
             * @see AccessibleRole
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public String getAccessibleDescription() {

            /**
             * Gets the accessibleDescription property of this object.  If this
             * property isn't set, returns the content type of this
             * <code>JEditorPane</code> instead (e.g. "plain/text", "html/text").
             *
             * @return the localized description of the object; <code>null</code>
             *  if this object does not have a description
             *
             * @see #setAccessibleName
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public String getAccessibleName() {

            /**
             * Gets the accessibleName property of this object.  The accessibleName
             * property of an object is a localized String that designates the purpose
             * of the object.  For example, the accessibleName property of a label
             * or button might be the text of the label or button itself.  In the
             * case of an object that doesn't display its name, the accessibleName
             * should still be set.  For example, in the case of a text field used
             * to enter the name of a city, the accessibleName for the en_US locale
             * could be 'city.'
             *
             * @return the localized name of the object; null if this
             * object does not have a name
             *
             * @see #setAccessibleName
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public String getSelectedText() {

            /**
             * Returns the portion of the text that is selected.
             *
             * @return the String portion of the text that is selected
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public int getSelectionEnd() {

            /**
             * Returns the end offset within the selected text.
             * If there is no selection, but there is
             * a caret, the start and end offsets will be the same.
             *
             * @return the index into the text of the end of the selection
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public int getSelectionStart() {

            /**
             * Returns the start offset within the selected text.
             * If there is no selection, but there is
             * a caret, the start and end offsets will be the same.
             *
             * @return the index into the text of the start of the selection
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public AttributeSet getCharacterAttribute(int i) {

            /**
             * Return the AttributeSet for a given character at a given index
             *
             * @param i the zero-based index into the text
             * @return the AttributeSet of the character
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            private IndexedSegment getSegmentAt(int part, int index)

            /**
             * Returns the Segment at <code>index</code> representing either
             * the paragraph or sentence as identified by <code>part</code>, or
             * null if a valid paragraph/sentence can't be found. The offset
             * will point to the start of the word/sentence in the array, and
             * the modelOffset will point to the location of the word/sentence
             * in the model.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            private String getAtIndex(int part, int index, int direction) {

            /**
             * Gets the word, sentence, or character at <code>index</code>.
             * If <code>direction</code> is non-null this will find the
             * next/previous word/sentence/character.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            private class IndexedSegment extends Segment {

            /**
             * IndexedSegment extends Segment adding the offset into the
             * the model the <code>Segment</code> was asked for.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public int getCaretPosition() {

            /**
             * Return the zero-based offset of the caret.
             *
             * Note: That to the right of the caret will have the same index
             * value as the offset (the caret is between two characters).
             * @return the zero-based offset of the caret.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public int getCharCount() {

            /**
             * Return the number of characters (valid indicies)
             *
             * @return the number of characters
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public Rectangle getCharacterBounds(int i) {

            /**
             * Determine the bounding box of the character at the given
             * index into the string.  The bounds are returned in local
             * coordinates.  If the index is invalid an empty rectangle is
             * returned.
             *
             * @param i the index into the String
             * @return the screen coordinates of the character's the bounding box,
             * if index is invalid returns an empty rectangle.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public int getIndexAtPoint(Point p) {

            /**
             * Given a point in local coordinates, return the zero-based index
             * of the character under that Point.  If the point is invalid,
             * this method returns -1.
             *
             * @param p the Point in local coordinates
             * @return the zero-based index of the character under Point p; if
             * Point is invalid returns -1.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public AccessibleRole getAccessibleRole() {

            /**
             * Gets the role of this object.  The role of the object is the generic
             * purpose or use of the class of this object.  For example, the role
             * of a push button is AccessibleRole.PUSH_BUTTON.  The roles in
             * AccessibleRole are provided so component developers can pick from
             * a set of predefined roles.  This enables assistive technologies to
             * provide a consistent interface to various tweaked subclasses of
             * components (e.g., use AccessibleRole.PUSH_BUTTON for all components
             * that act like a push button) as well as distinguish between subclasses
             * that behave differently (e.g., AccessibleRole.CHECK_BOX for check boxes
             * and AccessibleRole.RADIO_BUTTON for radio buttons).
             * <p>Note that the AccessibleRole class is also extensible, so
             * custom component developers can define their own AccessibleRole's
             * if the set of predefined roles is inadequate.
             *
             * @return an instance of AccessibleRole describing the role of the object
             * @see AccessibleRole
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public String getAccessibleDescription() {

            /**
             * Gets the accessibleDescription property of this object.  If this
             * property isn't set, returns the content type of this
             * <code>JEditorPane</code> instead (e.g. "plain/text", "html/text").
             *
             * @return the localized description of the object; <code>null</code>
             *  if this object does not have a description
             *
             * @see #setAccessibleName
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
            public String getAccessibleName() {

            /**
             * Gets the accessibleName property of this object.  The accessibleName
             * property of an object is a localized String that designates the purpose
             * of the object.  For example, the accessibleName property of a label
             * or button might be the text of the label or button itself.  In the
             * case of an object that doesn't display its name, the accessibleName
             * should still be set.  For example, in the case of a text field used
             * to enter the name of a city, the accessibleName for the en_US locale
             * could be 'city.'
             *
             * @return the localized name of the object; null if this
             * object does not have a name
             *
             * @see #setAccessibleName
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        public void removeFocusListener(FocusListener l) {

        /**
         * Removes the specified focus listener so it no longer receives focus
         * events from this component.
         *
         * @param l the focus listener
         * @see #addFocusListener
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        public void addFocusListener(FocusListener l) {

        /**
         * Adds the specified focus listener to receive focus events from this
         * component.
         *
         * @param l the focus listener
         * @see #removeFocusListener
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        public void requestFocus() {

        /**
         * Requests focus for this object.  If this object cannot accept focus,
         * nothing will happen.  Otherwise, the object will attempt to take
         * focus.
         * @see #isFocusTraversable
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        public boolean isFocusTraversable() {

        /**
         * Returns whether this object can accept focus or not.   Objects that
         * can accept focus will also have the AccessibleState.FOCUSABLE state
         * set in their AccessibleStateSets.
         *
         * @return true if object can accept focus; otherwise false
         * @see AccessibleContext#getAccessibleStateSet
         * @see AccessibleState#FOCUSABLE
         * @see AccessibleState#FOCUSED
         * @see AccessibleStateSet
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        public Accessible getAccessibleAt(Point p) {

        /**
         * Returns the Accessible child, if one exists, contained at the local
         * coordinate Point.
         *
         * @param p The point relative to the coordinate system of this object.
         * @return the Accessible, if it exists, at the specified location;
         * otherwise null
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        public void setSize(Dimension d) {

        /**
         * Resizes this object so that it has width and height.
         *
         * @param d The dimension specifying the new size of the object.
         * @see #getSize
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        public Dimension getSize() {

        /**
         * Returns the size of this object in the form of a Dimension object.
         * The height field of the Dimension object contains this object's
         * height, and the width field of the Dimension object contains this
         * object's width.
         *
         * @return A Dimension object that indicates the size of this component;
         * null if this object is not on the screen
         * @see #setSize
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        public void setBounds(Rectangle r) {

        /**
         * Sets the bounds of this object in the form of a Rectangle object.
         * The bounds specify this object's width, height, and location
         * relative to its parent.
         *
         * @param r rectangle indicating this component's bounds
         * @see #getBounds
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        public Rectangle getBounds() {

        /**
         * Gets the bounds of this object in the form of a Rectangle object.
         * The bounds specify this object's width, height, and location
         * relative to its parent.
         *
         * @return A rectangle indicating this component's bounds; null if
         * this object is not on the screen.
         * @see #contains
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        public void setLocation(Point p) {

        /**
         * Sets the location of the object relative to the parent.
         * @param p the new position for the top-left corner
         * @see #getLocation
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        public Point getLocation() {

        /**
         * Gets the location of the object relative to the parent in the form
         * of a point specifying the object's top-left corner in the screen's
         * coordinate space.
         *
         * @return An instance of Point representing the top-left corner of the
         * object's bounds in the coordinate space of the screen; null if
         * this object or its parent are not on the screen
         * @see #getBounds
         * @see #getLocationOnScreen
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        public Point getLocationOnScreen() {

        /**
         * Returns the location of the object on the screen.
         *
         * @return the location of the object on screen; null if this object
         * is not on the screen
         * @see #getBounds
         * @see #getLocation
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        public boolean contains(Point p) {

        /**
         * Checks whether the specified point is within this object's bounds,
         * where the point's x and y coordinates are defined to be relative
         * to the coordinate system of the object.
         *
         * @param p the Point relative to the coordinate system of the object
         * @return true if object contains Point; otherwise false
         * @see #getBounds
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        public boolean isShowing() {

        /**
         * Determines if the object is showing.  This is determined by checking
         * the visibility of the object and its ancestors.
         * Note: this
         * will return true even if the object is obscured by another (for
         * example, it is underneath a menu that was pulled down).
         *
         * @return true if object is showing; otherwise, false
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        public void setVisible(boolean b) {

        /**
         * Sets the visible state of the object.
         *
         * @param b if true, shows this object; otherwise, hides it
         * @see #isVisible
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        public boolean isVisible() {

        /**
         * Determines if the object is visible.  Note: this means that the
         * object intends to be visible; however, it may not be
         * showing on the screen because one of the objects that this object
         * is contained by is currently not visible.  To determine if an object
         * is showing on the screen, use isShowing().
         * <p>Objects that are visible will also have the
         * AccessibleState.VISIBLE state set in their AccessibleStateSets.
         *
         * @return true if object is visible; otherwise, false
         * @see #setVisible
         * @see AccessibleContext#getAccessibleStateSet
         * @see AccessibleState#VISIBLE
         * @see AccessibleStateSet
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        public void setEnabled(boolean b) {

        /**
         * Sets the enabled state of the object.
         *
         * @param b if true, enables this object; otherwise, disables it
         * @see #isEnabled
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        public boolean isEnabled() {

        /**
         * Determines if the object is enabled.  Objects that are enabled
         * will also have the AccessibleState.ENABLED state set in their
         * AccessibleStateSets.
         *
         * @return true if object is enabled; otherwise, false
         * @see #setEnabled
         * @see AccessibleContext#getAccessibleStateSet
         * @see AccessibleState#ENABLED
         * @see AccessibleStateSet
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        public FontMetrics getFontMetrics(Font f) {

        /**
         * Gets the FontMetrics of this object.
         *
         * @param f the Font
         * @return the FontMetrics, if supported, the object; otherwise, null
         * @see #getFont
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        public void setFont(Font f) {

        /**
         * Sets the Font of this object.
         *
         * @param f the new Font for the object
         * @see #getFont
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        public Font getFont() {

        /**
         * Gets the Font of this object.
         *
         * @return the Font,if supported, for the object; otherwise, null
         * @see #setFont
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        public void setCursor(Cursor cursor) {

        /**
         * Sets the Cursor of this object.
         *
         * @param cursor the new Cursor for the object
         * @see #getCursor
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        public Cursor getCursor() {

        /**
         * Gets the Cursor of this object.
         *
         * @return the Cursor, if supported, of the object; otherwise, null
         * @see #setCursor
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        public void setForeground(Color c) {

        /**
         * Sets the foreground color of this object.
         *
         * @param c the new Color for the foreground
         * @see #getForeground
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        public Color getForeground() {

        /**
         * Gets the foreground color of this object.
         *
         * @return the foreground color, if supported, of the object;
         * otherwise, null
         * @see #setForeground
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        public void setBackground(Color c) {

        /**
         * Sets the background color of this object.
         *
         * @param c the new Color for the background
         * @see #setBackground
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        public Color getBackground() {

        /**
         * Gets the background color of this object.
         *
         * @return the background color, if supported, of the object;
         * otherwise, null
         * @see #setBackground
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        public Locale getLocale() throws IllegalComponentStateException {

        /**
         * Gets the locale of the component. If the component does not have a
         * locale, then the locale of its parent is returned.
         *
         * @return this component's locale.  If this component does not have
         * a locale, the locale of its parent is returned.
         *
         * @exception IllegalComponentStateException
         * If the Component does not have its own locale and has not yet been
         * added to a containment hierarchy such that the locale can be
         * determined from the containing parent.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        public Accessible getAccessibleChild(int i) {

        /**
         * Returns the specified Accessible child of the object.  The Accessible
         * children of an Accessible object are zero-based, so the first child
         * of an Accessible child is at index 0, the second child is at index 1,
         * and so on.
         *
         * @param i zero-based index of child
         * @return the Accessible child of the object
         * @see #getAccessibleChildrenCount
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        public int getAccessibleChildrenCount() {

        /**
         * Returns the number of accessible children of the object.
         *
         * @return the number of accessible children of the object.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        public int getAccessibleIndexInParent() {

        /**
         * Gets the 0-based index of this object in its accessible parent.
         *
         * @return the 0-based index of this object in its parent; -1 if this
         * object does not have an accessible parent.
         *
         * @see #getAccessibleParent
         * @see #getAccessibleChildrenCount
         * @see #getAccessibleChild
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        public AccessibleStateSet getAccessibleStateSet() {

        /**
         * Gets the state set of this object.
         *
         * @return an instance of AccessibleStateSet describing the states
         * of the object
         * @see AccessibleStateSet
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        public AccessibleRole getAccessibleRole() {

        /**
         * Gets the role of this object.  The role of the object is the generic
         * purpose or use of the class of this object.  For example, the role
         * of a push button is AccessibleRole.PUSH_BUTTON.  The roles in
         * AccessibleRole are provided so component developers can pick from
         * a set of predefined roles.  This enables assistive technologies to
         * provide a consistent interface to various tweaked subclasses of
         * components (e.g., use AccessibleRole.PUSH_BUTTON for all components
         * that act like a push button) as well as distinguish between subclasses
         * that behave differently (e.g., AccessibleRole.CHECK_BOX for check boxes
         * and AccessibleRole.RADIO_BUTTON for radio buttons).
         * <p>Note that the AccessibleRole class is also extensible, so
         * custom component developers can define their own AccessibleRole's
         * if the set of predefined roles is inadequate.
         *
         * @return an instance of AccessibleRole describing the role of the object
         * @see AccessibleRole
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        public String getAccessibleDescription() {

        /**
         * Gets the accessibleDescription property of this object.  If this
         * property isn't set, returns the content type of this
         * <code>JEditorPane</code> instead (e.g. "plain/text", "html/text").
         *
         * @return the localized description of the object; <code>null</code>
         *      if this object does not have a description
         *
         * @see #setAccessibleName
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
        public String getAccessibleName() {

        /**
         * Gets the accessibleName property of this object.  The accessibleName
         * property of an object is a localized String that designates the purpose
         * of the object.  For example, the accessibleName property of a label
         * or button might be the text of the label or button itself.  In the
         * case of an object that doesn't display its name, the accessibleName
         * should still be set.  For example, in the case of a text field used
         * to enter the name of a city, the accessibleName for the en_US locale
         * could be 'city.'
         *
         * @return the localized name of the object; null if this
         * object does not have a name
         *
         * @see #setAccessibleName
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Returns the root AccessibleContext for the document
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
    private void buildInfo() {

    /**
     * Rebuilds the information from the current info.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
    private void unlock(Object key) {

    /**
     * Releases a lock previously obtained via <code>lock</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
    private Object lock() {

    /**
     * If possible acquires a lock on the Document.  If a lock has been
     * obtained a key will be retured that should be passed to
     * <code>unlock</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
    private Rectangle getRootEditorRect() {

    /**
     * Returns the bounds the root View will be rendered in.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
    private View getRootView() {

    /**
     * Returns the root <code>View</code> associated with the current text
     * component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
    private ElementInfo getRootInfo() {

    /**
     * Returns the ElementInfo representing the root Element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
    private JEditorPane getTextComponent() {

    /**
     * Returns the JEditorPane providing information for.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
    private Document getDocument() {

    /**
     * Returns the Document currently presenting information for.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
    private void setDocument(Document document) {

    /**
     * Sets the document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
    private ElementInfo rootElementInfo;

    /**
     * The root ElementInfo for the document
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
    private DocumentListener docListener;

    /**
     * DocumentListener installed on the current model.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/AccessibleHTML.java
    private JEditorPane editor;

    /**
     * The editor.
     */
