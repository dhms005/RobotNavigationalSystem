// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        Scanner scanner = new Scanner(System.in);
        
         System.out.println("Enter Grid : X Y");
         int gridX = scanner.nextInt();
         int gridY = scanner.nextInt();
         
         
         System.out.println("Enter Robot Position : X Y E");
         int startX = scanner.nextInt();
         int startY = scanner.nextInt();
         char startDir = scanner.next().charAt(0);
         
         
         System.out.println("Enter Robot Movement direction command");
         String command = scanner.next();
         scanner.close();
         
         
        
        String robotcurrentPosstion = robotMovement(gridX,gridY,startX,startY,startDir,command);
        System.out.println("robot current posotion is : "+ robotcurrentPosstion);
       
    }
    
    public static String robotMovement(int gridX, int gridY, int startX,int startY,char startDir, String commands) {
        int x = startX;
        int y = startY;
        char[] directions = {'N','E','S','W'};
        int dirIndex = new String(directions).indexOf(startDir);
        
        for(char command : commands.toCharArray()) {
            
            if(command == 'L') {
                dirIndex = (dirIndex + 3) % 4;
            } else if(command == 'R') {
                dirIndex = (dirIndex + 1) % 4;
            }else if (command == 'M') {
                if(directions[dirIndex] == 'N' && y <gridY) {
                    y++;
                }
                else if(directions[dirIndex] == 'E' && x <gridX) {
                    x++;
                }
                else if(directions[dirIndex] == 'S' && y > 0) {
                    y--;
                }
                else if(directions[dirIndex] == 'W' && x >0) {
                    x--;
                }
            }
        }
        
        return " "+x+ " " + y +" " +directions[dirIndex];
    }
}

