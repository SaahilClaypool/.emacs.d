_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Vector.h
};

  float getX() const;		    ///< Get horizontal component.
  void setX(float new_x);	    ///< Set horizontal component.
  float getY()const;		    ///< Get vertical component.
  void setY(float new_y);	    ///< Set vertical component.
  void setXY(float new_x, float new_y); ///< Set horizizontal & vertical.
  void normalize();		///< Normalize vector.
  void scale(float s);		///< Scale vector.
  float getMagnitude() const;	///< Return magnitude.
  bool operator==(const Vector &other) const;  ///< Compare Vector.
  bool operator!=(const Vector &other) const;  ///< Compare Vector.
  Vector &operator+=(const Vector &other);     ///< Add other Vector to this one.
  Vector operator+(const Vector &other) const; ///< Add Vector.
  Vector operator-(const Vector &other) const; ///< Subtract Vector.
  bool operator!() const;		       ///< Test if (0,0).
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Vector.h
  Vector();

  /// Default is (0,0).
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Vector.h
  Vector(float init_x, float init_y);

  /// Create Vector with (x,y).  
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Vector.h
 public:

  float x; 			///< Horizontal component.
  float y; 			///< Vertical component.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Vector.h
#ifndef __DF_VECTOR_H__

///
/// A 2d (x,y) vector
///
