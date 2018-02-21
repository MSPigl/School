# Matthew Pigliavento, October 24, 2015, hw3.py, this program changes RDJ's teeth
# orange, top hair purple, beard yellow, gives him a "glass eye," 
# and adds text surrounded by a green rectangle

# Turns teeth orange (I changed the G value to more greatly differentiate the color from red)
def teeth (facePic):
  orange = makeColor (255, 85, 0)
  for facex in range (188, 224):
    for facey in range (203, 230):
      p = getPixel (facePic, facex, facey)
      color = getColor (p)
      if distance (color, white) < 173:
        setColor (p, orange)

# Changes whites of left eye to red
def eye (facePic):
  for facex in range (264, 293):
    for facey in range (80, 90):
      p = getPixel (facePic, facex, facey)
      color = getColor (p)
      if distance (color, white) < 255:
        setColor (p, red)

# Changes top hair (head, brows, eyelashes, etc) color and cornea to purple
def topHair (facePic):
  purple = makeColor (128, 0, 128)
  for facex in range (85, 372):
    for facey in range (0, 177):
      p = getPixel (facePic, facex, facey)
      color = getColor (p)
      if distance (color, black) < 169:
        setColor (p, purple)

# Changes beard hair color to yellow
def facialHair (facePic):
  for facex in range (156, 282):
    for facey in range (215, 286):
      p = getPixel (facePic, facex, facey)
      color = getColor (p)
      if distance (color, black) < 180:
        setColor (p, yellow)

# Creates a silver filled oval over the right eye, giving RDJ a "glass eye"        
def glassEye (facePic):
  glassy = makeColor (185, 211, 238)
  addOvalFilled (facePic, 163, 65, 55, 40, glassy)  

# Displays the mutilated Robert Downey 
def graffiti ():
  robPic = makePicture (getMediaPath ("rdj.jpg"))
  teeth (robPic)
  eye (robPic)
  topHair (robPic)
  facialHair (robPic)
  glassEye (robPic)
  myStyle = makeStyle (serif, italic, 12) 
  text = "'I know very little about acting. I'm just an incredibly gifted faker' - RDJ"
  addTextWithStyle (robPic, 50, 300, text, myStyle, white)
  addRect (robPic, 48, 289, 350, 15, green)
  repaint (robPic)
   