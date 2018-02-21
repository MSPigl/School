# Matt Curtin, Matt Pigliavento

# lab3Scaling.py:  scaling an image up (2x) and down (0.5x)

def shrink (source):
  
  # set up target picture
  target = makeEmptyPicture( getWidth(source)/2, getHeight(source)/2)
  
  # do the actual copying
  sourceX = 0
  for targetX in range (0, getWidth(source)/2):
    sourceY = 0
    for targetY in range (0, getHeight(source)/2):
      color = getColor (getPixel (source, sourceX, sourceY))
      setColor (getPixel (target, targetX, targetY), color)
      sourceY = sourceY + 2
    sourceX = sourceX + 2
    
  return (target)
     
  
def grow (source):
  
  # set up target picture
  target = makeEmptyPicture( getWidth(source) * 2, getHeight(source) * 2)
  
  # do the actual copying
  sourceX = 0
  for targetX in range (0, getWidth(source) * 2):
    sourceY = 0
    for targetY in range (0, getHeight(source) * 2):
      color = getColor (getPixel (source, int(sourceX), int(sourceY)))
      setColor (getPixel (target, targetX, targetY), color)
      sourceY = sourceY + 0.5
    sourceX = sourceX + 0.5
      
  return (target)

# Places original into big, then small into big
def layer (myPic):
  
  small=shrink(myPic)
  big=grow(myPic)
  copyInto(small, myPic, (getWidth(myPic))/2-(getWidth(small))/2,(getHeight(myPic))/2-(getHeight(small))/2)
  copyInto(myPic, big, (getWidth(big))/2-(getWidth(myPic))/2,(getHeight(big))/2-(getHeight(myPic))/2)
  repaint(big)
  
# Prints picture in picture  
  print "finish me!"
  
   

 
    
  
  