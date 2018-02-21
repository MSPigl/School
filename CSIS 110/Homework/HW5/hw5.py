# Matthew Pigliavento, December 4, 2015, hw5.py
# This program creates a "silent film" of 150 frames at 
# 30 frames per second
# To execute:  setMediaPath() --> flick()

import random
import java.awt.Font as Font

# from text, Program 175
def writeFrame(num, dir, pict):
  numStr = str(num)
  if num < 10:
    writePictureTo (pict, dir+"//frame00"+numStr+".jpg")
  if num >= 10 and num < 100:
    writePictureTo (pict, dir+"//frame0"+numStr+".jpg")
  if num >= 100:
    writePictureTo (pict, dir+"//frame"+numStr+".jpg")
    
# creates the animation
def flick():
  directory = getMediaPath("frames")
  for frameNum in range (0, 150): 
    canvas = makeEmptyPicture (500, 500)
    string = "Goodbye Python :("
    if frameNum < 55:
      addText(canvas, 500-frameNum*4, 20, string)
    else:
      addText(canvas, frameNum*4, 20, string)
    if frameNum < 55:
      addText(canvas, frameNum*4, 480, string)
    else:
      addText(canvas, 500-frameNum*4, 480, string)
      
    # creates the right-hand border
    addRectFilled(canvas, 490, 0, 10, 500, red)
    addRectFilled(canvas, 490, frameNum*5, 10, 50, black)
    addRectFilled(canvas, 490, 100+frameNum*5, 10, 50, black)
    addRectFilled(canvas, 490, 200+frameNum*5, 10, 50, black)
    addRectFilled(canvas, 490, 300+frameNum*5, 10, 50, black)
    addRectFilled(canvas, 490, 400+frameNum*5, 10, 50, black)
    addRectFilled(canvas, 490, 500-frameNum*5, 10, 50, black)
    addRectFilled(canvas, 490, 400-frameNum*5, 10, 50, black)
    addRectFilled(canvas, 490, 300-frameNum*5, 10, 50, black)
    addRectFilled(canvas, 490, 200-frameNum*5, 10, 50, black)
    addRectFilled(canvas, 490, 100-frameNum*5, 10, 50, black)
    
    # creates the left-hand border
    addRectFilled(canvas, 0, 0, 10, 500, red)
    addRectFilled(canvas, 0, frameNum*5, 10, 50, black)
    addRectFilled(canvas, 0, 100+frameNum*5, 10, 50, black)
    addRectFilled(canvas, 0, 200+frameNum*5, 10, 50, black)
    addRectFilled(canvas, 0, 300+frameNum*5, 10, 50, black)
    addRectFilled(canvas, 0, 400+frameNum*5, 10, 50, black)
    addRectFilled(canvas, 0, 500-frameNum*5, 10, 50, black)
    addRectFilled(canvas, 0, 400-frameNum*5, 10, 50, black)
    addRectFilled(canvas, 0, 300-frameNum*5, 10, 50, black)
    addRectFilled(canvas, 0, 200-frameNum*5, 10, 50, black)
    addRectFilled(canvas, 0, 100-frameNum*5, 10, 50, black)
    
    # creates the upper border
    addRectFilled(canvas, 0, 0, 500, 10, black)
    addRectFilled(canvas, frameNum*5, 0, 50, 10, red)
    addRectFilled(canvas, 100+frameNum*5, 0, 50, 10, red)
    addRectFilled(canvas, 200+frameNum*5, 0, 50, 10, red)
    addRectFilled(canvas, 300+frameNum*5, 0, 50, 10, red)
    addRectFilled(canvas, 400+frameNum*5, 0, 50, 10, red)
    addRectFilled(canvas, 500-frameNum*5, 0, 50, 10, red)
    addRectFilled(canvas, 400-frameNum*5, 0, 50, 10, red)
    addRectFilled(canvas, 300-frameNum*5, 0, 50, 10, red)
    addRectFilled(canvas, 200-frameNum*5, 0, 50, 10, red)
    addRectFilled(canvas, 100-frameNum*5, 0, 50, 10, red)
    
    # creates the lower border
    addRectFilled(canvas, 0, 490, 500, 10, black)
    addRectFilled(canvas, frameNum*5, 500, 50, 10, red)
    addRectFilled(canvas, 100+frameNum*5, 490, 50, 10, red)
    addRectFilled(canvas, 200+frameNum*5, 490, 50, 10, red)
    addRectFilled(canvas, 300+frameNum*5, 490, 50, 10, red)
    addRectFilled(canvas, 400+frameNum*5, 490, 50, 10, red)
    addRectFilled(canvas, 500-frameNum*5, 490, 50, 10, red)
    addRectFilled(canvas, 400-frameNum*5, 490, 50, 10, red)
    addRectFilled(canvas, 300-frameNum*5, 490, 50, 10, red)
    addRectFilled(canvas, 200-frameNum*5, 490, 50, 10, red)
    addRectFilled(canvas, 100-frameNum*5, 490, 50, 10, red)
    
    # creates right black oval column
    addOvalFilled(canvas,445,frameNum*5,50, 50, black)
    addOvalFilled(canvas,445,100+frameNum*5,50, 50, black)
    addOvalFilled(canvas,445,200+frameNum*5,50, 50, black)
    addOvalFilled(canvas,445,300+frameNum*5,50, 50, black)
    addOvalFilled(canvas,445,400+frameNum*5,50, 50, black)
    addOvalFilled(canvas,445,500-frameNum*5,50, 50, black)
    addOvalFilled(canvas,445,400-frameNum*5,50, 50, black)  
    addOvalFilled(canvas,445,300-frameNum*5,50, 50, black) 
    addOvalFilled(canvas,445,200-frameNum*5,50, 50, black) 
    addOvalFilled(canvas,445,100-frameNum*5,50, 50, black)    
    
    # creates left black oval column
    addOvalFilled(canvas,0,frameNum*5,50, 50, black)
    addOvalFilled(canvas,0,100+frameNum*5,50, 50, black)
    addOvalFilled(canvas,0,200+frameNum*5,50, 50, black)
    addOvalFilled(canvas,0,300+frameNum*5,50, 50, black)
    addOvalFilled(canvas,0,400+frameNum*5,50, 50, black)
    addOvalFilled(canvas,0,500-frameNum*5,50, 50, black)
    addOvalFilled(canvas,0,400-frameNum*5,50, 50, black)  
    addOvalFilled(canvas,0,300-frameNum*5,50, 50, black) 
    addOvalFilled(canvas,0,200-frameNum*5,50, 50, black) 
    addOvalFilled(canvas,0,100-frameNum*5,50, 50, black)
    
    # creates criss-crossing red oval pattern
    addOvalFilled(canvas, frameNum*8, frameNum*8, 50, 50, red)
    addOvalFilled(canvas, 500-frameNum*8, frameNum*8, 50, 50, red)
    addOvalFilled(canvas, frameNum*8, 500-frameNum*8, 50, 50, red)
    addOvalFilled(canvas, 500-frameNum*8, 500-frameNum*8, 50, 50, red)
    
    # copies an image into the canvas and moves it down then up
    jy = makePicture(getMediaPath("Jython.jpg"))
    if frameNum < 55:
      copyInto(jy, canvas, 225, frameNum*5)
    else:
      copyInto(jy, canvas, 225, 500-frameNum*2)
    
    writeFrame (frameNum, directory, canvas)

  # wrap up
  movie = makeMovieFromInitialFile (directory+"//frame000.jpg")
  writeQuicktime (movie, getMediaPath ("flick.mov"), 30)
  
  return movie
