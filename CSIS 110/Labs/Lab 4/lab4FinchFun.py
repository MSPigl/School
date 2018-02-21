# Matt Pigliavento, Matt Curtin, Jake Van Vorst

import edu.cmu.ri.createlab.terk.robot.finch.Finch as Finch

#This program introduces several new Finch methods, the "while" loop,
#and conditionals: if, elif, and else.
#
#While the Finch is NOT upside down the program will check if the Finch 
#is being shaken or if he has his beak up.
#  
#If the Finch is being shaken his beak light should turn red,
#and he should say "Stop shaking me". If his beak is up his light 
#should turn yellow, and he should say "Please put my beak down".  Finally,
#for any other state his light should turn green and he should say 
#"Now I'm happy". The program stops when the finch is turned upside down.
#
#You will be using the following Finch functions to accomplish this task,
#which should be familiar to you from previous labs:
# setLED(R,G,B), saySomething("Hello"),
# sleep(duration) - Remember: 1000 = 1 sec
#
#In addition, you will be using the following new Boolean Finch functions:
# isBeakUp(), isShaken(), isFinchUpsideDown()

def happyState():
  # Set things up
  tom=Finch()
  # Continue executing the code below until "tom" is turned upside down. 
  while not tom.isFinchUpsideDown(): 
    if tom.isShaken():
      #his beak light should turn red,
      #and he should say "Stop shaking me"
      tom.setLED (255, 0, 0)
      tom.sleep (1000)
      tom.saySomething ("Stop shaking me")
      tom.sleep (1000)
    elif tom.isBeakUp():
      tom.setLED (255, 255, 0)
      tom.sleep (1000)
      tom.saySomething ("Please put my beak down")
      tom.sleep (1000)
      #Tom's light turns yellow and he says "Please put my beak down".
      #ADD 4 LINES OF CODE FOR THAT HERE
    else: 
      tom.setLED (0, 255, 0)
      tom.sleep (1000)
      tom.saySomething ("Now I'm happy")
      tom.sleep (1000)
    
      #Beak turns green and he should say "Now I'm happy".
      #ADD 4 LINES OF CODE FOR THAT HERE
  #wrap-up
  tom.quit()
    
      
      

     