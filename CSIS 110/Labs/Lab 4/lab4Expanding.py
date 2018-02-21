# Matt Pigliavento, Matt Curtin, Jake Van Vorst

# Creates 'gold" color
gold = makeColor(218, 175, 97)

# Change white or gold pixels to green
def bigbenColors():
  bbpic = makePicture (getMediaPath( "bigben.jpg"))
  
  for facex in range (66, 144):
    for facey in range (234, 300):
      p = getPixel (bbpic, facex, facey)
      color = getColor(p)
      if distance(color,white)<100.0 or distance(color,gold)<100.0:
         setColor (p, green)
         
 


        # wrap up
  repaint (bbpic)
  
