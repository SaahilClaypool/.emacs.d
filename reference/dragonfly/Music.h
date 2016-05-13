_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Music.h
  sf::Music *getMusic();

  /// Return pointer to SFML music.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Music.h
  void pause();

  /// Pause music.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Music.h
  void stop();

  /// Stop music.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Music.h
  void play(bool loop=true);

  /// Play music.
  /// If loop is true, repeat play when done.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Music.h
  std::string getLabel() const;

  /// Get label associated with music.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Music.h
  void setLabel(std::string new_label);

  /// Set label associated with music.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Music.h
  int loadMusic(std::string filename);

  /// Associate music buffer with file.
  /// Return 0 if ok, else -1.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Music.h
 public:

  sf::Music music;	        ///< The music.
  std::string label;	        ///< Text label to identify music.
  Music (Music const&);         ///< SFML doesn't allow music copy.
  void operator=(Music const&); ///< SFML doesn't allow music assignment.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Music.h
#ifndef __MUSIC_H__

///
/// The music
/// 
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Music.h
  sf::Music *getMusic();

  /// Return pointer to SFML music.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Music.h
  void pause();

  /// Pause music.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Music.h
  void stop();

  /// Stop music.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Music.h
  void play(bool loop=true);

  /// Play music.
  /// If loop is true, repeat play when done.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Music.h
  std::string getLabel() const;

  /// Get label associated with music.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Music.h
  void setLabel(std::string new_label);

  /// Set label associated with music.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Music.h
  int loadMusic(std::string filename);

  /// Associate music buffer with file.
  /// Return 0 if ok, else -1.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Music.h
 public:

  sf::Music music;	        ///< The music.
  std::string label;	        ///< Text label to identify music.
  Music (Music const&);         ///< SFML doesn't allow music copy.
  void operator=(Music const&); ///< SFML doesn't allow music assignment.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Music.h
#ifndef __MUSIC_H__

///
/// The music
/// 
