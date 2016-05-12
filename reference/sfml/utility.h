_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//utility.h
sf::Color colorToSFML(Color color);

/// Return SFML color based on DF color.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//utility.h
void colorToRGB(Color color, unsigned char &r, unsigned char &g, 
		 unsigned char &b);

/// Set RGB color based on DF color.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//utility.h
void addParticles(ParticleType type, Vector position, float scale, Color color = CUSTOM);

/// Add particles of specific type.
///  type - type of particle
///  position - location 
///  scale - scale size 
///  color - dragonfly color to use
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//utility.h
void addParticles(int count, int count_spread,
		  Vector position, float position_spread, 
		  Vector direction, float direction_spread,
		  float size, float size_spread, 
		  float speed, float speed_spread,
		  int age, int age_spread,
		  unsigned char opacity, char opacity_spread,
		  unsigned char r, unsigned char g, unsigned char b,
		  unsigned char color_spread);

/// Add particles.  Each paramter has average and spread.
///  count - number to add
///  position - location 
///  direction - direction to move [(0,0) for random]
///  size - size (pixels)
///  speed - speed (spaces/tick)
///  age - age (ticks)
///  opacity - how "see through" [0-255, 0 is transparent]
///  r, g, b - color in RGB values
