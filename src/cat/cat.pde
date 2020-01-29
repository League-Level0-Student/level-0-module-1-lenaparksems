 PImage face;
 
 void setup(){
  
       face = loadImage("Untitled.png");

   
   size(1152,700);
        background(0,255,0);
    }

    void draw(){
        if(mousePressed){               
                    image(face, 0, 0); 
        }
        else{                           //else
            fill(567,567,567);                  //fill green
        }
        ellipse(mouseX, mouseY, 100, 100);  //using these variables makes this shape follow the mouse
    }
                            
