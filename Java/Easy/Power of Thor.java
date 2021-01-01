import java.util.*;
import java.io.*;
import java.math.*;

class Player 
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTX = in.nextInt(); // Thor's starting X position
        int initialTY = in.nextInt(); // Thor's starting Y position

        while (true) 
        {
            int remainingTurns = in.nextInt(); // The level of Thor's remaining energy, representing the number of moves he can still make.
            String direction = "";

            if (initialTY < lightY) 
            {
                direction = "S";
                initialTY++;
            }
            else if (initialTY > lightY) 
            {
                direction = "N";
                initialTY--;
            } 
            
            if (initialTX < lightX) 
            {
                direction += "E";
                initialTX++;
            }
            else if (initialTX > lightX) 
            {
                direction += "W";
                initialTX--;
            }
            
            System.out.println(direction);
        }
    }
}
