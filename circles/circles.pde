int circle1x = 50;
int circle1y = 250;
int circle2x = 350;
int circle2y = 250;
int speed1 = 1;
int speed2 = -1;
void setup()
{
 size(400,600);
 
}
void draw()
{
  background(225);
  noFill();
  if(circle1x == 49)
  {
    speed1 = -speed1;
  }
  if(circle2x == 351)
  {
    speed2 = -speed2;
  }
  if(circle1x == circle2x)
  {
    speed1 = -speed1; 
    speed2 = -speed2;
  }
   circle1x = circle1x + speed1;
   
   circle2x = circle2x + speed2;
   
  for(int i = 0; i < 200; i = i + 10)
{
  ellipse(circle1x, circle1y, i, i);
  ellipse(circle2x, circle2y, i, i);
}
}