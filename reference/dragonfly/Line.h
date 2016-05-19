_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Line.h
};

  void setP1(Vector new_p1);  ///< Set first endpoint.
  Vector getP1() const;       ///< Get first endpoint.
  void setP2(Vector new_p2);  ///< Set second endpoint.
  Vector getP2() const;       ///< Get second endpoint.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Line.h
  Line();

  /// Default line segment is at (0,0).
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Line.h
  Line(Vector init_p1, Vector init_p2);

  /// Create line segment from p1 to p2.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Line.h
 public:

  Vector p1;            ///< First endpoint.
  Vector p2;            ///< Second endpoint.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Line.h
#ifndef __LINE_H__

///
/// A line segment
///
