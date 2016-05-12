_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Box.h
};

  bool operator==(const Box &other) const; ///< Compare boxes.
  bool operator!=(const Box &other) const; ///< Compare boxes.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Box.h
  float getVertical() const;

  /// Get vertical size of box.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Box.h
  void setVertical(float new_vertical);

  /// Set vertical size of box.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Box.h
  float getHorizontal() const;

  /// Get horizontal size of box.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Box.h
  void setHorizontal(float new_horizontal);

  /// Set horizontal size of box.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Box.h
  Vector getCorner() const;

  /// Get upper left corner of box.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Box.h
  void setCorner(Vector new_corner);

  /// Set upper left corner of box.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Box.h
  Box();

  /// Create box with (0,0) for corner, and 0 for horiz and vert.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Box.h
 public:

  Vector corner;           ///< Upper left corner of box.
  float horizontal;	   ///< Horizontal dimension.
  float vertical;	   ///< Vertical dimension.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Box.h
#ifndef __BOX_H__

///
/// A 2-d bounding box
///
